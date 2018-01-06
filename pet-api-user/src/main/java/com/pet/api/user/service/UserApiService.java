package com.pet.api.user.service;

import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;

public interface UserApiService {

    QUERY_USER_RES queryUserList(QUERY_USER_REQ req);

    QUERY_USER_RES getUserInfo(QUERY_USER_REQ req);

    QUERY_USER_RES get_string(QUERY_USER_REQ req);
}
