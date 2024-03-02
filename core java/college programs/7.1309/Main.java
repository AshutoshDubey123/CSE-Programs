/*Create 2 packages having the name admission & education. 

Admission package will cotain classes student_details & library.
The student_deatil should contain student name, department and date of birth which should be input through the keyboard. These information should be displayed via display method. 
The library class should contain the book details namely book_name, issue_date, return_date, which should be input through the keyboard and be displayed accordingly. 

The education package should cotain the classes assignment & examination.
The assignment class will be having assignmet_number, assignment _subject & mark_on_assignment.The value should be user input and displayed accordingly.
The examination class should contain  members subject & marks which will be user input and diplayed. 
The display should be menu driven in the main class.*/



//Main
import Admission.Library;
import Admission.Student_details;
import Education.Assignment;
import Education.Examination;
import java.util.Scanner;

public class Main {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);

 //Student Details
 String student_name, dept, dob;
 System.out.println("\nENTER STUDENT DETAILS.");
 System.out.print("ENTER STUDENT NAME: ");
 student_name = sc.nextLine();
 System.out.print("ENTER DEPARTMENT: ");
 dept=sc.nextLine();
 System.out.print("ENTER DATE OF BIRTH (DD.MM.YYYY): ");
 dob=sc.nextLine();
 Student_details obj1 = new 
Student_details(student_name,dept,dob);

 //Library Details
 String book_name, issue_date, return_date;
 System.out.println("\nENTER LIBRARY DETAILS.");
 System.out.print("ENTER BOOK NAME: ");
 book_name = sc.nextLine();
 System.out.print("ENTER ISSUE DATE (DD.MM.YYYY): ");
 issue_date=sc.nextLine();
 System.out.print("ENTER RETURN DATE (DD.MM.YYYY): ");
 return_date=sc.nextLine();
 Library obj2 = new Library(book_name,issue_date,return_date);

 //Assignment Details
 String assignment_number, assignment_subject, 
marks_on_assignment;
 System.out.println("\nENTER ASSIGNMENT DETAILS.");
 System.out.print("ENTER ASSIGNMENT NUMBER: ");
 assignment_number = sc.nextLine();
 System.out.print("ENTER ASSIGNMENT SUBJECT: ");
 assignment_subject=sc.nextLine();
 System.out.print("ENTER MARKS ON ASSIGNMENT: ");
 marks_on_assignment=sc.nextLine();
 Assignment obj3 = new Assignment(assignment_number, 
assignment_subject, marks_on_assignment);

 //Examination Details
 String subject, marks;
 System.out.println("\nENTER EXAMINATION DETAILS.");
 System.out.print("ENTER SUBJECT: ");
 subject=sc.nextLine();
 System.out.print("ENTER MARKS: ");
 marks=sc.nextLine();
 Examination obj4 = new Examination(subject, marks);

 System.out.println("\nDISPLAY MENU");
 System.out.println("1. DISPLAY STUDENT DETAILS.");
 System.out.println("2. DISPLAY LIBRARY DETAILS.");
 System.out.println("3. DISPLAY ASSIGNMENT DETAILS.");
 System.out.println("4. DISPLAY EXAMINATION DETAILS.");
 System.out.println("0. EXIT");

 while(true) {
 System.out.print("\nENTER CHOICE: ");
 int choice;
 try {
 choice = sc.nextInt();
  
 System.out.println();
 
 switch(choice) {
 case 0: System.exit(0);
 case 1: obj1.display(); break;
 case 2: obj2.display(); break;
 case 3: obj3.display(); break;
 case 4: obj4.display(); break;
 default: System.out.println("INVALID CHOICE");//this INVALID CHOICE would never had been printed so try catch is used to allow invalid choise to be printed
 }
} catch (java.util.InputMismatchException e) {
    System.out.println("INVALID CHOICE");
    sc.nextLine(); // Clear the invalid input from the buffer()
    //the sc.nextLine() call is used to consume the newline character after reading an integer, preventing the infinite loop issue
}

 }
  
 }
 
}



/*output:ENTER STUDENT DETAILS.
ENTER STUDENT NAME: Ashutosh Dubey 
ENTER DEPARTMENT: CSE
ENTER DATE OF BIRTH (DD.MM.YYYY): 22.07.2001

ENTER LIBRARY DETAILS.
ENTER BOOK NAME: OOP
ENTER ISSUE DATE (DD.MM.YYYY): 10.09.2023
ENTER RETURN DATE (DD.MM.YYYY): 25.09.2023

ENTER ASSIGNMENT DETAILS.
ENTER ASSIGNMENT NUMBER: 2
ENTER ASSIGNMENT SUBJECT: OOP
ENTER MARKS ON ASSIGNMENT: 23

ENTER EXAMINATION DETAILS.
ENTER SUBJECT: OOP
ENTER MARKS: 90

DISPLAY MENU
1. DISPLAY STUDENT DETAILS.
2. DISPLAY LIBRARY DETAILS.
3. DISPLAY ASSIGNMENT DETAILS.
4. DISPLAY EXAMINATION DETAILS.
0. EXIT

ENTER CHOICE: 1

STUDENT NAME: Ashutosh Dubey 
DEPARTMENT: CSE
DATE OF BIRTH: 22.07.2001

ENTER CHOICE: 2

BOOK NAME: OOP
ISSUE DATE: 10.09.2023
RETURN DATE: 25.09.2023

ENTER CHOICE: 3

ASSIGNMENT NUMBER: 2
ASSIGNMENT SUBJECT: OOP
MARKS ON ASSIGNMENT: 23

ENTER CHOICE: 4

SUBJECT: OOP
MARKS: 90

ENTER CHOICE: 45

INVALID CHOICE

ENTER CHOICE: 2

BOOK NAME: OOP
ISSUE DATE: 10.09.2023
RETURN DATE: 25.09.2023

ENTER CHOICE: 0
 */