public class ArrayEx01{
    public static void main(String[] args){
        System.out.println("시작");
        
        /*
            배열의 선언
            
            데이터형[] 배열변수명;
            데이터형 배열변수명[];
        */
        int[] arr1;
        int arr2[];
        /*
            배열의 생성

            배열변수명 = new 데이터형[갯수];
        */
        arr1 = new int[3];
        int[] arr3 = new int [4];

        System.out.println(arr1.length);
        System.out.println(arr3.length);

        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        // Runtime error(Exception)
        // System.out.println(arr1[3]);
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("끝");
    }
}