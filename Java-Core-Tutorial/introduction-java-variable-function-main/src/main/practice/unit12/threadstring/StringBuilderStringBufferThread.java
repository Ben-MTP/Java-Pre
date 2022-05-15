package main.practice.unit12.threadstring;

/**
 * Theo lý thuyết:
 *      StringBuilder sẽ nhanh hơn StringBuffer.
 * @author ManhKM on 2/9/2022
 * @project introduction-java-variable-function-main
 */
public class StringBuilderStringBufferThread {
    public static void main(String[] args) {
        // StringBuilder:
        StringBuilder stringBuilder = new StringBuilder();
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++){
            stringBuilder.append(i);
        }

        Long end1 = System.currentTimeMillis();
        System.out.println("Total time execute StringBuilder: " + (end1-start));

        // StringBuffer:
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < 5000000; i++){
            stringBuffer.append(i);
        }
        Long end2 = System.currentTimeMillis();
        System.out.println("Total time execute StringBuffer: " + (end2-end1));

    }
}
