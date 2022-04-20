/**
 * draw 2 graph by drawingpanel
 * @author Lengfan Yan
 * @version Lab 12: DrawingPanel check
 */ 
public class drawthings{

  //method for draw traffic light
  public void traffic(){
    DrawingPanel dp = new DrawingPanel(130,290);
    dp.setTitle("traffic light");
    java.awt.Graphics g = dp.getGraphics();
    
    g.drawRect(19,19,91,251);
    g.setColor(java.awt.Color.lightGray);
    g.fillRect(20,20,90,250);
    
    //darw 1 biger circle before the one should appare so creat 1pixel black line
    g.setColor(java.awt.Color.black);
    g.fillOval(29, 29, 72, 72);
    g.setColor(java.awt.Color.red);
    g.fillOval(30, 30, 70, 70);
    
    g.setColor(java.awt.Color.black);
    g.fillOval(29, 109, 72, 72);
    g.setColor(java.awt.Color.yellow);
    g.fillOval(30, 110, 70, 70);
    
    g.setColor(java.awt.Color.black);
    g.fillOval(29, 189, 72, 72);
    g.setColor(new java.awt.Color(0,127,0));
    g.fillOval(30, 190, 70, 70);
    
    dp.repaint();
  }
    
  //method draw nest shapes
  public void nest(){
    DrawingPanel dp = new DrawingPanel(250,250);
    dp.setTitle("nest");
    java.awt.Graphics g = dp.getGraphics();
    
    g.drawRect(24,24,201,201);
    g.setColor(java.awt.Color.green);
    g.fillRect(25,25,200,200);
    
    //darw 1 biger circle before the one should appare so creat 1pixel black line
    g.setColor(java.awt.Color.black);
    g.fillOval(24, 24, 202, 202);
    g.setColor(java.awt.Color.magenta);
    g.fillOval(25, 25, 200, 200);
    
    
    int xv[] = {25, 125, 225, 125};
    int yv[] = {125, 25, 125, 225};
    int xv1[] = {24, 125, 226, 125};
    int yv1[] = {125, 24, 126, 227};
    g.setColor(java.awt.Color.black);
    g.fillPolygon(xv1,yv1, 4);
    g.setColor(java.awt.Color.cyan);
    g.fillPolygon(xv,yv, 4);
    
    dp.repaint();
  }
    
  /**
   * The application method
   * @param args Command-line parameters
   */
  public static void main(String[] args) {
    drawthings d = new drawthings();
    d.traffic();
    d.nest();
  }
}