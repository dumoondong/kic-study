public class ArrayEx02{
    public static void main(String[] args){
        System.out.println("시작");
        
        //2차원 이상에서 사용하는 가변배열
        //int[][] arr1 = {{10,20,30},{40,50},{60}};

        int[][] arr1 = new int[3][];

        // arr1[0] = new int[3];
        // arr1[1] = new int[2];
        // arr1[2] = new int[1];
        arr1[0] = new int[] {10,20,30};
        arr1[1] = new int[] {40,50};
        arr1[2] = new int[] {60};

        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);

        System.out.println("끝");
    }
}