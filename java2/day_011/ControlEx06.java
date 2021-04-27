public class ControlEx06{
    public static void main(String[] args){
        System.out.println("시작");
        
        for(int i=1; i<=10; i++){
           for(int j=1; j<i; j++){
               System.out.print("*");
           }
           System.out.println("");
        }
        System.out.println("끝");
    }
}