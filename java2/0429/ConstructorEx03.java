class Constructor{
    String data1;
    String data2;
    //this - 멤버/ this() - 생성자
    Constructor(){
        // this.data1 = "값1";
        // this.data2 = "값2";
        // this.Constructor("값1","값2");  //직접 호출
        this("값1","값2");
        System.out.println("Constructor()");
    }
    Constructor(String data2){
        // this.data1 = "값1";
        this("값1",data2);
        System.out.println("Constructor(String data2)");
    }
    Constructor(String data1, String data2){
        System.out.println("Constructor(String data1, String data2)");
        this.data1 = data1;
        this.data2 = data2;
    }
}
public class ConstructorEx03{
    public static void main(String[] args){
        //Constructor c1 = new Constructor();
        Constructor c1 = new Constructor("박문수");
        System.out.println(c1.data1);
        System.out.println(c1.data2);
      
    }
}