class Student {
    String name;
    int roll;

    // Default Constructor
    Student() {
        name = "";
        roll = 0;
    }

    // Parameterized Constructor with roll number
    Student(int r) {
        roll = r;
    }

    // Parameterized Constructor with name and roll number
    Student(String s, int r) {
        name = s;
        roll = r;
    }

    // Method to display student details
    void show() {
        System.out.println("NAME = " + name);
      
        System.out.println("ROLL = " + roll);
          System.out.println(" ");
    }
}

class Test {
    public static void main(String args[]) {
        // Creating an object using the constructor with roll number
        Student s1 = new Student(129);
        s1.name = "Aditya Kumar"; // Assigning name separately
        
        // Creating an object using the constructor with name and roll number
        Student s2 = new Student("Shubham", 130); // Using a unique roll number
         Student s3=new Student("Aman",135);
         
         Student s4=new Student("Karan",145);
        // Displaying details
        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}