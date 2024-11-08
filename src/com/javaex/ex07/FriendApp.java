package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
      
         
        for(int i = 0; i < friendArray.length; ++i) {
        	String name, hp, shcool;
        	
        	System.out.print("이름: ");
        	name = sc.next();
        	System.out.print("핸드폰: ");
        	hp = sc.next();
        	System.out.print("학교: ");
        	shcool = sc.next();
        	
        	Friend f = new Friend(name, hp, shcool);
        	friendArray[i] = f;
        	
        	System.out.println("------------------");
        }

        
//         친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	Friend f = friendArray[i];
        	f.showInfo();
        	
        	
        }
        

        sc.close();
    }

}
