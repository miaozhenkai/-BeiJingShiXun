package com.mzk.atm;
import java.util.Scanner;
public class DengLu extends YongHu{
	public void dengLu(){
		Scanner scan=new Scanner(System.in);
		ZhuYe z=new ZhuYe();
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|     欢迎使用mzk的ATM     |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.out.print("请输入您的账号：");	
		if(getUsername().equals(scan.next())){
			System.out.print("\n请输入您的密码：");
			for(int i=0;i<3;i++){
				if(getPassword().equals(scan.next())){
					System.out.println("登录成功\n");
					z.zhuYe();
					break;
				}
				else if(i==2){
					System.out.println("\n密码已输入3次，为了防止您的财产gg，请明天再试。");
				}
				else{
					System.out.print("\n密码不正确！\n请重新输入密码：");
				}
			}				
		}		
		else{
			System.out.println("无用户名");	
		}
	}
}
