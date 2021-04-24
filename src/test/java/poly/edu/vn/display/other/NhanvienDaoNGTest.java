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
@PrepareForTest({JdbcHelper.class, NhanvienDao.class})
public class NhanvienDaoNGTest {
    NhanvienDao nhanviendao;
    NhanvienDao nhanviendaospy;
    
    
    public NhanvienDaoNGTest() {
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
         nhanviendao = new NhanvienDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        nhanviendao= PowerMockito.spy(new NhanvienDao());
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertWWithNullModel() {
        System.out.println("insert");
        NhanVien model = null;
        NhanvienDao instance = new NhanvienDao();
        instance.insert(model);
        
    }
    @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        NhanVien model = new NhanVien();
        NhanvienDao instance = new NhanvienDao();
        instance.insert(model);
        
    }
    @Test
    public void testInsertWithValidModer() {
        System.out.println("insert");
        NhanVien model = new NhanVien();
        NhanvienDao instance = new NhanvienDao();
        model.setHoTen("");
        model.setMaNV("");
        model.setMatKhau("");
        model.setVaiTro(true);
       
        instance.insert(model);
        
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien model = null;
        NhanvienDao instance = new NhanvienDao();
        instance.update(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate1() {
        System.out.println("update1");
        Doipass model = null;
        NhanvienDao instance = new NhanvienDao();
        instance.update1(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNV = "";
        NhanvienDao instance = new NhanvienDao();
        instance.delete(MaNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        NhanvienDao instance = new NhanvienDao();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByIdWithvalidID() throws Exception {
        System.out.println("findById");
        String MaNV = "12";
        NhanVien expectedTesult = new NhanVien();
        List<NhanVien> resultList = new ArrayList<>();
        resultList.add(expectedTesult);
        PowerMockito.doReturn(resultList)
                .when(nhanviendaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
       NhanVien result = nhanviendaospy.findById(MaNV);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
     @Test
    public void testFindByIdWithNotFoundID() throws Exception {
        System.out.println("findById");
        String MaNV = "-1";
        NhanVien expectedTesult = null;
        List<NhanVien> resultList = new ArrayList<>();
        
        //resultList.add(expectedTesult);
        
        
        PowerMockito.doReturn(resultList)
                .when(nhanviendaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
       NhanVien result = nhanviendaospy.findById(MaNV);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
    
}
