public class TypeCastingEx01{
    public static void main(String[] args){
       /*
            형변환
                * byte -> double
                자동형변환
                    작은 자료형 -> 큰 자료형
                수동형변환(TypeCasting) -   정확도 손실
                    큰 자료형 -> 작은 자료형
       */
       //자동형변환
       short s1=10;
       int i1=s1;
       System.out.println(i1);

       float f1=10.0f;
       double d1=f1;
       System.out.println(d1);

       char c1='A';
       int i2=c1;
       System.out.println(i2);
    }
}