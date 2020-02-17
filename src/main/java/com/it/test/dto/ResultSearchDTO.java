package com.it.test.dto;

import java.util.List;

public class ResultSearchDTO {

    private MetaPagination mata;
    private List<ResultItemDTO> items;

    public MetaPagination getMata() {
        return mata;
    }

    public ResultSearchDTO setMata(MetaPagination mata) {
        this.mata = mata;
        return this;
    }

    public List<ResultItemDTO> getItems() {
        return items;
    }

    public ResultSearchDTO setItems(List<ResultItemDTO> items) {
        this.items = items;
        return this;
    }
}
