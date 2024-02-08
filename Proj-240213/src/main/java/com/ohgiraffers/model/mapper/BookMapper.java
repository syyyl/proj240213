package com.ohgiraffers.model.mapper;

import com.ohgiraffers.common.SearchCriteria;
import com.ohgiraffers.model.dto.BookDTO;
import com.ohgiraffers.model.dto.MemberDTO;

import java.util.List;
import java.util.Map;

public interface BookMapper {


    static List<BookDTO> searchBook(Map<String, Object> criteria) {
        return null;
    }

    List<BookDTO> viewAllList();

    List<MemberDTO> viewMemberList();


}
