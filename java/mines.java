import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

public class mines {
	static int x=0;

    private Timer timer = new Timer();
	
    int nSeconds = 0;
    
	JFrame f;
	JMenuBar menu;
	JMenu m1, m2;
	Container c;
	JTextField t3, t4, t5;
	JButton s;
	JButton a[];
	JPanel pButton,  h;
	ImageIcon smile, sad;
	mines() {
		
		timer.schedule(new UpdateUITask(), 0, 1000);
		f = new JFrame("Minesweeper Game");
		menu = new JMenuBar();
		m1 = new JMenu("Game");
		m2 = new JMenu("Help");
		c = f.getContentPane();
		t3 = new JTextField("Bombs 10");
		t4 = new JTextField();
		t3.setFont(new Font("DigitalFont.TTF",Font.BOLD,25));
		t3.setBackground(Color.LIGHT_GRAY);
		t3.setForeground(Color.GRAY);
		t3.setBorder(BorderFactory.createLoweredBevelBorder());
		t4.setFont(new Font("DigitalFont.TTF",Font.BOLD,25));
		t4.setBackground(Color.LIGHT_GRAY);
		t4.setForeground(Color.GRAY);
		t4.setBorder(BorderFactory.createLoweredBevelBorder());
		t5 = new JTextField("Made By Haseeb ullah and Rashid Hanif");
		smile = new ImageIcon("smile.png");
		sad = new ImageIcon("sad.png");
		s = new JButton(smile);
		s.setBackground(Color.WHITE);
		s.addActionListener(new ClickHandler());
		a = new JButton[81];
		for (int i = 0; i < 81; i++) {
			a[i] = new JButton();
			a[i].setBackground(Color.WHITE);
			a[i].addActionListener(new ClickHandler());
		}
		
	}

	void create() {
		menu.add(m1);
		menu.add(m2);
		f.setJMenuBar(menu);
		pButton = new JPanel(new GridLayout(9,9));// 81 button
		h = new JPanel(new GridLayout(1, 3)); // smile,time and bombs
		f.setSize(600, 600);
		f.setVisible(true);
		c.setLayout(new BorderLayout());
		for (int i = 0; i < 81; i++) {
			pButton.add(a[i]);
		}
		h.add(t3);
		h.add(s);
		h.add(t4);
		c.add(pButton, BorderLayout.CENTER);// pbuttons contain all buttons
		c.add(h, BorderLayout.NORTH);
		c.add(t5, BorderLayout.SOUTH);
	}
	 private class UpdateUITask extends TimerTask {

	       

	       
	        public void run() {
	            EventQueue.invokeLater(new Runnable() {
	            	public void run() {
	                    t4.setText(String.valueOf("Time "+nSeconds++));
	                }
	            });
	        }
	    }
	
	

	public static void main(String abc[]) {
		mines g1 = new mines();
		g1.create();
	}
	class ClickHandler implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
				if(ae.getSource() == a[1]||ae.getSource() == a[10]||ae.getSource() == a[14]||ae.getSource() == a[16]||ae.getSource() == a[21]||ae.getSource() == a[42]||ae.getSource() == a[47]||ae.getSource() == a[49]||ae.getSource() == a[72]||ae.getSource() == a[73])
				{
					a[1].setIcon(new ImageIcon("index.png"));
					a[10].setIcon(new ImageIcon("index.png"));
					a[14].setIcon(new ImageIcon("index.png"));
					a[16].setIcon(new ImageIcon("index.png"));
					a[21].setIcon(new ImageIcon("index.png"));
					a[42].setIcon(new ImageIcon("index.png"));
					a[47].setIcon(new ImageIcon("index.png"));
					a[49].setIcon(new ImageIcon("index.png"));
					a[72].setIcon(new ImageIcon("index.png"));
					a[73].setIcon(new ImageIcon("index.png"));
					s.setIcon(sad);
					JOptionPane.showMessageDialog(null, "You lose, Game is Over");
				}
				for (int i = 0; i < 81; i++)
				{
					if (ae.getSource() == a[i]) {
						
						
					if((i==4)||(i==5)||(i==7)||(i==8)||(i==12)||(i==17)||(i==18)||(i==19)||(i==23)||(i==25)||(i==26)||(i==29)||(i==30)||(i==31)||(i==32)||(i==33)||(i==34)||(i==37)||(i==38)||(i==40)||(i==43)||(i==46)||(i==51)||(i==52)||(i==55)||(i==56)||(i==58)||(i==59)||(i==65)||(i==74))
						{	
							a[i].setContentAreaFilled(false);
							a[i].setText("1");
							x=x+1;
							if(x>=70)
							{
								JOptionPane.showMessageDialog(null, "you win, your time is "+nSeconds);
							}
						}
					
						else	if(i==11)
						{
							a[i].setContentAreaFilled(false);
							a[i].setText("3");
							x=x+1;
							if(x>=70)
							{
								JOptionPane.showMessageDialog(null, "you win, your time is "+nSeconds);
							}
						}
						else	if((i==0)||(i==2)||(i==6)||(i==9)||(i==13)||(i==15)||(i==20)||(i==22)||(i==24)||(i==39)||(i==41)||(i==48)||(i==50)||(i==57)||(i==63)||(i==64))
						{
							a[i].setContentAreaFilled(false);
							a[i].setText("2");
							x=x+1;
							if(x>=70)
							{
								JOptionPane.showMessageDialog(null, "you win, your time is "+nSeconds);
							}
						}
						else 
						{
							a[i].setContentAreaFilled(false);
							x=x+1;
							if(x>=70)
							{
								JOptionPane.showMessageDialog(null, "you win, your time is "+nSeconds);
							}
						}
					return;
				}
				}
				if(ae.getSource() == s)
				{
					nSeconds = 0;
					s.setIcon(smile);
					x=0;
					for (int i = 0; i < 81; i++) {
						a[i].setContentAreaFilled(true);
						a[i].setBackground(Color.WHITE);
						a[i].setText(null);
						a[i].setIcon(null);
					}
		}
	}
	}
}
