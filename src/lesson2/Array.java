package lesson2;

public class Array {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = FoldingElements(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неверный тип данных в массиве");
            System.out.println("Ошибка в элементе : " + e.i + "x" + e.j);
        }

    }


    public static int FoldingElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}