public class ContinuousSum {
    public static void main(String[] args) {

        int[] numbers = {100, 70, 80, 71, 98};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println("Continuous Sum = " + sum);
        }
    }
} 