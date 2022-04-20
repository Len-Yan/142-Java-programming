//Lengfan Yan
//csc142
//assignment 3: tic-tac-toe
//
import java.awt.Color;
public class Tic_Tac_ToeBoard {
  /**
   * draw tic-tac-toe
   * @author Lengfan Yan
   * @version assignment3 :Tic_Tac_ToeBoard    standard     (may be challenge? if that way works)
   * 
   * not even sure what i'm doing
   */
  //make private window for board
  private Tic_Tac_ToeBoard() {
    NsccWindow win = new NsccWindow(10,10,330,330);
    win.setTitle("tic-tac-toe board");
    
  
    //@param param for set the location of board
    //board 1
    public void DrawTicTacToe(int x, int y) {
      NsccLine onex = new NsccLine(30 + x, y, 30 + x, 90 + y);
      win.add(onex);
      NsccLine twox = new NsccLine(60 + x, y,60 + x, 90 + y);
      win.add(twox);
      NsccLine oney = new NsccLine(x, 30 + y, 90+ x, 30 + y);
      win.add(oney);
      NsccLine twoy = new NsccLine(x, 60 + y, 90+ x, 60 + y);
      win.add(twoy);
      
      win.repaint();    
  }
    
    // board 2 with nred line
    public void DrawTicTacToe(int x, int y, int r, int g, int b) {
      NsccLine onex = new NsccLine(30 + x, y, 30 + x, 90 + y);
      win.add(onex);
      //set color
      Color nred = new Color(r,g,b);
      onex.setForeground(nred);
      NsccLine twox = new NsccLine(60 + x, y,60 + x, 90 + y);
      win.add(twox);
      twox.setForeground(nred);
      NsccLine oney = new NsccLine(x, 30 + y, 90+ x, 30 + y);
      win.add(oney);
      oney.setForeground(nred);
      NsccLine twoy = new NsccLine(x, 60 + y, 90+ x, 60 + y);
      win.add(twoy);
      twoy.setForeground(nred);
      
      win.repaint();  }
      
      // board 3 with ex width
//  public void DrawTicTacToe(int x, int y, int w) {
//      NsccLine onex = new NsccLine(30 + x, y, 30 + x, 90 + y);
//      win.add(onex);
//      NsccLine twox = new NsccLine(60 + x, y,60 + x, 90 + y);
//      win.add(twox);
//      NsccLine oney = new NsccLine(x, 30 + y, 90+ x, 30 + y);
//      win.add(oney);
//      NsccLine twoy = new NsccLine(x, 60 + y, 90+ x, 60 + y);
//      win.add(twoy);
      
      win.repaint();   } 
  
      // borad 4 rotate  ( in other way...)
//  public void DrawTicTacToe(int x, int y) {
//      NsccLine onex = new NsccLine(30 + x, y, 30 + x, 90 + y);
//      win.add(onex);
//      onex.setSize(y,90)
//     NsccLine twox = new NsccLine(60 + x, y,60 + x, 90 + y);
//      win.add(twox);
//      twox.setSize(y,90)
//      NsccLine oney = new NsccLine(x, 30 + y, 90+ x, 30 + y);
//      win.add(oney);
//      oney.setSize(y,90)
//      NsccLine twoy = new NsccLine(x, 60 + y, 90+ x, 60 + y);
//      win.add(twoy);
//      two.setSize(y,90)
//      
//      win.repaint();    
//  }
  
  // call methods
     public static void main(String[] args) {
       Tic_Tac_ToeBorad drawttt;
       drawttt = new Tic_Tac_ToeBorad();
       drawttt.DrawTicTacToe(50,50);
       
       Tic_Tac_ToeBorad drawttt;
       drawttt = new Tic_Tac_ToeBorad();
       drawttt.DrawTicTacToe(50,50, 255, 0, 0);
       
  //     Tic_Tac_ToeBorad drawttt;
 //      drawttt = new Tic_Tac_ToeBorad();
  //     drawttt.DrawTicTacToe(50,50,5);
       
     }}