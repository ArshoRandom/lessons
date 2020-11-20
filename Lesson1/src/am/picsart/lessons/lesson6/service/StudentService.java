package am.picsart.lessons.lesson6.service;

import am.picsart.lessons.lesson6.model.Student;
import am.picsart.lessons.lesson6.util.StudentsFilerReader;
import am.picsart.lessons.lesson6.util.StudentsMapper;

import java.util.Scanner;

public class StudentService {

    public static Student[] createStudentsFromFile() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        String path = scanner.nextLine();
        String studentsData = StudentsFilerReader.readFile(path);
        return StudentsMapper.mapStringToStudents(studentsData);
    }

    public static void printAllStudentsInfo(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //    Task 1: Print full names of students
    public static void printFullNames(Student[] students) {
        System.out.println("\nTask 1: Print full names of students");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
    }

    //    Task 2: Print all male students
    public static void printMaleStudents(Student[] students) {
        System.out.println("\nTask 2: Print all male students");
        if (getFirstStudentByGender(students, 'm') != null) {
            for (Student student : students) {
                if (student.getGender() == 'm')
                    System.out.println(student);
            }
        }
    }

    //    Task 3: Print all female students who has mark greater then 50.4
    public static void printEnoughFemaleStudents(Student[] students) {
        System.out.println("\nTask 3: Print all female students who has mark greater then 50.4");
        if (getFirstStudentByGender(students, 'f') != null) {

            for (Student student : students) {
                if (student.getGender() == 'f' && student.getMark() > 50.4)
                    System.out.println(student);
            }
        } else {
            System.out.println("\nFemale student not exists");
        }
    }

    //    Task 4: Print student information having the minimal mark
    public static void printMinimalMarkStudent(Student[] students) {
        System.out.println("\nTask 4: Print student information having the minimal mark");
        Student minimalMarkStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() < minimalMarkStudent.getMark())
                minimalMarkStudent = students[i];
        }
        System.out.println(minimalMarkStudent);
    }


    //    Task 5: Print biggest male student information
    public static void printBiggestMaleStudent(Student[] students) {
        System.out.println("\nTask 5: Print biggest male student information");
        Student biggestMaleStudent = getFirstStudentByGender(students, 'm');
        if (biggestMaleStudent != null) {
            for (Student student : students) {
                if ((student.getBirthYear() < biggestMaleStudent.getBirthYear()) && student.getGender() == 'm')
                    biggestMaleStudent = student;
            }
            System.out.println(biggestMaleStudent);
        } else {
            System.out.println("\nMale students not exists");
        }
    }

    private static Student getFirstStudentByGender(Student[] students, char gender) {
        Student maleStudent = null;
        for (Student student : students) {
            if (student.getGender() == gender) {
                maleStudent = student;
                break;
            }
        }
        return maleStudent;
    }


    //    Task 6: Print students sorted by mark
    public static void printStudentsSortedByMark(Student[] students) {
        System.out.println("\nTask 6: Print students sorted by mark");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getMark() < students[j].getMark()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        printAllStudentsInfo(students);
    }


    //    Task 7: Print female students sorted by year
    public static void printFemaleStudentsSortedByYear(Student[] students) {
        System.out.println("\nTask 7: Print female students sorted by year");
        if (getFirstStudentByGender(students, 'f') != null) {
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = i + 1; j < students.length; j++) {
                    if (students[i].getBirthYear() < students[j].getBirthYear() && students[i].getGender() == 'f') {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
            for (Student student : students) {
                if (student.getGender() == 'f')
                    System.out.println(student);
            }
        } else {
            System.out.println("\nFemale student not exists");
        }
    }
}
