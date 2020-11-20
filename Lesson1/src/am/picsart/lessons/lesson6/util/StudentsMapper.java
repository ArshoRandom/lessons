package am.picsart.lessons.lesson6.util;

import am.picsart.lessons.lesson6.model.Student;

public class StudentsMapper {

    private static final int FIXED_LENGTH = 5;
    private static final String DATA_REGEXP = "([A-Za-z]+,[A-Za-z]+,[0-9]{4},[m|f],[0-9]{1,13}(\\.[0-9]*)?\n?)+";

    public static Student[] mapStringToStudents(String data) {
        String[][] studentsMatrix = stringToMatrix(data);
        if (studentsMatrix != null) {
            Student[] students = new Student[studentsMatrix.length];
            for (int i = 0; i < students.length; i++) {

                Student student = new Student();
                student.setName(studentsMatrix[i][0]);
                student.setSurname(studentsMatrix[i][1]);
                student.setBirthYear(Integer.parseInt(studentsMatrix[i][2]));
                student.setGender(studentsMatrix[i][3].charAt(0));
                student.setMark(Double.parseDouble(studentsMatrix[i][4]));
                students[i] = student;
            }
            return students;
        }
        return new Student[]{};
    }

    private static String[][] stringToMatrix(String str) {
        String[][] dataMatrix = null;
        if (str.matches(DATA_REGEXP)) {

            int linesCount = calculateLinesCount(str);
            if (str.endsWith("\n"))
                linesCount--;

            dataMatrix = new String[linesCount][FIXED_LENGTH];
            String[] chunks = str.split("\n");
            for (int i = 0; i < chunks.length; i++) {
                String[] subChunks = chunks[i].split(",");
                System.arraycopy(subChunks, 0, dataMatrix[i], 0, subChunks.length);
            }
        } else {
            System.err.println("Invalid format,please use <name>,<surname>,<birth year>,<m or f>,<mark>\\n...");
            System.exit(2);
        }
        return dataMatrix;

    }

    private static int calculateLinesCount(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\n')
                count++;
        }
        return count;
    }
}
