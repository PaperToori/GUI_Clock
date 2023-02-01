import javax.swing.*;
import java.awt.*;
public class Clock extends JPanel {
    // Variables
    private int size;

    // Constructors
    public Clock (int size) {
        this.size = size;
        this.setBackground(Color.lightGray); // Background colour doesn't work :(
        this.setSize(new Dimension(size, size));
    }

    // Methods

    // Makes the circle
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(0,0,size,size);
        g.setColor(Color.white);
        g.fillOval(10,10,size-20,size-20);

    }

}
