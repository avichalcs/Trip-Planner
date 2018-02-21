import java.util.*;
public class TripPlanner
{
	public static void main(String []args)
	{
		System.out.println("Welcome to TripPlanner.\nWhat is your name?");
        Scanner a=new Scanner(System.in);
		String name=a.nextLine();
		System.out.println(name+"\nNice to meet you Mr."+name+"\nWhere are you travelling to?");
		Scanner b=new Scanner(System.in);
		String city=b.nextLine();
		System.out.println(city+"\nGreat!\n"+city+" city sounds like a great trip.    \n***********************************************************        \nHow many days are you going to spend?");
		Scanner c=new Scanner(System.in);
		int days=c.nextInt();
		System.out.println(days+"\nHow much money are you planning to spend on your trip?");
		Scanner d=new Scanner(System.in);
		int money=d.nextInt();
		System.out.println(money+" rs.");
		int hours=days*24;
		int minutes=hours*60;
		int seconds=minutes*60;
		System.out.println("If you are travelling for "+days+" days that is same as "+hours+" hours "+minutes+" minutes "+seconds+" seconds");
		int pday=money/days;
		System.out.println("If you are going to spend "+money+" rs. that means perday you can spend "+pday+" rs."+"\n*************************************\nwhat is the time difference between your home and the destination city?");
		Scanner e=new Scanner(System.in);
		int td=e.nextInt();
	    if(td<=12)
		{
		int mid=td+12; 
		System.out.println("it means that when its midnight at home it will be "+td+" at your destination and when it is noon it will be "+mid+" at your destination.");
		}
		else
		{
		System.out.println("Error");
		}		
        System.out.println("what is the sqaure area of your destination city(in km2)");
		Scanner f=new Scanner(System.in);
        double area=f.nextDouble();
		double miles=area*0.6213;
        System.out.println(area+" km2.in miles it is "+miles);
		System.exit(0);
		}
}
		
		
		