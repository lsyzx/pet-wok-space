package com.pet.api.user.response;

import com.pet.common.utils.PetResponse;

public class QUERY_USER_RES extends PetResponse{

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
