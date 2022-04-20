/* Project 2
 * Lengfan Yan
 * CSC 142
 * 5/21
 */
import java.util.*;
public class assignment2{
  
  public static void main (String[] args) {
   //test1
    //String text = "abcde     vwxyz";
    //System.out.println(text.length());
   // System.out.println(encipher(text, -55));
   //test2
    int[] go = {-3,5,2,3,6,1,0,8,4,6,7,2,-5,-3,0,3};
    mode(go);
  }
  
  //prints out the mode of the array.  If there is a tie, it should print out all the values that tie for being the mode.
  //method 1
  public static void mode(int[] a){
    ArrayList ans = new ArrayList();      //ini
    int count1 = 0;
    int count2 = 0;
    
    //loop find any value that appear most times
    for(int i = 0; i<a.length; i++){
      count1 =0;
      //skip the value that is looked
      for(int j = i; j<a.length; j++){
        if(a[j] == a[i]){count1++;}
      }
      if(count1 >= count2){count2 = count1;}          // store the max appear times in count2
    }
    
    //loop again find all num that appears same times as the max appears ans store in ArrayList
    for(int i = 0; i<a.length; i++){
      count1 = 0;
      for(int j = i; j<a.length; j++){
        if(a[j] == a[i]){count1++;}
      }
      if(count1 == count2){ans.add(a[i]);}
    }
      System.out.println(ans);
  }
  
  //return a String that is a Caesar cipher of the given text using the given offset
  // method 2
  public static String encipher(String text, int offset){
    //ini     ' ' = 32   A = 65  Z = 90
    StringBuilder back = new StringBuilder("");
    int temp = 0;
    StringBuilder go = new StringBuilder(text.toUpperCase());
    
    if(Math.abs(offset)> 26){offset = offset%26 ;}     //math for later
    for(int i = 0; i<text.length(); i++){
      temp = go.charAt(i);
      if(temp != 32){                                  //skip if char is 'space'
        temp += offset;
        //deal with out range(26) offset
        if(temp > 90){temp = temp - 26;}
        else if (temp < 65){temp = temp + 26;}
      }
      back.append((char)temp);
    }
    
    String newtext = back.toString();
    return newtext; 
  }
}