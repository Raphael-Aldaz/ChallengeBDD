package challengDao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.security.PublicKey;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

import javax.management.loading.PrivateClassLoader;

import javax.swing.table.TableCellRenderer;

public class View extends JLabel {

	private static final long serialVersionUID = 1L;

	private static final String WEMESS = "Bienvenue dans votre application\nsaisissez les champs puis valider !";
	private JTable table;

	private JLabel label;
	private JButton button;
	JFrame frame = new JFrame("toto");
	// private static JtableColor aColor = new JtableColor();

	public View() {
		super();
		this.viewProperty();

	}

	private void viewProperty() {

		this.setLayout(null);
		this.labelProperty();
		this.buttonProperty();
		this.jtableProperty();

	}

	private void buttonProperty() {

		this.button = new JButton();
		this.button.setText("Charger la table des produits !");
		this.button.setBounds(150, 50, 220, 30);
		this.button.setForeground(Color.BLUE);
		this.add(button);

	}

	private void labelProperty() {
		label = new JLabel();
		this.label.setBounds(70, 10, 550, 20);
		this.label.setText(WEMESS);
		this.add(label);

	}

	private void jtableProperty() {
		String[] columns = new String[] { "Id", "Nom", "Adresse", "Taux horaire" };
		// données pour JTable dans un tableau 2D
		Object[][] data = new Object[][] { { 1, "Thomas", "Paris", 20.0 }, { 2, "Jean", "Marseille", 50.0 },
				{ 3, "Yohan", "Lyon", 30.0 }, { 4, "Emily", "Toulouse", 60.0 }, { 5, "Alex", "Nice", 10.0 },
				{ 6, "Jean", "Marseille", 50.0 }, { 7, "Yohan", "Lyon", 30.0 }, { 8, "Emily", "Toulouse", 60.0 },
				{ 9, "Alex", "Nice", 10.0 }, };

		table = new JTable(data, columns) {
			private static final long serialVersionUID = 1L;

			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component c = super.prepareRenderer(renderer, row, column);
				Color color1 = new Color(220, 220, 220);
				Color color2 = Color.WHITE;
				if (!c.getBackground().equals(getSelectionBackground())) {
					Color coleur = (row % 2 == 0 ? color1 : color2);
					c.setBackground(coleur);
					coleur = null;
				}
				return c;
			}
		};

		
		 
	
	    
		JScrollPane scrollPane = new JScrollPane(table);
		this.frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
		this.table.setBounds(0, 150, 550, 200);
		this.table.setVisible(true);
		this.add(table);

	}

}
