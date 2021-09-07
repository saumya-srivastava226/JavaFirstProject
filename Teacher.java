package school.management.system;

/**
 * This class is responsible for keeping the track of teacher's id,name and salary
 * @author Dell
 *
 */
public class Teacher {
	 private int id;//this.id
	 private String name;//this.name
	 private double salary;//this.salary
	 private double salaryEarned;
	 
	 
	 
	 public  Teacher(int id, String name, double salary){
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.salaryEarned=0;
		 
		 
	 }
	 public void setSalary(double salary) {
		 this.salary=salary;
		 
	 }
	 public int getId() {
		return this.id;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
	 public double getSalary() {
		 return this.salary;
	 }
	 public void receiveSalary(double salary) {
		 
		 // remove from the total money earned by the school
		 salaryEarned+=salary;
		 
		 School.updateTotalMoneySpent(salaryEarned);
	 }
}
