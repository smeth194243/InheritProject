package inherit.model;

import inherit.model.LoudNoises;

public class Hearing implements LoudNoises
{
	public double noiseVolume(Double decibleLevel)
	{
		decibleLevel = decibleLevel;
		return decibleLevel;
	}
	
	public double duncanClap()
	{
		double decibleLevel = 99999999.99;
		return decibleLevel;
	}

	
	public double shotgunBlast() 
	{
		double decibleLevel = 187.96;
		return decibleLevel;
	}

	
	public String carHorn() 
	{
		String carHorn = "Beep, Honk, Beep";
		
		return carHorn;
	}
}
