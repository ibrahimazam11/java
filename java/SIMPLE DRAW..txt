
package javaapplication7;
import java.awt.*;  

 import java.awt.event.*;  

 import javax.swing.*;  

 import javax.swing.event.*;  

 class Paint extends JFrame implements MouseListener, MouseMotionListener, ActionListener  

 {  

   int last_x=-10;  

   int last_y=-10;  

   int xpos=-10;  

  int ypos=-10;  

   Container con = null;  

   Color rred = (Color.red);  

   Color bblue = (Color.blue);  

   Color ggreen = (Color.green);  

   Color yyellow = (Color.yellow);  

      

   //crayons  

   ImageIcon blue = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\blue.gif");  

   JButton cblue = new JButton(blue);      

   ImageIcon red = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\red.gif");  

   JButton cred = new JButton(red);  

   ImageIcon yellow = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\yellow.gif");  

   JButton cyellow = new JButton(yellow);  

  ImageIcon green = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\green.gif");  

   JButton cgreen = new JButton(green);  

      

   //left icons  

   ImageIcon brush = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\brush.jpg");  

   JButton pbrush = new JButton(brush);  

   ImageIcon eraser = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\eraser.jpg");  

   JButton peraser = new JButton(eraser);  

   ImageIcon pencil = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\pencil.jpg");  

   JButton ppencil = new JButton(pencil);  

   ImageIcon text = new ImageIcon("C:\\Documents and Settings\\Owner\\Desktop\\text.jpg");  

   JButton ttext = new JButton(text);  
      
   private JPanel centerPanel;  
   private JPanel westPanel;  

   private JPanel southPanel;  

      

  private boolean texton;  
   private JTextField text2;  
  private String font;  
   private int topX, topY;  

   Label t;  
   

  public Paint() //constructor  

  {  

       Graphics g = getGraphics();  

          

     //text  

     if ( texton ) {  

         g.setFont( new Font( font, Font.PLAIN, last_x ) );  

         g.drawString( text2.getText(), topX, topY );  

         texton = false;  

         return;  

     }  

   

        

   TextField text2 = new TextField(50);  

     text2.addActionListener(  

      new ActionListener () {  

   

          public void actionPerformed( ActionEvent event )  

          {  

              texton = true;  

              repaint();  

          }  

    }
     );


          

     setTitle("Paint");  

     setBackground(Color.white);  

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

     con = this.getContentPane();   

     con.setBackground(Color.white);  

     addMouseListener(this);  

    addMouseMotionListener(this);  

       

     //file, help, top  

     JMenuBar menuBar = new JMenuBar();  

     getContentPane().add(menuBar, BorderLayout.NORTH);  

     JMenu fileMenu = new JMenu("File");       

     JMenu helpMenu = new JMenu("Help");  

     menuBar.add(fileMenu);  

     menuBar.add(helpMenu);  

        

     //text  

    

     centerPanel = new JPanel();  

    t = new Label("Enter text, then click location:");  

    centerPanel.add(t);  

     centerPanel.add(text2);  

    con.add(centerPanel, BorderLayout.CENTER);  

        

     //Dropdowns menu  

    JMenuItem newItem = new JMenuItem("New");  

     JMenuItem exitItem = new JMenuItem("Exit");  

     JMenuItem helpItem = new JMenuItem("About");  

     newItem.addActionListener(this);  

     exitItem.addActionListener(this);  

     helpItem.addActionListener(this);  

     fileMenu.add(newItem);  

     fileMenu.add(exitItem);  

     helpMenu.add(helpItem);  

        

     //left icons  

    westPanel = new JPanel();  

     westPanel.setLayout(new GridLayout(4,1));  

     westPanel.add(peraser);  

     westPanel.add(ppencil);  

     westPanel.add(pbrush);  

    westPanel.add(ttext);  

    con.add(westPanel, BorderLayout.WEST);   

        

     //bottom crayons  

    southPanel = new JPanel();  

    southPanel.setLayout(new GridLayout(2,2));  

     southPanel.add(cred);  

     southPanel.add(cyellow);  

    southPanel.add(cgreen);  

     southPanel.add(cblue);  

     con.add(southPanel, BorderLayout.SOUTH);   

        

   }  

    

     public void actionPerformed(ActionEvent ae){  

       String actionCommand = ae.getActionCommand();  

        if (actionCommand.compareTo("New") == 0){  

            startNewDocument();  

         } else if (actionCommand.compareTo("Exit") == 0){  

             exit();  

         } else if (actionCommand.compareTo("About") == 0){  

            help();}  

     }  

            

 public void startNewDocument(){  

        Graphics g = getGraphics();  

         g.setColor( Color.white );  

        g.fillRect( 0, 0, getSize().width, getSize().height );  

     }  

 
 public void exit(){  

    String exitMessage = "Are you sure you want to exit?";  

    if (JOptionPane.showConfirmDialog(this, exitMessage) == JOptionPane.YES_OPTION){  

         System.exit(0);  

    }  

 }  

    

 public void text(){  

     

     }   

   

 public void help(){  

     JOptionPane.showMessageDialog(this,"Paint\n" +   

        "Author: Cristy Tutt\n" +   

         "Version: May 12, 2009\n" );  

 }  

     

 public void mouseDragged(MouseEvent evt)  

   {  

     xpos=evt.getX();  

     ypos=evt.getY();  

     Graphics g = getGraphics();  

     g.setColor(rred);  

     g.drawLine(last_x,last_y,xpos,ypos);  

    last_x = xpos;  

    last_y = ypos;  

   }  

    

   public void mousePressed(MouseEvent evt)  

   {  

     last_x = evt.getX();  

    last_y = evt.getY();  

   }  


  //following methods need to be included even if not used  

   public void mouseMoved(MouseEvent evt) {}  

   public void mouseClicked(MouseEvent evt) {}  

   public void mouseReleased(MouseEvent evt) {}  

   public void mouseEntered(MouseEvent evt) {}  

  public void mouseExited(MouseEvent evt) {}  

   public static void main(String[] args)  

   {  
      Paint myDD = new Paint();  

     myDD.setSize(750,550);  

     myDD.setResizable(false); // do not allow the frame to be resized  

     myDD.setVisible(true);    

    

   }  

} 



