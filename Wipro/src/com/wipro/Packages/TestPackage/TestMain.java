package com.wipro.Packages.TestPackage;
public class TestMain {
public static void main(String[] args) {
	Foundation f=new Foundation();
	f.setVar1(7);
	System.out.println(f.getVar1());
	f.var2=8;
	f.var3=9;
	f.var4=10;
	System.out.println(f.var2);
	System.out.println(f.var3);
	System.out.println(f.var4);
}
}
