package com.mzk.atm;
import java.util.Scanner;
public class DengLu extends YongHu{
	public void dengLu(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|     ��ӭʹ��mzk��ATM     |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.out.print("�����������˺ţ�");	
		if(getUsername().equals(scan.next())){
			System.out.print("\n�������������룺");
			for(int i=0;i<3;i++){
				if(getPassword().equals(scan.next())){
					System.out.println("��¼�ɹ�\n");
					z.zhuYe();
					break;
				}
				else if(i==2){
					System.out.println("\n����������3�Σ�Ϊ�˷�ֹ���ĲƲ�gg�����������ԡ�");
				}
				else{
					System.out.print("\n���벻��ȷ��\n�������������룺");
				}
			}				
		}		
		else{
			System.out.println("���û���");	
		}
	}
}
