
// public class constructor{
//     int mark;
//     void name(String nam){
//         System.out.println(nam);
//     }
//     constructor(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args){
//         constructor obj1 = new constructor();
//         obj1.mark=20;
//         System.out.println(obj1.mark);
//         obj1.name("karthi");
        

//     }
// }

public class constructor{
    int mark;
    constructor(){
        System.out.println("think the beauty");
    }

    constructor(int a){
        mark = a;
        System.out.println(mark);
        System.out.println("Hello");
    }
    public static void main(String[] args){
        constructor obj1 = new constructor(10);
        constructor obj2 = new constructor();
        // obj1.mark();
    }
}