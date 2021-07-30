package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "San Diego";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
      //print their names, bibNumbers, and the location of their race. 
    	Athlete a= new Athlete("aa", 100);
    	Athlete b = new Athlete("bb", 99);
    	System.out.println(a.name);
    	System.out.println(b.name);
    	System.out.println(a.nextBibNumber);
    	System.out.println(b.nextBibNumber);
    	System.out.println(a.raceLocation);
    	System.out.println(b.raceLocation);
    	
    }
}