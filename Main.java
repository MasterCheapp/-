public class Main {
    public static void main(String[] args)
    {
//      создаем первый массив
        long[] x = new long[14];
        int k = 0;
        for (int i = 17; i >= 4; i--){
            x[k] = i;
            k +=  1;
        }
//      создаем второй массив
        float[] y = new float[14];
        for (int i = 0; i < y.length; i++) {
            y[i] = ((int)(Math.random() * 15) - 13);

        }
//      создаем двумерный массив для заполнения
        double[][] z = new double[14][14];

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++){
                int q = (int) x[i];
                switch (q) {
                    case 10 -> z[i][j] = f1(y[j]);
                    case 5, 6, 11, 12, 13, 16, 17 -> z[i][j] = f2(y[j]);
                    case 4, 7, 8, 9, 14, 15 -> z[i][j] = f3(y[j]);
                }

                }
            }
        f4(z);
        }

// вводим три метода типа double
    public static double f1(float k1) {
        return Math.asin(0.25 * Math.pow((k1 - 5.5) / 15, 2));
    }
    public static double f2(float k2){
        return Math.cos(Math.tan(Math.cos(k2)));
    }
    public static double f3(float k3){
        return (0.5 / (3.0 -(Math.pow(((4.0 / k3) - 2.0) / 12, Math.pow(k3, (1.0 - k3) / 6.0 )))));
    }
//  вводим метод типа void
    public static void f4(double[][] k4){
        for (byte i = 0; i < 14; i++){
            for (byte j=0; j < 14; j++){
                System.out.printf("%.3f \t", k4[i][j]);
            }
            System.out.println();
        }
    }
}
