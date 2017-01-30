public class public static void main(String[] args) {
	public static void main(String[] args) {
			JFrame frame =new JFrame();
			JLabel label = new JLabel("Hello world");
			JButton button = new JButton("PUSH");

			frame.getContentPane().setLayout(new FlowLayout());
			frame.getContentPane().add(label);
			frame.getContentPane().add(button);

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300,300);
			frame.setVisible(true);

	}	
}
