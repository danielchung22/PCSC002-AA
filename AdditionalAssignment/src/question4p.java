import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class question4p extends JFrame implements ActionListener {
		
	private static final long serialVersionUID = 1L;
	
	//Declare variables
	private static JPanel panel;
	private static JFrame purchaseframe, confirmframe;
	private static JLabel pagename, pageheader, AdultLabel, KidsLabel, SaladLabel, DessertLabel; 
	private static JLabel adultpricelabel, kidspricelabel, saladpricelabel, dessertpricelabel;
	private static JLabel setLabel, sideLabel;
	private static JLabel orderoutput, adultcountcheck, kidscountcheck, saladcountcheck, dessertcountcheck;
	private static JLabel adultcountchecko, kidscountchecko, saladcountchecko, dessertcountchecko, confirmlabel2; 
	private static JLabel totalpricelabel, totalpricechecko;
	private static JComboBox <Integer> adultcount, kidscount, saladcount, dessertcount;
	

	private static final int adultprice = 20, kidsprice = 12, saladprice = 4, dessertprice = 5;
	private static int totalprice;
	
	public question4p () {
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
		submitbutton.addActionListener(this);
		panel.add(submitbutton);
		
		cancelbutton = new JButton("CANCEL");
		cancelbutton.setBounds(80, 370, 120, 25);
		cancelbutton.addActionListener(this);
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
            
	public void actionPerformed (ActionEvent e) {
        String action = e.getActionCommand();
        
        JButton yesbutton, nobutton, detailedbutton;
        int adultcost, kidscost, saladcost, dessertcost, totalitems;
        
        //Retrieving the item selected within the combo boxes
        int numadult = Integer.parseInt(adultcount.getSelectedItem().toString());
        int numkids = Integer.parseInt(kidscount.getSelectedItem().toString());;
        int numsalad = Integer.parseInt(saladcount.getSelectedItem().toString());;
        int numdessert = Integer.parseInt(dessertcount.getSelectedItem().toString());;
              
        //Calculating the total price of the ordered items
        adultcost = numadult * adultprice;
        kidscost = numkids * kidsprice;
        saladcost = numsalad * saladprice;
        dessertcost = numdessert * dessertprice;
        totalitems = numadult + numkids + numsalad + numdessert;
        totalprice = adultcost+  kidscost + saladcost + dessertcost;
        
        //If the purchase button is selected
        if(action.contentEquals("PURCHASE")) {
        	
        	panel = new JPanel();
    		confirmframe = new JFrame("Confirm Your Order");
    		confirmframe.setSize(350,500);
    		confirmframe.setLocationRelativeTo(null);
    		confirmframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		confirmframe.add(panel);
    		  
    		panel.setLayout(null);	
    		
    		//Adding the elements into the frame
    		orderoutput = new JLabel ("Confirm Your Order:");
    		orderoutput.setBounds(20, 20, 160, 30);
    		orderoutput.setFont(new Font("CenturyGothic", Font.BOLD, 16));
    		orderoutput.setOpaque(true);
    		orderoutput.setBackground(Color.CYAN);
    		panel.add(orderoutput);
    		
    		adultcountcheck = new JLabel("Adult Meals: ");
    		adultcountcheck.setBounds(20, 60, 100, 30);
    		adultcountcheck.setFont(new Font("Abadi", Font.PLAIN, 14));
    		adultcountcheck.setOpaque(true);
    		adultcountcheck.setBackground(Color.pink);
    		panel.add(adultcountcheck);
    		
    		adultcountchecko = new JLabel(numadult + " Adult Meals");
    		adultcountchecko.setBounds(130, 60, 100, 30);
    		adultcountchecko.setFont(new Font("Abadi", Font.PLAIN, 14));
    		adultcountchecko.setOpaque(true);
    		adultcountchecko.setBackground(Color.MAGENTA);
    		panel.add(adultcountchecko);
    		
    		kidscountcheck = new JLabel("Kids Meals: ");
    		kidscountcheck.setBounds(20, 100, 100, 30);
    		kidscountcheck.setFont(new Font("Abadi", Font.PLAIN, 14));
    		kidscountcheck.setOpaque(true);
    		kidscountcheck.setBackground(Color.pink);
    		panel.add(kidscountcheck);
    		
    		kidscountchecko = new JLabel(numkids + " Kids Meals");
    		kidscountchecko.setBounds(130, 100, 100, 30);
    		kidscountchecko.setFont(new Font("Abadi", Font.PLAIN, 14));
    		kidscountchecko.setOpaque(true);
    		kidscountchecko.setBackground(Color.MAGENTA);
    		panel.add(kidscountchecko);
    		
    		saladcountcheck = new JLabel("Salads: ");
    		saladcountcheck.setBounds(20, 140, 100, 30);
    		saladcountcheck.setFont(new Font("Abadi", Font.PLAIN, 14));
    		saladcountcheck.setOpaque(true);
    		saladcountcheck.setBackground(Color.pink);
    		panel.add(saladcountcheck);
    		
    		saladcountchecko = new JLabel(numsalad + " Salads");
    		saladcountchecko.setBounds(130, 140, 100, 30);
    		saladcountchecko.setFont(new Font("Abadi", Font.PLAIN, 14));
    		saladcountchecko.setOpaque(true);
    		saladcountchecko.setBackground(Color.MAGENTA);
    		panel.add(saladcountchecko);
    		
    		dessertcountcheck = new JLabel("Desserts: ");
    		dessertcountcheck.setBounds(20, 180, 100, 30);
    		dessertcountcheck.setFont(new Font("Abadi", Font.PLAIN, 14));
    		dessertcountcheck.setOpaque(true);
    		dessertcountcheck.setBackground(Color.pink);
    		panel.add(dessertcountcheck);
    		
    		dessertcountchecko = new JLabel(numdessert + " Desserts");
    		dessertcountchecko.setBounds(130, 180, 100, 30);
    		dessertcountchecko.setFont(new Font("Abadi", Font.PLAIN, 14));
    		dessertcountchecko.setOpaque(true);
    		dessertcountchecko.setBackground(Color.MAGENTA);
    		panel.add(dessertcountchecko);
    		
    		totalpricelabel = new JLabel("Total Cost: ");
    		totalpricelabel.setBounds(20, 220, 100, 30);
    		totalpricelabel.setFont(new Font("Abadi", Font.PLAIN, 14));
    		totalpricelabel.setOpaque(true);
    		totalpricelabel.setBackground(Color.pink);
    		panel.add(totalpricelabel);
    		
    		totalpricechecko = new JLabel("$" + totalprice);
    		totalpricechecko.setBounds(130, 220, 100, 30);
    		totalpricechecko.setFont(new Font("Abadi", Font.BOLD, 16));
    		totalpricechecko.setOpaque(true);
    		totalpricechecko.setBackground(Color.MAGENTA);
    		panel.add(totalpricechecko);
    		
    		detailedbutton = new JButton("DETAILED");
    		detailedbutton.setBounds(45, 260, 100, 25);
    		detailedbutton.addActionListener(this);
    		panel.add(detailedbutton);
    		 		
    		confirmlabel2 = new JLabel("Do you wish to place this order?");
    		confirmlabel2.setBounds(20, 300, 300, 30);
    		confirmlabel2.setFont(new Font("Consolas", Font.PLAIN, 14));
    		confirmlabel2.setOpaque(true);
    		confirmlabel2.setBackground(Color.pink);
    		panel.add(confirmlabel2);
    		
    		yesbutton = new JButton("YES");
    		yesbutton.setBounds(45, 340, 100, 25);
    		yesbutton.addActionListener(this);
    		panel.add(yesbutton);
    		
    		nobutton = new JButton("NO");
    		nobutton.setBounds(155, 340, 100, 25);
    		nobutton.addActionListener(this);
    		panel.add(nobutton);
    		
    		confirmframe.setVisible(true);
    	
        }
        
        // If the user hits the detailed button to get a detailed report
        if (action.contentEquals("DETAILED")) {
        	String[] columnsNames = {"Item", "Price", "Qty", "Cost ($)",};

            Object[][] data = {
                    {"Adult Meals", adultprice, numadult, adultcost},
                    {"Kids Meals", kidsprice, numkids, kidscost},
                    {"Salads", saladprice, numsalad, saladcost},
                    {"Desserts", dessertprice, numdessert, dessertcost},
                    {"Total Cost", null, totalitems, totalprice}
                    
            };

            JTable table = new JTable(data, columnsNames);
            add(table.getTableHeader(), BorderLayout.PAGE_START);
            add(table, BorderLayout.CENTER);

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }
		
        else if (action.contentEquals("YES")) {	
        	
         //Outputting the total price of the ordered items
        JOptionPane.showMessageDialog(null, "Thank you for your purchase.");
			System.exit(0);
		}
    	else if (action.contentEquals("NO")) {
    		confirmframe.dispose();
    	}
        
        //If the user hits cancel
        else if (action.contentEquals("CANCEL")) {
        	System.exit(0);
        }
        }
	
	public static void main(String[] args) {
		question4p frame = new question4p ();
		frame.setTitle("Order Confirmation");

	}			
}