import java.util.*;

public class origamiC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Vsize = sc.nextInt();
        int Hsize=Vsize;
        sc.nextLine();
        
        int FoldSize = 0;
        for (int i = 0; i < N-1 ; i++) {
            int OverlapLength = sc.nextInt();
            FoldSize=Vsize-OverlapLength;
            Hsize+=FoldSize;
       
        }
        sc.close();
        System.out.println(Hsize*Vsize);
        
    }

}