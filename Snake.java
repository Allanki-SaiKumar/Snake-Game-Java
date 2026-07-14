package src;

import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {

        add(new Board());
        setResizable(false);
        pack();
        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Snake game = new Snake();
        game.setVisible(true);
    }
}
