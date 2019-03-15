package atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class transactions {
	static class Action4 implements ActionListener{
		public void actionPerformed (ActionEvent f) {
		 
		 ArrayList<attm> arr= new ArrayList();
		 for(int i=0;i<5;i++) {
			    attm h=new attm();
			    JFrame frame = new JFrame ("ATM");
				frame.setVisible(true);
				frame.setSize(500,500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    JLabel label = new JLabel("Transaction NUMBER"+(i+1));
			    JPanel panel = new JPanel();
			    frame .add(panel);
			    panel.add(label);
		    	arr.add(h);
			 
			 
			 
		 } 
		 } 
			 
		
	}

}

