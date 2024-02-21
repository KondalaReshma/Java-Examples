package queue;
import java.util.*;
class Student implements Comparable<Student>{

private int id;

private String name;

public Student(int id,String name){

this.id = id;

this.name = name;

}

public int getId(){

return this.id;

}

public String getName(){

return this.name;

}

@Override

public String toString(){

return id+" - "+name;

}

@Override

public int compareTo(Student that){

return Integer.compare(this.id , that.id);

// to reverse the order of sorting ------->

// return Interger.compare(that.id,this,id);

}

}

class AscendingStudentComparator implements Comparator<Student>{

@Override

public int compare(Student student1,Student student2){

return Integer.compare(student1.getId(),student2.getId());

}

}

class AscendingStudentNameComparator implements Comparator<Student>{

@Override

public int compare(Student student1,Student student2){

return student1.getName().compareTo(student2.getName());

}

}

public class Main

{

public static void main(String[] args) {

List<Student> students = List.of(new Student(111,"supraja"),new Student(345,"maneesh"),new Student(764,"kiran"));

List<Student> studentArrayList = new ArrayList<Student>(students);

System.out.println(studentArrayList);

Collections.sort(studentArrayList);

System.out.println(studentArrayList);

Collections.sort(studentArrayList,new AscendingStudentComparator());

System.out.println(studentArrayList);

System.out.println("---------------------------------------");

Collections.sort(studentArrayList,new AscendingStudentNameComparator());

System.out.println(studentArrayList);

// studentArrayList.sort(new AscendingStudentComparator());

// using the inbuilt sort function present in List

// System.out.println(studentArrayList);

}

}

