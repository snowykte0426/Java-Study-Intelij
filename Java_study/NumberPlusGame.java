import java.util.Scanner;

public class NumberPlusGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램이 종료됩니다.");
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("두 숫자의 합: " + (num1 + num2));
        }
    }
}