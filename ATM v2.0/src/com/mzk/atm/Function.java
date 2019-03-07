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
		System.out.println("|     ��ӭʹ��mzk��ATM     |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		try {
			readProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("1��¼");
		System.out.println("2ע��");
		int a=scan.nextInt();
		if(a==1) {
			login();
		}
		if(a==2) {
			signup();
		}
		else {
			System.err.println("������������������");
			title();
			}
	}
	public void signup() {
		System.out.println("�������û�����");
		username=scan.next();
		System.out.println("���������룺");
		password=scan.next();
		money=0;
		try {
			writeProperties();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ע��ɹ�\n");
		System.err.println(address);
		title();
	}
	public void login(){
		
		System.out.print("�����������˺ţ�");	
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
			System.out.print("\n�������������룺");
			for(int i=0;i<3;i++){
				if(password.equals(scan.next())){
					System.out.println("��¼�ɹ�\n");
					Home.HomePage();
					break;
				}
				else if(i==2){
					System.err.println("\n����������3�Σ�Ϊ�˷�ֹ���ĲƲ�gg�����������ԡ�");
					System.exit(0);
				}
				else{
					System.out.print("\n���벻��ȷ��\n�������������룺");
				}
			}				
		}		
		else{
			System.out.println("���û���������������\n");	
			login();
		}
	}
	public void drawMoney_1(){
		System.out.println(username);
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.print("|     �������");
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
			Home.HomePage();
		}
		else{
			while(a>money||a<=0){
				if(a>money){
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
			money=money-a;
			try {
				writeUserInfo();
			} catch (Exception e) {
				e.printStackTrace();
			}
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
			Home.HomePage();
		}
	}
	public void inquire_2(){
		System.out.println("|-----------------------|");
		System.out.println("|                       |");
		System.out.println("|    ���ڴ������Ժ󡣡�������    |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.out.println();
		System.out.println("|-----------------------|");
		System.out.println("|  ��ǰ�˻���"+username+"           |");
		System.out.println("|-----------------------|");
		System.out.println("|  ��ǰ��"+money+"RMB      |");
		System.out.println("|                       |");
		System.out.println("|  1.����                                              |");
		System.out.println("|-----------------------|");
		Scanner scan=new Scanner(System.in);	
		System.out.print("�����빦�����кţ�");
		int a=scan.nextInt();
		if(a==1){
			Home.HomePage();
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
		Home.HomePage();
	}
	public void saveMoney_3(){
		System.out.print("��������:");
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
			System.out.println("|       ���ڴ������Ժ�                  |");
			System.out.println("|                       |");
			System.out.println("|-----------------------|");
			System.out.println();
			System.out.println("|-----------------------|");
			System.out.println("|       ��ǰ�˻�"+username+"       |");
			System.out.println("|-----------------------|");
			System.out.println("|    ��ǰ��"+money+"RMB    |");
			System.out.println("|                       |");
			System.out.println("|    1.����                                        |");
			System.out.println("|-----------------------|");
			System.out.print("�����빦�ܺ�:");
			int a=scan.nextInt();
			if(a==1){
				Home.HomePage();
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
			}Home.HomePage();
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
	/*public void transfer_4(){
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
				Home.HomePage();
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
				Home.HomePage();
			}
		}
		else{
			System.out.println("\n�˺Ų�����");
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
		System.out.println("|  �˳��ɹ�����ӭ���ٴ�ʹ��ATM  |");
		System.out.println("|                       |");
		System.out.println("|-----------------------|");
		System.exit(0);
	}
}