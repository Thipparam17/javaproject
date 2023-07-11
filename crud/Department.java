package crud;

public class Department {

    private int dno;
    private String dname;
    private String location;

    public Department() {

    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDno() {
        return dno;
    }

    public String getDname() {
        return dname;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Department [dno=" + dno + ", dname=" + dname + ", location=" + location + "]";
    }

    // public Department(int dno, String dname, String location) {
    // this.dno = dno;
    // this.dname = dname;
    // this.location = location;
    // }

}
