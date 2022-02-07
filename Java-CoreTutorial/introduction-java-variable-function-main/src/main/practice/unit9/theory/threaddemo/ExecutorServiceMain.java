package main.practice.unit9.theory.threaddemo;

/**
 * @author ManhKM on 2/6/2022
 * @project introduction-java-variable-function-main
 */
public class ExecutorServiceMain {
    static long N = 2000000000;

    public static void main(String[] args) {
        sum1();
        sum2();
    }

    private static void sum2() {
        long start = System.currentTimeMillis();
        long localSum1 = 0;
        for (int i = 0; i < N; i++){
            localSum1 += i;
        }

        long localSum2 = 0;
        for(int i = 0; i < N; i++){
            localSum2 += i;
        }

        System.out.println("Sum 2: Total execution time ms: " + (System.currentTimeMillis() - start));
    }

    private static void sum1() {
    }
}
