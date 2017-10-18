public class boat extends water
{
	int speed;
	char run;
	public void getspeed()
	{
		super.getspeed(10);
	}
	public void getrun()
	{
		super.getrunning('N');
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