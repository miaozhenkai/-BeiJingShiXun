package com.mzk.atm;

import java.util.Scanner;

public class ChaXun2 extends YongHu{
	public void chaXun(){
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|    正在处理，请稍后。。。。。    |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|  当前账户："+getUsername()+"           |");
		System.out.println("|-----------------------|");
		System.out.println("|  当前余额："+getMoney()+"RMB      |");
		System.out.println("|                       |");
		System.out.println("|  1.返回                                              |");
		System.out.println("|-----------------------|");
		ZhuYe z=new ZhuYe();
		Scanner scan=new Scanner(System.in);	
		System.out.print("请输入功能序列号：");
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
		}
		z.zhuYe();	
	}
}
