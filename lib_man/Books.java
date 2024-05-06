import java.util.Scanner;

public class Books {

    Book theBooks[] = new Book[50];
    public static int count;

    Scanner input = new Scanner(System.in);

    public int compareBookObjects(Book b1, Book b2) {
        if (b1.BookName.equalsIgnoreCase(b2.BookName)) {
            System.out.println("Book of this Name Already Exists.");
            return 0;
        }
        if (b1.sNo == b2.sNo) {
            System.out.println("Book of this Serial No Already Exists.");
            return 0;
        }
        return 1;
    }

    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (this.compareBookObjects(b, this.theBooks[i]) == 0)
                return;
        }
        if (count < 50) {
            theBooks[count] = b;
            count++;
        } else {
            System.out.println("No Space to Add More Books.");
        }
    }

    public void searchBySno() {
        int sNo;
        System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");
        System.out.println("Enter Serial No of Book:");
        sNo = input.nextInt();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].BookName + "\t\t"
                        + theBooks[i].authorName + "\t\t" + theBooks[i].BookQtyCopy + "\t\t"
                        + theBooks[i].BookQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book for Serial No " + sNo + " Found.");
    }

    public void searchByAuthorName() {
        System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
        input.nextLine();
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) {
                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].BookName + "\t\t"
                        + theBooks[i].authorName + "\t\t" + theBooks[i].BookQtyCopy + "\t\t"
                        + theBooks[i].BookQty);
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");
    }

    public void showAllBooks() {
        System.out.println("\t\t\t\tSHOWING ALL Books\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].BookName + "\t\t"
                    + theBooks[i].authorName + "\t\t" + theBooks[i].BookQtyCopy + "\t\t"
                    + theBooks[i].BookQty);
        }
    }

    public void upgradeBookQty() {
        System.out.println("\t\t\t\tUPGRADE QUANTITY OF A Book\n");
        System.out.println("Enter Serial No of Book");
        int sNo = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.println("Enter No of Books to be Added:");
                int addingQty = input.nextInt();
                theBooks[i].BookQty += addingQty;
                theBooks[i].BookQtyCopy += addingQty;
                return;
            }
        }
    }

    public void dispMenu() {
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
                "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
                "----------------------

