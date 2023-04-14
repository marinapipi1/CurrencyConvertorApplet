import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CurrencyConversion {
    public static void converter(){

        JFrame f= new JFrame("Currency Converter");
        JButton b1,b2,b3;
        JTextField t1,t2;
        JLabel l1,l2;

        l1= new JLabel("BGN");
        l1.setBounds(50, 40, 50, 30);


        l2=new JLabel("GBP");
        l2.setBounds(190, 40, 50, 30);

        t1 = new JTextField("0");
        t1.setBounds(100, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);


        b1 = new JButton("LEV");
        b1.setBounds(100, 80, 60, 15);
        b2 = new JButton("GBP");
        b2.setBounds(240, 80, 60, 15);
        b3 = new JButton("close");
        b3.setBounds(150, 150, 100, 15);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double d
                        = Double.parseDouble(t1.getText());

                //Lev to dollars

                double d1 = Math.round(d * 0.45);


                String str1 = String.valueOf(d1);

                // Placing it in the text box
                t2.setText(str1);
            }
        });

        // Adding action listener
        b2.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                        = Double.parseDouble(t2.getText());

                // converting pound to lev
                double d3 = Math.round(d2/0.45);

                String str2 = String.valueOf(d3);

                t1.setText(str2);
            }
        });

        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        // Adding the created objects
        // to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Driver code
    public static void main(String args[])
    {
        converter();
    }
}
