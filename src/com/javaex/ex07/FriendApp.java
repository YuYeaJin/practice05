package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        System.out.println("이름: ");
        
        String name = sc.next();        
//        String hp = sc.next();
//        String shcool = sc.next();
        
        
        
        
        
//        int i = 0;
//        for (i=0; i<1; ++i) {
//        String name = sc.next();
//        String hp = sc.next();
//        String shcool = sc.next();
//        while (i < 1 ) {
//        	System.out.println("이름: " + name);
//        	System.out.println("핸드폰: " + hp);
//        	System.out.println("학교: " + shcool);
//        	
//        	i += 1;
//        }
//        }
        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
            
      
        //for문 끝
        
        
        // 친구정보 출력
//        for (int i = 0; i < friendArray.length; i++) {
//            //친구정보 출력 메소드 호출
//        }
        

        sc.close();
    }

}
