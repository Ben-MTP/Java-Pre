package main.practice.unit9.theory.streamlambda.demolambda;


import java.util.stream.IntStream;

/**
 * @author ManhKM on 2/24/2022
 * @project introduction-java-variable-function-main
 */
public class SoNguyenToLambda {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(int number){
        return number > 1 && IntStream.range(2, number).noneMatch(
                index -> number % index == 0
        );
    }
}
