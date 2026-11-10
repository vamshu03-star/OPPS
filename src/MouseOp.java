import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseOp extends JFrame implements MouseListener,MouseMotionListener {
    JLabel l;
    MouseOp(){
        setTitle("Mouse Movement");
        setLayout(new BorderLayout());
        setSize(450,300);

        l = new JLabel("No Event",SwingConstants.CENTER);
        add(l);
        addMouseListener(this);
        addMouseMotionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent ae){
        l.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent ae){
        l.setText("Mouse Pressed!");
    }
    public void mouseReleased(MouseEvent ae){
        l.setText("Mouse Released!");
    }
    public void mouseEntered(MouseEvent ae){
        l.setText("Mouse Entered!");
    }
    public void mouseExited(MouseEvent ae){
        l.setText("Mouse Exited!");
    }
    public void mouseDragged(MouseEvent ae) {
        l.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent ae) {
        l.setText("Mouse Moved");
    }
    public static void main(String[] args) {
        new MouseOp();
    }
}
