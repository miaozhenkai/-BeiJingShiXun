package com.mzk.atm;

import java.util.Scanner;

public class CunKuan3 extends YongHu{
	public void cunKuan(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.print("请输入金额:");
		double b=scan.nextDouble();
		if(b>0){
			setMoney(getMoney()+b);
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|       正在处理请稍后                  |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|       当前账户"+getUsername()+"       |");
			System.out.println("|-----------------------|");
			System.out.println("|    当前余额："+getMoney()+"RMB    |");
			System.out.println("|                       |");
			System.out.println("|    1.返回                                        |");
			System.out.println("|-----------------------|");
			System.out.print("请输入功能号:");
			int a=scan.nextInt();
			if(a==1){
				z.zhuYe();
				}
			else{
				while(a!=1){
					if(a<1){
						System.out.print("只能输入正整数。\n请重新输入：");
						a=scan.nextInt();
					}
					else if(a>1){
						System.out.print("只能输入正确的序号，进行选择！\n请重新输入：");
						a=scan.nextInt();
					}
					else{
						System.out.print("只能输入正整数，切不能输入字母。\n请重新输入：");
						a=scan.nextInt();
					}		
				}
			}z.zhuYe();
		}
		else{
			while(b<=0){
				if(b<=0){
					System.out.println("只能输入正整数\n请重新输入金额");
					b=scan.nextDouble();
				}
				else{
					System.out.println("只能输入正整数，切不能输入字母。\n请重新输入金额");
					b=scan.nextDouble();
				}	
			}
		}						
	}
}
