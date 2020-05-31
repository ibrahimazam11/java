import javax.swing.*;
import java.awt.FlowLayout;
public class FrameTest {
	public static void main(String[] args)
	{
			JFrame frame1=new JFrame();
			frame1.setTitle("Untitled");
			frame1.setSize(450,100);
			//frame1.setLocationRelativeTo(null); //To place Frame in center
			frame1.setLocation(400, 100);        //Set Frame on XY cordinates
			frame1.setVisible(true);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel p=new JPanel();
	         
	         
	JButton but1=new JButton("YES");
	JButton but2=new JButton("No");
	p.add(but1);
	p.add(but2);
	
	frame1.add(p);
	
	
	}
			
}