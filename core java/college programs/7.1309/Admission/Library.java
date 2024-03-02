// Library File
package Admission;
public class Library {
 String book_name, issue_date, return_date;
 public Library(String book_name, String issue_date, String 
return_date) {
 this.book_name = book_name;
 this.issue_date = issue_date;
 this.return_date = return_date;
 }
 public void display() {
 System.out.println("BOOK NAME: "+book_name);
 System.out.println("ISSUE DATE: "+issue_date);
 System.out.println("RETURN DATE: "+return_date);
 }
}