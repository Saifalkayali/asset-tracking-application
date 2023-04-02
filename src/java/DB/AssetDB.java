/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AssetBean;

/**
 * This is the class responsible for the database connection
 * @author salkayali
 */

public class AssetDB {

    Connection con;
    
    public AssetDB () throws SQLException{
         // Create a variable for the connection string.  
      String connectionUrl = "jdbc:mysql://localhost:3306/AssetDB?zeroDateTimeBehavior=convertToNull";
      String userName="root";
      String password="password";
     
      
      try {  
         // Establish the connection.  
         Class.forName("com.mysql.jdbc.Driver");  
         con = DriverManager.getConnection(connectionUrl, userName, password); 
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(AssetDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertForm(AssetBean asset) throws AssetDBException, SQLException {
        String psql = "INSERT INTO reqform (ReqStatus, ReqTitle, ProjCode, ReqType, RequestDateFrom, RequestDateTo, RequesterName, Budget, AssetRole, Description,"
                + "Requirements, AdditionalReq, Os, OtherOs, MachineType, Host, IpSettings, IpAddress, Domain, Criticality, Backup, availability )"
                + "VALUES"
                + "('New','"+asset.getTitle()+"','"+asset.getCode()+"','"+asset.getRequestType()+"','"+asset.getRequestDateFrom()+"','"+asset.getRequestDateTo()+"','"+asset.getRequester()+"',"
                + "'"+asset.getBudget()+"','"+Arrays.toString(asset.getRole())+"','"+asset.getDescription()+"','"+asset.getHardReq()+"','"+asset.getAddReq()+("',"
                + "'"+asset.getOs()+"','"+asset.getOtherOs()+"','"+asset.getMachineType()+"','"+asset.getHost()+"','"+asset.getDomain()+"','"+asset.getIpsettings()+"','"+asset.getIpaddress()+"','"+asset.getCriticality()+"',"
                + "'" +asset.getBackup()+"','"+asset.getAvailability())+"');";
        
        try{PreparedStatement pStmt = con.prepareStatement(psql);
            if (asset.getRequestDateFrom() !=null && asset.getRequestDateTo()  !=null){            
                pStmt.executeUpdate();
            }
            else{
                 psql = "INSERT INTO reqform (ReqStatus, ReqTitle, ProjCode, ReqType, RequesterName, Budget, AssetRole, Description,"
                + "Requirements, AdditionalReq, Os, OtherOs, MachineType, Host, IpSettings, IpAddress, Domain, Criticality, Backup, availability )"
                + "VALUES"
                + "('New','"+asset.getTitle()+"','"+asset.getCode()+"','"+asset.getRequestType()+"','"+asset.getRequester()+"','"+asset.getBudget()+"','"+Arrays.toString(asset.getRole())+"',"
                + "'"+asset.getDescription()+"','"+asset.getHardReq()+"','"+asset.getAddReq()+("',"
                + "'"+asset.getOs()+"','"+asset.getOtherOs()+"','"+asset.getMachineType()+"','"+asset.getHost()+"','"+asset.getDomain()+"','"+asset.getIpsettings()+"','"+asset.getIpaddress()+"','"+asset.getCriticality()+"',"
                + "'" +asset.getBackup()+"','"+asset.getAvailability())+"');";
            pStmt = con.prepareStatement(psql);
            pStmt.executeUpdate();
            } 
        }
            catch (SQLException ex  ) {
                throw new AssetDBException("error inserting Form ", ex);
        }
    }
   
    
    
     // a method to select all Assets
    public AssetBean[] selectAllRequests() throws  AssetDBException   {
        
        // creating list of Assets
        List<AssetBean> assets = new LinkedList<>();
        
        try(
            //A Statement is an interface that represents a SQL statement.
            Statement st_mt = con.createStatement();
            
            //execute Statement objects, and generate ResultSet object
            ResultSet rslt = st_mt.executeQuery("SELECT ReqID, ReqTitle, ReqStatus, RequesterName, RequestDateFrom FROM AssetDB.reqform ORDER BY ReqID DESC");) {
                
                // looping through all the products & setting attributes 
                while (rslt.next()){
                    
                    AssetBean a = new AssetBean();
                    a.setReqid(rslt.getInt("ReqID"));
                    a.setTitle(rslt.getString("ReqTitle"));
                    a.setReqStatus(rslt.getString("ReqStatus"));
                    a.setRequester(rslt.getString("RequesterName"));
                    
                    //creating requestDateFrom which is a variable of type Date class 
                    Date requestDateFrom = rslt.getDate("RequestDateFrom");
                    
                    
                    if (requestDateFrom == null){
                        a.setRequestDateFrom(null);                
                    }
                    else{
                    //creating date which is a variable of type LocalDate class and using toLocalDate()
                    LocalDate date = requestDateFrom.toLocalDate();
                    a.setRequestDateFrom(date);

                    }
                    
                    assets.add(a);
                }
        } catch (SQLException ex) {
            Logger.getLogger(AssetDB.class.getName()).log(Level.SEVERE, null, ex);
            throw new AssetDBException("error selecting Assets", ex);
        }
        return assets.toArray(new AssetBean[assets.size()]);
    
    }


    public AssetBean getRequest(String reqID) throws SQLException, AssetDBException {
        String psql = "SELECT ReqID, ReqStatus, ReqTitle, ProjCode, ReqType, RequestDateFrom, RequestDateTo, RequesterName, Budget, AssetRole, Description,"
                + " Requirements, AdditionalReq, Os, OtherOs, MachineType, Host, IpSettings, IpAddress, Domain, Criticality, Backup, availability FROM AssetDB.reqform WHERE ReqID = ?";
        try(
            PreparedStatement pStmt = prepStmtcode(con, psql, reqID);
            ResultSet rslt = pStmt.executeQuery();){
            
            
            
             if(rslt.next()){
                AssetBean asset = new AssetBean();
                asset.setReqStatus(rslt.getString("ReqStatus"));
                asset.setTitle(rslt.getString("ReqTitle"));
                asset.setCode(rslt.getString("ProjCode"));
                asset.setRequestType(rslt.getString("ReqType"));                 
                asset.setRequester(rslt.getString("RequesterName")); 
                asset.setBudget(rslt.getString("Budget")); 
                
                
                //subject to change ( Roles) 
                String roleString = rslt.getString("AssetRole");
                String[] roleArray = roleString.split(",");
                asset.setRole(roleArray);
                
                
                
                asset.setDescription(rslt.getString("Description"));
                asset.setHardReq(rslt.getString("Requirements"));
                asset.setAddReq(rslt.getString("AdditionalReq"));
                asset.setOs(rslt.getString("Os"));
                asset.setOtherOs(rslt.getString("otherOs"));
                asset.setMachineType(rslt.getString("MachineType"));
                asset.setHost(rslt.getString("Host"));
                asset.setDomain(rslt.getString("Domain"));
                asset.setIpsettings(rslt.getString("IpSettings"));
                asset.setIpaddress(rslt.getString("IpAddress"));
                asset.setCriticality(rslt.getString("Criticality"));
                asset.setCriticality(rslt.getString("Criticality"));
                asset.setBackup(rslt.getString("Backup"));
                asset.setAvailability(rslt.getString("Availability"));
                
                
                //creating releaseDate which is a variable of type Date class 
                Date requestDataFrom = rslt.getDate("RequestDateFrom");
                Date requestDataTo = rslt.getDate("RequestDateTo");
                
                if ( requestDataFrom != null | requestDataTo != null  ){
                    
                    //creating date which is a variable of type LocalDate class and using toLocalDate() method
                    LocalDate dateFrom = requestDataFrom.toLocalDate();
                    LocalDate dateTo = requestDataTo.toLocalDate();
                    
                    asset.setRequestDateFrom(dateFrom);
                    asset.setRequestDateTo(dateTo);
                    
                    return asset;
                }
                else{
               
                return asset;
        }
    }
        }
     catch ( SQLException ex  ) {
            Logger.getLogger(AssetDB.class.getName()).log(Level.SEVERE, null, ex);
            throw new AssetDBException("error getting asset", ex);
        }
        return null;
    }
    private PreparedStatement prepStmtcode(Connection conn, String psql, String reqID) throws SQLException {
       PreparedStatement pStmt = conn.prepareStatement(psql);
        pStmt.setString(1, reqID);
        return pStmt;
    }    

    // a method to update a request
    public void updateForm(AssetBean asset) throws SQLException, AssetDBException {
       		String psql = " UPDATE AssetDB.reqform SET "
		                   + " ReqStatus = ? "
		                   + " WHERE ReqID = ? ";
                
                try{
                    PreparedStatement pStmt = con.prepareStatement(psql);
                    pStmt.setString(1, asset.getReqStatus());
                    pStmt.setInt(2, asset.getReqid());
                pStmt.executeUpdate();
                    }
                catch (SQLException ex  ) {
                Logger.getLogger(AssetDB.class.getName()).log(Level.SEVERE, null, ex);
                    throw new AssetDBException("error updating Form ", ex);
                
            
        }
    }

    /**
     *
     * @param asset
     * @throws SQLException
     * @throws AssetDBException
     */
    public void deleteForm(AssetBean asset) throws SQLException, AssetDBException {
       		String psql = " DELETE AssetDB.reqform  "
		              + " WHERE ReqID = ? ";
                
                try{
                    PreparedStatement pStmt = con.prepareStatement(psql);
                                        pStmt.setInt(2, asset.getReqid());
                pStmt.executeUpdate();
                    }
                catch (SQLException ex  ) {
                Logger.getLogger(AssetDB.class.getName()).log(Level.SEVERE, null, ex);
                    throw new AssetDBException("error updating Form ", ex);
                
            
        }
}
    }
    