package com.jdc.incomingrequestdemo.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleCriteria {
    private String bodyLike;

    public ArticleCriteria(){}

}
