//Student_details File
package Admission;
public class Student_details {
 String student_name, dept, dob;
 public Student_details(String student_name, String dept, String dob) 
{
 this.student_name = student_name;
 this.dept = dept;
 this.dob = dob;
 }
 public void display() {
 System.out.println("STUDENT NAME: "+student_name);
 System.out.println("DEPARTMENT: "+dept);
 System.out.println("DATE OF BIRTH: "+dob);
 }
}