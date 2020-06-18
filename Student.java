package Four;

public class Student {
	
	public static String name;
	public static String style="nomal";
	public static int homework=0;
	public static int speak=0;
	public static int maxhp=100;
	public static int hp=100;
	public static int concentration=3;
	public static int hungry=21;
	public static boolean junho=false;
	public static boolean seangho=false;
	public static int money=10000000;
	public static int hope=1;
	public static int mis=0;
	
	public static int hacha() {

		  int damage = (int)(concentration+(hp*5/maxhp)+hope);
		  hp-=2;
		  if(hp<=0) {
			  hp=0;
		  }
		  hungry-=1;
		  if(hungry<=0) {
			  hungry=0;
		  }
		  return damage;
		 }
	 public static boolean run() {
		  if (Math.random() <= 0.7)
		   return true;
		  else
		   return false;
		 }
}
