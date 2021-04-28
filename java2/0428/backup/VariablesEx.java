class Variables{
    //멤버 변수의 종류
    //인스턴스 멤버 변수
    //클랜스(스태틱) 멤버 변수

    //저장 공간의 생성 시점 / 유효시간
    String instanceVariable;
    static String classVariable;

}
public class VariablesEx{
    public static void main(String[] args){
        Variables v1 = new Variables();
        v1.instanceVariable="10";
        v1.classVariable="10";

        System.out.println(v1.instanceVariable);
        System.out.println(v1.classVariable);

        //
        System.out.println(Variables.classVariable);
        Variables.classVariable="40";
        System.out.println(Variables.classVariable);
    }
}