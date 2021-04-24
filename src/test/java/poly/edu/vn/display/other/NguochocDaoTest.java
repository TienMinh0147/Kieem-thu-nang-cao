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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Tien Minh
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({JdbcHelper.class, NguochocDao.class})
public class NguochocDaoTest {
     NguochocDao nguoihocdao;
    NguochocDao nguoihocdaoSpy;
    
    public NguochocDaoTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         nguoihocdao= new NguochocDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        nguoihocdao= PowerMockito.spy(new NguochocDao());
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
       
     NguoiHoc model = null;
        nguoihocdao.insert(model);
       
    }

   @Test(expected = Exception.class)
   
 public void testInsertWithEmptyModel() {
       
        NguoiHoc model = new NguoiHoc();
     
      nguoihocdao.insert(model);
       
    }
@Test()
 public void testInsertValidModel() {
       
        NguoiHoc model = new NguoiHoc();
        model.setDienthoai("014242424");
        model.setGhichu("ko");
        model.setGioitinh(true);
        model.setGmail("minh@gmail.com");
        model.setHoten("Minh");
        model.setMaNH("CD02");
        model.setMaNV("03");
        model.setNgayDK(new Date());
        model.setNgaysinh(new Date());
     
        nguoihocdao.insert(model);
       
    }
 @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
      
        NguoiHoc model = null;
       nguoihocdao.update(model);
    }
    
     @Test(expected = Exception.class)
    public void testUpdateWithNEmptyModel() {
      
        NguoiHoc model = new NguoiHoc();
      nguoihocdao.update(model);
    }
    public void testUpdateWithNVaidModel() {
       NguoiHoc model = new NguoiHoc();
        model.setDienthoai("014242424");
        model.setGhichu("ko");
        model.setGioitinh(true);
        model.setGmail("minh@gmail.com");
        model.setHoten("Minh");
        model.setMaNH("CD02");
        model.setMaNV("03");
         model.setNgayDK(new Date());
        model.setNgaysinh(new Date());
      
   
       nguoihocdao.update(model);
    }
  @Test(expected = Exception.class)
    public void testDeleteWithEmptyId() {
       
        String MaNH = "02";
       
        nguoihocdao.delete(MaNH);
    }
    @Test(expected = Exception.class)
    public void testDeleteWithNullID() {
       
        String MaNH = null;
       
        nguoihocdao.delete(MaNH);
    
    
    }
    @Test()
    public void testDeleteWithValidID() {
       
        String MaNH = "12";
       
      nguoihocdao.delete(MaNH);
    
    
    }
    @Test
    public void testSelect() {
        System.out.println("select");
        NguochocDao instance = new NguochocDao();
        List<NguoiHoc> expResult = null;
        List<NguoiHoc> result = instance.select();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        NguochocDao instance = new NguochocDao();
        List<NguoiHoc> expResult = null;
        List<NguoiHoc> result = instance.selectByKeyword(keyword);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByCourse() {
        System.out.println("selectByCourse");
        Integer makh = null;
        NguochocDao instance = new NguochocDao();
        List<NguoiHoc> expResult = null;
        List<NguoiHoc> result = instance.selectByCourse(makh);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testFindByIdWithNotFound() throws Exception{
        System.out.println("findById");
        String MaNH = null;
        NguoiHoc expResult = null;
        List<NguoiHoc> resultList = new ArrayList<>();
        
        
        PowerMockito.doReturn(resultList).when(nguoihocdaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        NguoiHoc result = nguoihocdao.findById(MaNH);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testFindByIdWithFound() throws Exception{
        System.out.println("findById");
        String MaNH = "12";
        NguoiHoc expResult = new NguoiHoc();
       
        List<NguoiHoc> resultList = new ArrayList<>();
        resultList.add(expResult);
        
        
        PowerMockito.doReturn(resultList).when(nguoihocdaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        NguoiHoc result = nguoihocdaoSpy.findById(MaNH);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    
    
}
