package com.mzk.atm;

import java.util.Scanner;

public class ChaXun2 extends YongHu{
	public void chaXun(){
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|    ���ڴ������Ժ󡣡�������    |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|  ��ǰ�˻���"+getUsername()+"           |");
		System.out.println("|-----------------------|");
		System.out.println("|  ��ǰ��"+getMoney()+"RMB      |");
		System.out.println("|                       |");
		System.out.println("|  1.����                                              |");
		System.out.println("|-----------------------|");
		ZhuYe z=new ZhuYe();
		Scanner scan=new Scanner(System.in);	
		System.out.print("�����빦�����кţ�");
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
		}
		z.zhuYe();	
	}
}
