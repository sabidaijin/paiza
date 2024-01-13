import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
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
        

        if (n >= 2) {
            hanoi(n - 1, from, to, via, k, A, B, C,kl);
        }

        System.out.printf("Move the disc from %s to %s.\n", from, to);
   
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
        kl.remove(0);
        System.out.println(kl);
        if (kl.isEmpty() || A.isEmpty() && B.isEmpty()) { // 条件修正
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
        

        if (n >= 2) {
            hanoi(n - 1, via, from, to, k, A, B, C,kl);
        }
        
    }
}
