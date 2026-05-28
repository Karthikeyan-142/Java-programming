
public class constructor{
    int mark;
    void name(String nam){
        System.out.println(nam);
    }
    constructor(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        constructor obj1 = new constructor();
        obj1.mark=20;
        System.out.println(obj1.mark);
        obj1.name("karthi");
        

    }
}
