class Util{
    // void doGugudan(int startDan, int endDan){
    //     for(int i=startDan; i<=endDan; i++){
    //         for(int j=1; j<=9; j++){
    //             System.out.print(i+"X"+j+"="+(i*j)+"\t");
    //         }
    //         System.out.println();
    //     }
    // }
    void doGugudan(int ... dans){
        for(int i : dans){
            for(int j=1; j<=9; j++){
                // System.out.print(i+"X"+j+"="+(i*j)+"\t");
                System.out.printf("%d X %d = %d",i,j,(i*j));
            }
            System.out.println();
        }
    }
}

public class UtilEx01{
    public static void main(String[] args){
        Util u = new Util();
        u.doGugudan(2,5);
    }
}