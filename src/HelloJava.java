import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long sum4 = 0L;

        while (true){
            System.out.print("첫번째 숫자 : ");
            Long a = scanner.nextLong();
            System.out.print("두번째 숫자 : ");
            Long b = scanner.nextLong();
            Long sum = a + b;

            System.out.println("합한 숫자 : " + sum);

            sum4 += sum;

            if (a == 0 || b == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println("입력한 모든 숫자의 합 : " + sum4);
                break;

            }

        }
    }
}