package atm;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class attm {
	static double balance = 0;
	static ArrayList<ob> transaction = new ArrayList<ob>();
	static int i;
	 
	public double deposite(double deposite) {
		balance=(getBalance() + deposite);
		ob transac = new ob();
		transac.type = "Deposite";
		transac.amount=deposite;
		transaction.add(transac);
		return balance;
		
	}
	public  double withdrawel(double withdrawel) {
		balance=(getBalance() - withdrawel);
		ob transac = new ob();
		transac.type = "Withdrawel";
		transac.amount=withdrawel;
		transaction.add(transac);
		return balance;
		
	}
	public double getBalance() {
		return balance;
		
	}
	
		

	}

class ob {
	public String type;
	public double amount;
}

public class swing {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("ATM");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("ATM");
		JPanel panel = new JPanel();
		frame .add(panel);
		panel.add(label);
		JButton button = new JButton("CLICK TO START");
		panel.add(button);
		button.addActionListener(new Action());
		 
	}

}
		 class Action implements ActionListener{
			public void actionPerformed (ActionEvent a) {
				int y=5728;
				String op =JOptionPane.showInputDialog("Enter Pass Number");
				int first=Integer.parseInt(op);
				if (y==first) {
				JFrame frame2 = new JFrame("OPTIONS");
				frame2.setVisible(true);
				frame2.setSize(600,600);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JPanel panel = new JPanel (new GridBagLayout());
				frame2.getContentPane().add(panel,BorderLayout.NORTH);
				GridBagConstraints g = new GridBagConstraints();
				JLabel label = new JLabel("OPTIONS");
				JButton button = new JButton("DEPOSITE");
				g.gridx=0;
				g.gridy=0;
				g.insets = new Insets (10,10,10,10);
				panel .add(button,g);
				button.addActionListener(new Action1());
				JButton button1 = new JButton("WITHDRAWEL");
				g.gridx=0;
				g.gridy=2;
				panel .add(button1,g);
				button1.addActionListener(new Action2());
				JButton button2 = new JButton("BALANCE");
				g.gridx=0;
				g.gridy=4;
				panel .add(button2,g);
				button2.addActionListener(new Action3());
				JButton button3= new JButton("TRANSACTIONS");
				g.gridx=1;
				g.gridy=2;
				panel .add(button3,g);
				button3.addActionListener(new Action4());
				panel.add(label);
				frame2.add(panel);
				panel.add(button);
				panel.add(button1);
				panel.add(button2);
				panel.add(button3);
				
				 
			}
				else {
					
					JOptionPane.showMessageDialog(null, "ERROR");
					 
				}
				
			
		}
	}
		
			 
		 class Action1 implements ActionListener{
			public void actionPerformed (ActionEvent b) {
				attm at = new attm();
			String op2 =JOptionPane.showInputDialog("Enter DEPOSITE");
			int d=Integer.parseInt(op2);
			at.deposite(d);
			JOptionPane.showMessageDialog(null,"YOUR BALANCE IS "+ at.getBalance());
			 
			
			}
}
		 class Action2 implements ActionListener{
			public void actionPerformed (ActionEvent c) {
				attm at = new attm();
				
				String op3 =JOptionPane.showInputDialog("Enter WITHDRAWEL");
				int w=Integer.parseInt(op3);
				at.withdrawel(w);
				if(at.getBalance()<0)
					{JOptionPane.showMessageDialog(null, "SORRY TRANSACTION CAN NOT BE COMPLETED");}
				else{JOptionPane.showMessageDialog(null,"YOUR Balance IS "+at.getBalance());}
				 
			}
}
		 class Action3 implements ActionListener{
			public void actionPerformed (ActionEvent d) {
				
				attm at = new attm();
				at.getBalance();
				JOptionPane.showMessageDialog(null, "YOUR BALANCE IS "+at.getBalance());
				 
			}
}
		 class Action4 implements ActionListener{
			public void actionPerformed (ActionEvent f) {
			 attm at=new attm();
			 
					
				JFrame frame = new JFrame ("Transactions");
				frame.setVisible(true);
				frame.setSize(500,500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JPanel panel = new JPanel();
				frame .add(panel);
				JButton button4 = new JButton("PREVIES");
				button4.addActionListener(new Action5());
				JButton button5 = new JButton("NEXT");
				panel.add(button4);
				panel.add(button5);
				button5.addActionListener(new Action6());
				JOptionPane.showMessageDialog(null,"YOUR BALANCE IS "+at.getBalance());
				at.i = 0;
				 
			}
		 }
				 class Action5 implements ActionListener{
						public void actionPerformed (ActionEvent g) {
							attm at = new attm();
							JOptionPane.showMessageDialog(null, at.transaction.get(at.i).type+at.transaction.get(at.i).amount );
					    	if(at.i > 0)
					    		{at.i --;}
					    	 
					   }
				}
					    
				 class Action6 implements ActionListener{
						public void actionPerformed (ActionEvent h) {
							
					    	attm at=new attm();
					    	JOptionPane.showMessageDialog(null, at.transaction.get(at.i).type+at.transaction.get(at.i).amount );
					        if(at.i<6)
					    	{at.i ++;}
					    	 
					   }
						    
					    	
					    	
					    	
				 }
			
		 
		 
				 
	
					
				
				
				 
				 
			 
		
				 
			
			 
			 
			
		
		
		
