/*
 * calculate primes number form 2 to N and return the primeslist
 * 
 * @author Lengfan Yan
 * @version assignment 9:Sive of Eratosthenes   standard
 */ 

class dosieve implements Sieve {
  
  //fields and initialization
  java.util.List<Integer> numberlist;
  java.util.List<Integer> primelist;
  
  int i;
  int c;
  int currentprime;
  int countcp = 0;
  
  /**
   * calculating primes numbers
   * @param n the number from user input
   * @return primelist give back primelist
   */ 
  public java.util.List<Integer> getPrimes(int n){
    numberlist = new java.util.ArrayList<Integer>();
    primelist = new java.util.ArrayList<Integer>();
    c = 2;
    //get limit M
    int m = (int)Math.sqrt(n);
    // loop turn n to list from 2 to n
    for(i=0;i<n-1;i++){
      numberlist.add(c);
      c++;}
                                                         //System.out.println(numberlist);    test for errors
    
    //get primes and remove them from numberlist
    for(i=0;i<m;){
      //value that check is it going to add to primeslist
      countcp = 0;
      currentprime = numberlist.get(i);
      //out the loop if reach M
      if(currentprime > m){break;}
      
      //loop remove prime numbers from numberlist
      for(int j=0;j<numberlist.size();j++){     
        if(numberlist.get(j) % currentprime == 0){
          numberlist.remove(j);
          countcp++;
        }
                                                          //  System.out.println(numberlist);
      }
      if(countcp>0){primelist.add(currentprime);}
                                                          // System.out.println("        "+primelist);
    }
    //add the numbers left after loop reach limit M that are not removed
    for(i=0;i<numberlist.size();i++){
      primelist.add(numberlist.get(i));}
    
    return primelist;
  }
}