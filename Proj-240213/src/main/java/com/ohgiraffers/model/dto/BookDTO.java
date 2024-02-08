package com.ohgiraffers.model.dto;

import java.util.Date;

public class BookDTO {

    private int bookCode;
    private String bookName;
    private String publisher;
    private Date releaseDate;
    private int amount;
    private int categoryCode;
    private boolean loanableYN;

    public BookDTO() {
    }

    public BookDTO(int bookCode, String bookName, String publisher,
                   Date releaseDate, int amount, int categoryCode, boolean loanableYN) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.amount = amount;
        this.categoryCode = categoryCode;
        this.loanableYN = loanableYN;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public boolean isLoanableYN() {
        return loanableYN;
    }

    public void setLoanableYN(boolean loanableYN) {
        this.loanableYN = loanableYN;
    }


    @Override
    public String toString() {
        return "BookDTO{" +
                "bookCode=" + bookCode +
                ", bookName='" + bookName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", releaseDate=" + releaseDate +
                ", amount=" + amount +
                ", categoryCode=" + categoryCode +
                ", loanableYN=" + loanableYN +
                '}';
    }
}
