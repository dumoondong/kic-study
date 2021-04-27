public class TypeCastingEx02{
    public static void main(String[] args){
       //수동형변환
       int i1=10;
    //    short s1=i1;
       short s1=(short)i1;

       double d1=10.0f;
       float f1=(float)d1;
       float f2=(float)10.0;

       int i2='A';
       char c1=(char)i2;

       System.out.println(c1);
       System.out.println((char)97);
    }
}