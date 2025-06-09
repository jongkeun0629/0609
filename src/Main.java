public class Main {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(numbers.length);

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // 역순
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[numbers.length - i - 1]);
        }
    }
}
