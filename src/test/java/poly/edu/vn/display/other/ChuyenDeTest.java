/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tien Minh
 */
public class ChuyenDeTest {
    
    public ChuyenDeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    @Test
    public void testGetMaCD() {
      
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
     
    }

    @Test
    public void testSetMaCD() {
       
        String MaCD = "M01";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(MaCD);
        String expected ="M01";
        assertEquals(expected, instance.getMaCD());
       
    }

    /**
     * Test of getTenCD method, of class ChuyenDe.
     */
    @Test
    public void testGetTenCD() {
        System.out.println("getTenCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getTenCD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTenCD method, of class ChuyenDe.
     */
    @Test
    public void testSetTenCD() {
        System.out.println("setTenCD");
        String TenCD = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(TenCD);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testGetHocPhi() {
       
        ChuyenDe instance = new ChuyenDe();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetHocPhi() {
        
        double HocPhi = 600;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(HocPhi);
        
        double expected = 600;
        double result = instance.getHocPhi();
        
        assertEquals(expected, result, 0.0);
       
    }
    @Test
    public void testSetHocPhiWithNegative() {
        
        double HocPhi = -600;
        ChuyenDe instance = new ChuyenDe();
        
        
       
        Exception exception = 
                assertThrows(Exception.class, 
                        ()-> instance.setHocPhi
        (HocPhi) );
        
        
     
     
    }
    @Test
    public void testSetHocPhiWithLarge() {
        
        double HocPhi = 600000000000d;
        ChuyenDe instance = new ChuyenDe();
        
        
       
        Exception exception = assertThrows(Exception.class, 
                        ()-> instance.setHocPhi
        (HocPhi) );
        
     
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getThoiLuong method, of class ChuyenDe.
     */
    @Test
    public void testGetThoiLuong() {
      
        ChuyenDe instance = new ChuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setThoiLuong method, of class ChuyenDe.
     */
    @Test
    public void testSetThoiLuong() {
       
        int ThoiLuong = 10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(ThoiLuong);
        int expected =10;
        int result = instance.getThoiLuong();
        assertEquals(expected, result);
      
    }
      @Test
    public void testSetThoiLuongWithNegative() {
        
       
        int ThoiLuong = -10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(ThoiLuong);
       Exception ex = assertThrows(Exception.class, ()->instance.setThoiLuong(ThoiLuong));
   
       
    }

    /**
     * Test of getHinh method, of class ChuyenDe.
     */
    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getHinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHinh method, of class ChuyenDe.
     */
    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String hinh = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinh(hinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoTa method, of class ChuyenDe.
     */
    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMoTa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoTa method, of class ChuyenDe.
     */
    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String MoTa = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(MoTa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
