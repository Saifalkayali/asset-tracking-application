/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * 
 * 
 * @author salkayali
 */
public class DataClass {
    
    private DataSource db; 

    public DataClass() {
        try {
            db = getDataClass();
        } catch (NamingException ex) {
            Logger.getLogger(DataClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private DataSource getDataClass() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/");
    }
}
