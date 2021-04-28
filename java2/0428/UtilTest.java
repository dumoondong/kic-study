class Util{
    void doCalculator(int data1,String data2,int data3){
        if(data2 == "+"){
            System.out.printf("%d + %d = %d",data1,data3,(data1+data3));
        }else if(data2 == "-"){
            System.out.printf("%d - %d = %d",data1,data3,(data1-data3));
        }else if(data2 == "*"){
            System.out.printf("%d * %d = %d",data1,data3,(data1*data3));
        }else if(data2 == "/"){
            System.out.printf("%d / %d = %d",data1,data3,(data1/data3));
        }
    }
}
public class UtilTest{
    public static void main(String[] args){
        Util u = new Util();
        u.doCalculator(2,"*",5);
    }
}