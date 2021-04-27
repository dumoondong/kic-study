public class ConstantEx01{
    public static void main(String[] args){
        //기본 식별자(이름 규칙) - 에러

        //변수  : 소문자 -팀간 내부룰
        //intnumber => intNumber
        int i1=10;
        //상수 : 대문자
        //intnumber => Int_Number
        final int I2=20;

        System.out.println(i1);
        System.out.println(I2);

    }
}