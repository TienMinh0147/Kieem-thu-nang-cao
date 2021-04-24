/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tien Minh
 */
public class NhanVienTest {
    
    public NhanVienTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class NhanVien.
     */
  
    /**
     * Test of getMaNV method, of class NhanVien.
     */
    @Test
    public void testGetMaNV() {
   
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaNV method, of class NhanVien.
     */
    @Test
    public void testSetMaNV() {
      
        String maNV = "";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
      
    }

    /**
     * Test of getMatKhau method, of class NhanVien.
     */
    @Test
    public void testGetMatKhau() {
       
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMatKhau method, of class NhanVien.
     */
    @Test
    public void testSetMatKhau() {
      
        String matKhau = "";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
       
    }

    /**
     * Test of getHoTen method, of class NhanVien.
     */
    @Test
    public void testGetHoTen() {
    
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHoTen method, of class NhanVien.
     */
    @Test
    public void testSetHoTen() {
     
        String hoTen = "";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
       
    }

    /**
     * Test of isVaiTro method, of class NhanVien.
     */
    @Test
    public void testIsVaiTro() {
     
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = instance.isVaiTro();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setVaiTro method, of class NhanVien.
     */
    @Test
    public void testSetVaiTro() {
      
        boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
       
    }
    
}
