package main.practice.unit9.theory.streamlambda.demolambda;

/**
 * @author ManhKM on 2/24/2022
 * @project introduction-java-variable-function-main
 */
public class LambdaString {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask     = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    private static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
