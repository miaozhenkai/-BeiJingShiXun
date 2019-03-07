package com.mzk.atm;

import java.util.Scanner;

public class Home {
	public static void HomePage(){
		Scanner scan=new Scanner(System.in);
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|     欢迎使用mzk的ATM     |");
		System.out.println("|             苗先生你好         |");
		System.out.println("|  1.取款                                              |");
		System.out.println("|  2.查询                                              |");
		System.out.println("|  3.实时存款                                      |");
		System.out.println("|  4.转账(gg)                                              |");
		System.out.println("|  5.退出                                              |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		Function f=new Function();
		System.out.print("请输入功能序列号：");
		switch(scan.nextInt()){
			case 1 :f.drawMoney_1();break;
			case 2 :f.inquire_2();break;
			case 3 :f.saveMoney_3();break;
			//case 4 :f.transfer_4();break;
			case 5 :f.exit_5();break;
			default:System.err.print("输入有误\n");HomePage();break;
		}
	}
	
	

}
