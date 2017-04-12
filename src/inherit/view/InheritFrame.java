package inherit.view;

import javax.swing.JFrame;
import inherit.controller.InheritController;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class InheritFrame extends JFrame
{
	private InheritController baseController;
	private InheritPanel inheritPanel;
	
	public InheritFrame(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		inheritPanel = new InheritPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(inheritPanel);
		this.setTitle("Advanced Inheritance");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);	
	}
}

