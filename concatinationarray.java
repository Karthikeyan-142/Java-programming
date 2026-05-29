// import java.util.*;


// class concatinationarray{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] nums = new int[size];
//         int val = nums.length;
//         int[] num2 = new int[val*2];
//         for (int i=0;i<val;i++){
//             nums[i] = sc.nextInt();
//         }
//         // System.out.println(nums);
//         for (int i=0;i<val;i++){
//             num2[i] = nums[i];
//             num2[size+i] = nums[i];
//         }
//         System.out.println(Arrays.toString(num2));
//     }
// }
import java.util.*;
class concatinationarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        int[] num1 = new int[size*2];

        for (int i=0;i<size;i++){
            num[i] = sc.nextInt();
        
        }
        System.arraycopy(num,0,num1,0,size); 
        System.arraycopy(num,0,num1,size,size);
        System.out.println(Arrays.toString(num1));




    }

}