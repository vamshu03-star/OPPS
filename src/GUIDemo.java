import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
class GUIDemo extends JFrame implements ActionListener {
    JButton b1,b2;
    JLabel l;
    GUIDemo(){
        this.setSize(500,400);
        this.setTitle("New Title");
        this.setLayout(null);
        l = new JLabel("No Click");
        l.setBounds(100,50,100,20);
        this.add(l);
        b1 = new JButton("Hello");
        this.add(b1);
        b1.setBounds(100,100,100,20);
        b1.addActionListener(this);
        b2 = new JButton("Clear");
        this.add(b2);
        b2.setBounds(100,150,100,20);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            l.setText(b1.getText());
        }
        if(ae.getSource()==b2){
            l.setText("Clear");
        }
    }
    public static void main(String[] args) {
      new GUIDemo();
    }
}
