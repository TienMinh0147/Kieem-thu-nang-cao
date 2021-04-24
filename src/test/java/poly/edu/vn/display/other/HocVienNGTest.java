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
public class HocVienNGTest {
    
    public HocVienNGTest() {
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
        HocVien instance = new HocVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaHV() {
        System.out.println("getMaHV");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaHV();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaHV() {
        System.out.println("setMaHV");
        int maHV = 0;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 0;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        HocVien instance = new HocVien();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String maNH = "";
        HocVien instance = new HocVien();
        instance.setMaNH(maNH);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDiem() {
        System.out.println("getDiem");
        HocVien instance = new HocVien();
        double expResult = 0.0;
        double result = instance.getDiem();
        assertEquals(result, expResult, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDiem() {
        System.out.println("setDiem");
        double diem = 0.0;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
        fail("The test case is a prototype.");
    }
    @Test(expectedExceptions = Exception.class)
    public void testSetDiemWithNegative() {
        System.out.println("setDiem");
        double diem = 10.0;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
       
    }
    @Test()
    public void testSetDiemWithPostive() {
        System.out.println("setDiem");
        double diem = 10.0;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
        double actual = instance.getDiem();
        
         assertEquals(actual, diem);
    }
     @Test()
    public void testSetHocPhiWithZero() {
        System.out.println("setHocPhi");
        double diem = 10.0;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
        double actual = instance.getDiem();
        
         assertEquals(actual, diem);
    }
}
