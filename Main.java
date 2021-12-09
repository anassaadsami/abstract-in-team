package AbstractAndTasksInTeam;

public class Main {

	public static void main(String[] args) {
//		Anas team1 = new Anas();  //----> error 
//		Ali team2 = new Ali();  -----> error 
		Teim team3 = new Teim("oop", "anas", "ali", "teim");
		team3.print1();
		team3.print2();
		team3.print3();
		
//		Project p1 = new Anas("oop", "anas");   //----> error 
//		Project p2 = new Ali();     //----> error 
		Project p3 = new Teim("oop", "anas", "ali", "teim");
		

	}

}
