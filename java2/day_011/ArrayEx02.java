public class ArrayEx02{
    public static void main(String[] args){
        System.out.println("시작");
        
        //선언과 초기화
        int[] arr1 = new int[] {10,20,30,40};
        int[] arr2 = {10,20,30,40};
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        //향상된 for
        for(int data : arr2){
            System.out.println(data);
        }

        String[] arr3 ={"10","20","30","40"};

        //향상된 for
        for(String data2 : arr3){
            System.out.println(data2);
        }
        System.out.println("끝");
    }
}