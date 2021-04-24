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
@PrepareForTest({JdbcHelper.class, KhoahocDao.class})
public class KhoahocDaoNGTest {
    KhoahocDao khoahocdao;
    KhoahocDao khoahocdaospy;
    
    public KhoahocDaoNGTest() {
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
        khoahocdao = new KhoahocDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        khoahocdaospy = PowerMockito.spy(new KhoahocDao());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertWWithNullModel() {
        System.out.println("insert");
        KhoaHoc model = null;
        KhoahocDao instance = new KhoahocDao();
        instance.insert(model);
        
    }
    @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc();
        KhoahocDao instance = new KhoahocDao();
        instance.insert(model);
        
    }
    @Test
    public void testInsertWithValidModer() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc();
        KhoahocDao instance = new KhoahocDao();
        model.setGhiChu("");
        model.setHocPhi(20);
        model.setMaCD("12");
        model.setMaKH(0);
        model.setMaNV("CD01");
        model.setNgayKG(new Date());
        model.setNgayTao(new Date());
        model.setThoiLuong(200);
        instance.insert(model);
        
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        KhoaHoc model = null;
        KhoahocDao instance = new KhoahocDao();
        instance.update(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = null;
        KhoahocDao instance = new KhoahocDao();
        instance.delete(MaKH);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        KhoahocDao instance = new KhoahocDao();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByIdWithvalidID() throws Exception {
        System.out.println("findById");
        Integer makh = 12;
        KhoaHoc expectedTesult = new KhoaHoc();
        List<KhoaHoc> resultList = new ArrayList<>();
        resultList.add(expectedTesult);
        PowerMockito.doReturn(resultList)
                .when(khoahocdaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        KhoaHoc result = khoahocdaospy.findById(makh);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
     @Test
    public void testFindByIdWithNotFoundID() throws Exception {
        System.out.println("findById");
        Integer makh = -1;
        KhoaHoc expectedTesult = null;
        List<KhoaHoc> resultList = new ArrayList<>();
        
        //resultList.add(expectedTesult);
        
        
        PowerMockito.doReturn(resultList)
                .when(khoahocdaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        KhoaHoc result = khoahocdaospy.findById(makh);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
    
}
