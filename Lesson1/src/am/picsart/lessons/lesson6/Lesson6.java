package am.picsart.lessons.lesson6;

import am.picsart.lessons.lesson6.model.Student;
import am.picsart.lessons.lesson6.service.StudentService;

public class Lesson6 {

    public static void main(String[] args) throws Exception {
        Student[] studentsFromFile = StudentService.createStudentsFromFile();

        StudentService.printFullNames(studentsFromFile);
        StudentService.printMaleStudents(studentsFromFile);
        StudentService.printEnoughFemaleStudents(studentsFromFile);
        StudentService.printMinimalMarkStudent(studentsFromFile);
        StudentService.printBiggestMaleStudent(studentsFromFile);
        StudentService.printStudentsSortedByMark(studentsFromFile);
        StudentService.printFemaleStudentsSortedByYear(studentsFromFile);

    }
}


