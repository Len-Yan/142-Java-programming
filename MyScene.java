// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * This is the shell for programming assignment 3.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 * @author Lengfan Yan
 * @version Assignment 4: MyScene  (standerd)
 */
public class MyScene extends NsccWindow {

  // instance variables
  private MyHouse house;
  private MyHouse house1;
  private MyHouse house2;
  private MyTree tree;
  private MyTree tree1;
  private MyTree tree2;
  
  /**
   * Constructor for objects of class MyScene
   */
  public MyScene() {
    // Specify the constructor for the superclass
    super(10, 10, 400, 300);
    // set characteristics for the object
    setTitle("My Scene");
    
    // Draw the sky
    getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
    
    // Draw some grass
    NsccRectangle grass = new NsccRectangle(0, 100, 400, 200);
    grass.setBackground(new Color(0x00, 0x99, 0x00));
    grass.setFilled(true);
    add(grass);
    
    // Draw a house
    house = new MyHouse(100, 50);
    add(house);
    house1 = new MyHouse(120, 110, Color. orange);
    add(house1);
    house2 = new MyHouse(20, 165, Color. black);
    add(house2);
    // draw trees
    tree = new MyTree(200,40);
    add(tree);
    tree1 = new MyTree(170,90, Color.red);
    add(tree1);
    tree2 = new MyTree(230,120, Color.yellow);
    add(tree2);
    
  }
  
  /**
   * Alter the scene, by changing color
   */
  public void change1() {
    // change the color of the house
    house.setColor(Color.red);
    house1.setColor(Color.cyan);
    house2.setColor(Color.white);
    // change color of tree
    tree.setColor(Color.pink);
    tree1.setColor(Color.gray);
    tree2.setColor(Color.magenta);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing location
   */
  public void change2() {
    // change the location of the house
    house.setLocation(50, 125);
    house1.setLocation(0, 20);
    house2.setLocation(250, 155);
    // change location of trees 
    tree.setLocation(-70, 142);
    tree1.setLocation(100, 150);
    tree2.setLocation(225, 52);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing size
   */
  public void change3() {
    // change the size of the house
    house.setSize(80, 60);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, restoring original settings
   */
  public void reset() {
    // reset the initial values for the house
    house.setLocation(100, 50);
    house.setColor(Color.blue);
    house.setSize(120, 90);
    house1.setLocation(120, 110);
    house1.setColor(Color.orange);
    house1.setSize(120, 90);
    house2.setLocation(20, 165);
    house2.setColor(Color.black);
    house2.setSize(120, 90);
    // reset the initial values for the leaf
    tree.setLocation(200,40);
    tree.setColor(Color.green);
    tree.setSize(160, 120);
    tree1.setLocation(170,90);
    tree1.setColor(Color.red);
    tree1.setSize(160, 120);
    tree2.setLocation(230, 120);
    tree2.setColor(Color.yellow);
    tree2.setSize(160,120);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * The application method, to test your code
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

     // declare a MyScene reference
     MyScene aScene;
     // instantiate MyScene
     aScene = new MyScene();
     // pause
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setColor
     aScene.change1();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setLocation
     aScene.change2();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setSize
     aScene.change3();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // reset initial values
     aScene.reset();
  }
  
}
