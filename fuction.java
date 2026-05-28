// public class fuction{

//     void getsoap(int val){
//         System.out.println("purchased the soap");
//         System.out.println(val);
//     }

//     void chocalate(int val){
//         System.out.println("the chacalte price is " + val);
//     }

//     void icecream(int val){
//         System.out.println("the icecream price is " + val);
//     }


// public static void main(String[] args){
//     fuction obj1 = new fuction();
//     obj1.getsoap(30);
//     obj1.chocalate(40);
//     obj1.icecream(50);
// }}

// public class fuction{
//     void sum(int num1 ,int num2){
//         System.out.println(num1+num2);

//     }

// public static void main(String[] args) {
//     fuction obj1 = new fuction();
//     obj1.sum(20,30);
// }
// }

// public class fuction{
//     int sum(int num1 ,int num2){
//         int a = num1+num2;
//         return a;

//     }

// public static void main(String[] args) {
//     fuction obj1 = new fuction();
//     int remainder = obj1.sum(20,30);
//     System.out.println(remainder);
// }
// }

public class fuction{
    String getname(String name){
        return name;

    }
    int getphone(int pn){
        return pn;
    }

public static void main(String[] args) {
    fuction obj1 = new fuction();
    String remainder = obj1.getname("karthi");
    int remainder1 = obj1.getphone(12345566);
    System.out.println(remainder);
    System.out.println(remainder1);
}
}