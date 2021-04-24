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
public class NhanVienNGTest {
    
    public NhanVienNGTest() {
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
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMatKhau();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        String matKhau = "";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsVaiTro() {
        System.out.println("isVaiTro");
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = instance.isVaiTro();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
        fail("The test case is a prototype.");
    }
    
}
