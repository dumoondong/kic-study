public class ControlEx08{
    public static void main(String[] args){
        System.out.println("시작");
        
        int i=1;
        while(i<=5){
            i++;
            int j=1;
            while(j<=5){
                j++;
                if(j==3){
                    //break;
                    continue;
                }
                System.out.println(i+":"+j);
            }
        }
        
        System.out.println("끝");
    }
}