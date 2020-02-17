package com.it.test.dto;

public class MetaPagination {

    private int page;
    private int totalPage;
    private int records;
    private int totalRecords;

    public int getPage() {
        return page;
    }

    public MetaPagination setPage(int page) {
        this.page = page;
        return this;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public MetaPagination setTotalPage(int totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public int getRecords() {
        return records;
    }

    public MetaPagination setRecords(int records) {
        this.records = records;
        return this;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public MetaPagination setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
}
