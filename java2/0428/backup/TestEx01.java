public class TestEx01{
    public static void main(String[] args){
        // char A= 'A';
        // for(int i=1; i<=10; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(A);
        //         A=(char)(A+1);
        //     }
        //     A='A';
        //     System.out.println("");
        // }
        for(int i=0;i<=9;i++){
            for(int j=65; j<=65+i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}