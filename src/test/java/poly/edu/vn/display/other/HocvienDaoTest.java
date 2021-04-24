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
@PrepareForTest({JdbcHelper.class, HocvienDao.class})
public class HocvienDaoTest {
    
    HocvienDao hocviendao;
    HocvienDao hocviendaospy;
    
    public HocvienDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        hocviendao= new HocvienDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        hocviendaospy= PowerMockito.spy(new HocvienDao());
    }
    
    @After
    public void tearDown() {
    }

  @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
        
        HocVien model = null;
               hocviendao.insert(model);
        
    }
     public void testInsertWithEmptyModel() {
       
      HocVien model = new HocVien();
     
        hocviendao.insert(model);
       
    }
      @Test()
 public void testInsertValidModel() {
       
        HocVien model = new HocVien();
        model.setDiem(10);
        model.setMaHV(10);
        model.setMaKH(0);
       model.setMaNH("CD02");
  
        hocviendao.insert(model);
       
    }

     @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
      
        HocVien model = null;
       hocviendao.update(model);
    }
    @Test(expected = Exception.class)
    public void testUpdateWithNEmptyModel() {
      
        HocVien model = new HocVien();
       hocviendao.update(model);
    }
     @Test()
    public void testUpdateWithNVaidModel() {
        HocVien model = new HocVien();
        model.setDiem(10);
        model.setMaHV(10);
        model.setMaKH(0);
       model.setMaNH("CD02");
      
   
       hocviendao.update(model);
    }

    @Test(expected = Exception.class)
    public void testDeleteWithEmptyId() {
       
        Integer MaHV = null;
       
       hocviendao.delete(MaHV);
    }
    @Test(expected = Exception.class)
    public void testDeleteWithNullID() {
       
        Integer MaHV = null;
       
        hocviendao.delete(MaHV);
    
    
    }
    @Test()
    public void testDeleteWithValidID() {
       
        Integer MaHV = 12;
       
        hocviendao.delete(MaHV);
    
    
    }
    
    @Test
    public void testSelect() throws Exception {
        System.out.println("select");
        HocVien HocVien = new HocVien();
         List<HocVien> expResult = new ArrayList<>();
        expResult.add(HocVien);
        
        PowerMockito.doReturn(expResult).when(hocviendaospy, "select", ArgumentMatchers.anyInt());
        List<HocVien> result = hocviendaospy.select();
        assertThat(result, CoreMatchers.is(expResult));
    }
  
    @Test
    public void testFindByIdWithNotFound() throws Exception{
        System.out.println("findById");
        Integer MaHV = null;
        HocVien expResult = null;
        List<HocVien> resultList = new ArrayList<>();
        
        
        PowerMockito.doReturn(resultList).when(hocviendao, "select", ArgumentMatchers.anyInt(), ArgumentMatchers.any());
      
        
        HocVien result = hocviendaospy.findById(MaHV);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testFindByIdWithFound() throws Exception{
        System.out.println("findById");
        Integer MaHV = 12;
       HocVien expResult = new HocVien();
       
        List<HocVien> resultList = new ArrayList<>();
        resultList.add(expResult);
        
        
        PowerMockito.doReturn(resultList).when(hocviendaospy, "select", ArgumentMatchers.anyInt(), ArgumentMatchers.any());
      
        
        HocVien result = hocviendaospy.findById(MaHV);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    
    
}
