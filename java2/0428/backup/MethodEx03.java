class Method{
   //... 가변인자
   void doFunc(String ... args){
       System.out.println(args.length);
       
       for(String arg : args){
           System.out.print(arg + "\t");
       }
       System.out.println();
   }
}
public class MethodEx03{
    public static void main(String[] args){
        Method m = new Method();
       
        m.doFunc("봄");
        m.doFunc("봄","여름");
        m.doFunc("봄","여름","가을");
    }
}