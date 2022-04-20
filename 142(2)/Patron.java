/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 * this class deall with a action due with people act with Library.
 */
import java.util.ArrayList;

public class Patron extends Library{
  //ini
  String idNum;
  String name;
  ArrayList<LibraryItem> checkedOutItems;
  double fineAmount;
  
  //constructor
  public Patron(String idN, String n){
    checkedOutItems = new ArrayList<LibraryItem>(); 
    idNum = idN;
    name = n;
  }
  
  public void addItem(LibraryItem item){         //add item to member's checkoutlist
    checkedOutItems.add(item);
  }
  public void removeItem(LibraryItem item){      //remove item from member's checkoulist
    checkedOutItems.remove(item);
  }
  
  public double getFineAmount(){                 //get the amount of fine of this memeber
//    for(int i = 0;i<checkedOutItems.size();i++){
//      System.out.println("       L   "+checkedOutItems.get(i).checkOutLength);
//      if ((currentDate - checkedOutItems.get(i).getDateCheckedOut()) > checkedOutItems.get(i).checkOutLength){
//        System.out.println(" sjkdfh" + (currentDate - checkedOutItems.get(i).getDateCheckedOut() - checkedOutItems.get(i).checkOutLength) * 0.1);
//        fineAmount += (currentDate - checkedOutItems.get(i).getDateCheckedOut() - checkedOutItems.get(i).checkOutLength) * 0.1;
//      }
//    }
    return fineAmount;
  }
  public void amendFine(double amount){          // action due with fine changes
    fineAmount += amount;
  }
  public String getName(){                       // get memeber's name
    return name;
  }
}