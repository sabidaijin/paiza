// あまりにも仕事が多く自身の健康状態が心配になったあなたは、最大で連続何日出勤しなければならないのか気になりました。

// それぞれの仕事の期間が与えられるので、最大で連続何日連続出勤しなければならないか計算するプログラムを作成してください。

import java.util.*;
public class countworkday{
    public static void main (String[] args) {
        // 自分の得意な言語
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
 
        Integer task = sc.nextInt();
        Integer max=0;
        Integer preend=0;
        
        Integer current=0;
        // 与えられたタスクの数だけ調査する
        for(int i=0;i<task;i++){
            Integer start = sc.nextInt();
            Integer end = sc.nextInt();
            // 最初の週はタスクの長さ=最大連続日数
            // 次の週からは、もしも前回のエンド＝今回のスタートだったらmaxに労働日数を追加、
            // 前回の方が１小さい＝加算する
            // 前回の方が大きい＝前回終了時の一つ増やした値分終了力引く
            // 前回より１以上小さい＝加算せずリセットする
            // 前回と一致
      
            // 前回のスタートよりも前でスタートしてるもしくは同じ時、
            if(start==preend && preend<=end){
                current=current+end-Math.max(preend,start)+1;
                
                max=Math.max(max,current);
            }
            else if(start<=preend && preend<=end){
                current=current+end-Math.max(preend,start)+1;
                
                max=Math.max(max,current);
            }else{
                // 普通にmaxの値が大きい時
                current=end-start+1;
                max=Math.max(max,current);
                
                }
            System.out.println(current);
            // 前回の終わり日時を保存
            preend=end+1;}
            
        
        max=Math.max(max,current);
        
        sc.close();
        System.out.println(max);
        // 最大連続労働日数を出力する
    }
}


