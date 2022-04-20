/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 */

public class LibraryItem extends Library{
//ini
  public String title;
  public String genre;
  public String copyrightYear;
  
  private int location; // 0 = on shelf, 1 = on hold shelf, 2 = checked out
  private Patron checkedOutBy; // null if not checked out
  private Patron requestedBy; // null if not on request
  private int dateCheckedOut;
  
  public LibraryItem(){
  }
  // all method straightforward
   public int getLocation(){
    return location;
  }
  public void setLocation(int loc){
    location = loc;
  }
  public Patron getCheckedOutBy(){
    return checkedOutBy;
  }
  public void setCheckedOutBy(Patron p){
    checkedOutBy = p;
  }
  public Patron getRequestedBy(){
    return requestedBy;
  }
  public void setRequestedBy(Patron p){
    requestedBy = p;
  }
  public int getDateCheckedOut(){
    return dateCheckedOut;
  }
  public void setDateCheckedOut(int d){
    dateCheckedOut = d;
  }
}