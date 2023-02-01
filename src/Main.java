import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        start();

    }


    static public void start(){

        // Variables
        int fSize = 250;
        int size = 200;

        //basic frame setup
        JFrame f = new JFrame("Analog Clock");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(fSize, fSize));

        // Adds clock
        f.add(new Clock(size));

        // Displays JFrame
        //f.setLayout(null);
        f.pack();
        f.setVisible(true);


    }
}