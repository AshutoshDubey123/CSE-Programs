//Assignment File
package Education;
public class Assignment {
 String assignment_number, assignment_subject, marks_on_assignment;
 public Assignment(String assignment_number, String 
assignment_subject, String marks_on_assignment) {
 this.assignment_number = assignment_number;
 this.assignment_subject = assignment_subject;
 this.marks_on_assignment = marks_on_assignment;
 }
 public void display() {
 System.out.println("ASSIGNMENT NUMBER: "+assignment_number);
 System.out.println("ASSIGNMENT SUBJECT: "+assignment_subject);
 System.out.println("MARKS ON ASSIGNMENT: "+marks_on_assignment);
 }
}