package com.pet.api.user.request;

import com.pet.common.utils.PetRequest;

import java.util.Map;

public class QUERY_USER_REQ extends PetRequest{
    private int pageSize;
    private int pageNum;
    private Map<String,String> params;

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "QUERY_USER_REQ{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", params=" + params +
                '}';
    }
}
