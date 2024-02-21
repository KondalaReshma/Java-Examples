package collections;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = List.of(new Student (108,"reshma"),new  Student (105,"saho")
				,new Student (100,"prabhas"));
         List <Student> studentAl = new ArrayList<> (students);
		System.out.println(students);
		Collections.sort(studentAl);
		System.out.println(studentAl);
		
	}

}
