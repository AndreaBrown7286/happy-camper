package org.launchcode.happycamper.controllers.models.data;

import org.springframework.beans.factory.annotation.Autowired;

public class SearchForm {

    @Autowired
    private BlogDao blogDao;

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
