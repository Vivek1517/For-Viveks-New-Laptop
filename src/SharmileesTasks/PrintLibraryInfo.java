package SharmileesTasks;

public class PrintLibraryInfo {
    public static void main(String[] args) {
        LibraryDetails objLibrary= new LibraryDetails();
        System.out.println("Name Of The Library: "+objLibrary.name);
      //printing books directory
       objLibrary.objID1.id=1;
       objLibrary.objID1.bookName="Microsoft Dynamic Extension";
       objLibrary.objID2.id=2;
       objLibrary.objID2.bookName="Microsoft Azure Fundamentals";
       objLibrary.objID3.id=3;
       objLibrary.objID3.bookName="Clean Code";
       objLibrary.objID4.id=4;
       objLibrary.objID4.bookName="Name Refactoring";
       objLibrary.objBorrowedBook.bookName="Microsfot Dynamic Extensions";
       objLibrary.ObjBorrowedBook1.bookName="Microsoft Azure Fundamentals";

       System.out.println("Book ID: "+objLibrary.objID1.id+" "+objLibrary.objID1.bookName);
        System.out.println("Book ID: "+objLibrary.objID2.id+" "+objLibrary.objID2.bookName);
        System.out.println("Book ID: "+objLibrary.objID3.id+" "+objLibrary.objID3.bookName);
        System.out.println("Book ID: "+objLibrary.objID4.id+" "+objLibrary.objID4.bookName);
        System.out.println("Borrowed Book: "+objLibrary.objID1.id+objLibrary.objBorrowedBook.bookName);
        System.out.println("             : "+objLibrary.objID2.id+objLibrary.objBorrowedBook.bookName);

        System.out.println("**************************************************");
// printing member id15
        objLibrary.objMember.name="Sharmilee";
        objLibrary.objMember.id=15;
        objLibrary.objMember.bookBorrowed="Microsoft Dynamic Extension";
        System.out.println("Name of Member: "+objLibrary.objMember.name);
        System.out.println("Member ID: "+objLibrary.objMember.id);
        System.out.println("Name Book Borrowed: "+objLibrary.objMember.bookBorrowed);
      System.out.println("**************************************************");
        // printing member id16
        objLibrary.objMembe1.name="Kiyaan";
        objLibrary.objMembe1.id=16;
        objLibrary.objMembe1.bookBorrowed="Microsoft Azure Fundamentals";
        System.out.println("Name Of Member: "+objLibrary.objMembe1.name);
        System.out.println("Member ID: "+objLibrary.objMembe1.id);
        System.out.println("Name Of Book Borrowed: "+objLibrary.objMembe1.bookBorrowed);
    }
}
