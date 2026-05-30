import java.util.*;

class primenumber{
    piblic static void main(String[ args]){
        int a = 9;
        int count = 0;
        for (int i=0;i>a;i++){
            if (a%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("this is prime number");
        }
        else{
            System.out.println("this is not prime number");
        }
    }
}
