
public class baseclass {
	
	int speed;
	char run;
	public static void main(String[] args) {
		
		car toyota=new car();
		aeroplane mig=new aeroplane();
		//aeroplane mig=new aeroplane();
		vehicle v=new vehicle();
		v=toyota;
		/*if(v instanceof landclass)
		{
			toyota.getspeed();
			toyota.getrun();
			toyota.retspeed();
			toyota.retrun();
			speed=v.speed();
			run=v.running();
			System.out.println("Speed:"+speed);
			System.out.println("Run:"+run);
		}*/
		
		dosomething(v,toyota);
		//System.out.println(variadic.arr(1,2,5,10));
	}
	public static void dosomething(vehicle t,car toyota)
	{
		if(t instanceof landclass)
		{
			toyota.getspeed();
			toyota.getrun();
			toyota.retspeed();
			toyota.retrun();
			System.out.println("Speed:"+t.speed);
			System.out.println("Run:"+t.run);
		}
	}

}
