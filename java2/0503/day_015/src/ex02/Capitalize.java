package ex02;

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//절차적 프로그램
		
		//입력
		if(args.length != 1) {
			System.out.println("입력갯수가 잘못되었습니다.");
		}else {
			//처리
//			String[] names = args[0].split(" ");
//			String result = "";
//			for(String name : names) {
//				//System.out.println(name);
//				result += name.substring(0,1).toUpperCase() + name.substring(1)+" ";
//			}
//			//출력
//			System.out.println(result);
			
			Util u = new Util(args[0]);
			System.out.println(u.capitalizeName());
		}
	}

}
