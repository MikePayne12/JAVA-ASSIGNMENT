//Q4
public class StudentManagement {
    // Instance variables
    private String studentName;
    private int studentAge;
    private static int totalStudents = 0;
    
    // Constructor
    public StudentManagement(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
        totalStudents++; // Increment total students when object is created
        System.out.println("New student created: " + name);
    }
    
    // Non-static method
    public void displayStudentInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Current total students: " + totalStudents);
    }
    
    // First static method
    public static void displaySchoolInfo() {
        System.out.println("\nSchool Information:");
        System.out.println("School Name: ABC High School");
        System.out.println("Location: New York");
        System.out.println("Total enrolled students: " + totalStudents);
    }
    
    // Second static method
    public static int getAverageAge(StudentManagement[] students) {
        if (students.length == 0) return 0;
        
        int totalAge = 0;
        for (StudentManagement student : students) {
            totalAge += student.studentAge;
        }
        return totalAge / students.length;
    }
    
    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Create some student objects
        StudentManagement student1 = new StudentManagement("John Doe", 18);
        StudentManagement student2 = new StudentManagement("Jane Smith", 19);
        StudentManagement student3 = new StudentManagement("Bob Wilson", 20);
        
        // Call non-static method
        student1.displayStudentInfo();
        
        // Call first static method
        StudentManagement.displaySchoolInfo();
        
        // Call second static method
        StudentManagement[] studentArray = {student1, student2, student3};
        int averageAge = StudentManagement.getAverageAge(studentArray);
        System.out.println("\nAverage age of all students: " + averageAge);
    }
}