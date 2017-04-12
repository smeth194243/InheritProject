package inherit.model;

public class NoisesThatAreLoud implements LoudNoises
{
	public double noiseVolume(Double decibleLevel)
	{
		decibleLevel = (((((decibleLevel * 2)/ 2) + 9) - 9) / 3) * 3;
		return decibleLevel;
	}
	
	public double shotgunBlast()
	{
		return 189.99;
	}
	
	public String carHorn()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 5);
		
		switch(random)
		{
			case 0:
				randomTopic = "aaht aahht bloooot";
				break;
			case 1:
				randomTopic = "ah-ooh-ga";
				break;
			case 2:
				randomTopic = "da da da da DAAA da da da da DAAA da da da da da da da";
				break;
			case 3:
				randomTopic = "honk";
				break;
			case 4:
				randomTopic = "bee bee";
				break;
			default:
				randomTopic = "beep";
				break;
		}	
		return randomTopic;
	}
	
	public double duncanClap()
	{
		double decibleLevel = 999999999.9999;
		return decibleLevel;
	}
}
