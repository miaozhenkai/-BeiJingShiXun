package com.mzk.atm;

import java.util.Scanner;

public class ZhuanZhang4 extends YongHu{
	public void zhuanZhang(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.print("\n������Է����˺�:");
		if(getUsername2().equals(scan.next())){
			System.out.print("ת�˽�");
			double a=scan.nextDouble();
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
				System.out.println("|         ת�˳ɹ���                    |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				z.zhuYe();
			}
			else{
				while(a>getMoney()||a<=0){
					if(a>getMoney()){
						System.out.print("��������������\n���ٴ������");
						a=scan.nextDouble();	
					}
					else if(a<=0){
						System.out.print("ֻ����������\n���ٴ������");
						a=scan.nextDouble();
					}
					else{
						System.out.print("ֻ���������֣�����������ĸ.\n���ٴ������");
						a=scan.nextDouble();
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
				System.out.println("|         ת�˳ɹ���                    |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				z.zhuYe();
			}
		}
		else{
			System.out.println("\n�˺Ų�����");
			zhuanZhang();
		}
	}
}
