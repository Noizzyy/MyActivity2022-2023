package CLASSPACK;
 
public class Employee {
    private String name = "";
    private String jobTitle = "";
    private double numOfAttendance = 0.0;
    private double salary = 0.0;
 
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
 
    public String getjobTitle() {
        return jobTitle;
    }
 
    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
 
    public double getnumOfAttendance() {
        return numOfAttendance;
    }
 
    public void setnumOfAttendance(Double numOfAttendance) {
        this.numOfAttendance = numOfAttendance;
    }
 
    public double getsalary() {
        return salary;
    }
 
    public void setsalary(double salary) {
        this.salary = salary;
    }
 
    public double Computation() {
        return numOfAttendance * salary;
    }
}