/*
 * find prime numbers in given number n 
 * 
 * @author Lengfan Yan
 * @version assignment 9:Sive of Eratosthenes   standard
 */ 

public class SieveDriver {
   // declear fields for scanner and sieve 
   private java.util.Scanner scan;
   private Sieve theSieve;
   
   // constructor initialize fields
   public SieveDriver(){
     scan = new java.util.Scanner(System.in);
     theSieve = new dosieve();}
   
   // main method
   public void go() {
     int n = 0;
     java.util.List<Integer> primes;
     do{
       n = getNumber();
       primes = theSieve.getPrimes(n);
       printPrimes(n, primes);
     }while( n != 0);
   }
   
   /**
    * get n from user
    * @return n the user input
    */ 
   public int getNumber() {
     System.out.println("Enter the upper bound(0 to exit): ");
     boolean test = false;
     int n = 0;
     if(scan.hasNextInt() == false){
       test = false;
     }
     
     //if input is int -- scan it
     if(scan.hasNextInt() == true){
       n = scan.nextInt();
       // if input > 1  -- return it
       if(n>=0){ 
         return n;
       }
     }
     // if input not int -- error message, ask input
     while(test != true){
       System.out.println("Error! pleas enter a positive number for upper bound again");
       if(scan.hasNextInt() == true){
         n = scan.nextInt();
         //if input positive -- out of error message go process as input are int
         if(n >= 0){
           test = true;
         }
       }
       else{scan.next();}
     }
     //for compile, never reach
     return n;
   }
   
   /**
    * print the prime values back from dosieves
    * @param bound the value user input
    * @param list a list of primes that give back form some calculation
    */ 
   public void printPrimes(int bound, java.util.List<Integer> list) {
      int count = 0;
      int l = list.size();
      if(bound>0){
        System.out.println("Here are the primes between 2 and " + bound);
      }
      java.util.Iterator<Integer> it = list.iterator();
      while(it.hasNext()){
        System.out.print(it.next() + " ");
        count++;
        if (count == 12){
          System.out.println("");
          count = 0;}
      }
      double tem = l*1.0;
      int per = (int)Math.round((tem/bound)*100);
      System.out.println();
      System.out.println(per + "% of the numbers between 1 and " + bound +" are prime.");
   }
   
   /**
   * The application method
   * @param args Command-line parameters
   */
   public static void main(String[] args) {
   
      new SieveDriver().go();
      
   }
   
}