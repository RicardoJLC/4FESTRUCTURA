public class App {
    public static void main(String[] args) throws Exception {
        int[][] arrTest={
            {1,3,7,8},
            {0,6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9,0}
        };
        // Imprime la sumatoria de todos los elementos
        //No se permite el uso de streams o clases externas
        int sum=0;
        for(int i=0;i<arrTest.length;i++){
            for(int j=0;j<arrTest[i].length;j++){
                sum+=arrTest[i][j];
            }
        }
        System.out.println("La Sumatoria es: "+sum);


    }
}
