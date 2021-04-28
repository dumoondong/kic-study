public class ArrayEx01{
    public static void main(String[] args){
        System.out.println("시작");
        
        int[][] arr1 = {{10,20},{30,40},{50,60}};
        
        /*
        for(int row=0; row<arr3.length; row++){
            for(int col=0; col<arr1[row].length; col++){
                System.out.println("데이터:"+arr1[row][col]);
            }
        }
        */
        for(int[] cols : arr1){
            for(int data : cols){
                System.out.println(data);
            }
        }
        System.out.println("끝");
    }
}