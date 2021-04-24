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
@PrepareForTest({JdbcHelper.class, NhanvienDao.class})
public class NhanvienDaoTest {
    NhanvienDao nhanviendao;
    NhanvienDao nhanviendaoSpy;
    
    public NhanvienDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       nhanviendao= new NhanvienDao();
        PowerMockito.mockStatic(JdbcHelper.class);
        nhanviendaoSpy= PowerMockito.spy(new NhanvienDao());
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
       
     NhanVien model = null;
        nhanviendao.insert(model);
       
    }
  @Test(expected = Exception.class)
   
 public void testInsertWithEmptyModel() {
       
        NhanVien model = new NhanVien();
     
        nhanviendao.insert(model);
       
    }
 @Test()
 public void testInsertValidModel() {
       
        NhanVien model = new NhanVien();
       model.setHoTen("");
       model.setMaNV("");
       model.setMatKhau("");
       model.setVaiTro(true);
     
        nhanviendao.insert(model);
       
    }
 
    @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
      
       NhanVien model = null;
       nhanviendao.update(model);
    }
    
     @Test(expected = Exception.class)
    public void testUpdateWithNEmptyModel() {
      
        NhanVien model = new NhanVien();
      nhanviendao.update(model);
    }
    @Test()
    public void testUpdateWithNVaidModel() {
         NhanVien model = new NhanVien();
       model.setHoTen("");
       model.setMaNV("");
       model.setMatKhau("");
       model.setVaiTro(true);
      
   
       nhanviendao.update(model);
    }
    @Test(expected = Exception.class)
    public void testDeleteWithEmptyId() {
       
        String MaNV = "";
       
        nhanviendao.delete(MaNV);
    }
    @Test(expected = Exception.class)
    public void testDeleteWithNullID() {
       
        String MaNV = null;
       
       nhanviendao.delete(MaNV);
    
    
    }
    
     @Test()
    public void testDeleteWithValidID() {
       
        String MaNV="12";
       
        nhanviendao.delete(MaNV);
    
    
    }

    
    @Test
    public void testFindByIdWithNotFound() throws Exception{
        System.out.println("findById");
        String MaNV = null;
        NhanVien expResult = null;
        List<NhanVien> resultList = new ArrayList<>();
        
        
        PowerMockito.doReturn(resultList).when(nhanviendaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        NhanVien result = nhanviendaoSpy.findById(MaNV);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
    @Test
    public void testFindByIdWithFound() throws Exception{
        System.out.println("findById");
        String MaNV = "12";
        NhanVien expResult = new NhanVien();
       
        List<NhanVien> resultList = new ArrayList<>();
        resultList.add(expResult);
        
        
        PowerMockito.doReturn(resultList).when(nhanviendaoSpy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
      
        
        NhanVien result = nhanviendaoSpy.findById(MaNV);
        
        
        assertThat(result, CoreMatchers.is(expResult));
    }
   
    
}
