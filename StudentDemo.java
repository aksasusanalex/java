package javaprograms;

class Student{
	int rollnumber;
	String name;
	int m1,m2,m3;
	float avg;
	
	Student(int rollnumber, String name, int m1,int m2,int m3){
	this.rollnumber = rollnumber;
	this.name = name;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	
	
	}
	public void calculateAverage() {
		avg=(m1+m2+m3)/3;
	}
	public void displayDetails() {
		System.out.println("Roll NUMBER "+ rollnumber);
		System.out.println("Name " +name);
		System.out.println("Mark1:"+m1 +"\tMark2:"+ m2 +"\tMark3:"+ m3);
		System.out.println("Average Marks"+avg);
		
	}
}
public class StudentDemo {
	public static void main(String args[]) {
		Student student1 =new Student(30,"ayina",20,30,40);
		student1.calculateAverage();
		student1.displayDetails();
		
		
		Student student2=new Student(57,"Mariet",20,30,40);
		student2.calculateAverage();
		student2.displayDetails();
		
	}
}
	
	
