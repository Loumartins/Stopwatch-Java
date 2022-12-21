import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    Stopwatch(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    void start() {

    }
    void stop() {

    }
    void reset(){

    }
}
