package school.management.system;
import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Teacher lizzy=new Teacher(1,"Lizzy",500);
		Teacher malissa=new Teacher(2,"Melissa",700);
		Teacher david=new Teacher(3,"David",500);
		
		List<Teacher> teachersList=new ArrayList<>();
		
		teachersList.add(lizzy);
		teachersList.add(malissa);
		teachersList.add(david);
		
		
		Student meave=new Student(1,"Meave",11);
		Student otis=new Student(2,"Otis",11);
		Student ola=new Student(3,"Ola",12);
		
		List<Student> studentsList=new ArrayList<>();
		
		studentsList.add(meave);
		studentsList.add(otis);
		studentsList.add(ola);
		
		
		School gps=new School( teachersList, studentsList );
			System.out.println(	"The gps has earned:"+gps.getTotalMoneyEarned());
			otis.payFees(678.90);
			System.out.println(	"The gps has earned:"+gps.getTotalMoneyEarned());
		meave.payFees(900);
		System.out.println(	"The gps has earned:"+gps.getTotalMoneyEarned());
		
		
		// Lets us make ghs pay teachers salary;
		
		System.out.println("---------------------------------------------------------------------------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent for salary to"+lizzy.getName()+"Now has "+gps.getTotalMoneyEarned());
	}

}
