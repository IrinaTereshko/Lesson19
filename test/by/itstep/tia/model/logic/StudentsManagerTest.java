package by.itstep.tia.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentsManagerTest {



    @Test
    public void testCalculateAvgMarkPositive(){

               int[] marks = {5,5,5,5,5};
               double expected = 5.0;

               double actual = StudentsManager.calcAvgStudentMark(marks);

        assertEquals(expected, actual, 0.001);


    }

    @Test
    public void testCalculateAvgMarkNegativeEmptyObject(){

        int[] marks = {}; // int[] marks = new int[0]
        double expected = -1;

        double actual = StudentsManager.calcAvgStudentMark(marks);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCalculateAvgMarkNegativeWithNull(){

// можно не создавать массив с null , а сразу его передать в методе
        //int[] marks = null; // int[] marks = new int[0]

        double expected = -1;

// 2 возможности передать отсутствие данных
      //  double actual = StudentsManager.calcAvgStudentMark(marks);
        //  или
        double actual = StudentsManager.calcAvgStudentMark(null);
        assertEquals(expected, actual, 0);
    }
}
