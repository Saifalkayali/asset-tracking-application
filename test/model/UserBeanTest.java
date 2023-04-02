/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test  of class UserBean.
 * @author salkayali
 */
public class UserBeanTest {
    
    public UserBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFirstName method, of class UserBean.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        UserBean instance = new UserBean();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFirstName method, of class UserBean.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String newFirstName = "";
        UserBean instance = new UserBean();
        instance.setFirstName(newFirstName);
        
    }

    /**
     * Test of getLastName method, of class UserBean.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        UserBean instance = new UserBean();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLastName method, of class UserBean.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String newLastName = "";
        UserBean instance = new UserBean();
        instance.setLastName(newLastName);
        
    }

    /**
     * Test of getPassword method, of class UserBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserBean instance = new UserBean();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class UserBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String newPassword = "";
        UserBean instance = new UserBean();
        instance.setPassword(newPassword);
        ;
    }

    /**
     * Test of getUsername method, of class UserBean.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        UserBean instance = new UserBean();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserName method, of class UserBean.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String newUsername = "";
        UserBean instance = new UserBean();
        instance.setUserName(newUsername);
        
    }

    /**
     * Test of isValid method, of class UserBean.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        UserBean instance = new UserBean();
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setValid method, of class UserBean.
     */
    @Test
    public void testSetValid() {
        System.out.println("setValid");
        boolean newValid = false;
        UserBean instance = new UserBean();
        instance.setValid(newValid);
        
    }
    
}
