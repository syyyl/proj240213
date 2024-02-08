package com.ohgiraffers.controller;

import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberDTO;
import com.ohgiraffers.model.service.BookService;
import com.ohgiraffers.view.BookPrint;

import java.util.List;

public class BookController {

    private final BookPrint bookPrint;
    private final BookService bookService;

    public BookController() {
        bookPrint = new BookPrint();
        bookService = new BookService();
    }
    public void viewAllList() {

        List<BookDTO> allBookList = bookService.viewAllList();

        if (allBookList != null && !allBookList.isEmpty()) {
            bookPrint.printAllList(allBookList);
        } else {
            bookPrint.printErrorMessage("viewAllList");
        }

    }


    public void viewMemberList() {

        List<MemberDTO> allMemberList = bookService.viewMemberList();

        if (allMemberList != null && !allMemberList.isEmpty()) {
            bookPrint.printMemberList(allMemberList);
        } else {
            bookPrint.printErrorMessage("viewMemberList");
        }
    }



}
