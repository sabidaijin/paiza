// Paiza 市では、電車が N 路線運行しています。それぞれの路線は、M 個の駅を有しています。

// 運賃は、i 番目 (1 ≦ i ≦ N) の路線の 1 番目の駅から j 番目 (1 ≦ j ≦ M) の駅まで移動したとき A_{i, j} 円となります。k 番目 (1 ≦ k ≦ j) の駅から j 番目の駅まで移動した場合は、A_{i, j} と A_{i, k} の差額だけ運賃がかかります。j 番目の駅から k 番目の駅に移動する場合も同様です。
// ここで、指定されたルートで電車を用いて目的地に行くことを考えたとき、運賃がいくらになるか計算するプログラムを作成してください。なお、スタート地点は 1 番目の路線の 1 番目の駅であり、現在地が j 番目の駅である場合、どの路線の j 番目の駅も 0 円で移動することが出来ます。
// また、目的地が i 番目の路線の駅となっている場合、i 番目の路線を用いて移動することとします。

// 例えば、入力例 1 は以下のようになります。
import java.util.*;
public class culfee {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        // 路線の数
        Integer way = sc.nextInt();
        // 駅の数
        Integer platform = sc.nextInt();
        // 運賃表を二次元配列で作る
       
       
        
        Integer[][] costgraph = new Integer[way][platform];
        for(int n=0;n<way;n++){
            for(int m=0;m<platform;m++){
                Integer cost = sc.nextInt();
                costgraph[n][m]=cost;
                
                
            }
        }
        
        // 行くべき駅のデータを集まる
        Integer via = sc.nextInt();
        Integer sumcost=0;
        Integer prevp=1;
        Integer cost=0;
        for(int j=0;j<via;j++){
            Integer vw = sc.nextInt();
            Integer vp = sc.nextInt();
            // 戻り路線
            if (vp<prevp){ 
                
                cost=costgraph[vw-1][prevp-1]-costgraph[vw-1][vp-1];}
            else{
                // 上り路線
                cost=costgraph[vw-1][vp-1]-costgraph[vw-1][prevp-1];
            }
            
                
                prevp=vp;
                sumcost = sumcost+cost;
                
            }
        // 集めたデータから行くべき駅に行った時にどれだけのコストが合計でかかるのか計算する
        sc.close();
        System.out.println(sumcost);
    }
}

// 上り線、下り線の場合分けができておらず、コードを書き始める前にもっと考えてから行うべきだった











