package school.management.system;
import java.util.List;
import java.util.ArrayList;
/**
 * School can have many teachers and many students
 * We can create array of Teacher and Student, what if we do not know how many teachers are going to be there?
 * The answer is obviolsy not array because I dont know how many teachers and students are going to be there
 * @author Dell
 *
 */
public class School {
	
	/* private Teacher[] teacher;
	    private Student[] student;*/ 
	// The above array cant be used because the size of the students and teachers is not fix
	
	
	// We will use ArrayList for that
	
	
	
	
	
    private List<Teacher> teachers;
    private List<Student> students;
    private static  double totalMoneyEarned;
    private static double totalMoneySpent;
    
    
    public School(List<Teacher> teachers, List<Student> students)// The list of teachers and students is being passed as an argument
    {
    	
    	this.teachers=teachers;
    	this.students=students;
    	totalMoneyEarned=0;
    	totalMoneySpent=0;
    }
    
    public List<Teacher> getTeachers(){
    	return teachers;
    }
    public List<Student> getStudents(){
    	return students;
    }
    
    public double getTotalMoneyEarned() {
    	return totalMoneyEarned;
    }
    public double getTotalMoneySpent() {
    	return totalMoneySpent;
    }
    
    public void addStudent(Student student) {
    	students.add(student);
    }
    public void addTeacher(Teacher teacher) {
    	teachers.add(teacher);
    }
    public static void updateTotalMoneyEarned(double MoneyEarned) {
    	totalMoneyEarned=totalMoneyEarned+MoneyEarned;
    }
    public  static void updateTotalMoneySpent(double MoneySpent) {
    	totalMoneyEarned-=MoneySpent;
    	
    }
    
    // what is the purpose of static
    // ans- with static we can access the method otherwise we have to have an instance of the method
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
