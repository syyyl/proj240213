package com.ohgiraffers.model.service;

import com.ohgiraffers.common.SearchCriteria;
import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberDTO;
import com.ohgiraffers.model.mapper.BookMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class BookService {
    private BookMapper bookMapper;

    public List<BookDTO> viewAllList() {

        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);

        List<BookDTO> allBookList = bookMapper.viewAllList();

        sqlSession.close();

        return allBookList;
    }


    public List<MemberDTO> viewMemberList() {

        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);

        List<MemberDTO> allMemberList = bookMapper.viewMemberList();

        sqlSession.close();

        return allMemberList;
    }

    public void searchBookList(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);

        List<BookDTO> bookList = BookMapper.searchBook(criteria);

        if (bookList != null && !bookList.isEmpty()) {
            bookList.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();

    }

}
