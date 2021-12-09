package AbstractAndTasksInTeam;
// this show the useful of abstract class to share the tasks between the IT
public abstract class Project {
	String name  ;
	
	public Project(String name) {
		this.name = name;
	}

	public abstract void print1();

	public abstract void print2();

	public abstract void print3();

}

abstract class Anas extends Project {
	String lastName ;
	public Anas(String name , String lastName) {
		super(name);
		this.lastName = lastName;
	}
	// here Anas did his job (just do implementation of print1()
	// but hi must do for other methods but it's not his jobb and that's why i put
	// abstract keyword
	// in class name
	@Override
	public void print1() {
		System.out.println("this is Anas's task");

	}

	public abstract void print2(); // here we just write the methods without implementation

	public abstract void print3();

}

abstract class Ali extends Anas {
	String lastName2 ;
	public Ali(String name , String lastName , String lastName2) {
		super(name , lastName);
		this.lastName2 = lastName2;
	}

	// here Ali did his job (just do implementation of print2()
	// but he must do for other methods but it's not his jobb and that's why i put
	// abstract keyword
	// in class name
	
	
	@Override
	public void print1() {  // if Ali want to see Anas's task must do override and use super keyword
		super.print1();
		
	}
	@Override
	public void print2() {
		System.out.println("this is Ali's task");

	}

	public abstract void print3();

}

class Teim extends Ali {   // here Teim can not extends from Anas cause he want to see Ali's task also ??
	String lastName3 ;
	public Teim(String name , String lastName , String lastName2 , String lastName3) {
		super(name , lastName , lastName2);
		this.lastName3 = lastName3;
	}

	// here Teim did his job (just do implementation of print3()
	@Override
	public void print3() {
		System.out.println("this is Teim's task");

	}
	@Override
	public void print1() {  // Teim can see the task of Anas and Teim by overriding thier mehtod 
		super.print1();
	}
	@Override
	public void print2() {
		super.print2();
	}
	

}
