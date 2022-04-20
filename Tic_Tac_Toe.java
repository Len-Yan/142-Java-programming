/**
 * a Tic-Tac-Toe game
 * 
 * @authur Lengfan Yan
 * @version Assignment 10: Tic_Tac_Toe   challenge
 */
public class Tic_Tac_Toe implements java.awt.event.ActionListener{
  //fields
  NsccWindow win;
  private javax.swing.JButton[] bt;
  private javax.swing.JLabel llab;
  private boolean xo;
  
  //fields for challenge
  javax.swing.JLabel wins;
  javax.swing.JButton re;
  int xwin = 0;
  int owin = 0;
  int steps = 0;
  
  
  //constructor
  public Tic_Tac_Toe(){
    //instantiate
    xo = false;
    win = new NsccWindow(10,10, 235,280);
    win.setTitle("Tic-Tac-Toe");
    bt = new javax.swing.JButton[9];
    
    //lines to make the tic-tac-toe board look better. 
    NsccRectangle a = new NsccRectangle(30,30,160,160);
    a.setFilled(true);
    a.setBackground(java.awt.Color.black);
    win.add(a);
    
    // loop for 9 button
    int hor = 0;
    int ver = 0;
    for(int i =0;i <9;i++){
      int x = 55;
      int y = 55;
      bt[i] = new javax.swing.JButton("");
      bt[i].setLocation(30 + x * hor, 30 + y * ver);
      bt[i].setSize(50, 50);
      win.add(bt[i]);
      hor++;
      if(hor == 3){
        hor = 0;
        ver++;
      }
      bt[i].addActionListener(this);
    }
    //ini JLabel
    llab = new javax.swing.JLabel("X's turn");
    llab.setLocation(30,200);
    llab.setSize(160,20);
    llab.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
    win.add(llab);
    
    //label for track game state
    wins = new javax.swing.JLabel("X win: " + xwin + "pt  |  O win: " + owin + "pt");
    wins.setLocation(40,9);
    wins.setSize(160,20);
    win.add(wins);
   
    //reset button
    re = new javax.swing.JButton("RESET");
    re.setLocation(110,200);
    re.setSize(75,18);
    win.add(re);
    re.addActionListener(this);
    re.setEnabled(false);
    
    //not important
    javax.swing.JLabel notimportant = new javax.swing.JLabel("note: 2pt per game");
    notimportant.setLocation(50,226);
    notimportant.setSize(120,12);
    win.add(notimportant);
    
    win.repaint();
  }
  
  /*
   * hander
   * @param e common param for actionevent, listen to action
   */ 
  public void actionPerformed(java.awt.event.ActionEvent e) { 
    //check if game end
    int endgame = 0;
    
    //loop to check which is cilcked and perform X, O.
    for(int i = 0; i<9;i++){
      if(e.getSource() == bt[i]){
        if(xo == false){
          bt[i].setText("X");
          llab.setText("O's turn");
          xo = true;
          steps++;
          //disable button onece cilcked
          bt[i].setEnabled(false);
        }
        else{bt[i].setText("O");
          llab.setText("X's turn");
          xo = false;
          steps++;
          bt[i].setEnabled(false);
        }}
    }
    
    //check if game win and do somethings with it   for X
    if(bt[0].getText().equals("X") && bt[1].getText().equals("X") && bt[2].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[3].getText().equals("X") && bt[4].getText().equals("X") && bt[5].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[6].getText().equals("X") && bt[7].getText().equals("X") && bt[8].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[0].getText().equals("X") && bt[3].getText().equals("X") && bt[6].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[1].getText().equals("X") && bt[4].getText().equals("X") && bt[7].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[2].getText().equals("X") && bt[5].getText().equals("X") && bt[8].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[0].getText().equals("X") && bt[4].getText().equals("X") && bt[8].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }else if(bt[2].getText().equals("X") && bt[4].getText().equals("X") && bt[6].getText().equals("X")){
      xwin++;
      endgame++;
      llab.setText("X win.");
    }
    //check if game win and do somethings with it   for O
    else if(bt[0].getText().equals("O") && bt[1].getText().equals("O") && bt[2].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[3].getText().equals("O") && bt[4].getText().equals("O") && bt[5].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[6].getText().equals("O") && bt[7].getText().equals("O") && bt[8].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[0].getText().equals("O") && bt[3].getText().equals("O") && bt[6].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[1].getText().equals("O") && bt[4].getText().equals("O") && bt[7].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[2].getText().equals("O") && bt[5].getText().equals("O") && bt[8].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[0].getText().equals("O") && bt[4].getText().equals("O") && bt[8].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }else if(bt[2].getText().equals("O") && bt[4].getText().equals("O") && bt[6].getText().equals("O")){
      owin++;
      endgame++;
      llab.setText("O win.");
    }
    //check Cat game
    else{
      if (steps == 9){
        llab.setText("Cat game.");
       // steps = 0;
      }
    }
    //if game end Enable reste
    if(endgame != 0){
      for(int i = 0;i<9;i++){
        bt[i].setEnabled(false);
         re.setEnabled(true);
      }
    }
    
    // update win count
    wins.setText("X win: " + xwin + "pt  |  O win: " + owin + "pt");

    // reset if cilck on reste
    if(e.getSource() == re){
      for(int k = 0;k<9;k++){
        bt[k].setText("");
        bt[k].setEnabled(true);
        xo = false;
        llab.setText("X's turn");
        re.setEnabled(false);
      }
      steps = 0;
    }
  }
  
  /*
   * run method
   * @param args Command-line parameters
   */ 
  public static void main(String[] args) {
    new Tic_Tac_Toe();
  }
}