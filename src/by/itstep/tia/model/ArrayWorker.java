package by.itstep.tia.model;

public class ArrayWorker {
    public static int max(int[]array){

      // проверка на дурака от нулевого и пустого массива,
        // проверка на нуль стьавиться первая в условии!!!
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        // два способа начать поиск  максимального значения, надо выбрать начальную точку для сравнения
        int max = array[0];
      //  int max = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            }
        return max;
        }
    }
}
