package MarketingMadeEasy.src.mme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// 
public class Frame extends JFrame {
	/**
	 * Created to assist in those pesky meetings with upper management!
	 */
	private static final long serialVersionUID = 1L;
	private JButton button;
	private JLabel label;
	private JPanel panel;
	private JTextArea textArea;
	
	public Frame(){
		super("-Marketing Made Easy-");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,300));
		
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		
		label = new JLabel("Start..");
		
		new JTextField(10);
		
		button = new JButton("Marketing!");

		button.addActionListener(new ButtonListener());
		
		panel.add(label);
		panel.add(button);
		
		textArea = new JTextArea();
		
		add(panel, BorderLayout.SOUTH);
		add(textArea, BorderLayout.CENTER);
		
		setVisible(true);
	}

private class ButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("generate " + WordGen.createPhrase());
		textArea.append(WordGen.createPhrase() + "\n");
		
		}
	}
}