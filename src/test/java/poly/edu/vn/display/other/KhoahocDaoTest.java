/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import java.util.ArrayList;
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
@PrepareForTest({JdbcHelper.class, KhoahocDao.class})
public class KhoahocDaoTest {
     KhoahocDao khoahocdao;
    KhoahocDao khoahocDaospy;
    
    public KhoahocDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         khoahocdao= new KhoahocDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        khoahocDaospy = PowerMockito.spy(new KhoahocDao());
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
       
      KhoaHoc model = null;
      khoahocdao.insert(model);
       
    }

    @Test(expected = Exception.class)
   
 public void testInsertWithEmptyModel() {
       
      KhoaHoc model = new KhoaHoc();
     
        khoahocdao.insert(model);
       
    }
 @Test()
 public void testInsertValidModel() {
       
        KhoaHoc model = new KhoaHoc();
       model.setGhiChu("");
       model.setHocPhi(30);
       model.setMaCD("CD02");
       model.setMaKH(0);
       model.setMaNV("02");
       model.setNgayKG(null);
       model.setNgayTao(null);
       model.setThoiLuong(20);
       
     
        
        khoahocdao.insert(model);
       
    }

    @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
      
        KhoaHoc model = null;
       khoahocdao.update(model);
    }

@Test(expected = Exception.class)
    public void testUpdateWithNEmptyModel() {
      
        KhoaHoc model = new KhoaHoc();
      khoahocdao.update(model);
    }
    
    @Test()
    public void testUpdateWithNVaidModel() {
       KhoaHoc model = new KhoaHoc();
       model.setGhiChu("");
       model.setHocPhi(30);
       model.setMaCD("CD02");
       model.setMaKH(0);
       model.setMaNV("02");
       model.setNgayKG(null);
       model.setNgayTao(null);
       model.setThoiLuong(20);
      
   
       khoahocdao.update(model);
    }
    
   @Test(expected = Exception.class)
    public void testDeleteWithEmptyId() {
       
        Integer MaKH = null;
       
        khoahocdao.delete(MaKH);
    }
    @Test(expected = Exception.class)
    public void testDeleteWithNullID() {
       
        Integer MaKH = null;
       
       khoahocdao.delete(MaKH);
    
    
    }
    @Test()
    public void testDeleteWithValidID() {
       
         Integer MaHV = null;
       
       khoahocdao.delete(MaHV);
    
    
    }
    @Test
    public void testSelect() throws Exception{
        System.out.println("select");
        KhoaHoc khoahoc = new KhoaHoc();
        List<KhoaHoc> expResult = new ArrayList<>();
        expResult.add(khoahoc);
        
        PowerMockito.doReturn(expResult).when(khoahocDaospy, "select", ArgumentMatchers.anyString());
        List<KhoaHoc> result = khoahocDaospy.select();
        assertThat(result, CoreMatchers.is(expResult));
    }

    @Test
    public void testFindByIdWithNotFound() throws Exception{
        System.out.println("findById");
        Integer MaKH = null;
        KhoaHoc expResult = null;
        List<KhoaHoc> resultList = new ArrayList<>();
        
        
        PowerMockito.doReturn(resultList).when(khoahocDaospy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        KhoaHoc result = khoahocDaospy.findById(MaKH);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testFindByIdWithFound() throws Exception{
        System.out.println("findById");
        Integer MaKH = null;
        KhoaHoc expResult = new KhoaHoc();
       
        List<KhoaHoc> resultList = new ArrayList<>();
        resultList.add(expResult);
        
        
        PowerMockito.doReturn(resultList).when(khoahocDaospy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        KhoaHoc result = khoahocDaospy.findById(MaKH);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    
    
}
