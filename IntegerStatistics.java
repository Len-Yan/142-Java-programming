/**
 * simple program that will collect integer data from the user and 
 * calculate some simple statistics on the data collected
 * 
 * author Lengfan Yan
 * version assignment 6   standard
 */ 

public class IntegerStatistics {
  
  java.util.Scanner scan;
  int i;
  // declare storage for the integers
  int[] stor = new int [10];

  // create a constructor
   public  IntegerStatistics(){
     scan = new java.util.Scanner(System.in);  }
   //flieds
     int nums;
     boolean nustest;
     int count = 0;
   
   // get intergers
   public void getint() {
     //cheak is there a int or not
     nustest = scan.hasNextInt();
    int p = 1;
    // run , stores number if there is int
     while(nustest == true){
         // prompt for the value
         nustest = scan.hasNextInt();
         System.out.println("You had entered " + (p) +" numbers.");
         ++p;
         if (nustest == true){
         
         // get the input value
         nums = scan.nextInt();
         // store the input value into the array
        // only store 10 number
         if (count < 10){
           stor[count++] = nums;   }
         
         // after 10 number discard
         else if (count == 9){
           System.out.println("the numbers of your input have reached it's limit, the number you put now will not saved.");}
         else if (count >= 10){
           System.out.println("the numbers of your input have reached it's limit, the number you put now will not saved.");
           count = 10;}
         }
         // forgot what this want.
         else if (nustest == false){ 
           break; }
     }}
   
   
   
  
  private void showMenu() {
    System.out.println("Menu:");
    System.out.println("   p - Print the list of values");
    System.out.println("   s - Print statistics for the values");
    System.out.println("   f - Fill the list with random values");
    System.out.println("   c - Clear the list of values");
    System.out.println("   h - Print out this menu");
    System.out.println("   x - Exit the program");
    // ann other n to put number
    System.out.println("   n - type 10 number your own");
  }
  
  private void clearValues() {
    // empty (zero out) the array
    for(i=0;i<10;i++){
      stor[i] = 0;}
    count = 0;
  }

  private void fillList() {
    // fill the array
    java.util.Random rand = new java.util.Random();
    for(i=0;i<10;i++){
      int tem = rand.nextInt(26);
      stor[i] = (tem - 10);
      count++;
      if (count > 10){
        count = 1;}
      else{}}
  }
  
  private void printValues() {          ////////
    System.out.print("The values: [");
    // print the values
    
    for (i=0; i<count-1;++i){
      System.out.print( stor[i] + ", ");}
    System.out.print(stor[count-1]);
    System.out.println("]");
  }
  
  private void printStats() {
    int sums = 0;
    //print # of value
    System.out.println("Number of values: " + count);
    // give sum
    for (i=0; i<count;i++){
      sums += stor[i];}
    System.out.println("Sum of the values: " + sums);
    // give max in the list
    int max = stor[0];
    for (i=0; i<count;i++){
      if (stor[i] >= max){
        max = stor[i];}}
      System.out.println("Maximum value: " + max);
     //give min in the lisst 
    int min = stor[0];
    for (i=0; i<count;i++){
      if (stor[i] <= min){
        min = stor[i];}}
    System.out.println("Minimum value: " + min);
    
    //make average variable
    double ave;
    // make a new double variable for count
    double newcount = count *1.0;
      ave = sums/ newcount;
    System.out.format("Average value: " + "%.3f%n",ave);

  }
  
  public void go() {
    System.out.println("Welcome to Simple Statistics Program\n");
    String input;
    
    showMenu();
    do {
      System.out.print("Enter a command or integer value: ");
      input = scan.next();
      
      if(input.equals("p")) {
        printValues();
      } else if(input.equals("s")) {
        printStats();
      } else if(input.equals("f")) {
        fillList();
      } else if(input.equals("c")) {
        clearValues();
      } else if(input.equals("h")) {
        showMenu();
      } else if(input.equals("x")) {
        
        //press n to input numbers
      } else if(input.equals("n")){
        System.out.println("press anything else than number return to meue.");
        getint();
      // do nothing
      } else {
        System.out.println("Unrecognized command. Try again.");
        showMenu();
      }
    } while( ! input.equals("x"));
    System.out.println("\nThank you for using the Simple Statistics Program");
  }
  
  public static void main(String[] args) {
    new IntegerStatistics().go();
  }
  
}
