package com.ohgiraffers.view;

import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberDTO;
import com.ohgiraffers.model.mapper.BookMapper;

import java.util.List;

public class BookPrint {
    public void printAllList(List<BookDTO> allBookList) {

        System.out.println("===== 전체 도서 목록 =====");
        for (BookDTO book : allBookList) {
            System.out.println(book);
        }
        System.out.println("===================");
    }

    public void printMemberList(List<MemberDTO> allMemberList) {

        System.out.println("===== 전체 회원 목록 =====");
        for (MemberDTO member : allMemberList) {
            System.out.println(member);
        }
        System.out.println("===================");
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "viewAllList" : errorMessage = "조회 결과가 없습니다.";
            case "viewMemberList" : errorMessage = "조회 결과가 없습니다.";
        }
        System.out.println(errorMessage);
    }


}
