package crud;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        DepartmentDAO dao = new DepartmentDAO();

        while (flag) {
            System.out.println(
                    "Welcome to DNS\n1.Add Depart\n2.Update Depart\n3.Delete depart\n4.select depart\n0. EXIT\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter dept no");
                    int dno1 = sc.nextInt();
                    System.out.println("Enter dept name");
                    String dname1 = sc.next();
                    System.out.println("Enter location");
                    String location1 = sc.next();

                    Department dept1 = new Department();
                    dept1.setDno(dno1);
                    dept1.setDname(dname1);
                    dept1.setLocation(location1);

                    int count = dao.addDept(dept1);
                    System.out.println(count + " Records Inserted");

                    break;

                case 2:
                    System.out.println("Enter dept no");
                    int dno2 = sc.nextInt();
                    System.out.println("Enter dept name");
                    String dname2 = sc.next();
                    System.out.println("Enter location");
                    String location2 = sc.next();

                    Department dept2 = new Department();
                    dept2.setDno(dno2);
                    dept2.setDname(dname2);
                    dept2.setLocation(location2);

                    int count1 = dao.updateDept(dept2);
                    System.out.println(count1 + " Records Inserted");

                    break;
                case 3:

                    System.out.println("Enter DeptNo to delete one record");
                    int dno3 = sc.nextInt();
                    int count3 = dao.deleteDeptByNo(dno3);
                    System.out.println(count3 + " has successfully deleted");

                    break;
                case 4:
                    System.out.println("Enter department no");
                    int dno4 = sc.nextInt();
                    Department deptObj = dao.getDeptByNo(dno4);
                    System.out.println(deptObj);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
