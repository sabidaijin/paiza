// あなたの目の前には、N 種類の色のガーベラがそれぞれ 2 本ずつ、合計 2N 本のガーベラが一列に並べられています。
// あなたは、「隣り合う 2 本のガーベラを指定してそれらの位置を交換する」という操作を繰り返して、ガーベラを

// ・色 1, 色 2, ..., 色 N, 色 1, 色 2, ..., 色 N

// という順番に並べ替えたいと考えています。
// 最小で何回の操作が必要になるでしょうか。

import java.util.*;
public class garbera_sort2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        ArrayList<Integer> list =new ArrayList<>();
        
        
        for(int i=0;i<N*2;i++){
            list.add(sc.nextInt());
        }
        
        Integer count=0;
        Integer index=0;
        while(index<list.size()){
            for(int i=1;i<=N;i++){
                if(list.get(index)==i){
                index++;
                }else{
                    for(int j=index+1;j<list.size();j++){
                        if(list.get(j)==i){
                            for(int k=j-1;index<=k;k--){
                                
                                Integer temp=list.get(k);
                                list.set(k,list.get(j));
                                list.set(j,temp);
                                count++;
                                j--;
                                
                            }
                        index++;
                        break;
                        
                        }
                        
            
                    }
                }
    }
}
        System.out.println(count);
       
    }
}
