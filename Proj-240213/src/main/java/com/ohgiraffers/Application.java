package com.ohgiraffers;

import com.ohgiraffers.model.service.BookService;
import com.ohgiraffers.view.BookMenu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. 조회");
            System.out.println("2. 도서 관리");
            System.out.println("3. 회원 관리");
//            System.out.println("2. 등록");
//            System.out.println("3. 수정");
//            System.out.println("4. 삭제");



            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 :
                    new BookMenu().viewMenu(); break;
                case 2 :
                    new BookMenu().bookManager(); break;
                case 3 :
                    new BookMenu().memberManager(); break;
                default:
                    System.out.println("올바른 번호를 입력해주세요."); break;
            }
        } while(true);
    }


}
