import java.util.*;

public class ramen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
       
        int R=0;
        int result=0;
        for(int i=0;i<N;i++){
            R=sc.nextInt();
            
            if(A+B*M>C*R){
                result++;
            }
            
        }
        sc.close();
        System.out.println(result);
        
    }

}