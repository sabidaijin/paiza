import java.util.Scanner;

public class restaurant_menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int count = sc.nextInt();
        sc.nextLine(); // 改行を読み飛ばす

        String[] menu = new String[count];
        menu = sc.nextLine().split(" ");

        sc.close();

        boolean found = false; // 一致する料理が見つかったかどうかを示すフラグ

        for (int k = 0; k < menu.length; k++) {
            if (menu[k].equals(line)) {
                found = true;
                break; // 一致する料理が見つかったらループを抜ける
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
