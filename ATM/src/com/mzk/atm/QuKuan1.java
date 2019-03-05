package com.mzk.atm;

import java.util.Scanner;

public class QuKuan1 extends YongHu{
	public void quKuan(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.print("|     请输入金额：");
		double a=scan.nextDouble();
		System.out.println();
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		if(a<=getMoney()&&a>0){
			setMoney(getMoney()-a);
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|    正在处理，请稍后。。。。。     |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|         交易成功！                    |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			z.zhuYe();
		}
		else{
			while(a>getMoney()||a<=0){
				if(a>getMoney()){
					System.out.println("余额不足请重新输入");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     请再次输入金额：");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}
				else if(a<=0){
					System.out.println("只能输入正数");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     请再次输入金额：");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}
				else{
					System.out.println("只能输入数字，不能");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     请再次输入金额：");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}		
			}
			setMoney(getMoney()-a);
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|    正在处理，请稍后。。。。。     |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|         交易成功！                    |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			z.zhuYe();
		}		
	}

}
