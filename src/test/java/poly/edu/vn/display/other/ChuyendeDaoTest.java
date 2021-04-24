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
@PrepareForTest({JdbcHelper.class, ChuyendeDao.class})
public class ChuyendeDaoTest {
    
    ChuyendeDao chuyenDedao;
    ChuyendeDao chuyenDedaoSpy;
    
    public ChuyendeDaoTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        chuyenDedao= new ChuyendeDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        chuyenDedaoSpy= PowerMockito.spy(new ChuyendeDao());
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
       
      ChuyenDe model = null;
        chuyenDedao.insert(model);
       
    }
    @Test(expected = Exception.class)
   
 public void testInsertWithEmptyModel() {
       
        ChuyenDe model = new ChuyenDe();
     
        chuyenDedao.insert(model);
       
    }
 @Test()
 public void testInsertValidModel() {
       
        ChuyenDe model = new ChuyenDe();
        model.setHinh("test.jpg");
        model.setHocPhi(100);
        model.setMaCD("CD01");
        model.setMoTa("Mo ta");
        model.setTenCD("Chuyen de");
        model.setThoiLuong(20);
     
        chuyenDedao.insert(model);
       
    }
    @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
      
        ChuyenDe model = null;
       chuyenDedao.update(model);
    }
    
     @Test(expected = Exception.class)
    public void testUpdateWithNEmptyModel() {
      
        ChuyenDe model = new ChuyenDe();
       chuyenDedao.update(model);
    }
    @Test()
    public void testUpdateWithNVaidModel() {
        ChuyenDe model = new ChuyenDe();
        model.setHinh("test.jpg");
        model.setHocPhi(100);
        model.setMaCD("CD01");
        model.setMoTa("Mo ta");
        model.setTenCD("Chuyen de");
        model.setThoiLuong(20);
      
   
       chuyenDedao.update(model);
    }


    @Test(expected = Exception.class)
    public void testDeleteWithEmptyId() {
       
        String MaCD = "";
       
        chuyenDedao.delete(MaCD);
    }
    @Test(expected = Exception.class)
    public void testDeleteWithNullID() {
       
        String MaCD = null;
       
        chuyenDedao.delete(MaCD);
    
    
    }
    
     @Test()
    public void testDeleteWithValidID() {
       
        String MaCD = "12";
       
        chuyenDedao.delete(MaCD);
    
    
    }
    @Test
    public void testSelect() throws Exception{
        System.out.println("select");
         ChuyenDe chuyenDe = new ChuyenDe();
        List<ChuyenDe> expResult = new ArrayList<>();
        expResult.add(chuyenDe);
        
        PowerMockito.doReturn(expResult).when(chuyenDedaoSpy, "select", ArgumentMatchers.anyString());
        List<ChuyenDe> result = chuyenDedaoSpy.select();
        assertThat(result, CoreMatchers.is(expResult));
    }

    @Test
    public void testTim() {
        System.out.println("tim");
        ChuyendeDao instance = new ChuyendeDao();
        instance.tim();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByIdWithNotFound() throws Exception{
        System.out.println("findById");
        String macd = null;
        ChuyenDe expResult = null;
        List<ChuyenDe> resultList = new ArrayList<>();
        
        
        PowerMockito.doReturn(resultList).when(chuyenDedaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        ChuyenDe result = chuyenDedaoSpy.findById(macd);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testFindByIdWithFound() throws Exception{
        System.out.println("findById");
        String macd = "12";
        ChuyenDe expResult = new ChuyenDe();
       
        List<ChuyenDe> resultList = new ArrayList<>();
        resultList.add(expResult);
        
        
        PowerMockito.doReturn(resultList).when(chuyenDedaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        ChuyenDe result = chuyenDedaoSpy.findById(macd);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    
}
