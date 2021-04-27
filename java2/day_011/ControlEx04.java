public class ControlEx04{
    public static void main(String[] args){
      /*
        조건에 의한 분기
            if ~ else ~
            if ~ else if ~ else ~
            switch ~ case ~default ~
        조건에 의한 반복
            for
            while
            do ~ while
        continue,break
      */
        
        System.out.println("시작");
        //switch - byte, short, int, char /String
        //행
        for(int i=1; i<=5; i++){
            // System.out.println(i);
            //열
            for(int j=1; j<=5; j=j+2){
                System.out.println(i+":"+j);
            }
        }
        System.out.println("끝");
    }
}