public class HelloJava {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);
        multiple(num1);
        System.out.println(num1);

        int num2 = num1;

    }
    public static void multiple (int num2) {

        num2 = num2 * 2;
    }

}