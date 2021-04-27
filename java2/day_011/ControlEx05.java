public class ControlEx05{
    public static void main(String[] args){
        System.out.println("시작");
        
        int sum=0;
        for(int i=3; i<=100; i++){
            if(i%3==0){
                sum+=i;
            }
        }
        
        System.out.println("결과:" + sum);
        System.out.println("끝");
    }
}