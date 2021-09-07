package school.management.system;


/** 
 * 
 * @author Dell
 *This class is responsible to keep the track of students
 *It has info like- name, grade, fees paid
 */ 
public class Student {


	private int id;// We made it private because we do not want anyone to modify this outside the student class
	private String name;// Name is also kept private. It can'tbe accessed by outside classes
	private int grade;//(Class -1 to 12)
	private double feesPaid;
	private double feesTotal;
	
	// A constructor is used to initialize the values to the object as soon as object is created 
	// using new keyword
	/**
	 * Fees for every student is $30,000
	 * Fees Paid initially is zero
	 * @param id id of the student-unique
	 * @param name name of the student, it may or may not be unique
	 * @param grade grade of the student
	 */
	
	public Student(int id,String name,int grade){
		this.id=id; // this.id = id of the present class ie The Student class
		this.name=name;// this.name= name of the present class,  name= argument thst is passed
		this.grade=grade;
		this.feesPaid=0;
		this.feesTotal=30000;
	}
	
	// Not going to alter student's name, student's id , 
	public  void setGrade(int grade) {
		
		this.grade=grade;// Update  the grade of this class with grade parameter that has been passed
	} 
	/**
	 * add the fees to the fees Paid
	 * The school is going to receive the fund 
	 * @param fees
	 */
	
	 
//	public void updateFeesPaid( double fees) {
	//	this.feesPaid=feesPaid+fees;
		
	//}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade()
	{
		return grade;
	}
	public double getFeesPaid()
	{
		return this.feesPaid;
	}
	public double getFeesTotal()
	{
		return feesTotal;
	}
	public void payFees(double fees)
	{
		feesPaid+=fees;
		 // we have to update the school earned money as well
		// for that we are going to make a mthod static 
		
		School.updateTotalMoneyEarned(feesPaid);
	}
}
