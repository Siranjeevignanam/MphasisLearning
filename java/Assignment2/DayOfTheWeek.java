package Assignment2;

public enum DayOfTheWeek {

	sunday("sun","White"),monday("moon","White"),tuesday("mars","red"),wednesday("jupiter","yellow"),thursday("Jupiter","Brown"),friday("Pluto","Pale yellow"),saturday("Saturn","Golden");
	String owner;
	String color;
	DayOfTheWeek(String x,String y)
	{
		System.out.println("Owner : "+x+"Color "+y);
	}
}
