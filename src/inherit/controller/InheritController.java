package inherit.controller;

import java.util.ArrayList;
import inherit.model.*;
import inherit.view.*;

public class InheritController
{
	private NoisesThatAreLoud loudNoises;
	private SethMorris sethMorris;
	private Hearing hearing;
	private Sound sound;
	private Slurp slurp;
	private ArrayList<LoudNoises> noises;
	private InheritFrame baseFrame;
	
	public InheritController()
	{
		loudNoises = new NoisesThatAreLoud();
		noises = new ArrayList<LoudNoises>();
		hearing = new Hearing();
		sethMorris = new SethMorris();
		sound = new Sound();
		slurp = new Slurp();
		baseFrame = new InheritFrame(this);
	}
	public void start()
	{

	}
	
	public String inheritanceTest()
	{
		String testOutput = "";
		if(new SethMorris() instanceof LoudNoises)
		{
			testOutput += "The volume of the shotgun is " + sethMorris.shotgunBlast() + " (Seth Morris)\n";
		}
		
		if(new Hearing() instanceof LoudNoises)
		{
			testOutput += "The volume of Duncan's clap is " + hearing.duncanClap() + " (Duncan Nguyen)\n";
		}
		
		if(new NoisesThatAreLoud() instanceof LoudNoises)
		{
			testOutput += "The sound a car makes is " + loudNoises.carHorn() + " (Isaac Hill)\n";
		}
		
		if(new Sound() instanceof LoudNoises)
		{
			testOutput += "The volume of a 2.0 decible sound is " + sound.noiseVolume(2.0) + " (Matt Hachtel)\n";	
		}
		
		if(new Slurp() instanceof LoudNoises)
		{
			testOutput += "The sound of shotgun blast is " + slurp.shotgunBlast() + " (Patrick Brashear)";
		}
		
		return testOutput;
	}
}