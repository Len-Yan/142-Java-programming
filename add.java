/*
 * application that collects and manipulates command-line arguments.
 * 
 * @author Lengfan Yan
 * @version Assignment 8: Addition  standar
 * 
 */
public class add {
  
  
  public static void main (String[] args) {
    // created variables
    int n;
    int sum = 0;
    int value;
    int strs;
    int c = 0;
    int fence = 0;
    int count_true;
    String ignor = "";
    
    
    //do add if there is inputs
    if(args.length > 0){
      //do add
      for (int i=0; i<args.length;i++) {
        // check input validation
        count_true = 0;
        for (n=0;n<args[i].length();n++){
          strs = args[i].charAt(n);
          if (Character.isDigit(strs) == true){
            count_true += 1;}
          }
        // do add if the token all #
        if (count_true == args[i].length()){
          c = 1;
          value = Integer.parseInt(args[i]);
          // print addition in one line
          fence ++;
          if (fence == 1){System.out.print(value);}
          else {System.out.print(" + " + value);}
          sum += value;
        }
        // ignored arguments
        else{ignor += args[i] + " ";}
        }
      if(c == 1){
        System.out.println(" = " + sum);}
      
      System.out.println("Ignored arguments: " + ignor);}
    //missing input
    if(args.length == 0){System.out.print("No input values");}
    
    
  }}
