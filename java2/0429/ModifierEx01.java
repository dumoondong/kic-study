class Modifier{ 
   public String data1="public";
   protected String data2="protected";
   String data3 = "default";
   //private String data4 = "private";

   void viewData(){
       System.out.println(this.data1);
   }

   public void doFunc1(){System.out.println("doFunc1() 호출");}
   protected void doFunc2(){System.out.println("doFunc2() 호출");}
   void doFunc3(){System.out.println("doFunc3() 호출");}
   private void doFunc4(){System.out.println("doFunc4() 호출");}
   
}

public class ModifierEx01{
    public static void main(String[] args){
        Modifier m = new Modifier();
        System.out.println(m.data1);
        System.out.println(m.data2);
        System.out.println(m.data3);
       // System.out.println(m.data4);

       m.viewData();

       m.doFunc1();
       m.doFunc2();
       m.doFunc3();
       //m.doFunc4();
    }
}