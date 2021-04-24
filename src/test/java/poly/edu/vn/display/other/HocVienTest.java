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
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author Tien Minh
 */
public class HocVienTest {
    
    public HocVienTest() {
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
    public void testGetMaHV() {
      
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaHV();
       
    }

    
    public void testSetMaHV() {
     
        int maHV = 0;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
       
    }

    
    @Test
    public void testGetMaKH() {
        
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaKH();
      
    }

  
    @Test
    public void testSetMaKH() {
       
        int maKH = 0;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
        
    }

    /**
     * Test of getMaNH method, of class HocVien.
     */
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        HocVien instance = new HocVien();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMaNH method, of class HocVien.
     */
    @Test
    public void testSetMaNH() {
     
        String maNH = "";
        HocVien instance = new HocVien();
        instance.setMaNH(maNH);
       
    }

    /**
     * Test of getDiem method, of class HocVien.
     */
    @Test
    public void testGetDiem() {
      
        HocVien instance = new HocVien();
        double expResult = 0.0;
        double result = instance.getDiem();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setDiem method, of class HocVien.
     */
    @Test
    public void testSetDiem() {
      
        double diem = 0.0;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
       
    }
    
    @Test      
    public void testSetDiemWithNegative() {
       
        double diem = -5;
        HocVien instance = new HocVien();
       
         Exception exception = 
                assertThrows(Exception.class, 
                        ()-> instance.setDiem(diem)
         );
         
    
}
    @Test      
    public void testSetDiemWithLage() {
       
        double diem = 10;
        HocVien instance = new HocVien();
       
         Exception exception = 
                Assertions.assertThrows(Exception.class, 
                        ()-> instance.setDiem(diem)
         );
}
}