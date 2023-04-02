/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salkayali
 * 
 *  Test of class AssetBean.
 * Maybe delete the getter tests
 */
public class AssetBeanTest {
    
    public AssetBeanTest() {
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
     * Test of getAvailability method, of class AssetBean.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getAvailability();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAvailability method, of class AssetBean.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        String availability = "";
        AssetBean instance = new AssetBean();
        instance.setAvailability(availability);
        
    }

    /**
     * Test of getBackup method, of class AssetBean.
     */
    @Test
    public void testGetBackup() {
        System.out.println("getBackup");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getBackup();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBackup method, of class AssetBean.
     */
    @Test
    public void testSetBackup() {
        System.out.println("setBackup");
        String backup = "";
        AssetBean instance = new AssetBean();
        instance.setBackup(backup);
        
    }

    /**
     * Test of getCriticality method, of class AssetBean.
     */
    @Test
    public void testGetCriticality() {
        System.out.println("getCriticality");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getCriticality();
        assertEquals(expResult, result);
            }

    /**
     * Test of setCriticality method, of class AssetBean.
     */
    @Test
    public void testSetCriticality() {
        System.out.println("setCriticality");
        String criticality = "";
        AssetBean instance = new AssetBean();
        instance.setCriticality(criticality);
        
    }

    /**
     * Test of getDomain method, of class AssetBean.
     */
    @Test
    public void testGetDomain() {
        System.out.println("getDomain");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getDomain();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDomain method, of class AssetBean.
     */
    @Test
    public void testSetDomain() {
        System.out.println("setDomain");
        String domain = "";
        AssetBean instance = new AssetBean();
        instance.setDomain(domain);
        
    }

    /**
     * Test of getHost method, of class AssetBean.
     */
    @Test
    public void testGetHost() {
        System.out.println("getHost");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getHost();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHost method, of class AssetBean.
     */
    @Test
    public void testSetHost() {
        System.out.println("setHost");
        String host = "";
        AssetBean instance = new AssetBean();
        instance.setHost(host);
        
    }

    /**
     * Test of getMachineType method, of class AssetBean.
     */
    @Test
    public void testGetMachineType() {
        System.out.println("getMachineType");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getMachineType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMachineType method, of class AssetBean.
     */
    @Test
    public void testSetMachineType() {
        System.out.println("setMachineType");
        String machineType = "";
        AssetBean instance = new AssetBean();
        instance.setMachineType(machineType);
        
    }

    /**
     * Test of getOtherOs method, of class AssetBean.
     */
    @Test
    public void testGetOtherOs() {
        System.out.println("getOtherOs");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getOtherOs();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setOtherOs method, of class AssetBean.
     */
    @Test
    public void testSetOtherOs() {
        System.out.println("setOtherOs");
        String otherOs = "";
        AssetBean instance = new AssetBean();
        instance.setOtherOs(otherOs);
        
        
    }

    /**
     * Test of getOs method, of class AssetBean.
     */
    @Test
    public void testGetOs() {
        System.out.println("getOs");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getOs();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setOs method, of class AssetBean.
     */
    @Test
    public void testSetOs() {
        System.out.println("setOs");
        String os = "";
        AssetBean instance = new AssetBean();
        instance.setOs(os);
        
        
    }

    /**
     * Test of getAddReq method, of class AssetBean.
     */
    @Test
    public void testGetAddReq() {
        System.out.println("getAddReq");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getAddReq();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setAddReq method, of class AssetBean.
     */
    @Test
    public void testSetAddReq() {
        System.out.println("setAddReq");
        String addReq = "";
        AssetBean instance = new AssetBean();
        instance.setAddReq(addReq);
        
        
    }

    /**
     * Test of getHardReq method, of class AssetBean.
     */
    @Test
    public void testGetHardReq() {
        System.out.println("getHardReq");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getHardReq();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setHardReq method, of class AssetBean.
     */
    @Test
    public void testSetHardReq() {
        System.out.println("setHardReq");
        String hardReq = "";
        AssetBean instance = new AssetBean();
        instance.setHardReq(hardReq);
        
        
    }

    /**
     * Test of getDescription method, of class AssetBean.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setDescription method, of class AssetBean.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        AssetBean instance = new AssetBean();
        instance.setDescription(description);
        
        
    }

    /**
     * Test of getRole method, of class AssetBean.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        AssetBean instance = new AssetBean();
        String[] expResult = null;
        String[] result = instance.getRole();
        assertArrayEquals(expResult, result);
        
        
    }

    /**
     * Test of setRole method, of class AssetBean.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String[] role = null;
        AssetBean instance = new AssetBean();
        instance.setRole(role);
        
        
    }

    /**
     * Test of getBudget method, of class AssetBean.
     */
    @Test
    public void testGetBudget() {
        System.out.println("getBudget");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getBudget();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setBudget method, of class AssetBean.
     */
    @Test
    public void testSetBudget() {
        System.out.println("setBudget");
        String budget = "";
        AssetBean instance = new AssetBean();
        instance.setBudget(budget);
        
        
    }

    /**
     * Test of getRequester method, of class AssetBean.
     */
    @Test
    public void testGetRequester() {
        System.out.println("getRequester");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getRequester();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setRequester method, of class AssetBean.
     */
    @Test
    public void testSetRequester() {
        System.out.println("setRequester");
        String requester = "";
        AssetBean instance = new AssetBean();
        instance.setRequester(requester);
        
        
    }

    /**
     * Test of getRequestDateTo method, of class AssetBean.
     */
    @Test
    public void testGetRequestDateTo() {
        System.out.println("getRequestDateTo");
        AssetBean instance = new AssetBean();
        LocalDate expResult = null;
        LocalDate result = instance.getRequestDateTo();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setRequestDateTo method, of class AssetBean.
     */
    @Test
    public void testSetRequestDateTo() {
        System.out.println("setRequestDateTo");
        LocalDate requestDateTo = null;
        AssetBean instance = new AssetBean();
        instance.setRequestDateTo(requestDateTo);
        
        
    }

    /**
     * Test of getRequestDateFrom method, of class AssetBean.
     */
    @Test
    public void testGetRequestDateFrom() {
        System.out.println("getRequestDateFrom");
        AssetBean instance = new AssetBean();
        LocalDate expResult = null;
        LocalDate result = instance.getRequestDateFrom();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setRequestDateFrom method, of class AssetBean.
     */
    @Test
    public void testSetRequestDateFrom() {
        System.out.println("setRequestDateFrom");
        LocalDate requestDateFrom = null;
        AssetBean instance = new AssetBean();
        instance.setRequestDateFrom(requestDateFrom);
        
        
    }

    /**
     * Test of getRequestType method, of class AssetBean.
     */
    @Test
    public void testGetRequestType() {
        System.out.println("getRequestType");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getRequestType();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setRequestType method, of class AssetBean.
     */
    @Test
    public void testSetRequestType() {
        System.out.println("setRequestType");
        String requestType = "";
        AssetBean instance = new AssetBean();
        instance.setRequestType(requestType);
        
        
    }

    /**
     * Test of getCode method, of class AssetBean.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCode method, of class AssetBean.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        AssetBean instance = new AssetBean();
        instance.setCode(code);
        
        
    }

    /**
     * Test of getTitle method, of class AssetBean.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        AssetBean instance = new AssetBean();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setTitle method, of class AssetBean.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        AssetBean instance = new AssetBean();
        instance.setTitle(title);
        
        
    }
    
}
