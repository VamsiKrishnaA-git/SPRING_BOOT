import java.util.Scanner;

public class Change1 {
    private static int getChange(int m) {
        //write your code here
       int  x = m;
       int q1 = x / 10;
       int r1 = x % 10;
       int q2 = r1 / 5;
       int r2 = r1 % 5;
       int q3 = r2 / 1;
        return q1+q2+q3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

