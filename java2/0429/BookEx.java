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

public class BookEx{
    public static void main(String[] args){
        int[] arr1 = new int[3];

        Book[] arr2 = new Book[3];

        Book b1 = new Book("java", "홍길동",1000);
        Book b2 = new Book("jsp", "박문수",2000);
        Book b3 = new Book("spring", "이몽룡",3000);

        arr2[0] = b1;
        arr2[1] = b2;
        arr2[2] = b3;

        System.out.println(arr2.length);

        Book b = arr2[0];
        System.out.println(b.title);
        System.out.println(b.author);

        System.out.println(arr2[0].title);
        System.out.println(arr2[0].author);
        //전체
        for(int i =0; i<arr2.length; i++){
            // System.out.println(arr2[i].title);
            // System.out.println(arr2[i].author);
            // System.out.println(arr2[i].price);
        }
        //향상된 for
        for(Book data : arr2){
            System.out.println(data.title);
            System.out.println(data.author);
            System.out.println(data.price);
        }

    }
}