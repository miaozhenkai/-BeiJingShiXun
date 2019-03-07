package com.mzk.atm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Function{
	static String username;
	static String password;
	static double money;
	static String address;
	Set<String> set;
	Scanner scan=new Scanner(System.in);
	Properties p=new Properties();
	InputStream in=Function.class.getResourceAsStream("/UserInfo/UserAddress.properties");
	public void readProperties() throws Exception {
		p.load(in);
		set=p.stringPropertyNames();	
	}
	public void writeProperties() throws Exception {
		p.load(in);
		p.setProperty(username, "src/UserInfo/"+username+".txt");
		OutputStream out = new FileOutputStream("src/UserInfo/UserAddress.properties");
		p.store(out, "key-value");
		address=p.getProperty(username);
		writeUserInfo();
		out.close();
	}
	public  void writeUserInfo() throws Exception {
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setMoney(money);
		ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(address));
		out.writeObject(u);
	}
	public void readUserInfo() throws Exception {
		p.load(in);
		address=p.getProperty(username);
		System.out.println(username);
		ObjectInputStream in =new ObjectInputStream(new FileInputStream(address));
		User u=(User)in.readObject();	
		username=u.getUsername();
		password=u.getPassword();
		money=u.getMoney();
	}
	public void title() {
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|     欢迎使用mzk的ATM     |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		try {
			readProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("1登录");
		System.out.println("2注册");
		int a=scan.nextInt();
		if(a==1) {
			login();
		}
		if(a==2) {
			signup();
		}
		else {
			System.err.println("输入有误，请重新输入");
			title();
			}
	}
	public void signup() {
		System.out.println("请输入用户名：");
		username=scan.next();
		System.out.println("请输入密码：");
		password=scan.next();
		money=0;
		try {
			writeProperties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("注册成功\n");
		System.err.println(address);
		title();
	}
	public void login(){
		
		System.out.print("请输入您的账号：");	
		try {
			readProperties();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String inputusername=scan.next();
		if(set.contains(inputusername)){
			username=inputusername;
			address=p.getProperty(username);
			System.out.println(address);
			try {
				readUserInfo();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print("\n请输入您的密码：");
			for(int i=0;i<3;i++){
				if(password.equals(scan.next())){
					System.out.println("登录成功\n");
					Home.HomePage();
					break;
				}
				else if(i==2){
					System.err.println("\n密码已输入3次，为了防止您的财产gg，请明天再试。");
					System.exit(0);
				}
				else{
					System.out.print("\n密码不正确！\n请重新输入密码：");
				}
			}				
		}		
		else{
			System.out.println("无用户名，请重新输入\n");	
			login();
		}
	}
	public void drawMoney_1(){
		System.out.println(username);
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.print("|     请输入金额：");
		double a=scan.nextDouble();
		System.out.println();
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		if(a<=money&&a>0){
			money=money-a;
			try {
				writeUserInfo();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|    正在处理，请稍后。。。。。     |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|         交易成功！                    |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			Home.HomePage();
		}
		else{
			while(a>money||a<=0){
				if(a>money){
					System.out.println("余额不足请重新输入");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     请再次输入金额：");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}
				else if(a<=0){
					System.out.println("只能输入正数");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     请再次输入金额：");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}
				else{
					System.out.println("只能输入数字，不能");
					System.out.println("|-----------------------|");
					System.out.println("|                       |");
					System.out.print("|     请再次输入金额：");
					a=scan.nextDouble();
					System.out.println();
					System.out.println("|                       |");
					System.out.println("|-----------------------|");
				}		
			}
			money=money-a;
			try {
				writeUserInfo();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|    正在处理，请稍后。。。。。     |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|         交易成功！                    |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			Home.HomePage();
		}
	}
	public void inquire_2(){
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|    正在处理，请稍后。。。。。    |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|  当前账户："+username+"           |");
		System.out.println("|-----------------------|");
		System.out.println("|  当前余额："+money+"RMB      |");
		System.out.println("|                       |");
		System.out.println("|  1.返回                                              |");
		System.out.println("|-----------------------|");
		Scanner scan=new Scanner(System.in);	
		System.out.print("请输入功能序列号：");
		int a=scan.nextInt();
		if(a==1){
			Home.HomePage();
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
		Home.HomePage();
	}
	public void saveMoney_3(){
		System.out.print("请输入金额:");
		double b=scan.nextDouble();
		if(b>0){
			money=money+b;
			try {
				writeUserInfo();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("|-----------------------|");
			System.out.println("|                       |");
			System.out.println("|       正在处理请稍后                  |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|       当前账户"+username+"       |");
			System.out.println("|-----------------------|");
			System.out.println("|    当前余额："+money+"RMB    |");
			System.out.println("|                       |");
			System.out.println("|    1.返回                                        |");
			System.out.println("|-----------------------|");
			System.out.print("请输入功能号:");
			int a=scan.nextInt();
			if(a==1){
				Home.HomePage();
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
			}Home.HomePage();
		}
		else{
			while(b<=0){
				if(b<=0){
					System.out.println("只能输入正整数\n请重新输入金额");
					b=scan.nextDouble();
				}
				else{
					System.out.println("只能输入正整数，切不能输入字母。\n请重新输入金额");
					b=scan.nextDouble();
				}	
			}
		}						
	}
	/*public void transfer_4(){
		System.out.print("\n请输入对方的账号:");
		if(getUsername2().equals(scan.next())){
			System.out.print("转账金额：");
			double a=scan.nextDouble();
			if(a<=getMoney()&&a>0){
				setMoney(getMoney()-a);
				System.out.println();
				System.out.println("|-----------------------|");
				System.out.println("|                       |");
				System.out.println("|    正在处理，请稍后。。。。。     |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				System.out.println("|-----------------------|");
				System.out.println("|                       |");
				System.out.println("|         转账成功！                    |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				Home.HomePage();
			}
			else{
				while(a>getMoney()||a<=0){
					if(a>getMoney()){
						System.out.print("余额不足请重新输入\n请再次输入金额：");
						a=scan.nextDouble();	
					}
					else if(a<=0){
						System.out.print("只能输入正数\n请再次输入金额：");
						a=scan.nextDouble();
					}
					else{
						System.out.print("只能输入数字，不能输入字母.\n请再次输入金额：");
						a=scan.nextDouble();
					}		
				}
				setMoney(getMoney()-a);
				System.out.println();
				System.out.println("|-----------------------|");
				System.out.println("|                       |");
				System.out.println("|    正在处理，请稍后。。。。。     |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				System.out.println("|-----------------------|");
				System.out.println("|                       |");
				System.out.println("|         转账成功！                    |");
				System.out.println("|                       |");
				System.out.println("|-----------------------|");
				System.out.println();
				Home.HomePage();
			}
		}
		else{
			System.out.println("\n账号不存在");
			transfer_4();
		}
	}*/
	public void exit_5(){
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|  退出成功，欢迎你再次使用ATM  |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.exit(0);
	}
}