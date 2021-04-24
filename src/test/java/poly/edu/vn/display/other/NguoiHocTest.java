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

/**
 *
 * @author Tien Minh
 */
public class NguoiHocTest {
    
    public NguoiHocTest() {
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
     * Test of toString method, of class NguoiHoc.
     */
   
    

    /**
     * Test of getMaNH method, of class NguoiHoc.
     */
    @Test
    public void testGetMaNH() {
        
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMaNH method, of class NguoiHoc.
     */
    @Test
    public void testSetMaNH() {
       
        String MaNH = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNH(MaNH);
          }

    /**
     * Test of getHoten method, of class NguoiHoc.
     */
    @Test
    public void testGetHoten() {
     
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getHoten();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHoten method, of class NguoiHoc.
     */
    @Test
    public void testSetHoten() {
     
        String Hoten = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setHoten(Hoten);
       
    }

    /**
     * Test of getNgaysinh method, of class NguoiHoc.
     */
    @Test
    public void testGetNgaysinh() {
       
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgaysinh();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNgaysinh method, of class NguoiHoc.
     */
    @Test
    public void testSetNgaysinh() {
     
        Date Ngaysinh = null;
        NguoiHoc instance = new NguoiHoc();
        instance.setNgaysinh(Ngaysinh);
        
    }

    /**
     * Test of isGioitinh method, of class NguoiHoc.
     */
    @Test
    public void testIsGioitinh() {
              NguoiHoc instance = new NguoiHoc();
        boolean expResult = false;
        boolean result = instance.isGioitinh();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setGioitinh method, of class NguoiHoc.
     */
    @Test
    public void testSetGioitinh() {
        
        boolean Gioitinh = false;
        NguoiHoc instance = new NguoiHoc();
        instance.setGioitinh(Gioitinh);
        
    }

    /**
     * Test of getDienthoai method, of class NguoiHoc.
     */
    @Test
    public void testGetDienthoai() {
      
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getDienthoai();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setDienthoai method, of class NguoiHoc.
     */
    @Test
    public void testSetDienthoai() {
     
        String Dienthoai = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setDienthoai(Dienthoai);
       
    }

    /**
     * Test of getGmail method, of class NguoiHoc.
     */
    @Test
    public void testGetGmail() {
     
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getGmail();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setGmail method, of class NguoiHoc.
     */
    @Test
    public void testSetGmail() {
     
        String Gmail = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setGmail(Gmail);
        
    }

    /**
     * Test of getGhichu method, of class NguoiHoc.
     */
    @Test
    public void testGetGhichu() {
       
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getGhichu();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setGhichu method, of class NguoiHoc.
     */
    @Test
    public void testSetGhichu() {
   
        String Ghichu = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setGhichu(Ghichu);
       
    }

    /**
     * Test of getMaNV method, of class NguoiHoc.
     */
    @Test
    public void testGetMaNV() {
       
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMaNV method, of class NguoiHoc.
     */
    @Test
    public void testSetMaNV() {
       
        String MaNV = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNV(MaNV);
       
    }

    /**
     * Test of getNgayDK method, of class NguoiHoc.
     */
    @Test
    public void testGetNgayDK() {
      
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgayDK();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setNgayDK method, of class NguoiHoc.
     */
    @Test
    public void testSetNgayDK() {
      
        Date NgayDK = null;
        NguoiHoc instance = new NguoiHoc();
        instance.setNgayDK(NgayDK);
       
    }
    
}
