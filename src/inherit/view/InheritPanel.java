package inherit.view;

import javax.swing.*;
import inherit.controller.InheritController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class InheritPanel extends JPanel
{
	private InheritController baseController;
	private InheritFrame baseFrame;
	private SpringLayout baseLayout;
	
	private JButton button;
	private JTextArea textArea;
	private JLabel label;
	
	public InheritPanel(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.button = new JButton("Test");
		this.textArea = new JTextArea(20, 65);
		this.label = new JLabel("Inheritance");
		
		setupDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupDisplay()
	{
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
	}
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900,600));
		this.setBackground(Color.gray);
		
		label.setFont(new Font("BigNoodleTitling", Font.PLAIN, 50));
		
		this.add(button);
		this.add(textArea);
		this.add(label);
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, label, 67, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, label, -6, SpringLayout.NORTH, textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, button, 68, SpringLayout.SOUTH, textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 67, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -54, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, button, 401, SpringLayout.WEST, this);
	}
	
	public void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{		
			public void actionPerformed(ActionEvent click)
			{
				textArea.setText(baseController.inheritanceTest());
			}			
		});
	}
}