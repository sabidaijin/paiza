import java.util.*;
// あなたは、自作のペイントツールに「塗りつぶしツール」と言われるものを実装しようとしています。
// このツールは、あるドットの色を変更するとき、上下左右に隣接するドットで、同じ色のドットが存在するならそのドットの色も同時に変更する、という操作を繰り返し行うツールです。

// まず、白と黒の二色のみが使われた画像に対して、白ドットを黒に塗りつぶすツールを実装しようとしています。入力として、画像と塗りつぶしツールを実行する白ドットの座標が与えられるので、塗りつぶしツール実行後の画像を出力してください。

// 入力例 1 の場合、(5, 4) に塗りつぶしツールを適用すると、下図のようになります。


public class nuritubisi{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
   
        char[][] field = new char[N][M];
        
        for (int i = 0; i < N; i++) { 
             String line = sc.nextLine();
            for (int L = 0; L < M; L++) {
                // 一文字ずつ配列に入れる
                field[i][L] = line.charAt(L);
            }
        }

        check(field,n-1,m-1);
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        sc.close();}
       
      
    
        

    static void check (char[][] field,int v,int h){
        if(h>=field[0].length||v<0||h<0|| v>=field.length){
            return;
        } else if( field[v][h] =='#'){
            return ;}

        else{
            field[v][h]='#';
                }
                
            check(field,v+1,h);
            check(field,v-1,h);
            check(field,v,h+1);
            check(field,v,h-1);
            return ;
        }
    }


        

