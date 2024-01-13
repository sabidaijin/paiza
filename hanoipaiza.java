// ハノイの塔を再帰関数を用いて解くプロジェクト
// Input:   3 2
// Output:  Move the disc from A to B.
//          Move the disc from A to C.
//          Move the disc from B to C.
//          Move the disc from A to B.
//          Move the disc from C to A.
//          Move the disc from C to B.
//          Move the disc from A to B.
//          Reached k = 0.
//          -
//          -
//          123

import java.util.*;

public class hanoipaiza {
    public static void main(String[] args) throws Exception {

        // n:ハノイの塔のディスクの数 int
        // k:動かせる回数 int
        // A:釘A　ArrayListで保持
        // B:釘B ArrayListで保持
        // C:釘C ArrayListで保持
        // kl:操作回数(リストで保持ししているのは、再帰関数の中で値を変更するため)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> kl = new ArrayList<>();
        
        for (int i = n; i >= 1; i--) {
            A.add(i);
        }
        
        for(int i=0;i<k;i++){
            kl.add(i);}
        sc.close();
        
        
        hanoi(n, "A", "B", "C", k, A, B, C,kl);
    }

    public static void hanoi(int n, String from, String via, String to, int k, ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C,ArrayList<Integer>kl) {
        // ハノイの塔の操作をするメソッド
        // ハノイの塔は土台ディスクとそれ以外と考えると、それ以外のディスクを目的の釘ではないところに山積みすることができる。
        // 実装できる。つまり3枚の時は二枚を使った小さな山を作り、土台ディスクを目的の釘に移動させる。その後、小さな山を目的の釘に移動させることで実装できる。
        // 4枚の時は3枚を使った小さな山を作り、土台ディスクを目的の釘に移動させる。その後、小さな山を目的の釘に移動させることで実装できる。
        // といった形で再起的に考え、4枚の時は土台と3枚(3枚の時は土台と2枚(2枚の時は土台と1枚))という形で考えると実装できる。

        
        // 土台以外の山を目的ではないところに移動させる
        if (n >= 2) {
            hanoi(n - 1, from, to, via, k, A, B, C,kl);
        }

        System.out.printf("Move the disc from %s to %s.\n", from, to);
        
        // ディスクを移動する
        switch (from) {
            case "A":
                A.remove(A.size() - 1);
                break;
            case "B":
                B.remove(B.size() - 1);
                break;
            case "C":
                C.remove(C.size() - 1);
                break;
        }

        switch (to) {
            case "A":
                A.add(n);
                break;
            case "B":
                B.add(n);
                break;
            case "C":
                C.add(n);
                break;
        }
        

        // 残り操作回数を減らす
        kl.remove(0);
        System.out.println(kl);
        // もしも操作回数が０になったら、もしくはAとBが空になったら終了
        if (kl.isEmpty() || A.isEmpty() && B.isEmpty()) {
            System.out.println("Reached k = 0.");
    
            // A, B, C のサイズを求めて、ディスクの数を取得
            int sizeA = A.size();
            int sizeB = B.size();
            int sizeC = C.size();
        
            // A, B, C でディスクがない場合は '-' を表示
            if (sizeA == 0) {
                System.out.print("-");
            } else {
                // ディスクがある場合はディスクを表示
                for (int i = 0; i < sizeA; i++) {
                    System.out.print(A.get(i));
                }
            }
            
            System.out.println("");
            
            // B についても同様に処理
            if (sizeB == 0) {
                System.out.print("-");
            } else {
                for (int i = 0; i < sizeB; i++) {
                    System.out.print(B.get(i));
                }
            }
            
            System.out.println("");
            
            // C についても同様に処理
            if (sizeC == 0) {
                System.out.print("-");
            } else {
                for (int i = 0; i < sizeC; i++) {
                    System.out.print(C.get(i));
                }
            }
            
            System.out.println("");
            
            System.exit(0);
        }
        
        // 目的の山に土台以外のディスクを移動させる
        if (n >= 2) {
            hanoi(n - 1, via, from, to, k, A, B, C,kl);
        }
        
    }
}
