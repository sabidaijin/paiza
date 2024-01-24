import java.util.*;

public class tetorisu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] field = new char[N][5];
        
        for (int M = 0; M < N; M++) {
            String line = sc.next();
            for (int L = 0; L < 5; L++) {
                // 一文字ずつ配列に入れる
                field[M][L] = line.charAt(L);
            }
        }

        ArrayList<Integer> delx = new ArrayList<>();
        ArrayList<Integer> dely = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        
        for(int i=0;i<10;i++){
        check.CheckField(field, 1, 1, delx, dely, count);
        if (count.size() > 0) {
            check.DelField(field, count, delx, dely);
        }
        }
        sc.close();
        for (int M = 0; M < N; M++) {
            for (int L = 0; L < 5; L++) {
                System.out.print(field[M][L]);
            }
            System.out.println();
        }
    }

    static class check {
        public static void CheckField(char[][] field, int v, int h, ArrayList<Integer> delx,
                ArrayList<Integer> dely, ArrayList<Integer> count) {
            
            int count2=0;
            if (v >= field.length - 1 && h >= 4) {
                return;
            }
            
            if (h + 1 < field[0].length && field[v][h] == field[v][h + 1]) {
                System.out.println("一致しています");
                delx.add(v);
                dely.add(h + 1);
                CheckField(field, v, h + 1, delx, dely, count);
            }else{
                count2++;
                
            }

            if (h - 1 >= 0 && field[v][h] == field[v][h - 1]) {
                System.out.println("一致しています");
                delx.add(v);
                dely.add(h - 1);
                CheckField(field, v, h - 1, delx, dely, count);
            }else{
                count2++;
            }


            if (v + 1 < field.length && field[v][h] == field[v + 1][h]) {
                System.out.println("一致しています");
                delx.add(v + 1);
                dely.add(h);
                CheckField(field, v + 1, h, delx, dely, count);
            }else{
                count2++;
            }


            if (v - 1 >= 0 && field[v][h] == field[v - 1][h]) {
                System.out.println("一致しています");
                delx.add(v - 1);
                dely.add(h);
                CheckField(field, v - 1, h, delx, dely, count);
            }else{
                count2++;
            }
            if(count2==4){
               return;
            }

        }

        public static void DelField(char[][] field, ArrayList<Integer> count, ArrayList<Integer> delx,
                ArrayList<Integer> dely) {
            for (int i = 0; i < delx.size(); i++) {
                field[delx.get(i)][dely.get(i)] = '.';
            }
            count.clear();
            
            for (int i = field.length - 1; i > 0; i--) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == '.' && field[i - 1][j] != '.') {
                        field[i][j] = field[i - 1][j];
                        field[i - 1][j] = '.';
                    }
                }
            }
        }
    }
}
