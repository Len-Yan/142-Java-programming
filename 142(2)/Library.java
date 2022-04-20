/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 */
import java.util.ArrayList;

public class Library{
  //ini
  public ArrayList<LibraryItem> holdings;
  public ArrayList<Patron> members;
  public int currentDate;
  
  public Library(){
    holdings = new ArrayList<LibraryItem>();
    members = new ArrayList<Patron>();
    currentDate = 0;
  }
  
  public void addItem(LibraryItem item){        // add to shelf
    holdings.add(item);
  }
  public void addMember(Patron p){              // take out from shelf
    members.add(p);
  }
  
  public void checkOutItem(Patron p, LibraryItem item){
    if(item.getLocation() == 0){                //do if book on shelf
    item.setLocation(2);
    item.setCheckedOutBy(p);
    item.setDateCheckedOut(currentDate);
    p.addItem(item);
    holdings.remove(item);
    }
    else if(item.getLocation() == 1 && p.equals(item.getRequestedBy())){   //do if p is requested this book successfully
    item.setLocation(2);
    item.setCheckedOutBy(p);
    item.setDateCheckedOut(currentDate);
    p.addItem(item);
    holdings.remove(item);
    item.setRequestedBy(null);
    }
    
    else if(item.getLocation() == 2){           // do nothing if p not able to get book
      System.out.println("Sorry, the item you wished is already checked out."); 
    }
    else{System.out.println("Sorry, the item is requested by other person");}
  }
  
  public void returnItem(Patron p, LibraryItem item){
    item.setCheckedOutBy(null);
    p.removeItem(item);
    holdings.add(item);
    if(item.getRequestedBy() == null){          // if no one requeested when return
      item.setLocation(0);
    }
    else{                                       // put on hold shelf if was someone requested.
      item.setLocation(1);
    }
  }
  
  public void requestItem(Patron p, LibraryItem item){
    if(item.getLocation() == 0){                // do if no one requested it
      item.setLocation(1);
      item.setRequestedBy(p);
      System.out.println("you can check out this item now.");
    }
    else if(item.getLocation() == 2 && item.getRequestedBy() ==null){     // do if able to waite for it
      item.setRequestedBy(p);
      System.out.println("you are on hold this item after it returns.");
    }
    else {System.out.println("Sorry, that item is already on request.");} // not able
  }
  
  public void incrementCurrentDate(){           // increments one day
    currentDate++;
    for(int i = 0; i<members.size();i++){       // set all member instance's currentDate update while this do
      members.get(i).currentDate = currentDate;
    }
    
    int Length = 0;
    for(int i = 0; i<members.size();i++){       // read the checkoutlength for each type book and determine the fine
      for(int j = 0; j<members.get(i).checkedOutItems.size();j++){
        if(members.get(i).checkedOutItems.get(j) instanceof Audiobook)
          Length = Audiobook.checkOutLength;
        
        else if(members.get(i).checkedOutItems.get(j) instanceof Book)
          Length = Book.checkOutLength;
        
        else if(members.get(i).checkedOutItems.get(j) instanceof CD)
          Length = CD.checkOutLength;
        
        else if(members.get(i).checkedOutItems.get(j) instanceof DVD)
          Length = DVD.checkOutLength;
        
        if(currentDate - members.get(i).checkedOutItems.get(j).getDateCheckedOut() > Length){ 
          members.get(i).fineAmount += .1;      // add fine if item overdue
        } 
      }
    }  
  }
  
  public void payFines(Patron p, double amount){ //add or minus fine
    p.amendFine(-amount);                        // pay should let fine less
  }
}