public class ArrayDemo {
     public static void main(String[] args) {

    int[] number  = {100,70,80,71,98};

        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum = sum + number [i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
    
}
