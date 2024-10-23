package EmmanuelB30;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCalc extends JFrame implements ActionListener{
		
	JFrame j= new JFrame("Calcutlator");	
	
	int operator =0 , a=0, b=0;
	double res;
	JButton b1, b2, b3, badd, b4, b5, b6, bsub, b7, b8, b9, bmul, b0, bclr, beq, bdiv;
	JTextField t1=new JTextField();
	
		public MyCalc() {
			
			setSize(400,500);
			setLayout(null);
			
			t1.setBounds(100,50,200,25);
			b1 = new JButton("1");
	        b1.setBounds(100, 100, 50, 50);
	        b1.addActionListener(this);
	        
	        b2 = new JButton("2");
	        b2.setBounds(150, 100, 50, 50);
	        b2.addActionListener(this);
	        
	        b3 = new JButton("3");
	        b3.setBounds(200, 100, 50, 50);
	        b3.addActionListener(this);
	        
	        badd = new JButton("+");
	        badd.setBounds(250, 100, 50, 50);
	        badd.addActionListener(this);
	        
	        b4 = new JButton("4");
	        b4.setBounds(100, 150, 50, 50);
	        b4.addActionListener(this);
	        
	        b5 = new JButton("5");
	        b5.setBounds(150, 150, 50, 50);
	        b5.addActionListener(this);
	        
	        b6 = new JButton("6");
	        b6.setBounds(200, 150, 50, 50);
	        b6.addActionListener(this);
	        
	        bsub = new JButton("-");
	        bsub.setBounds(250, 150, 50, 50);
	        bsub.addActionListener(this);
	        
	        b7 = new JButton("7");
	        b7.setBounds(100, 200, 50, 50);
	        b7.addActionListener(this);
	        
	        b8 = new JButton("8");
	        b8.setBounds(150, 200, 50, 50);
	        b8.addActionListener(this);
	        
	        b9 = new JButton("9");
	        b9.setBounds(200, 200, 50, 50);
	        b9.addActionListener(this);
	        
	        bmul = new JButton("*");
	        bmul.setBounds(250, 200, 50, 50);
	        bmul.addActionListener(this);
	        
	        b0 = new JButton("0");
	        b0.setBounds(100, 250, 50, 50);
	        b0.addActionListener(this);
	        
	        bclr = new JButton("C");
	        bclr.setBounds(150, 250, 50, 50);
	        bclr.addActionListener(this);
	        
	        beq = new JButton("=");
	        beq.setBounds(200, 250, 50, 50);
	        beq.addActionListener(this);
	        
	        bdiv = new JButton("/");
	        bdiv.setBounds(250, 250, 50, 50);
	        bdiv.addActionListener(this);
			
			add(b1);
			add(b2);
			add(b3);
			add(badd);
			add(b4);
			add(b5);
			add(b6);
			add(bsub);
			add(b7);
			add(b8);
			add(b9);
			add(bmul);
			add(b0);
			add(bclr);
			add(beq);
			add(bdiv);
			add(t1);
			
			
			setVisible(true);
			
		}
	public static void main(String[] args) {
		new MyCalc()
;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)t1.setText(t1.getText() + "1");
		else if (e.getSource() == b2) {
            t1.setText(t1.getText() + "2");
        } else if (e.getSource() == b3) {
            t1.setText(t1.getText() + "3");
        } else if (e.getSource() == b4) {
            t1.setText(t1.getText() + "4");
        } else if (e.getSource() == b5) {
            t1.setText(t1.getText() + "5");
        } else if (e.getSource() == b6) {
            t1.setText(t1.getText() + "6");
        } else if (e.getSource() == b7) {
            t1.setText(t1.getText() + "7");
        } else if (e.getSource() == b8) {
            t1.setText(t1.getText() + "8");
        } else if (e.getSource() == b9) {
            t1.setText(t1.getText() + "9");
        } else if (e.getSource() == b0) {
            t1.setText(t1.getText() + "0");
        }
		
        if (e.getSource() == badd) {
            a = Integer.parseInt(t1.getText());
            operator = 1;
            t1.setText("");
        } else if (e.getSource() == bsub) {
            a = Integer.parseInt(t1.getText());
            operator = 2;
            t1.setText("");
        } else if (e.getSource() == bmul) {
            a = Integer.parseInt(t1.getText());
            operator = 3;
            t1.setText("");
        } else if (e.getSource() == bdiv) {
            a = Integer.parseInt(t1.getText());
            operator = 4;
            t1.setText("");
        }

        if (e.getSource() == beq) {
            b = Integer.parseInt(t1.getText());

            switch (operator) {
                case 1: res = a + b; break;
                case 2: res = a - b; break;
                case 3: res = a * b; break;
                case 4: 
                    if (b == 0) {
                        t1.setText("Error");
                        return;
                    }
                    res = (double) a / b; 
                    break;
            }
            t1.setText(String.valueOf(res));
        }

        if (e.getSource() == bclr) {
            t1.setText("");
        }
    }
}
