/*
 * a app that click on the button will change the color of ellipse belows
 * @author Lengfan Yan 
 * @version Lab 9: ButtonButton, Updated    check
 * 
 */ 

public class ButtonButton 
    implements java.awt.event.ActionListener {
    // creat fileds of shape
    NsccWindow win;
    NsccEllipse el;
    
    public ButtonButton() {
        //ini nscc nsccwindow and nsccellipse
        win = new NsccWindow();
        el = new NsccEllipse(100, 70, 200, 150);
        el.setFilled(true);
        el.setBackground(java.awt.Color.blue);
        win.add(el);
        // create button
        javax.swing.JButton btn;
        btn = new javax.swing.JButton("Click me");
        btn.setLocation(135, 30);
        btn.setSize(130, 35);
        win.add(btn);
        
//        javax.swing.JButton btn2;
//        btn2 = new javax.swing.JButton("Click me2");
//        btn2.setLocation(135, 225);
//        btn2.setSize(130, 30);
//        win.add(btn2);
        
        // set up the button
//        btn2.addActionListener(new ButtonStuff());
        btn.addActionListener(this);
        
        win.repaint();
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        win.setTitle("Thanks, I needed that.");
        // check the color of ellipse and change it
        if(el.getBackground().equals(java.awt.Color.blue)) {
          el.setBackground(java.awt.Color.red);
        }
        else if(el.getBackground().equals(java.awt.Color.red)) {
          el.setBackground(java.awt.Color.green);
        }
        else if(el.getBackground().equals(java.awt.Color.green)) {
          el.setBackground(java.awt.Color.blue);
        }
        
        // check the object for btn and show differtent when clikck it more than onece
        Object src = e.getSource();
        if(src instanceof javax.swing.JButton) {
            javax.swing.JButton btn;
            btn = (javax.swing.JButton) src;
            btn.setText("Click me again");}
        
        win.repaint();
        javax.swing.JOptionPane.showMessageDialog(null, "Thanks!");
    }
    //run
    public static void main(String[] args) {
        new ButtonButton();
    }
    
}
                           
/*class ButtonStuff implements java.awt.event.ActionListener {
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        javax.swing.JButton btn2;
        Object src = e.getSource();
        if(src instanceof javax.swing.JButton) {
            btn2 = (javax.swing.JButton) src;
            btn2.setText("Click me again2");}
            
        
        NsccEllipse el2;
        Object elt = ;
        if(elt instanceof NsccEllipse){
          el2 = (NsccEllipse) elt;
        if(el2.getBackground().equals(java.awt.Color.red)) {
          el2.setBackground(java.awt.Color.blue);
        }
        else if(el2.getBackground().equals(java.awt.Color.green)) {
          el2.setBackground(java.awt.Color.red);
        }
        else if(el2.getBackground().equals(java.awt.Color.blue)) {
          el2.setBackground(java.awt.Color.green);       
        }
        } javax.swing.JOptionPane.showMessageDialog(null, "Thanks!");
    }
}
*/
