public class OperatorEx01{
    public static void main(String[] args){
      /*
        피연산자 연산자 피연산자 => 결과

        갯수
        단항연산자  :   부호, ++/--
        이항연산자
            산술연산자
                +
            대입연산자
                =
            비교연산자
                >
            논리연산자
                && / || / |
        삼항연산자 : ? :
        산술연산자 = 피연산자(int)
      */
      int i1=10;
      int i2=20;
      int sum1=i1+i2;
      System.out.println(sum1);

      short s1=10;
      short s2=20;
    //   int sum2=s1+s2;
      short sum2=(short)(s1+s2);
      System.out.println(sum2);

      int i3=10;
      int i4=3;
      //
      System.out.println(i3/i4);        //몫
      System.out.println(i3%i4);        //나머지

      System.out.println(i3/(double)i4);
    }
}