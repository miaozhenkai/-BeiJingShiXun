package com.mzk.atm;

import java.util.Scanner;

public class Home {
	public static void HomePage(){
		Scanner scan=new Scanner(System.in);
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|     ��ӭʹ��mzk��ATM     |");
		System.out.println("|             ���������         |");
		System.out.println("|  1.ȡ��                                              |");
		System.out.println("|  2.��ѯ                                              |");
		System.out.println("|  3.ʵʱ���                                      |");
		System.out.println("|  4.ת��(gg)                                              |");
		System.out.println("|  5.�˳�                                              |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		Function f=new Function();
		System.out.print("�����빦�����кţ�");
		switch(scan.nextInt()){
			case 1 :f.drawMoney_1();break;
			case 2 :f.inquire_2();break;
			case 3 :f.saveMoney_3();break;
			//case 4 :f.transfer_4();break;
			case 5 :f.exit_5();break;
			default:System.err.print("��������\n");HomePage();break;
		}
	}
	
	

}
