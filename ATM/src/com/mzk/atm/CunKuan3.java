package com.mzk.atm;

import java.util.Scanner;

public class CunKuan3 extends YongHu{
	public void cunKuan(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.print("��������:");
		double b=scan.nextDouble();
		if(b>0){
			setMoney(getMoney()+b);
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|       ���ڴ������Ժ�                  |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|       ��ǰ�˻�"+getUsername()+"       |");
			System.out.println("|-----------------------|");
			System.out.println("|    ��ǰ��"+getMoney()+"RMB    |");
			System.out.println("|                       |");
			System.out.println("|    1.����                                        |");
			System.out.println("|-----------------------|");
			System.out.print("�����빦�ܺ�:");
			int a=scan.nextInt();
			if(a==1){
				z.zhuYe();
				}
			else{
				while(a!=1){
					if(a<1){
						System.out.print("ֻ��������������\n���������룺");
						a=scan.nextInt();
					}
					else if(a>1){
						System.out.print("ֻ��������ȷ����ţ�����ѡ��\n���������룺");
						a=scan.nextInt();
					}
					else{
						System.out.print("ֻ���������������в���������ĸ��\n���������룺");
						a=scan.nextInt();
					}		
				}
			}z.zhuYe();
		}
		else{
			while(b<=0){
				if(b<=0){
					System.out.println("ֻ������������\n������������");
					b=scan.nextDouble();
				}
				else{
					System.out.println("ֻ���������������в���������ĸ��\n������������");
					b=scan.nextDouble();
				}	
			}
		}						
	}
}
