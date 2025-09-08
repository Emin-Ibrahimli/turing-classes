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
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getName().compareToIgnoreCase(students[minIndex].getName()) < 0){
                    minIndex = j;
                }
            }

            Student temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }

         for(Student s: students) {
          System.out.println(s);
      }
    }
}