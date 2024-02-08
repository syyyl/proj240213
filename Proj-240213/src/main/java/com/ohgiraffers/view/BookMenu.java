package com.ohgiraffers.view;

import com.ohgiraffers.common.SearchCriteria;
import com.ohgiraffers.controller.BookController;
import com.ohgiraffers.model.service.BookService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMenu {

    public void viewMenu() {
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();
        BookService bookService = new BookService();

        do {
            System.out.println("1. 전체 도서 조회");
            System.out.println("2. 전체 회원 조회");
            System.out.println("3. 도서 검색");
            System.out.println("9. 상위 메뉴로");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : bookController.viewAllList(); break;
                case 2 : bookController.viewMemberList(); break;
                case 3 : bookService.searchBookList(inputText()); break;
                case 9 : return;
                default :
                    System.out.println("올바른 번호를 입력해주세요."); break;
            }
        } while(true);


    }


    private static Map<String, Object> inputText {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색어를 입력하세요 : ");
        String searchText = sc.nextLine();


        Map<String, Object> criteria = new HashMap<>();

        if (searchText != null) {
            criteria.put("searchText", searchText);
        } else {
            System.out.println("올바른 검색어를 입력해주세요");
        }
        
        return criteria;
    }



    public void bookManager() {
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();

        do {
            System.out.println("1. 새로운 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("9. 상위 메뉴로");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : break;
                case 2 : break;
                case 3 : break;
                case 9 : return;
                default :
                    System.out.println("올바른 번호를 입력해주세요."); break;
            }
        } while(true);
    }

    public void memberManager() {
        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();

        do {
            System.out.println("1. 새로운 회원 등록");
            System.out.println("2. 회원 수정");
            System.out.println("3. 회원 삭제");
            System.out.println("9. 상위 메뉴로");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : break;
                case 2 : break;
                case 3 : break;
                case 9 : return;
                default :
                    System.out.println("올바른 번호를 입력해주세요."); break;
            }
        } while(true);
    }
}
