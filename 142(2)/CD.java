/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 * this class specialize LibraryItem CD
 */

public class CD extends LibraryItem{
  
  //ini which is different
  private String performer;
  private int lengthInMinutes;
  public static final int checkOutLength = 14;
  
//constructor
  public CD(String ti, String ge, String copyrightDate, String pf, int length){
     title = ti;
    genre = ge;
    copyrightYear = copyrightDate;
    performer = pf;
    lengthInMinutes = length;
  }
    
    
//  public int getDateCheckedOut(){
//    return dateCheckedOut;
//  }
//  public void setDateCheckedOut(int d){
//    dateCheckedOut = d;
//  }
}