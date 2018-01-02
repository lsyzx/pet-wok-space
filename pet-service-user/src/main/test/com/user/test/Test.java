package com.user.test;
import com.alibaba.fastjson.JSON;
import com.pet.api.user.entity.UserRequest;
import com.pet.api.user.entity.UserResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Test {

    public static void main(String[]args)
    {
        UserRequest userRequest = new UserRequest();
        userRequest.setPageNum(1);
        userRequest.setPageSize(2);
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8888/services/users/getlist.json");
        Response response = target.request().post(Entity.entity(userRequest, MediaType.APPLICATION_JSON_TYPE));
        try {
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
            }
            System.out.println("The generated id is " + JSON.toJSONString(response.readEntity(UserResponse.class)));

        } finally {
            response.close();
            client.close(); // 在真正开发中不要每次关闭client，比如HTTP长连接是由client持有的
        }


    }
}
