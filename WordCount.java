public class WordCount {
 
  public static void tokenCount(String text) {
    
    java.util.Scanner scan;
    
    // open the file for reading using Scanner
    try {
      scan = new java.util.Scanner(new java.io.File(text));
    } catch(java.io.FileNotFoundException e) {
      System.err.println("Error opening file: " + text);
      return;
    }
    
    // process the file, token by token
    int i = 0;
    while(scan.hasNext()) {
      String token = scan.next();
      i ++;
    }
    
    // close the file
    scan.close();
    
    // output statistics
    System.out.println("Token count: " + i);
    System.out.println();
    
  }
  
  public static void main(String[] args) {
    
    for(String arg : args) {
      tokenCount(arg);
    }
    
  }
  
}
