package lesson5;

public class lesson5 {

    static final int SIZE = 10000;
    static final int HALF = SIZE / 2;
    public static float[] arr = new float[SIZE];
    public static float[] arr1 = new float[HALF];
    public static float[] arr2 = new float[HALF];

    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        for (int i = 0; i <SIZE;i++){
            arr[i] = 1;
        }
        long time1 = System.currentTimeMillis();
        for (int i = 0; i <SIZE;i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения одним потоком:" + (System.currentTimeMillis() - time1));
    }

    public static class MyThread1 extends Thread {
            @Override
            public void run() {
                System.arraycopy(arr, 0, arr1, 0, HALF);
                for (int i = 0; i <HALF;i++){
                    arr[i] = 1;
                }
                for (int i = 0; i <HALF;i++){
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }

            }
        }
    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            System.arraycopy(arr, HALF, arr2, 0, HALF);
            for (int i = 0; i <HALF;i++){
                arr[i] = 1;
            }
            for (int i = 0; i <HALF;i++){
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

        }
    }


    public static void method2(){
        long time2 = System.currentTimeMillis();
        new MyThread1().start();
        new MyThread2().start();
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.out.println("Время выполнения двумя потоками:"+(System.currentTimeMillis() - time2));
    }
}
