package org.example.Controller;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;


@Deprecated
public class HackathonController {


    private final HttpClient httpClient = HttpClients.createDefault();


    public String fetchDataEntry(String param) {
        String responseData = null;

        try {
            if (param != null || !param.isEmpty()) {

                HttpGet request = new HttpGet("http://localhost:8080/api/maze/" + param);
                HttpResponse response = httpClient.execute(request);

                responseData = EntityUtils.toString(response.getEntity(), "UTF-8");

            } else {
                System.out.println("invalid parameter");
            }

        } catch (Exception errorFirstKey) {
            System.out.println("fel");
        }
        return responseData;
    }


    public int[][] mazeEndpointBuilder(String mazeName) {
        String responsData = fetchDataEntry(mazeName);

            try {
                if (responsData != null && !responsData.isEmpty()) {

                    ObjectMapper objectMapper = new ObjectMapper();
                    return objectMapper.readValue(responsData, int[][].class);
                }

            } catch (Exception e) {
                System.out.println("Data is empty or null");

        }
        return null;
    }
}
