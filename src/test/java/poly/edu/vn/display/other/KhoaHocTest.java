/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author Tien Minh
 */
public class KhoaHocTest {
    
    public KhoaHocTest() {
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

   
    @Test
    public void testGetMaKH() {
       
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(expResult, result);
       
    }

    
    @Test
    public void testSetMaKH() {
    
        int maKH = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKH(maKH);
      
    }

  
    @Test
    public void testGetMaCD() {
     
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaCD method, of class KhoaHoc.
     */
    @Test
    public void testSetMaCD() {
       
        String maCD = "M01";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaCD(maCD);
        String expected ="M01";
        assertEquals(expected, instance.getMaCD());
    }

    
    @Test
    public void testGetHocPhi() {
       
        KhoaHoc instance = new KhoaHoc();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setHocPhi method, of class KhoaHoc.
     */
    @Test
    public void testSetHocPhi() {
       
        double hocPhi = 700;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
        double expected = 700;
        double result = instance.getHocPhi();
        
        assertEquals(expected, result, 0.0);
    }
    
    @org.junit.jupiter.api.Test
    public void testSetHocPhiWithNegative() {
        System.out.println("");
        double HocPhi = -700;
        ChuyenDe instance = new ChuyenDe();
        
        
       
        Exception exception = 
                assertThrows(Exception.class, 
                        ()-> instance.setHocPhi
        (HocPhi) );
           
 

   
}
       @org.junit.jupiter.api.Test
    public void testSetHocPhiWithLarge() {
        
        double HocPhi = 700000000000d;
        ChuyenDe instance = new ChuyenDe();
        
        
       
        Exception exception = assertThrows(Exception.class, 
                        ()-> instance.setHocPhi
        (HocPhi) );
        
     
        // TODO review the generated test code and remove the default call to fail.
     
    }
    @Test
    public void testGetThoiLuong() {
      
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setThoiLuong method, of class KhoaHoc.
     */
    @Test
    public void testSetThoiLuong() {
      
        int thoiLuong = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
       
    }

    /**
     * Test of getNgayKG method, of class KhoaHoc.
     */
    @Test
    public void testGetNgayKG() {
    
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayKG();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNgayKG method, of class KhoaHoc.
     */
    @Test
    public void testSetNgayKG() {
      
        Date ngayKG = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayKG(ngayKG);
        
    }

    /**
     * Test of getGhiChu method, of class KhoaHoc.
     */
    @Test
    public void testGetGhiChu() {
      
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getGhiChu();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGhiChu method, of class KhoaHoc.
     */
    @Test
    public void testSetGhiChu() {
     
        String ghiChu = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setGhiChu(ghiChu);
      
    }

    /**
     * Test of getMaNV method, of class KhoaHoc.
     */
    @Test
    public void testGetMaNV() {
       
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMaNV method, of class KhoaHoc.
     */
    @Test
    public void testSetMaNV() {
       
        String maNV = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaNV(maNV);
       
    }

    /**
     * Test of getNgayTao method, of class KhoaHoc.
     */
    @Test
    public void testGetNgayTao() {
       
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayTao();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setNgayTao method, of class KhoaHoc.
     */
    @Test
    public void testSetNgayTao() {
     
        Date ngayTao = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayTao(ngayTao);
        
    }
    
}
