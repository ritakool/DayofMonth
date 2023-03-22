import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bạn muốn kiểm tra tháng nào ?");
        Scanner sc  = new Scanner(System.in);
        byte moth = sc.nextByte();

        switch (moth) {
            case 2 -> System.out.println(("Tháng 2 có 28 hoặc 29 ngày!"));
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Tháng " + moth + " có 31 ngày!");
            case 4, 6, 9, 11 -> System.out.println("Tháng " + moth + " có 30 ngày!");
            default -> System.out.println("Bạn có chắc là có tháng " + moth + " không?");
        }
    }
}