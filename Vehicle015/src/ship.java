public class ship extends water
{
	int speed;
	char run;
	public void getspeed()
	{
		super.getspeed(60);
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