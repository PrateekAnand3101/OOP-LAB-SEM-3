// import java.awt.*;

// import javax.swing.*;
// import javax.swing.JLabel;
// class SwingDemo extends JFrame
// {
//     SwingDemo()
//     {
        
//         JFrame f=new JFrame("A simple swing application");
//         f.setSize(420,420);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//         JLabel jl=new JLabel("Bro, do you even code?");
    
//         f.add(jl);
        
//         setLayout(new FlowLayout());
//         // jl.setHorizontalTextPosition(JLabel.CENTER);
//     }
// }
// class Swing
// {
//     public static void main(String args[])
//     {
//         SwingDemo s= new SwingDemo();
        
        

        
//     }
    
    


// }

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// class Addition extends JFrame implements ActionListener{
// 	JLabel l,l1,l2,l3;
// 	JTextField tf,tf1,tf2,tf3;
// 	JButton b,b1,b2,b3;
// 	JCheckBox c;
// 	JRadioButton r1,r2,r3;
// Addition()
// {
// l=new JLabel("Add Result");
// l1=new JLabel("Subtract Result");
// l2=new JLabel("Multiply Result");
// l3=new JLabel("Divide Result");
// tf=new JTextField(10);
// tf1=new JTextField(10);
// // tf2=new JTextField(10);
// // tf3=new JTextField(10);
// b=new JButton("Add");
// b1=new JButton("Subtract");
// b2=new JButton("Multiply");
// b3=new JButton("Divide");
// c=new JCheckBox("I'm not a robot");
// r1=new JRadioButton("Pizza");
// r2=new JRadioButton("samosa");
// r3=new JRadioButton("hello");
// r1.addActionListener(this);
// r2.addActionListener(this);
// r3.addActionListener(this);
// b.addActionListener(this);
// b1.addActionListener(this);
// b2.addActionListener(this);
// b3.addActionListener(this);
// add(tf);
// add(l1);
// add(b1);
// add(tf1);
// add(l);
// add(b);
// // add(tf2);
// add(l2);
// add(b2);
// // add(tf3);
// add(l3);
// add(b3);
// ButtonGroup gp=new ButtonGroup();
// gp.add(r1);
// gp.add(r2);
// gp.add(r3);
// setLayout(new FlowLayout());
// setSize(400,400);
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// setVisible(true);
// }
// public void actionPerformed(ActionEvent ae)
// {
// 	int i=Integer.parseInt(tf.getText());
//     int j=Integer.parseInt(tf1.getText()); 
// 	int value;
// 	String food=
// 	if(ae.getSource()==b)
// 	{	
//      value=i+j;
// 	 l.setText(value+"");
// 	}
// 	else if(ae.getSource()==b1)
// 	{
// 		value=i-j;
// 		l1.setText(value+"");
// 	}		
// 	else if(ae.getSource()==b2)
// 	{
// 		value=i*j;
// 		l2.setText(value+"");
// 	}		
// 	else if(ae.getSource()==b2)
// 	{
// 		value=i/j;
// 		l3.setText(value+"");
// 	}	
	
// }
// }
// class Swing{
// public static void main(String args[]){
// 	Addition a=new Addition();
// }
// }
// class Largest extends JFrame implements ActionListener
// {
// 	JLabel l,l1,l2,l3;
// 	JTextField t,t1,t2;
// 	JButton b;
// 	Largest()
// 	{
// 		l= new JLabel("Enter first number:\n");
// 		l1=new JLabel("Enter second number:\n");
// 		l2=new JLabel("Enter third number:\n");
// 		l3=new JLabel();
// 		t=new JTextField(10);
// 		t1=new JTextField(10);
// 		t2=new JTextField(10);
// 		b=new JButton("Display");
// 		add(l);
// 		add(t);
// 		add(l1);
// 		add(t1);
// 		add(l2);
// 		add(t2);
// 		add(b);
// 		add(l3);
// 		b.addActionListener(this);
// 		setLayout(new FlowLayout());
// 		setSize(400,400);
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		setVisible(true);
// 	}
// 	@Override
// 	public void actionPerformed(ActionEvent ae) {
// 		// TODO Auto-generated method stub

// 		int i=Integer.parseInt(t.getText());
//         int j=Integer.parseInt(t1.getText());
// 		int k=Integer.parseInt(t2.getText()); 
// 		int val;
// 		if(ae.getSource()==b)
// 		{
// 			if(i>j && i>k)
// 			{
// 				val=i;
// 				l3.setText(val+" is the largest ");


// 			}
// 			else if(j>i && j>k)
// 			{
// 				val=j;
// 				l3.setText(val+" is the largest ");
// 			}
// 			else
// 				val=k;
// 				l3.setText(val+" is the largest ");
// 		} 
// 	}

// }
// class Swing
// {
// 	public static void main(String[] args) {
// 		Largest a=new Largest();
// 	}
// }
import javax.swing.* ;
import java.awt.FlowLayout;
import java.awt.event.*; 


class swingin extends JFrame implements ActionListener{
    JTextField t1;
    JLabel l1 ;
    JRadioButton r1,r2;
    JButton b;
    public  swingin(){
             t1 = new JTextField(15);
             l1 = new JLabel("Greetings");
             r1 = new JRadioButton("Male");
             r2 = new JRadioButton("Female");
             b = new JButton("ok");

             ButtonGroup g1 = new ButtonGroup();
             g1.add(r1);
             g1.add(r2);

            add(t1);
            add(r1);
            add(r2);
            add(b);
            add(l1);
            b.addActionListener(this);
            setLayout(new FlowLayout());
            setSize(400,400);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


            public void actionPerformed(ActionEvent ae){
                String name = t1.getText();
                if(r1.isSelected()){
                    name = "Mr"+name;

                }
                else{
                    name = "Mrs"+ name;
                
                }
                l1.setText(name);
            }

            public class Swing{
                public static void main(String[] args) {
                    swingin o1 = new swingin();
                }
            }
        


}