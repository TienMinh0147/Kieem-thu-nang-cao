/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import java.util.Date;
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
public class NguoiHocNGTest {
    
    public NguoiHocNGTest() {
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
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String MaNH = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNH(MaNH);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHoten() {
        System.out.println("getHoten");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getHoten();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHoten() {
        System.out.println("setHoten");
        String Hoten = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setHoten(Hoten);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgaysinh() {
        System.out.println("getNgaysinh");
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgaysinh();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgaysinh() {
        System.out.println("setNgaysinh");
        Date Ngaysinh = null;
        NguoiHoc instance = new NguoiHoc();
        instance.setNgaysinh(Ngaysinh);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsGioitinh() {
        System.out.println("isGioitinh");
        NguoiHoc instance = new NguoiHoc();
        boolean expResult = false;
        boolean result = instance.isGioitinh();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGioitinh() {
        System.out.println("setGioitinh");
        boolean Gioitinh = false;
        NguoiHoc instance = new NguoiHoc();
        instance.setGioitinh(Gioitinh);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDienthoai() {
        System.out.println("getDienthoai");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getDienthoai();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDienthoai() {
        System.out.println("setDienthoai");
        String Dienthoai = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setDienthoai(Dienthoai);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGmail() {
        System.out.println("getGmail");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getGmail();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGmail() {
        System.out.println("setGmail");
        String Gmail = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setGmail(Gmail);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGhichu() {
        System.out.println("getGhichu");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getGhichu();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGhichu() {
        System.out.println("setGhichu");
        String Ghichu = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setGhichu(Ghichu);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NguoiHoc instance = new NguoiHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String MaNV = "";
        NguoiHoc instance = new NguoiHoc();
        instance.setMaNV(MaNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgayDK() {
        System.out.println("getNgayDK");
        NguoiHoc instance = new NguoiHoc();
        Date expResult = null;
        Date result = instance.getNgayDK();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgayDK() {
        System.out.println("setNgayDK");
        Date NgayDK = null;
        NguoiHoc instance = new NguoiHoc();
        instance.setNgayDK(NgayDK);
        fail("The test case is a prototype.");
    }
    
}
