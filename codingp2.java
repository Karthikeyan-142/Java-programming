// import java.util.*;

// class codingp2{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         if (a > 15){
//             System.out.println("pass");
//         }
//         else{
//             System.out.println("Fail");
//         }
//     }
// }


import java.util.*;

class codingp2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score < 50){
            System.out.println("You need to improve.");
        }
        else if(score>50 && score < 90 ){
            System.out.println("Good");
        }
        else{
            System.out.println("Excellent");
        }
    }

}