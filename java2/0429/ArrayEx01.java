class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title=title;
        this.author = author;
        this.price = price;
    }
}

public class ArrayEx01{
    public static void main(String[] args){
        //기본자료형의 이차원 구조
        int[][] arr1 = new int[3][];
        arr1[0] = new int[] {10,20,30};
        arr1[1] = new int[] {10,20,30};
        arr1[2] = new int[] {10,20,30};

        // 일차원 <-객체 = 이차원 배열
        Book[] arr2 = new Book[3];
        arr2[0] = new Book("java", "홍길동",1000);
        arr2[1] = new Book("jsp", "박문수",2000);
        arr2[2] = new Book("spring", "이몽룡",3000);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}