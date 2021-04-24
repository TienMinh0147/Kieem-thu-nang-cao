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
@PrepareForTest({JdbcHelper.class, NguochocDao.class})
public class NguochocDaoNGTest {
    NguochocDao nguoihocdao;
    NguochocDao nguoihocdaospy;
    
    public NguochocDaoNGTest() {
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
         nguoihocdao = new NguochocDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        nguoihocdao = PowerMockito.spy(new NguochocDao());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

   @Test(expectedExceptions = Exception.class)
    public void testInsertWWithNullModel() {
        System.out.println("insert");
        NguoiHoc model = null;
        NguochocDao instance = new NguochocDao();
        instance.insert(model);
        
    }
    @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        NguoiHoc model = new NguoiHoc();
        NguochocDao instance = new NguochocDao();
        instance.insert(model);
        
    }
    @Test
    public void testInsertWithValidModer() {
        System.out.println("insert");
     NguoiHoc model = new NguoiHoc();
        NguochocDao instance = new NguochocDao();
       model.setDienthoai("");
       model.setGhichu("");
       model.setGioitinh(true);
       model.setGmail("");
       model.setHoten("");
       model.setMaNH("");
       model.setMaNV("");
       model.setNgayDK(new Date());
       model.setNgaysinh(new Date());
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        NguoiHoc model = null;
        NguochocDao instance = new NguochocDao();
        instance.update(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        NguochocDao instance = new NguochocDao();
        instance.delete(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        NguochocDao instance = new NguochocDao();
        List expResult = null;
        List result = instance.select();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        NguochocDao instance = new NguochocDao();
        List expResult = null;
        List result = instance.selectByKeyword(keyword);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByCourse() {
        System.out.println("selectByCourse");
        Integer makh = null;
        NguochocDao instance = new NguochocDao();
        List expResult = null;
        List result = instance.selectByCourse(makh);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        String manh = "";
        NguochocDao instance = new NguochocDao();
        NguoiHoc expResult = null;
        NguoiHoc result = instance.findById(manh);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
      @Test
    public void testFindByIdWithvalidID() throws Exception {
        System.out.println("findById");
        String MaNH = "024";
        NguoiHoc expectedTesult = new NguoiHoc();
        List<NguoiHoc> resultList = new ArrayList<>();
        resultList.add(expectedTesult);
        PowerMockito.doReturn(resultList)
                .when(nguoihocdaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        NguoiHoc result = nguoihocdaospy.findById(MaNH); 
        
        
        
    }
     @Test
    public void testFindByIdWithNotFoundID() throws Exception {
        System.out.println("findById");
        String MaNH = "024";
        NguoiHoc expectedTesult = null;
        List< NguoiHoc> resultList = new ArrayList<>();
        
        //resultList.add(expectedTesult);
        
        
        PowerMockito.doReturn(resultList)
                .when(nguoihocdaospy, "select", 
                        ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
       NguoiHoc result = nguoihocdaospy.findById(MaNH);
        
       Assert.assertThat(result, CoreMatchers.is(expectedTesult));
        
        
        
        
    }
    
    
}
