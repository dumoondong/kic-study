class Modifier{
    //멤버필드 = 데이터
   //public String data1="public";
   private String data1 = "private";

   //메서드 - 제어문
   //멤버필드 접근메서드 : getter/setter
   //getter : get멤버변수명(대문자로 시작)
   //setter : set멤버변수명(대문자로 시작)
   public void setData1(String data1){
       this.data1 = data1;
   //private void doFunc4(){System.out.println("doFunc4() 호출");}
   }
   public String getData1(){
       return data1;
   }
}

public class ModifierEx02{
    public static void main(String[] args){
        Modifier m = new Modifier();
        m.setData1("데이터");
        System.out.println(m.getData1());
    }
}