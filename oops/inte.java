package oops;
//=83% of storage used … If you run out, you can't create, edit, and upload files. Get 30 GB of storage for ₹59.00 ₹15.00/month for 2 months.
class Student
{
	//Data-Security
	private int rollNo;
	private String name;
	private String address;

	//setter methods
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}

	public void setName(String name){
		this.name =name;
	}	

	public void setAddress(String address){
		this.address =address;
	}

	//getter methods
	public int getRollNo(){
		return this.rollNo;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
}

public class inte
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		//calling setter methods
		s1.setRollNo(10);
		s1.setName("sachin");
		s1.setAddress("MI");

		//calling getter methods
		System.out.println("RollNo  is :: "+s1.getRollNo());
		System.out.println("Name    is :: "+s1.getName());
		System.out.println("Address is :: "+s1.getAddress());
		Student s2 = new Student();
		
		//calling setter methods
		s2.setRollNo(1);
		s2.setName("sachi");
		s2.setAddress("M");

		//calling getter methods
		System.out.println("RollNo  is :: "+s2.getRollNo());
		System.out.println("Name    is :: "+s2.getName());
		System.out.println("Address is :: "+s2.getAddress());


	}
}
