class Variables{
    String data1 ="data1";
  
    void printVariables(){
        String data1= "data12";
        String data2= "data2";
        System.out.println( data1 );
        //this - 자기참조를 나타내는 예약어
        System.out.println( this.data1 );
        System.out.println("this:"+this);
        System.out.println( data2 );
    }

    void doFunc(){
        System.out.println("doFunc() 호출");
    }
}
public class VariablesEx03{
    public static void main(String[] args){

        Variables v1 = new Variables();
        
        v1.printVariables();
        System.out.println("v1:" +v1);
    }
}