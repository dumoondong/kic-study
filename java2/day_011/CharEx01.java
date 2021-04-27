public class CharEx01{
    public static void main(String[] args){
        //문자형
        char c1 = 'a';
        System.out.println(c1);

        char c2 = '한';
        System.out.println(c2);

        //문자(영문자,특수문자)코드 - ASCII
        char c3 = 97;
        System.out.println(c3);
        
        //다국어 - 유니코드
        char c4 = '\uc790';
        System.out.println(c4);

        //escape 코드
        //\t - tag, \n -enter, \' - ', \" -"
        
        System.out.print("abc");
        System.out.print('\n');         //println()
        System.out.print("cde");
        
    }
}