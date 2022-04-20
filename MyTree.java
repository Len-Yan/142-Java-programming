/**
 * A new graphic component. This component is used in
 * the notes to highlight the process of designing a 
 * new object and then implementing it.
 *
 * @author Lengfan Yan
 * @version Assignment 4: MyScene (standerd)
 */
public class MyTree extends NsccComponent {
  
   // instance variables
  private NsccUpTriangle leaf;
  private NsccRectangle body;
  
  /**
   * constructor for MyTree
   * creater MyTree object
   * 
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   */
  public MyTree(int x, int y)
  {
    // Specify the constructor for the superclass
    super(x, y, 160, 120);
    
     // Create the body object
    body = new NsccRectangle(100, 60, 20, 50);
    // Set the characteristics of the walls
    body.setFilled(true);
    body.setBackground(new java.awt.Color(160, 110, 33));
    // add body to tree
    add(body);
  
  // Create the leaf object
    leaf = new NsccUpTriangle(80, 0, 60, 75);
    // Set the characteristics of the leaf
    leaf.setFilled(true);
    leaf.setBackground(java.awt.Color.green);
    // add leaf on tree
    add(leaf);}
  
  
  /**
   * overload MyTree
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   * @param c  color of the object
   */ 
   public MyTree(int x, int y, java.awt.Color c)
  {
     super(x, y, 160, 120);
       // Create the body object
    body = new NsccRectangle(100, 60, 20, 50);
    // Set the characteristics of the walls
    body.setFilled(true);
    body.setBackground(new java.awt.Color(160, 110, 33));
    // add body to tree
    add(body);
  
  // Create the leaf object
    leaf = new NsccUpTriangle(80, 0, 60, 75);
    // Set the characteristics of the leaf
    leaf.setFilled(true);
    leaf.setBackground(c);
    // add leaf on tree
    add(leaf);}
     
   
   /**
   * Change the color of the tree
   * 
   * @param c The color for the leaf of the tree
   */
  public void setColor(java.awt.Color c) {
    leaf.setBackground(c);
    repaint();
  }
  
  /**
   * Retrieve the color of the tree
   * 
   * @return The color of the leaf of the tree
   */
  public java.awt.Color getColor() {
    return leaf.getBackground();
  }
  
}
