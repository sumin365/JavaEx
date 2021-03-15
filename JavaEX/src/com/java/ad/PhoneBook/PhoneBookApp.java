package com.java.ad.PhoneBook;

import java.util.*;


public class PhoneBookApp {
    final int LIST = 1;
    final int INSERT = 2;
    final int DELETE = 3;
    final int SEARCH = 4;
    final int EXIT = 5;
    private Scanner scanner; 
    HashMap<String, Phone>map = new HashMap<String,Phone>();
    private String name, hp, tel;
    public PhoneBookApp() {
    	 scanner  = new Scanner (System.in);
    	
    }
    public void run() {
    	System.out.println("********************************");
		System.out.println("*       전화번호 관리 프로그램       *");
		System.out.println("********************************");
    	while(true) {
    		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
    		System.out.println("--------------------------------");
    		System.out.println(">메뉴 번호 : ");
    		int menu= scanner.nextInt();
    		switch(menu) {
    		case LIST: allnum(); break;
    		case INSERT: insert(); break;
    		case DELETE: delete(); break;
    		case SEARCH: search(); break;
    		case EXIT: System.out.println("프로그램을 종료합니다. ");return;
    		
    		} 
    		

    	}
    }
 
    public void allnum() {
    	System.out.print(false);
    }
    
    
}
