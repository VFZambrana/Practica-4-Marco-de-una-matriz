public class Ejercicio12 {

    int[][] marco;

    public Ejercicio12(){

        marco = new int[5][15];
    }
    public void run(){
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == 4 || i == marco[i][j] - 1 || j == 0 || j == 14  || j == marco[i][j] -1){
                marco[i][j] = 1;
                }
                else {
                    marco[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println();
        }
    }
}
