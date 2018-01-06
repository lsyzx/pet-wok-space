package com.user.test;
import com.alibaba.fastjson.JSON;
import com.pet.api.user.request.QUERY_USER_REQ;
import com.pet.api.user.response.QUERY_USER_RES;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[]args)
    {
        QUERY_USER_REQ QUERYUSERREQ = new QUERY_USER_REQ();
        QUERYUSERREQ.setPageNum(1);
        QUERYUSERREQ.setPageSize(2);
        Map<String,String> params = new HashMap<String, String>();
        params.put("key1","value1");
        params.put("key2","value2");
        QUERYUSERREQ.setParams(params);
        QUERYUSERREQ.setSign("sign");
        QUERYUSERREQ.setTimestamp("timestamp");
        QUERYUSERREQ.setToken("232daff23dfag4gk442");
        System.out.println(JSON.toJSONString(QUERYUSERREQ));
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8888/services/reset_demon/testList.json");
        Response response = target.request().post(Entity.entity("", MediaType.APPLICATION_JSON_TYPE));
        try {
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + response.getStatus());
            }
            System.out.println("The generated id is " + JSON.toJSONString(response.readEntity(QUERY_USER_RES.class)));

        } finally {
            response.close();
            client.close(); // 在真正开发中不要每次关闭client，比如HTTP长连接是由client持有的
        }


    }
}
