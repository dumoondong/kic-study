public class ControlEx03{
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

      int data=10;
        switch(data){
          case 10:
            System.out.println("10");
            break;
          case 20:
            System.out.println("20");
            break;  
          case 30:
            System.out.println("30");
            break;
          default:
            System.out.println("기타");  
      }

        String data2 = "30";
        switch(data2){
          case "10":
            System.out.println("10");
            break;
          case "20":
            System.out.println("20");
            break;  
          case "30":
            System.out.println("30");
            break;
          default:
            System.out.println("기타");  
      }
      System.out.println("끝");
    }
}