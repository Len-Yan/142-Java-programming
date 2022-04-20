/**
 * this app will let user to add items to a shopping list, 
 * review the contents of the list, and remove all items from the list
 * 
 * @author Lengfan Yan 
 * @version Assignment 7: shoppinglist   stanard
 */

public class ShoppingList {
   
   private java.util.Scanner scan;
   // declare storage for the list items
   String[] stor;
   // make fileds
   int i;
   int count;
   boolean dtest;
   String strs;
   
   public ShoppingList() {
      scan = new java.util.Scanner(System.in);
      // initialize storage for list items
      stor = new String [10];
      count = 0;
      dtest = false;
   }
   
   public void printList() {
     // local valuable for numbering list
     int n =1;
     System.out.println("Your shopping list:");
     // print the list
     if(count == 0) {
       System.out.println("  * No items on list.");}
     else{
       for (i=0; i<count;i++){
         System.out.println("  " + n + ". " + stor[i]);
         n++;
       }}
   }
   /**
    *  add item to the list
    * @param value of user input
    */
   public void addToList(String item) {
         stor[count++] = item; 
     }
   
   public void emptyList() {
      // empty the list
     for(i=0;i<10;i++){
       stor[i] = "";
     }
     count = 0;
     System.out.println("All items removed from list.");
   }
   
   /**
    * check to see if duplicates
    * @param the value of user input
    * @return give back ture or false of duplication 
    */
   public boolean checkList(String item) {
      for(i=0;i<count;i++){
        if(item.equals(stor[i])){
          dtest = true; 
          return dtest;}
      }
       return false;
   }
   /**
    * get input form user
    * @return give back input from user
    */
   public String getInput() {
      System.out.print("Enter your item or command: ");
      return scan.next();
   }
   
   public void printWelcome() {
      System.out.println("Welcome to the XYZ Shopping List Program.");
   }
   
   public void printThankYou() {
      System.out.println("Thank you for using the XYZ Shopping List Program.");
   }
   
   public void printHelp() {
      System.out.println("Here are the list of commands:");
      System.out.println("  -p : Print the list");
      System.out.println("  -e : Empty the list");
      System.out.println("  -x : Exit the application");
      System.out.println("  -h : Print this command list");
   }
   
   public void go() {
      String input;
      boolean test;

      printWelcome();
      printHelp();
      input = getInput();
      
      do {
        if(input.equals("-h")){
          printHelp();
        } else if(input.equals("-p")){
            printList();
        } else if(input.equals("-x")){
        } else if(input.equals("-e")){
            emptyList();
        } else{
            // if duplicates, print error  skip addToList
            test = checkList(input);
            if (test == true){System.out.println("Duplicate item " + input + " not added to list.");}
            // if the things in list more than 10, don't add it.
            else if(count < 10){
              addToList(input);}
            else{System.out.println("List is Full. Item " + input + " not added to list.");}
        }
        input = getInput();
      } while( ! input.equals("-x"));
      printThankYou();
   }
   
   public static void main(String[] args) {
      ShoppingList list;

      list = new ShoppingList();
      list.go();
   }
   
}