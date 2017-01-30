import java.awt.FlowLayout;
import javax.swing.*;

public class  WindowTest {
	public static void main(String[] args) {
			JFrame frame =new JFrame();
			JLabel label = new JLabel("Asuka Ninomiya");
			JButton button = new JButton("PUSH");

			frame.getContentPane().setLayout(new FlowLayout());
			frame.getContentPane().add(label);
			frame.getContentPane().add(button);
			
			frame.setBounds(50,50,300,300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

	}
}