package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.println(">>");
			String expression=scanner.nextLine();
			
			if(expression.equals("quit")){
				break;
			}
			
			String[] tokens = expression.split(" ");
			
			int a1=Integer.parseInt(tokens[0]);
			int b1=Integer.parseInt(tokens[2]);
			switch(tokens[1]) {
				case "+":{
					
					Add a=new Add();
					a.calculate(a1, b1);
					
					break;
				}
				case "-":{
					Sub a=new Sub();
					a.calculate(a1, b1);
					
					break;
				}
				case "*":{
					Mul a=new Mul();
					a.calculate(a1, b1);
					
					break;
				}
				case "/":{
					Div a=new Div();
					a.calculate(a1, b1);
					
					break;
				}
			}
			
		}
		
		scanner.close();
	}
}
