package ex02;

public class JuminCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "123456-1234567";
		int last = Integer.valueOf(data.substring(13,14));
		int n1 = Integer.valueOf(data.substring(0,1))* 2; 
        int n2 = Integer.valueOf(data.substring(1,2))* 3; 
        int n3 = Integer.valueOf(data.substring(2,3))* 4; 
        int n4 = Integer.valueOf(data.substring(3,4))* 5; 
        int n5 = Integer.valueOf(data.substring(4,5))* 6; 
        int n6 = Integer.valueOf(data.substring(5,6))* 7; 
        int n7 = Integer.valueOf(data.substring(7,8))* 8; 
        int n8 = Integer.valueOf(data.substring(8,9))* 9; 
        int n9 = Integer.valueOf(data.substring(9,10))* 2; 
        int n10 = Integer.valueOf(data.substring(10,11))* 3; 
        int n11 = Integer.valueOf(data.substring(11,12))* 4; 
        int n12 = Integer.valueOf(data.substring(12,13))* 5;
        int n = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12;
        
        int n13 = (11-(n%11))%10;
                if(last == n13){
                    System.out.println("맞다");
                }else{
                    System.out.println("틀리다");
                    System.out.printf("계산식:"+n13 + "마지막자리수:"+last);
                }
	}

}
