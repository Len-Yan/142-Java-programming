/**
 * This code simply declares a private field to store the reindeer names and two methods: 
 * one adds eight names1 to the list and the other prints out the contents of the list.
 * 
 * @author Lengfan Yan
 * @version Lab 11:Collections  standar
 */
public class Reindeer {

  // The reindeer
  private java.util.Collection<String> reindeer;
  
  /**
   * Constructor, which you will write
   */
  public Reindeer(){
  reindeer = new java.util.ArrayList<String>();
    
  }
  /**
   * Add the names of the reindeer to the collection.
   */
  public void addReindeer() {
    reindeer.add("Dasher");
    reindeer.add("Dancer");
    reindeer.add("Prancer");
    reindeer.add("Vixen");
    reindeer.add("Comet");
    reindeer.add("Cupid");
    reindeer.add("Dunder");
    reindeer.add("Blixem");
  }
  
  /**
   * A simple method to print out the contents of
   * the collection.
   */
  public void print() {
    java.util.Iterator<String> it = reindeer.iterator();
    while(it.hasNext()){
      System.out.print(it.next());
    }
    //for(Object o : reindeer) {
     // System.out.print(o + " ");
   // }
    System.out.println();
  }
  
  /**
   * The application method, which you will write
   * @param args Command-line arguments
   */
  public static void main(String[] args) {
    Reindeer rein = new Reindeer();
    rein.addReindeer();
    rein.print();
    rein.reindeer = new java.util.LinkedList<String>();
    rein.addReindeer();
    rein.print();
    //System.out.println("1");
    rein.addReindeer();
    rein.print();
    rein.reindeer = new java.util.HashSet<String>();
    rein.addReindeer();
    rein.print();
    rein.addReindeer();
    rein.print();
  }
}
