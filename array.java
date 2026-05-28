// import java.util.*;
// class array{
//     public static void main(String[] args){
//         int[] sc = new int[3];
//         Scanner sa = new Scanner (System.in);
//         sc[0] = sa.nextInt();
//         sc[1] = sa.nextInt();
//         sc[2] = sa.nextInt();
//         // sc[0] = sa.nextInt();
//         System.out.println(Arrays.stream(sc).sum());

//     }
// }

// import java.util.*;

// class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] sa = new int[3];

//         for(int i=0;i <3;i++){
//             sa[i] = sc.nextInt();

//         }
//         System.out.println(Arrays.toString(sa));



// }}

// import java.util.*;

// class array{
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
//         // int[] sa = new int[3];

//         for(int i=1;i <=3;i++){
//             // sa[i] = sc.nextInt();
//             // sa[i] = i * 2;
//             System.out.println(i + "*" + "2" + "=" + i*2);

//         }
        
        



// }}


// import java.util.*;

// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();   
//         }
//         for (int i=0;i <arr.length;i++){
//             int a = arr.length / 2;
//             if (i == a){
//                 System.out.print(arr[i]);
//             }
//         }
       

//     }
// }

import java.util.*;

class array{
    public  static void main(String[] args){

        // for(int i=0;i<3;i++){
        //     for(int j=i;j<=3;j++){

        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        for (int i=0;i<3;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}