public class Person{
	private String name;
	Private String address;

	
	public Person ( String initialName, String initialaddress ) {
		this.name = initialName;
		this.address = initialaddress;
	}
	public String getName ( ) {
		return name;
	}

	public void setName ( String newName ) {
		name = newName;
	}

	public String getAddress ( ) {
		return address;
	}

	public void setAddress ( String newAddress ) {
		address = newAddress;
	}

	public String toString()
	{
	   return String.format("Person[name="+name+", address="+address+"]");	
	}
}

	public class Student extends Person {
	
	private String program;
	private int year;
	private double fee;

	
	public Student (String initialName, String initialAddress, String initialProgram, int initialYear, double initialFee) {
		super(initialName,initialAddress);
		program = initialProgram;
		year = initialYear;
		fee=initialFee;
	}

	public String getProgram ( ) {
		return program;
	}
	public int getYear ( ) {
		return year;
	}
	public double getFee ( ) {
		return fee;
	}

	public void setProgram (String newProgram ) {
		program = newProgram;
	}
	public void setYear (int newYear ) {
		year = newYear;
	}
	public void setFee (double newFee ) {
		fee = newFee;
	}

	public String toString()
	{
	      return String.format("Student[Person[name="+name+", address="+address+"],prorgram="+program+"Year="+year+
"Fee="+fee+"]");	
	}
}



public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff (String initialName, String initialAddress, String initialSchool, double initialPay) {
		super(initialName,initialAddress);
		school = initialSchool;
		pay=initialPay;
	}

	public String getSchool ( ) {
		return school;
	}
	
	public double getPay ( ) {
		return pay;
	}

	public void setSchool (String newSchool ) {
		program = newSchool;
	}
	
	public void setPay (double newPay) {
		pay = newPay;
	}


	public String toString()
	{
		  return String.format("Student[Person[name="+name+", address="+address+"],School="+school+"Pay="+pay+"]");	
	}
}	

public class ass1{
	public static void main(String args[]){
	Student student1= new Student("std1","add1","prog1",2,31000);
	Staff staff1=new Staff("stff1","add2","VR",50000);

System.out.println(student1);
System.out.println("\n"+staff1);
	
}
}