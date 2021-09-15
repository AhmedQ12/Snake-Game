import java.awt.EventQueue;

import javax.swing.JFrame;

public class game extends JFrame {

    game() {
        add(new board());
        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        // Creates a new thread so our GUI can process itself
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new game();
                frame.setVisible(true);
            }
        });
    }
}