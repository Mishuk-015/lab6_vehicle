
public class landclass extends vehicle
{
	int speed;
	char run;
	public void getspeed(int speed)
	{
		super.speed=speed;
	}
	public void getrunning(char run)
	{
		super.run=run;
	}
	public int isspeed()
	{
		this.speed=super.speed();
		return speed;
	}
	public char isrunning()
	{
		this.run=super.running();
		return run;
	}
}

