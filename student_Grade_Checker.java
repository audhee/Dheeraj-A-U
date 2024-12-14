import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    ArrayList<Integer> grades;

    Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
}

class GradeChecker {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, ArrayList<Integer> grades) {
        students.add(new Student(name, grades));
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.name.equals(name));
    }

    public void updateGrades(String name, ArrayList<Integer> grades) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                student.grades = grades;
                break;
            }
        }
    }

    public double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.isEmpty() ? 0 : (double) sum / grades.size();
    }

    public int findHighestMark(ArrayList<Integer> grades) {
        int highest = 0;
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public String assignLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else if (average >=35) {
            return "E";
        }
         else {
            return "F";
        }
    }

    public void displayStudentGrades(String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                double average = calculateAverage(student.grades);
                int highest = findHighestMark(student.grades);
                String letterGrade = assignLetterGrade(average);
                System.out.printf("%s's Grades: %s, Average: %.2f, Highest: %d, Letter Grade: %s%n", student.name, student.grades, average, highest, letterGrade);
                return;
            }
        }
        System.out.println("Student " + name + " not found!");
    }

    public void displayAllGrades() {
        for (Student student : students) {
            displayStudentGrades(student.name);
        }
    }
}

public class Gradechecker3 {
    public static void main(String[] args) {
        GradeChecker checker = new GradeChecker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Update Grades\n4. Display All Grades\n5. Display Student Grades\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grades (comma-separated): ");
                    String[] gradesInput = scanner.nextLine().split(",");
                    ArrayList<Integer> grades = new ArrayList<>();
                    for (String grade : gradesInput) {
                        grades.add(Integer.parseInt(grade.trim()));
                    }
                    checker.addStudent(name, grades);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    checker.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new grades (comma-separated): ");
                    gradesInput = scanner.nextLine().split(",");
                    grades = new ArrayList<>();
                    for (String grade : gradesInput) {
                        grades.add(Integer.parseInt(grade.trim()));
                    }
                    checker.updateGrades(name, grades);
                    break;
                case 4:
                    checker.displayAllGrades();
                    break;
                case 5:
                    System.out.print("Enter student name to display: ");
                    name = scanner.nextLine();
                    checker.displayStudentGrades(name);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
