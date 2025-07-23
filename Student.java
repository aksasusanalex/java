package javaprograms;
import java.util.Scanner;

class Student {
    int age;
    String name;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter student age: ");
        student.age = scanner.nextInt();

        student.displayDetails();

        scanner.close();
    }
}

