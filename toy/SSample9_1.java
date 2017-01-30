import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class SSample9_1 extends JFrame implements ActionListener{

  JTextField text1;
  JTextField text2;
  JLabel label;

  public static void main(String args[]){
    SSample9_1 frame = new SSample9_1("タイトル");
    frame.setVisible(true);
  }

  SSample9_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    text1 = new JTextField("文１", 20);
    text2 = new JTextField("文２", 20);
    JButton open = new JButton("開く");
    JButton save = new JButton("保存");
    open.addActionListener(this);
    //seve.addActionListener(this);
    label = new JLabel();
    JTextField textArea;
    JScrollPne scrollPane;

    textArea=new JTextArea(10,30);
    scrollPane=new JScrollPne(textArea);
    con.add(scrollPane);

    //fieldPanel.add(open);
    //fieldPanel.add(save);

    p.add(text1);
    p.add(text2);
    p.add(open);
    //p.add(save);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
    contentPane.add(label, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e){
    label.setText(text1.getText() + text2.getText());
  }
}