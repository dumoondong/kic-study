class Variables{
    //초기화
    //멤버 필드/클래스 멤버 필드- 자동초기화
    //객체 - null;
    //기본 자료형 - 기본값
    String instanceVariable;            //null
    static String classVariable;
    int intVariable;                    //0
    
    void printVariables(){
        //자동 초기화 할 수 없음
        String localVariable= "";
        System.out.println( localVariable );
    }
}
public class VariablesEx02{
    public static void main(String[] args){

        Variables v1 = new Variables();

        System.out.println(v1.instanceVariable);
        System.out.println(v1.intVariable);
        System.out.println(Variables.classVariable);
        
    }
}