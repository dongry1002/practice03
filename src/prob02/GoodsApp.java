package prob02;

import java.util.Scanner;



public class GoodsApp {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Goods[] good=new Goods[3];

		
		for(int i=0;i<3;i++){
			
			good[i]=new Goods();	
	
			
			good[i].setName(scanner.next());
			good[i].setPrice(scanner.nextInt());
			good[i].setStock(scanner.nextInt());
			
			System.out.println(good[0].getName()+"("+"가격:"
			                  +good[0].getPrice()+")이"
					          +good[0].getStock()+"개 입고 되었습니다.");
			

		}
		
		
	}
}
