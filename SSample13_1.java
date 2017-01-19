import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.;
import java.awt.event.;
import javax.swing.;
import java.io.;

class SSample13_1 extends JFrame{
  public static void main(String args[]){
    SSample13_1 frame = new SSample13_1("タイトル");
    frame.setVisible(true);
  }

  SSample13_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JButton button1 = new JButton("Yes");
    JButton button2 = new JButton("No");
    JButton button3 = new JButton("Cancel");
    JButton button4 = new JButton("Help");

    getRootPane().setDefaultButton(button3);

    p.add(button1);
    p.add(button2);
    p.add(button3);
    p.add(button4);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}