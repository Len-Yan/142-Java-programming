/**
 * create tiling pattern in drawing panel window
 * @author Lengfan Yan
 * @version Assignment 11: Tiling   standard
 */ 
public class Tiles{
  //field
  public static final int WIDTH = 200;
  public static final int HEIGHT = 150;
  
  //method for draw Basket weave
  public void M1(){
    
    DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
    dp.setTitle("Basket weave");
    java.awt.Graphics g = dp.getGraphics();  
    //draw background
    g.setColor(new java.awt.Color(185,122,87));
    g.fillRect(0, 0, WIDTH,HEIGHT);  
    //draw lines horizontally
    for(int h = 0; h< (HEIGHT/40)+1; h++){
      g.setColor(java.awt.Color.black);
      g.drawLine(0,20+h*40,WIDTH,20+h*40);
    }
    //make  "yellow" blocks
    for(int h = 0; h< (HEIGHT/40)+1; h++){
      //first lines
      for(int i =0; i < WIDTH/40+1; i++){     
        g.setColor(new java.awt.Color(255,201,14));
        g.fillRect(i*80,  h*80, 40, 40);
        g.setColor(java.awt.Color.black);
        g.drawRect(i*80,  h*80, 40, 40);
        g.drawLine(20+ i*80+(-1)*h*40, 0+ 40*h , 20+ i*80+(-1)*h*40 , 40+ 40*h);
      }
      //sceond lines
      for(int i =0; i < WIDTH/40+1; i++){
        g.setColor(new java.awt.Color(255,201,14));
        g.fillRect(40+i*80,  40+h*80, 40, 40);
        g.setColor(java.awt.Color.black);
        g.drawRect(40+i*80,  40+h*80, 40, 40);
        g.drawLine(20+ i*80+(-1)*h*40, 0+ 40*h , 20+ i*80+(-1)*h*40 , 40+ 40*h);
      }
    }
    dp.repaint();
  }
  
  
  //method for draw Mediterranean 1
  public void M2(){
    DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
    dp.setTitle("Med. 1");
    java.awt.Graphics g = dp.getGraphics();  
    //draw backgournd
    g.setColor(new java.awt.Color(255,255,64));
    g.fillRect(0, 0, WIDTH,HEIGHT);    
//    int xv[] = {7, 17, 24, 24, 17, 7, 0, 0};
//    int yv[] = {0, 0, 7, 17, 24, 24, 17, 7};
//    g.setColor(new java.awt.Color(255,255,64));
//    g.fillPolygon(xv,yv, 8);
//    g.setColor(java.awt.Color.black);
//    g.drawPolygon(xv,yv, 8);
    
    //make 2 line at up and left of red part
    for(int y = 0; y< (HEIGHT/24)+1; y++){
      for(int x =0; x < WIDTH/24+1; x++){
        int xv[] = {17+x*24,24+x*24,17+x*24,10+x*24};
        int yv[] = {10+y*24,17+y*24,24+y*24,17+y*24};
        g.setColor(java.awt.Color.red);
        g.fillPolygon(xv,yv, 4);
        g.setColor(java.awt.Color.black);
        g.drawPolygon(xv,yv, 4);
        g.drawLine(17+x*24,0+y*24,17+x*24,10+y*24);
        g.drawLine(0+x*24,17+y*24,10+x*24,17+y*24); 
      }
    }
    dp.repaint();
  }
  
  
  
  
//  public void forM3(int x, int y, java.awt.Graphics g){
//   // DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
//  //  java.awt.Graphics g = dp.getGraphics(); 
//    g.setColor(new java.awt.Color(192,192,128));
//    g.fillRect(0, 0, WIDTH,HEIGHT);  
//    java.awt.Graphics2D gd = (java.awt.Graphics2D)g.create();
//    gd.rotate(Math.toRadians(45),20,5);
//  
//    int xv[] = {17*x,24*x,17*x,10*x};
//    int yv[] = {10,17,24,17};
//    gd.setColor(new java.awt.Color(0,112,192));
//    gd.fillPolygon(xv,yv, 4);
//    gd.setColor(java.awt.Color.black);
//    gd.drawPolygon(xv,yv, 4);
//    gd.drawLine(17*x,0,17,10);
//    gd.drawLine(x,17,10,17);}
  
  
  //method for draw Mediterranean 2
  public void M3(){
    DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
    dp.setTitle("Med. 2");
    java.awt.Graphics g = dp.getGraphics();  
    
//    g.setColor(new java.awt.Color(192,192,128));
//    g.fillRect(0, 0, WIDTH,HEIGHT);      
//    for(int x =0; x<(WIDTH/20)+1; x++){
//    forM3(x*40,0,g);
//    }
    //backgournd
    g.setColor(new java.awt.Color(0,112,192));
    g.fillRect(0, 0, WIDTH,HEIGHT);  
    
    for(int y = 0; y< (HEIGHT/24)+1; y++){
      for(int x =0; x < WIDTH/34+1; x++){
        //make first line of polygon
        g.setColor(new java.awt.Color(0,112,192));
        int xv1[] = {7+34*x,17+34*x,24+34*x,24+34*x,17+34*x,7+34*x,0+34*x,0+34*x};
        int yv1[] = {-17+34*y,-17+34*y,-10+34*y,0+34*y,7+34*y,7+34*y,0+34*y,-10+34*y};
        g.setColor(new java.awt.Color(192,192,128));
        g.fillPolygon(xv1,yv1,8);
        g.setColor(java.awt.Color.black);
        g.drawPolygon(xv1,yv1,8);
      }
      //make 2nd line of polygon
      for(int x =0; x < WIDTH/24+1; x++){
        g.setColor(new java.awt.Color(0,112,192));
        int xv1[] = {-10+34*x,0+34*x,7+34*x,7+34*x,0+34*x,-10+34*x,-17+34*x,-17+34*x};
        int yv1[] = {0+34*y,0+34*y,7+34*y,17+34*y,24+34*y,24+34*y,17+34*y,7+34*y};
        g.setColor(new java.awt.Color(192,192,128));
        g.fillPolygon(xv1,yv1,8);
        g.setColor(java.awt.Color.black);
        g.drawPolygon(xv1,yv1,8);
      }
    }
  dp.repaint();
  } 
    
//    java.awt.Graphics2D gd = (java.awt.Graphics2D)g.create();
//    gd.rotate(Math.toRadians(45));
//    
//    for(int y = 0; y< (HEIGHT/24); y++){
//      for(int x =0; x < (WIDTH/24); x++){
//        int xv[] = {17+x*24,24+x*24,17+x*24,10+x*24};
//        int yv[] = {10+y*24,17+y*24,24+y*24,17+y*24};
//        gd.setColor(new java.awt.Color(0,112,192));
//        gd.fillPolygon(xv,yv, 4);
//        gd.setColor(java.awt.Color.black);
//        gd.drawPolygon(xv,yv, 4);
//        gd.drawLine(17+x*24,0+y*24,17+x*24,10+y*24);
//        gd.drawLine(0+x*24,17+y*24,10+x*24,17+y*24); 
//      }
  // }
  
  
  //method for draw OPEN WAVE
  public void M4(){
    DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
    dp.setTitle("Open Weave");
    java.awt.Graphics g = dp.getGraphics();  
    //backgournd
     g.setColor(new java.awt.Color(154,32,64));
     g.fillRect(0, 0, WIDTH,HEIGHT); 
    // rect horizontally
     for(int y=0;y< (HEIGHT/30)+1;y++){
       g.setColor(new java.awt.Color(204,136,204));
       g.fillRect(0,10 +30*y,WIDTH, 20);
       g.setColor(java.awt.Color.black);
       g.drawRect(0,10 +30*y ,WIDTH, 20);
     }
     // put verticall rect on the horizontall rect
     for(int y=0;y< (HEIGHT/30)+1;y++){
       //first line
       for(int x=0;x<(WIDTH/30)+1;x++){
         g.setColor(new java.awt.Color(204,136,204));
         g.fillRect(10+x*60,y*60,20,40);
         g.setColor(java.awt.Color.black);
         g.drawRect(10+x*60,y*60,20,40);
       }
       //second
       for(int x=0;x<(WIDTH/30)+1;x++){
         g.setColor(new java.awt.Color(204,136,204));
         g.fillRect(40+x*60,-30+y*60,20,40);
         g.setColor(java.awt.Color.black);
         g.drawRect(40+x*60,-30+y*60,20,40);       
       }
     }
  }
  
  
  //method for draw Pythagorean
  public void M5(){
    DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
    dp.setTitle("Pythagorean");
    java.awt.Graphics g = dp.getGraphics();  
    //backgournd
    g.setColor(new java.awt.Color(64,64,192));
    g.fillRect(0, 0, WIDTH,HEIGHT);  
    
    //make shape of 3 square together
    for(int y=0;y<(HEIGHT/50)+1;y++){
      //first line
      for(int x = 0 ;x<(WIDTH/50)+1;x++){
        g.setColor(new java.awt.Color(136,204,204));
        g.fillRect(-15+x*50,-5+y*50,20,20);
        g.fillRect(15+x*50,-15+y*50,20,20);
        g.fillRect(5+x*50,5+y*50,20,20);
        g.setColor(java.awt.Color.black);
        g.drawRect(-15+x*50,-5+y*50,20,20);
        g.drawRect(15+x*50,-15+y*50,20,20);
        g.drawRect(5+x*50,5+y*50,20,20);
      }//second
      for(int x = 0 ;x<(WIDTH/50)+1;x++){
        g.setColor(new java.awt.Color(136,204,204));
        g.fillRect(-5+x*50,25+y*50,20,20);
        g.fillRect(25+x*50,15+y*50,20,20);
        g.fillRect(15+x*50,35+y*50,20,20);
        g.setColor(java.awt.Color.black);
        g.drawRect(-5+x*50,25+y*50,20,20);
        g.drawRect(25+x*50,15+y*50,20,20);
        g.drawRect(15+x*50,35+y*50,20,20);
      }
    } 
  }
    
  /**
   * The application method
   * @param args Command-line parameters
   */
  public static void main(String[] args) {
    
    Tiles d = new Tiles();
    d.M1();
    d.M2();
    //d.forM3(15,15,g);
    d.M3();
    d.M4();
    d.M5();
  }
}