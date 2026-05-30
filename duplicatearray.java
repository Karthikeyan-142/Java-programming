import java.util.*;
class duplicatearray{
    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);
        int size  = sc.nextInt();
        int[] num1 = new int[size];

        for (int i=0;i<size;i++){
            num1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num1));
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;i++){
                if (num1[i] == num1[j+1]){
                    System.out.println("true");
                }
            }
        }
        System.out.println("false");


    }
}