public class Main {
    public static void main(String[] args){
        String message = "Hello, Java!!";

        System.out.println(message);

        System.out.println(message.length());

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        System.out.println(message.indexOf("l"));

        // indexOf() 로직 구현
        for (int i = 0; i < message.length(); i++){
            if (message.charAt(i) == 'l'){
                System.out.println(i);
                break;
            }
        }
        System.out.println(message.substring(3,6));
    }
}
