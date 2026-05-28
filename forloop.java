// import java.util.*;

// class forloop{
//     public static void main(String[] args){
//         for(int i=5;i>=0;i-=1){
//             System.out.println(i); 
//         }
//     }
// }

// import java.util.*;

// class forloop{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number");
//         int b = sc.nextInt();

//         for (int i=a;i<=b;i++){
//             System.out.println(i);
//         }
//     }
// }


import java.util.*;

class forloop{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        for (int i=a;i<=b;i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}