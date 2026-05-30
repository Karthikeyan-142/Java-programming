class reverse{
    public static void main(String[] args){
        int a = 1234;
        int count = 0;

        while(a > 0){
            int digit = a % 10;
            count  = (count*10) + digit ;
            a = a /10;
            


        }
         System.out.println(count);
       
    }
}