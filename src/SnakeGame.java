import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board = new Board();

    SnakeGame(){
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        SnakeGame game = new SnakeGame();
    }
}
