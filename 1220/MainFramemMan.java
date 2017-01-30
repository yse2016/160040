    import java.awt.*;
    import javax.swing.*;

    public class MainFrameMan {
        public static void main(String[] args) {
            FrameMan fm = new FrameMan();
        }
    }


    class FrameMan {
        // field
        JFrame frame;
        JPanel panel;
        JLabel label;
        JButton button;

        // method
        public FrameMan(){
            System.out.println("ALOHA from FrameMan!");
        }
    }