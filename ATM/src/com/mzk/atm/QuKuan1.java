package com.mzk.atm;

import java.util.Scanner;

public class QuKuan1 extends YongHu{
	public void quKuan(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.print("|     �������");
		double a=scan.nextDouble();
		System.out.println();
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		if(a<=getMoney()&&a>0){
			setMoney(getMoney()-a);
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|    ���ڴ������Ժ󡣡�������     |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|         ���׳ɹ���                    |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			z.zhuYe();
		}
		else{
			while(a>getMoney()||a<=0){
				if(a>getMoney()){
					System.out.println("��������������");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     ���ٴ������");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}
				else if(a<=0){
					System.out.println("ֻ����������");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     ���ٴ������");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}
				else{
					System.out.println("ֻ���������֣�����");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     ���ٴ������");
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
			System.out.println("|    ���ڴ������Ժ󡣡�������     |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|         ���׳ɹ���                    |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			z.zhuYe();
		}		
	}

}
