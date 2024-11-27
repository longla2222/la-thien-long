package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Nhập vào hai số nguyên a và b
        System.out.print("Nhập số nguyên a: 10 ");
        int a = 10;
        System.out.print("Nhập số nguyên b: 20 ");
        int b = 20;
        
        // Tính tổng, hiệu, tích, thương của a và b
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = b != 0 ? (double) a / b : Double.NaN;  // Kiểm tra chia cho 0

        // In ra kết quả các phép toán
        System.out.printf("Tổng: %.2f\n", sum);
        System.out.printf("Hiệu: %.2f\n", difference);
        System.out.printf("Tích: %.2f\n", product);
        if (b != 0) {
            System.out.printf("Thương: %.2f\n", quotient);
        } else {
            System.out.println("Thương: Không thể chia cho 0");
        }

        // Khai báo biến c và so sánh các giá trị của a và b
        boolean isGreaterThan = a > b;
        boolean isLessThan = a < b;
        boolean isGreaterThanOrEqual = a >= b;
        boolean isLessThanOrEqual = a <= b;
        boolean isEqual = a == b;

        // In kết quả so sánh
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a >= b: " + isGreaterThanOrEqual);
        System.out.println("a <= b: " + isLessThanOrEqual);
        System.out.println("a == b: " + isEqual);

        // Đóng đối tượng scanner
        scanner.close();

	}

}
