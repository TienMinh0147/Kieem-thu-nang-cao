/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Tien Minh
 */
public class ChuyenDeNGTest {
    
    public ChuyenDeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String MaCD = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(MaCD);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTenCD() {
        System.out.println("getTenCD");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getTenCD();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTenCD() {
        System.out.println("setTenCD");
        String TenCD = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(TenCD);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        ChuyenDe instance = new ChuyenDe();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(result, expResult, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHocPhi() {
        
        double HocPhi = 0.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(HocPhi);
        
    }
    @Test(expectedExceptions = Exception.class)
    public void testSetHocPhiWithNegative() {
        System.out.println("setHocPhi");
        double hocPhi = -10.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);
       
    }
     @Test()
    public void testSetHocPhiWithPostive() {
        System.out.println("setHocPhi");
        double hocPhi = 10.0;
         ChuyenDe instance = new  ChuyenDe();
        instance.setHocPhi(hocPhi);
        double actual = instance.getHocPhi();
        
         assertEquals(actual, hocPhi);
    }
     @Test()
    public void testSetHocPhiWithZero() {
        System.out.println("setHocPhi");
        double hocPhi = 10.0;
         ChuyenDe instance = new  ChuyenDe();
        instance.setHocPhi(hocPhi);
        double actual = instance.getHocPhi();
        
         assertEquals(actual, hocPhi);
    }


    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        ChuyenDe instance = new ChuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetThoiLuongWithNegative() {
        System.out.println("setThoiLuong");
        int thoiLuong = -12;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(thoiLuong);
        
    }
     @Test(expectedExceptions = Exception.class)
    public void testSetThoiLuongWithZero() {
        System.out.println("setThoiLuong");
        int thoiLuong = 0;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(thoiLuong);
        
    }
     @Test
    public void testSetThoiLuongWithValid() {
        System.out.println("setThoiLuong");
        int thoiLuong = 12;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(thoiLuong);
        int actual = instance.getThoiLuong();
         assertEquals(actual, thoiLuong);
    }

    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String hinh = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinh(hinh);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMoTa();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String MoTa = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(MoTa);
        fail("The test case is a prototype.");
    }
    
}
