public class Modificacion {
    public static void main(String[] args) {
        int[][] arrTest = {
                {1},
                {6,3,1},
                {1,2,3,4},
                {0,5,3,0},
                {2,5,9},
                {2,4,8,9,10}
        };

        System.out.println("Antes:");
        print2D(arrTest);

        int[][] newArr = new int[arrTest.length][];

        for (int i = 0; i < arrTest.length; i++) {
            int[] row = arrTest[i];

            if (row == null) {
                newArr[i] = null;
                continue;
            }

            int oldLen = row.length;
            if (oldLen == 0) {
                newArr[i] = new int[] {1};
                continue;
            }

            int[] newRow = new int[oldLen + 1];

            for (int j = 0; j < oldLen; j++) {
                newRow[j] = row[j];
            }

            newRow[oldLen] = row[oldLen - 1] + 1;

            newArr[i] = newRow;
        }

        arrTest = newArr;

        System.out.println("\nDespués:");
        print2D(arrTest);
    }

    private static void print2D(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int[] row = a[i];
            if (row == null) {
                System.out.println("null");
                continue;
            }
            System.out.print("{");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) System.out.print(", ");
            }
            System.out.println("}");
        }
    }
}
