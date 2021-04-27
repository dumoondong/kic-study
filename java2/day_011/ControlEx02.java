public class ControlEx02{
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
      int score=80;
      if(score>=90){
          System.out.println("A학점");
      }else if(score>=80){
          System.out.println("B학점");
      }else if(score>=70){
          System.out.println("C학점");
      }else if(score>=60){
          System.out.println("D학점");
      }else{
          System.out.println("F학점");
      }
       System.out.println("끝");
    }
}