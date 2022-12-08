public class Main {
    public static void main(String[] args) {
        // case 1.1 (задание 1 + задание 2)
        System.out.println("case 1.1");
        int[] box = {1, 2, 3};
        for (int a = 0; a < box.length; a++) {
            System.out.print(box[a]);
            if (a != box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // case 1.2 (задание 1 + задание 2)
        System.out.println("case 1.2");
        double[] doubleArr = {1.57, 7.654, 9.986};
        for (int k = 0; k < doubleArr.length; k++) {
            System.out.print(doubleArr[k]);
            if (k != box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // case 1.3 (задание 1 + задание 2)
        System.out.println("case 1.3");
        int[] marks = {5, 7, 1, 3, 4, 8, 12, 2, 5, 9};
        for (int z = 0; z < marks.length; z++) {
            System.out.print(marks[z]);
            if (z != box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // case 3.1 (задание 3)
        System.out.println("case 3.1");
        int[] apples = {1, 2, 3};
        for (int a = apples.length - 1; a >= 0; a--) {
            System.out.print(apples[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // case 3.2 (задание 3)
        System.out.println("case 3.2");
        double[] arr = {1.57, 7.654, 9.986};
        for (int h = arr.length - 1; h >= 0; h--) {
            System.out.print(arr[h]);
            if (h != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // case 3.3 (задание 3)
        System.out.println("case 3.3");
        int[] numbers = {5, 7, 1, 3, 4, 8, 12, 2, 5, 9};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // case 4
        System.out.println("case 4");
        int[] cells = {1, 2, 3};
        for (int j = 0; j < cells.length; j++) {
            if (cells[j] % 2 != 0) {
                cells[j] += 1;
            }
            System.out.print(cells[j]);
            if (j != cells.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}