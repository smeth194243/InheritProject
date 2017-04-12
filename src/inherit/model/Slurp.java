package inherit.model;

public class Slurp implements LoudNoises
{
	double soundLevel;
	
	
	public Slurp()
	{
		soundLevel = 1000;
		
	}
	
	public double noiseVolume(Double decibleLevel)
	{
		return soundLevel * decibleLevel * 99999999999999e170;
	}
	
	public double shotgunBlast()
	{
		return -1;
	}
	
	public String carHorn()
	{
		return "SLUUSUUSUSUSUSUSUSS";
	}
	
	public double duncanClap()
	{
		return -742380045845850466803680356890632.0;
	}
}
