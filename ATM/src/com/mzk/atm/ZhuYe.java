package com.mzk.atm;

import java.util.Scanner;

public class ZhuYe {
	public void zhuYe(){
		Scanner scan=new Scanner(System.in);
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|     ��ӭʹ��mzk��ATM     |");
		System.out.println("|             ���������         |");
		System.out.println("|  1.ȡ��                                              |");
		System.out.println("|  2.��ѯ                                              |");
		System.out.println("|  3.ʵʱ���                                      |");
		System.out.println("|  4.ת��                                              |");
		System.out.println("|  5.�˳�                                              |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		QuKuan1 q1=new QuKuan1();
		ChaXun2 c2=new ChaXun2();
		CunKuan3 c3=new CunKuan3();
		ZhuanZhang4 z4=new ZhuanZhang4();
		TuiChu5 t5=new TuiChu5();
		System.out.print("�����빦�����кţ�");
		switch(scan.nextInt()){
			case 1 :q1.quKuan();break;
			case 2 :c2.chaXun();break;
			case 3 :c3.cunKuan();break;
			case 4 :z4.zhuanZhang();break;
			case 5 :t5.tuiChu();break;
			default:System.out.print("��������");zhuYe();break;
		}
	}
	
	

}
