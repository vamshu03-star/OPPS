import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DivisionUI extends JFrame implements ActionListener {
    JTextField num1,num2,result;
    JButton divide;
    DivisionUI(){
        setTitle("Integer Division");
        setSize(400,250);
        setLayout(new GridLayout(4,2,2,5));
         add(new JLabel("Num1: "));
         num1 = new JTextField();
         add(num1);
         //add

         add(new JLabel("Num2: "));
         num2 = new JTextField();
        add(num2);

         add(new JLabel("Result"));
         result = new JTextField();
         result.setEditable(false);
         add(result);

         divide = new JButton("Divide");
         add(divide);
         divide.addActionListener(this);

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int res = n1/n2;
            result.setText(String.valueOf(res));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Enter valid input");
        }
        catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(this,"Cannot Divide By Zero");
        }
    }
    public static void main(String[] args) {
      new DivisionUI();
    }
}
