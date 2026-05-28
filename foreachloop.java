// class foreachloop{
//     public static void main(String[] args){
//         int[] arr = {10,20,30,40,50};

//         for (int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }

//         for (int var:arr){
//             System.out.println(var);
//         }

//     }
    
// }

class foreachloop{
    public static void main(String[] args){
        String[] arr = {"one","two","three","four"};

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (String var:arr){
            System.out.println(var);
        }

    }
    
}