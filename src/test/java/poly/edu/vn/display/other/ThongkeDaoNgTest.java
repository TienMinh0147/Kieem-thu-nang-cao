/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.vn.display.other;

import com.mockrunner.mock.jdbc.MockConnection;
import com.mockrunner.mock.jdbc.MockResultSet;
import com.mockrunner.mock.jdbc.MockStatement;

import java.util.List;

import static org.junit.Assert.*;

import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author Tien Minh
 */

@PrepareForTest({JdbcHelper.class, ThongkeDao.class})
public class ThongkeDaoNgTest extends PowerMockTestCase{
    ThongkeDao thongkedaospy;
    
    @Mock
    MockConnection connection;
    
     @Mock
    MockStatement statement;
     
    
     @Spy
     @InjectMocks
  MockResultSet rs = new MockResultSet("myMock");
     
    public ThongkeDaoNgTest() {
    }
    
    @ObjectFactory
    public IObjectFactory getObjectFactory(){
       return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    
    @BeforeMethod
    public void setUp() {
        PowerMockito.mockStatic(JdbcHelper.class);
        thongkedaospy = PowerMockito.spy(new ThongkeDao());
    }
    
    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testGetNguoiHoc() throws Exception {
        System.out.println("getnguoihoc");
        
        rs = initMockResultSet();
        
        PowerMockito.when(JdbcHelper.executeQuery(ArgumentMatchers.anyString()))
                .thenReturn(rs);
  
PowerMockito.when(rs.getStatement()).thenReturn(statement);
PowerMockito.when(statement.getConnection()).thenReturn(connection);
List result = thongkedaospy.getNguoiHoc();

        assertEquals(0, result.size());

    
    }
    @Test
    public void testGetNguoiHocWithMultipleData() throws Exception {
        System.out.println("getnguoihoc");
        
        rs = initMultipleDataMockResultSet();
        
        PowerMockito.when(JdbcHelper.executeQuery(ArgumentMatchers.anyString()))
                .thenReturn(rs);
  
PowerMockito.when(rs.getStatement()).thenReturn(statement);
PowerMockito.when(statement.getConnection()).thenReturn(connection);
List result = thongkedaospy.getNguoiHoc();

        assertEquals(3, result.size());

    
    }
    

    @Test
    public void testGetBangDiem() {
    }

    @Test
    public void testGetDiemTheoChuyenDe() {
    }

    @Test
    public void testGetDoanhThu() {
    }

    private MockResultSet initMockResultSet() throws Exception{
        rs.addColumn("Nam", new Integer[]{1});
        rs.addColumn("SoLuong", new Integer[]{1});
         rs.addColumn("Dautien", new java.sql.Date[]{
             new java.sql.Date(new java.util.Date().getTime())
         });
          rs.addColumn("CuoiCung", new java.sql.Date[]{
              new java.sql.Date(new java.util.Date().getTime())
                  
          });
          
         rs.beforeFirst();
         return rs;
           
    }

    private MockResultSet initMultipleDataMockResultSet() throws Exception{
       rs.addColumn("Nam", new Integer[]{1,2});
        rs.addColumn("SoLuong", new Integer[]{1,5,7});
         rs.addColumn("Dautien", new java.sql.Date[]{
             new java.sql.Date(new java.util.Date().getTime()),
             new java.sql.Date(new java.util.Date().getTime()),
             new java.sql.Date(new java.util.Date().getTime())
         });
          rs.addColumn("CuoiCung", new java.sql.Date[]{
              new java.sql.Date(new java.util.Date().getTime()),
              new java.sql.Date(new java.util.Date().getTime()),
              new java.sql.Date(new java.util.Date().getTime())
                  
          });
          
         rs.beforeFirst();
         return rs;
    }

}
    

