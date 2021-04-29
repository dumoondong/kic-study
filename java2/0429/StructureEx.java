class Structure{
    //멤버 필드
    //인스턴스 /클래스(스태딕)
    //지역변수 (메서드 안에 선언된 변수 + 초기화)
    String instanceVar = "instance";
    static String classVar = "instance";
    //메서드
    //인스턴스/클래스(스태딕)
    
    void doFunc01(){
        //this
        //overloading
        System.out.println("doFunc1() 호출");
    }
    static void doFunc02(){
        System.out.println("doFunc2() 호출");
    }
}
public class StructureEx{
    //특수 메서드
    public static void main(String[] args){
        System.out.println(Structure.classVar);
        Structure.doFunc02();

        Structure s = new Structure();
        System.out.println(s.instanceVar);
        s.doFunc01();
    }
}