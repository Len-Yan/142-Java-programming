/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 * this class specialize LibraryItem Book
 */

public class Book extends LibraryItem{
 
  //ini which is different
  private String author;
  private int numPages;
  public static final int checkOutLength = 21;
  
//constructor
  public Book(String ti, String ge, String copyrightDate, String au, int np){
     title = ti;
    genre = ge;
    copyrightYear = copyrightDate;
    author = au;
    numPages = np;
  }

//  
//  public int getDateCheckedOut(){
//    return dateCheckedOut;
//  }
//  public void setDateCheckedOut(int d){
//    dateCheckedOut = d;
//  }
  
  
}