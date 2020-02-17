package com.it.test.dto;

public class ResultItemDTO {

    private Integer id;
    private String title;
    private String refUrl;
    private String summaryContent;
    private String content;

    public Integer getId() {
        return id;
    }

    public ResultItemDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ResultItemDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getRefUrl() {
        return refUrl;
    }

    public ResultItemDTO setRefUrl(String refUrl) {
        this.refUrl = refUrl;
        return this;
    }

    public String getSummaryContent() {
        return summaryContent;
    }

    public ResultItemDTO setSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ResultItemDTO setContent(String content) {
        this.content = content;
        return this;
    }
}
