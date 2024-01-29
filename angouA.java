import java.util.*;

public class angouA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> allformer = new ArrayList<>();
        ArrayList<Integer> alllater = new ArrayList<>();
        ArrayList<Integer> field1 = new ArrayList<>();
        ArrayList<Integer> field2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int int1 = sc.nextInt();
            int int2 = sc.nextInt();
            allformer.add(int1);
            alllater.add(int2);
        }

        int result = 0; // Initialize the result variable
        int count = 0;
        int allcount = 0;

        // Calculate the sum of allformer elements
        for (int i = 0; i < N; i++) {
            allcount += allformer.get(i);
        }

        for (int i = 0; i < N; i++) {
            int int1 = allformer.get(i);
            int int2 = alllater.get(i);

            
            for (int k = 0; k < int1; k++) {
                if (count <allcount/2) {
                    field1.add(int2); // Add to field1 based on the condition
                    count ++;
                }else {
                    field2.add(int2); // Add to field2 based on the condition
                }
                
            }
            }
            

        for (int i = 0; i < allcount/2; i++) {
            int int1 = field1.get(i);
            int int2 = field2.get(i);

            result += Math.abs(int1 - int2);
              
        }
        System.out.println(result);

      
        sc.close();
    
}}