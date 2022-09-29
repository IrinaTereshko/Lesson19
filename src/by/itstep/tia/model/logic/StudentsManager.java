package by.itstep.tia.model.logic;

public class StudentsManager {

    public static double calcAvgStudentMark(int[] marks) {

       // проверка на пустой массив и отсутствие массива
        if (marks == null || marks.length == 0 ) {
            return -1;
        }

        double s = 0;

        for (int i = 0; i < marks.length; i++) {
            s += marks[i];
        }

        return s / marks.length;
    }
}
