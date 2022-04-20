/**
 * this is a class draw Trafficlight
 * 
 * @author Lengfan Yan
 * @version Lab 2: Traffic Light
 * 
 */
import java.awt.Color;

public class TrafficLight {
   // create a window draw trafficlingt inside
   public void drawTheLight() {
     //create window
     NsccWindow win = new NsccWindow(10, 10, 140, 330);
     //create a rectangle hold trafficlight
     NsccRectangle re = new NsccRectangle(20, 20, 90, 250);
     //set color for rectangle
     re.setBackground(java.awt.Color.lightGray);     
     re.setFilled(true);
     //add rectangle in the window i created
     win.add(re);      
     // create the lights for trafficlight, color them and attach to rectangle
     NsccEllipse circle1 = new NsccEllipse(10, 10, 70, 70);                                
     re.add(circle1);
     circle1.setFilled(true); 
     circle1.setBackground(java.awt.Color.red);                                 
                                     
     NsccEllipse circle2 = new NsccEllipse(10, 90, 70, 70);  
     re.add(circle2);  
     circle2.setFilled(true); 
     circle2.setBackground(java.awt.Color.yellow);                              
                                     
     NsccEllipse circle3 = new NsccEllipse(10, 170, 70, 70);
     re.add(circle3);   
     circle3.setFilled(true);
     circle3.setBackground(java.awt.Color.green);                                
                                     
                                                                                                     
     //repaint the draws in window                                
     win.repaint();
   }

   // runs the trafficlight created above
   public static void main(String[] args) {
     TrafficLight lab2;
     lab2 = new TrafficLight();
     lab2.drawTheLight();}
}





