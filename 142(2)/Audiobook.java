/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 * this class specialize LibraryItem Audiobook
 */

public class Audiobook extends LibraryItem{
  
  //ini which is different
  private String author;
  private int lengthInMinutes;
  public static final int checkOutLength = 21;
  
  //constructor
  public Audiobook(String ti, String ge, String copyrightDate, String au, int length){
    title = ti;
    genre = ge;
    copyrightYear = copyrightDate;
    author = au;
    lengthInMinutes = length;
  }
 
//  
//  public int getDateCheckedOut(){
//    return dateCheckedOut;
//  }
//  public void setDateCheckedOut(int d){
//    dateCheckedOut = d;
//  }
  
}