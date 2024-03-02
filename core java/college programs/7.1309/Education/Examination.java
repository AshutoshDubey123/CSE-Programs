//Examination File
package Education;
public class Examination {
 public String subject, marks;
 public Examination(String subject, String marks) {
 this.subject = subject;
 this.marks = marks;
 }
 public void display() {
 System.out.println("SUBJECT: "+subject);
 System.out.println("MARKS: "+marks);
 }
}