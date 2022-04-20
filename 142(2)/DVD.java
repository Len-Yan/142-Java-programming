/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 * this class specialize LibraryItem DVD
 */

public class DVD extends LibraryItem{
  
  //ini which is different
  private String director;
  private int lengthInMinutes;
  public static final int checkOutLength = 7;
  
//constructor
  public DVD(String ti, String ge, String copyrightDate, String dr, int length){
    title = ti;
    genre = ge;
    copyrightYear = copyrightDate;
    director = dr;
    lengthInMinutes = length;
  }
  
  
  
//  public int getDateCheckedOut(){
//    return dateCheckedOut;
//  }
//  public void setDateCheckedOut(int d){
//    dateCheckedOut = d;
//  }
}