/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import java.util.ArrayList;

import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author Tien Minh
 */
@PrepareForTest({JdbcHelper.class, ChuyendeDao.class})
public class ChuyendeDaoNGTest {
   ChuyendeDao chuyendedao;
    ChuyendeDao chuyendedaospy;
    
    public ChuyendeDaoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
     @ObjectFactory
    public IObjectFactory getObjectFactory(){
        return  new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    
    

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        chuyendedao = new ChuyendeDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        chuyendedao = PowerMockito.spy(new ChuyendeDao());
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertWWithNullModel() {
        System.out.println("insert");
        ChuyenDe model = null;
        ChuyendeDao instance = new ChuyendeDao();
        instance.insert(model);
        
    }
      @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        ChuyenDe model = new ChuyenDe();
       ChuyendeDao instance = new ChuyendeDao();
        instance.insert(model);
        
    }
    @Test
    public void testInsertWithValidModer() {
        System.out.println("insert");
       ChuyenDe model = new ChuyenDe();
        ChuyendeDao instance = new ChuyendeDao();
        model.setHinh("");
        model.setHocPhi(30);
        model.setMaCD("");
        model.setMoTa("");
        model.setTenCD("");
        model.setThoiLuong(0);
       
        instance.insert(model);
        
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe model = null;
        ChuyendeDao instance = new ChuyendeDao();
        instance.update(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaCD = "";
        ChuyendeDao instance = new ChuyendeDao();
        instance.delete(MaCD);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        ChuyendeDao instance = new ChuyendeDao();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTim() {
        System.out.println("tim");
        ChuyendeDao instance = new ChuyendeDao();
        instance.tim();
        fail("The test case is a prototype.");
    }

     @Test
    public void testFindByIdWithvalidID() throws Exception {
        System.out.println("findById");
        String MaCD = "CD02";
        ChuyenDe expectedTesult = new ChuyenDe ();
        List<ChuyenDe> resultList = new ArrayList<>();
        resultList.add(expectedTesult);
        PowerMockito.doReturn(resultList)
                .when(chuyendedaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        ChuyenDe result = chuyendedaospy.findById(MaCD);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
     @Test
    public void testFindByIdWithNotFoundID() throws Exception {
        System.out.println("findById");
        String MaCD = "CD02";
       ChuyenDe expectedTesult = null;
        List<ChuyenDe> resultList = new ArrayList<>();
        
        //resultList.add(expectedTesult);
        
        
        PowerMockito.doReturn(resultList)
                .when(chuyendedaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        ChuyenDe result = chuyendedaospy.findById(MaCD);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
    
}
