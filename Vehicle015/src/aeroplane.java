public class aeroplane extends air
{
	int speed;
	char run;
	public void getspeed()
	{
		super.getspeed(1500);
	}
	public void getrun()
	{
		super.getrunning('Y');
	}
	public void retspeed()
	{
		speed=super.isspeed();
		System.out.println("Speed:"+speed);
	}
	public void retrun()
	{
		run=super.isrunning();
		System.out.println("Running:"+run);
	}
}