import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
class List{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        int a=4;

        for(int i=0;i<a;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
       
    }
}