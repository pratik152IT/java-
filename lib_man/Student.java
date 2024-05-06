import java.util.Scanner;
 

public class Student {
 
    
    String StudentName;
    String regNum;
 
    Book borrowedBooks[] = new Book[3];
    public int BooksCount = 0;
 
   
    Scanner input = new Scanner(System.in);
 
   
    public Student()
    {
       
        System.out.println("Enter Student Name:");
 
        
        this.StudentName = input.nextLine();
 
        
        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}
