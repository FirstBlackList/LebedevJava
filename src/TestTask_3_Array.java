public class TestTask_3_Array {

    public static void returnNumbersThatAreMultiplesOfThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Элемент кратный трём: " +
                        array[i] + " находиться под индексом: " + i);
            }
        }
    }

}
