/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * This class stores the user data
 * @author salkayali
 */
public class UserBean {
      private String username;
      private String password;
      private String firstName;
      private String lastName;

    /**
     * boolean valid
     */
    public boolean valid;
	
    /**
     * returns firstName
     * @returns firstName
     */
    public String getFirstName() {
         return firstName;
	}

    /**
     * set FirstName
     * @param newFirstName
     */
    public void setFirstName(String newFirstName) {
         firstName = newFirstName;
	}

    /**
     * return lastName
     * @return lastName
     */
    public String getLastName() {
         return lastName;
			}

    /**
     * set LastName
     * @param newLastName
     */
    public void setLastName(String newLastName) {
         lastName = newLastName;
			}
			
    /**
     * return password
     * @return password
     */
    public String getPassword() {
         return password;
	}

    /**
     * set Password
     * @param newPassword
     */
    public void setPassword(String newPassword) {
         password = newPassword;
	}
	
    /**
     * return username
     * @return username
     */
    public String getUsername() {
         return username;
			}

    /**
     * set UserName
     * @param newUsername
     */
    public void setUserName(String newUsername) {
         username = newUsername;
			}

    /**
     * returns if isValid
     * @return isValid
     */
    public boolean isValid() {
         return valid;
	}

    /**
     * sets Valid
     * @param newValid
     */
    public void setValid(boolean newValid) {
         valid = newValid;
	}	
}

