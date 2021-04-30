
public class Util {
	void doCalculator(int num1,String oper,int num2){
		int result = 0;
		
		switch(oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		}
			System.out.println(num1+""+oper+""+num2+"="+result);
		}
	}
