import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class question3p extends JFrame {
		
	private static final long serialVersionUID = 1L;
	
	//Declare variables
	private static JPanel panel;
	private static JFrame purchaseframe;
	private static JLabel pagename, pageheader, AdultLabel, KidsLabel, SaladLabel, DessertLabel; 
	private static JLabel adultpricelabel, kidspricelabel, saladpricelabel, dessertpricelabel;
	private static JLabel setLabel, sideLabel;
	private static JComboBox <Integer> adultcount, kidscount, saladcount, dessertcount;
	
	private static final int adultprice = 20, kidsprice = 12, saladprice = 4, dessertprice = 5;
		
	public question3p () {
		JButton submitbutton, cancelbutton;
		
		//Create the frame
		panel = new JPanel();
		purchaseframe = new JFrame("Fund Raiser");
		purchaseframe.setSize(295,500);
		purchaseframe.setLocationRelativeTo(null);
		purchaseframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		purchaseframe.add(panel);
		  
		panel.setLayout(null);
		
		//Adding the elements into the frame
		pagename = new JLabel("ROTARY CLUB");
		pagename.setBounds(50, 30, 215, 30);
		pagename.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 24));
		pagename.setForeground(Color.BLUE);
		panel.add(pagename);
		
		pageheader = new JLabel("Please select the quantity");
		pageheader.setBounds(20, 60, 255, 30);
		pageheader.setFont(new Font("DengXianLight", Font.ITALIC, 16));
		panel.add(pageheader);
		
		setLabel = new JLabel ("Set Meals");
		setLabel.setBounds(20, 100, 255, 30);
		setLabel.setFont(new Font("CenturyGothic", Font.BOLD, 16));
		setLabel.setOpaque(true);
		setLabel.setBackground(Color.CYAN);
		panel.add(setLabel);
		
		AdultLabel = new JLabel("Adult Sets: ");
		AdultLabel.setBounds(20, 140, 100, 30);
		AdultLabel.setFont(new Font("CenturyGothic", Font.PLAIN, 14));
		AdultLabel.setOpaque(true);
		AdultLabel.setBackground(Color.PINK);
		panel.add(AdultLabel);
		  
		adultpricelabel = new JLabel("($" + adultprice + " each) ");
		adultpricelabel.setBounds(120, 140, 70, 30);
		adultpricelabel.setFont(new Font("CenturyGothic", Font.PLAIN, 12));
		adultpricelabel.setOpaque(true);
		adultpricelabel.setBackground(Color.PINK);
		panel.add(adultpricelabel);
		
		KidsLabel = new JLabel("Kids Sets: ");
		KidsLabel.setBounds(20, 180, 100, 30);
		KidsLabel.setFont(new Font("CenturyGothic", Font.PLAIN, 14));
		KidsLabel.setOpaque(true);
		KidsLabel.setBackground(Color.PINK);
		panel.add(KidsLabel);
		
		kidspricelabel = new JLabel("($" + kidsprice + " each) ");
		kidspricelabel.setBounds(120, 180, 70, 30);
		kidspricelabel.setFont(new Font("CenturyGothic", Font.PLAIN, 12));
		kidspricelabel.setOpaque(true);
		kidspricelabel.setBackground(Color.PINK);
		panel.add(kidspricelabel);
		
		sideLabel = new JLabel ("Side Orders");
		sideLabel.setBounds(20, 220, 255, 30);
		sideLabel.setFont(new Font("CenturyGothic", Font.BOLD, 16));
		sideLabel.setOpaque(true);
		sideLabel.setBackground(Color.CYAN);
		panel.add(sideLabel);
		
		SaladLabel = new JLabel("Salad(s): ");
		SaladLabel.setBounds(20, 260, 100, 30);
		SaladLabel.setFont(new Font("CenturyGothic", Font.PLAIN, 14));
		SaladLabel.setOpaque(true);
		SaladLabel.setBackground(Color.PINK);
		panel.add(SaladLabel);
		  
		saladpricelabel = new JLabel("($" + saladprice + " each) ");
		saladpricelabel.setBounds(120, 260, 70, 30);
		saladpricelabel.setFont(new Font("CenturyGothic", Font.PLAIN, 12));
		saladpricelabel.setOpaque(true);
		saladpricelabel.setBackground(Color.PINK);
		panel.add(saladpricelabel);
		
		DessertLabel = new JLabel("Dessert(s): ");
		DessertLabel.setBounds(20, 300, 100, 30);
		DessertLabel.setFont(new Font("CenturyGothic", Font.PLAIN, 14));
		DessertLabel.setOpaque(true);
		DessertLabel.setBackground(Color.PINK);
		panel.add(DessertLabel);
		
		dessertpricelabel = new JLabel("($" + dessertprice + " each) ");
		dessertpricelabel.setBounds(120, 300, 70, 30);
		dessertpricelabel.setFont(new Font("CenturyGothic", Font.PLAIN, 12));
		dessertpricelabel.setOpaque(true);
		dessertpricelabel.setBackground(Color.PINK);
		panel.add(dessertpricelabel);
		
		adultcount = new JComboBox<Integer>();
		adultcount.setBounds(200, 140, 75, 30);
		adultcount.setOpaque(true);
		adultcount.setBackground(Color.ORANGE);
		panel.add(adultcount);
		  
		kidscount = new JComboBox<Integer>();
		kidscount.setBounds(200, 180, 75, 30);
		kidscount.setOpaque(true);
		kidscount.setBackground(Color.ORANGE);
		panel.add(kidscount);
		
		saladcount = new JComboBox<Integer>();
		saladcount.setBounds(200, 260, 75, 30);
		saladcount.setOpaque(true);
		saladcount.setBackground(Color.ORANGE);
		panel.add(saladcount);
		  
		dessertcount = new JComboBox<Integer>();
		dessertcount.setBounds(200, 300, 75, 30);
		dessertcount.setOpaque(true);
		dessertcount.setBackground(Color.ORANGE);
		panel.add(dessertcount);
		
		//Button to submit the order
		submitbutton = new JButton("PURCHASE");
		submitbutton.setBounds(80, 340, 120, 25);
		panel.add(submitbutton);
		
		cancelbutton = new JButton("CANCEL");
		cancelbutton.setBounds(80, 370, 120, 25);
		panel.add(cancelbutton);
		
		//Adding the integers into the combo boxes
		for (int i = 0; i <= 100; i++) {
			adultcount.addItem(Integer.valueOf(i));
			kidscount.addItem(Integer.valueOf(i));
			saladcount.addItem(Integer.valueOf(i));
            dessertcount.addItem(Integer.valueOf(i));
        }
		
		purchaseframe.setVisible(true);
	}
            
	public static void main(String[] args) {
		question3p frame = new question3p ();
		frame.setTitle("Order Confirmation");

	}			
}