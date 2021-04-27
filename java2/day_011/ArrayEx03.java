public class ArrayEx03{
    public static void main(String[] args){
        System.out.println("시작");
        
        //이차원 배열
        int[][] arr1;
        arr1 = new int[3][2];
        int[][] arr2= new int[3][2];

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        int[][] arr3 = new int[][] {{10,20},{30,40},{50,60}};
        int[][] arr4 = {{10,20},{30,40},{50,60}};
        
        System.out.println(arr4[0][0]);
        System.out.println(arr4[2][1]);
        //for
        for(int row=0; row<arr3.length; row++){
            for(int col=0; col<arr1[row].length; col++){
                System.out.println("데이터:"+arr1[row][col]);
            }
        }
        System.out.println("끝");
    }
}