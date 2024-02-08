package com.ohgiraffers.model.dto;

import java.util.Date;

public class MemberDTO {

    private int memberCode;
    private String memberName;
    private Date joinDate;
    private boolean loanYN;
    private String loanedBook;

    public MemberDTO() {
    }

    public MemberDTO(int memberCode, String memberName, Date joinDate,
                     boolean loanYN, String loanedBook) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.joinDate = joinDate;
        this.loanYN = loanYN;
        this.loanedBook = loanedBook;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isLoanYN() {
        return loanYN;
    }

    public void setLoanYN(boolean loanYN) {
        this.loanYN = loanYN;
    }

    public String getLoanAmount() {
        return loanedBook;
    }

    public void setLoanAmount(String loanedBook) {
        this.loanedBook = loanedBook;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", joinDate=" + joinDate +
                ", loanYN=" + loanYN +
                ", loanedBook=" + loanedBook +
                '}';
    }
}
