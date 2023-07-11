package crud;

import java.sql.*;

public class DepartmentDAO {

    Connection conn = DBUtil.getDBConnection();

    public int addDept(Department dept) {

        // insert into dept value(?,?,?);
        int count = 0;
        String insertQuery = "insert into dept values(?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, dept.getDno());
            pstmt.setString(2, dept.getDname());
            pstmt.setString(3, dept.getLocation());
            count = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return count;
    }

    public int updateDept(Department dept) {
        int count = 0;
        String updateQuery = "update dept set dname=? , location=? where dno=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, dept.getDname());
            pstmt.setString(2, dept.getLocation());
            pstmt.setInt(3, dept.getDno());
            count = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return count;

        // update set dname =? , location =? where dno=?;

    }

    public Department getDeptByNo(int dno) {

        // select * from dept where dno=?;
        String selectQuery = "select * from dept where dno=?";
        int count = 0;
        Department dpt = new Department();
        try {
            PreparedStatement pstmt = conn.prepareStatement(selectQuery);
            pstmt.setInt(1, dno);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int deptno = rs.getInt("dno");
                String deptName = rs.getString("dname");
                String loc = rs.getString(3);

                dpt.setDname(deptName);
                dpt.setDno(dno);
                dpt.setLocation(loc);

            }

        } catch (Exception e) {

        }

        return dpt;
    }

    public int deleteDeptByNo(int dno) {

        // delete from dept where dno=?
        String deleteQuery = "delete from dept where dno=?";
        int count = 0;
        try {
            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, dno);
            count = pstmt.executeUpdate();

        } catch (Exception e) {

        }

        return count;
    }

}
