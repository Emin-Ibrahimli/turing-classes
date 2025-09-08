package Task5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Alex", 20, 70.0, "Tourism"),
                new Student("John", 21, 80.0, "Math"),
                new Student("David", 20, 84.0, "Economics"),
                new Student("John", 21, 60.2, "Medicine"),
                new Student("Jack", 18, 90.7, "Veterinary ")
        };

        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            boolean bln = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0){
                    Student s1 = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = s1;
                    bln = true;
                }
            }

                if (!bln) {
                    break;
                }
        }

         for(Student s: students) {
          System.out.println(s);
      }
    }
}