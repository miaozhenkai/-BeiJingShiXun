package com.mzk.atm;

import java.util.Scanner;

public class ZhuanZhang4 extends YongHu{
	public void zhuanZhang(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.print("\n请输入对方的账号:");
		if(getUsername2().equals(scan.next())){
			System.out.print("转账金额：");
			double a=scan.nextDouble();
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
				System.out.println("|         转账成功！                    |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				z.zhuYe();
			}
			else{
				while(a>getMoney()||a<=0){
					if(a>getMoney()){
						System.out.print("余额不足请重新输入\n请再次输入金额：");
						a=scan.nextDouble();	
					}
					else if(a<=0){
						System.out.print("只能输入正数\n请再次输入金额：");
						a=scan.nextDouble();
					}
					else{
						System.out.print("只能输入数字，不能输入字母.\n请再次输入金额：");
						a=scan.nextDouble();
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
				System.out.println("|         转账成功！                    |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				z.zhuYe();
			}
		}
		else{
			System.out.println("\n账号不存在");
			zhuanZhang();
		}
	}
}
