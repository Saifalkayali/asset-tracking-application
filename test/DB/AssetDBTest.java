/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import model.AssetBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *This is Test class for AssetDB
 * @author salkayali
 */
public class AssetDBTest {
    
    public AssetDBTest() {
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
     * Test of insertForm method, of class AssetDB.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsertForm() throws Exception {
        System.out.println("insertForm");
        AssetBean asset = null;
        AssetDB instance = new AssetDB();
        instance.insertForm(asset);
        
    }
    
}
