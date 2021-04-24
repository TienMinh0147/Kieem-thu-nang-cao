/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import java.util.ArrayList;
import java.util.Date;
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
@PrepareForTest({JdbcHelper.class, HocvienDao.class})
public class HocvienDaoNGTest {
     HocvienDao hocviendao;
    HocvienDao hocviendaospy;
    
    public HocvienDaoNGTest() {
    }
     @ObjectFactory
    public IObjectFactory getObjectFactory(){
        return  new org.powermock.modules.testng.PowerMockObjectFactory();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
          hocviendao = new HocvienDao();
        PowerMockito.mockStatic(JdbcHelper.class);
       hocviendaospy = PowerMockito.spy(new HocvienDao());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertWWithNullModel() {
        System.out.println("insert");
        HocVien model = null;
        HocvienDao instance = new  HocvienDao();
        instance.insert(model);
        
    }
    @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
         HocVien model = new HocVien();
         HocvienDao instance = new  HocvienDao();
         
        instance.insert(model);
        
    }
    @Test
    public void testInsertWithValidModer() {
        System.out.println("insert");
          HocVien model = new  HocVien();
         HocvienDao instance = new  HocvienDao();
      model.setDiem(10);
      model.setMaHV(2);
      model.setMaKH(0);
      model.setMaNH("");
        
    }


    @Test
    public void testUpdate() {
        System.out.println("update");
        HocVien model = null;
        HocvienDao instance = new HocvienDao();
        instance.update(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaHV = null;
        HocvienDao instance = new HocvienDao();
        instance.delete(MaHV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        HocvienDao instance = new HocvienDao();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

   @Test
    public void testFindByIdWithvalidID() throws Exception {
        System.out.println("findById");
        Integer MaHV = 12;
        HocVien expectedTesult = new HocVien();
        List<HocVien> resultList = new ArrayList<>();
        resultList.add(expectedTesult);
        PowerMockito.doReturn(resultList)
                .when(hocviendaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        HocVien result = hocviendaospy.findById(MaHV);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
     @Test
    public void testFindByIdWithNotFoundID() throws Exception {
        System.out.println("findById");
        Integer makh = -1;
        HocVien expectedTesult = null;
        List<HocVien> resultList = new ArrayList<>();
        
        //resultList.add(expectedTesult);
        
        
        PowerMockito.doReturn(resultList)
                .when(hocviendaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        HocVien result = hocviendaospy.findById(makh);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
    
}
