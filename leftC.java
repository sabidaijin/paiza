import java.util.*;
public class leftC {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        double FirstRatio = sc.nextInt();
        double SecondRatio = sc.nextInt();
        double left=(amount*(1-FirstRatio/100))*(1-SecondRatio/100);

        
        System.out.println(left);
    }
}
