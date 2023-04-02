<%-- 
    Document   : index
    Created on : Dec 12, 2017, 3:54:22 PM
    Author     : salkayali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="AssetCss.css">
        <title> IT Asset Request Client </title>
    </head>
    <body>
        <h1> IT Asset Request Client </h1>
        <c:if test="${errMsgs !=null}">
            
                <c:forEach var="errMsgs"  items="${errMsgs}">
                    
                        <p id="errs">${errMsgs}</p>
                    
                </c:forEach>
            
        </c:if>
        <table border="1"  id="tbl1">
            <form action="submitForm">
               <tr>
                    <td><label> Request Title(short description): </label><input type="text" name="title" value="${param.title}" length="80" /></td>
                </tr>
                <tr>
                    <td><label> Project Code: </label><input type="text" name="code" value="${param.code}" length="20"/></td>
                </tr>
                <tr>
                    <td><label> Request Type : </label> <input type="radio" name="requestType" value="Permanent" /> <label> Permanent </label>
                        <input type="radio" name="requestType" value="Temporary" /> <label> Temporary </label>
                </tr>
                <tr>
                    <td> <label>Request Date(yyyy-mm-dd): </label><br>
                    <label> From: </label><input type="text" name="requestDateFrom"  length="20"/>
                    <label> To: </label><input type="text" name="requestDateTo"  length="20"/>
                </tr>    
                <tr>
                    <td><label> Requester Name: </label><input type="text" name="requester" value="" length="20"/></td>
                </tr>
                <tr>
                    <td><label> Is there a budget?</label>
                            <select  name="budget" value="budget">
                                <option name="budget" value="" > </option>
                                <option name="budget" value="Yes">Yes</option>
                                <option name="budget" value="No">No</option>
                              </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Role of Asset(choose all that apply):</label>
                        <input type="checkbox" name="role" value="Support" /><label>Support</label>
                        <input type="checkbox" name="role" value="Compile" /><label>Compile</label>
                        <input type="checkbox" name="role" value="Development" /><label>Development</label>
                        <input type="checkbox" name="role" value="Testing" /><label>Testing</label>
                        <input type="checkbox" name="role" value="Certification Testing" /><label>Certification Testing</label>
                        <input type="checkbox" name="role" value="IT \Other" /><label>IT\Other</label>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Description of Need(Justification for request. Specify if this is for a project, red flag, etc..): </label> <br>
                        <textarea id="area" name="description" rows="4" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                          <label>Hardware Requirements: (Processor, Memory, Diskspace, etc..) </label><br>
                        <textarea  id="area" name="hardReq" rows="4" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Additional Requirements: </label><br>
                        <textarea id="area" name="addReq" rows="4" cols="60"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label> Operating System: </label><br>
                        <input type="radio" name="os" value="Windows 7 x64" /> <label> Windows 7 x64 </label><br>
                        <input type="radio" name="os" value="Windows 10 x64" /><label> Windows 10 x64 </label><br>
                        <input type="radio" name="os" value="Windows Server 2012 R2 x64" /> <label> Windows Server 2012 R2 x64 </label> <br>
                        <input type="radio" name="os" value="Windows Server 2016 x64" /> <label>Windows Server 2016 x64 </label> <br>
                        <input type="radio" name="os" value="Red Hat Linux 7 x 64" /> <label> Red Hat Linux 7 x 64 </label> <br>
                        <input type="radio" name="os" /> <label> Other </label><input type="text" name="otherOs" value="" /> <br> 
                    </td>
                </tr>
                <tr>
                    <td>
                        <label> Physical or Virtual machine:</label>
                        <select name="machineType" id="sel" >
                                <option value=""></option>
                                <option value="No Preference">No Preference</option>
                                <option value="Physical">Physical</option>
                                <option value="Virtual">Virtual</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Hostname(s):</label>
                        <input type="text" name="host" value="" />
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Added to IT domain:</label>
                         <select name="domain">
                                <option value=""></option>
                                <option value="Yes">Yes</option>
                                <option value="No">No</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>IP Settings(DHCP or Static):</label><br>
                        <input type="radio" name="ipsettings" value="DHCP IP" /> <label> DHCP </label> <br>
                        <input type="radio" name="ipsettings" value="Static IP" /> <label> Static </label><br>
                         <label>IP Address:</label>
                         <input type="text" name="ipaddress" value="" />
                    </td>
                </tr>
                <tr>
                    <td>
                         <label>Criticality of Asset:</label>
                          <select name="criticality">
                                <option value=""></option>
                                <option value="Yes">Yes</option>
                                <option value="No">No</option>
                          </select>
                        <label>Backup Required:</label>
                        <select  name="backup">
                                <option value=""></option>
                                <option value="Yes">Yes</option>
                                <option value="No">No</option>
                        </select><br>
                        <label>High Availability Required: </label>
                        <select  name="availability">
                                <option value=""></option>
                                <option value="Yes">Yes</option>
                                <option value="No">No</option>
                        </select>
                    </td>
                </tr>
                 
                
            </tbody>
        </table>
       
                        <input id="btn" type="submit" value="SUBMIT" />
                    
            </form>
               
        
    </body>
</html>
