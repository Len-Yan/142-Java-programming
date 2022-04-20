/**
 * new myhat
 * @author Lengfan Yan
 * @verson lab 5
 */
public class MyHat extends NsccComponent {
 
  // The pieces of the top hat
  private NsccComponent brim;
  private NsccComponent body;
  
  /**
   * The 'default' constructor for MyHat.
   * This creates a black hat at location (10, 10).
   */
  public MyHat() {
    this(10, 10);
  }
  
  /**
   * A constructor for MyHat. This creates a black top hat
   * of the 'standard' size, at the specified location.
   * 
   * @param x The x-coordinate for the top hat.
   * @param y The y-coordinate for the top hat.
   */
  
  public MyHat(int x, int y){
    super(x, y, 70, 45);
    brim = new NsccEllipse(0, 35, 60, 10);
    brim.setBackground(java.awt.Color.black);
    brim.setFilled(true);
    body = new NsccUpTriangle(5, 0, 50, 60);
    body.setBackground(java.awt.Color.black);
    body.setFilled(true);
    // add the pieces to the hat
    add(brim);
    this.add(body);
  }}