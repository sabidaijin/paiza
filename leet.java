import java.util.*;

public class leet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        char[] charArray = line.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case 'A':
                case 'a':
                    charArray[i] = '4';
                    break;
                case 'E':
                case 'e':
                    charArray[i] = '3';
                    break;
                case 'G':
                case 'g':
                    charArray[i] = '6';
                    break;
                case 'I':
                case 'i':
                    charArray[i] = '1';
                    break;
                case 'O':
                case 'o':
                    charArray[i] = '0';
                    break;
                case 'S':
                case 's':
                    charArray[i] = '5';
                    break;
                case 'Z':
                case 'z':
                    charArray[i] = '2';
                    break;
                default:
                    // 変換不要な文字を処理する場合、ここをカスタマイズしてください
            }
        }

        // 文字配列を文字列に戻して、修正された文字列を表示します
        line = new String(charArray);

        System.out.println(line);
    }
}
