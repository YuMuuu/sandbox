import javax.swing.*;
import java.awt.*;

public class Sample extends JFrame{
	
	Sample(){
		setTitle("タイトル");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setBackground(new Color(0,0,0,127));
		
		JPanel p = new JPanel();
		JLabel label = new JLabel();
		label.setText("あいうえお");
		
		p.add(label);
		
		getContentPane().add(p);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		Sample s = new Sample();
	}
}

