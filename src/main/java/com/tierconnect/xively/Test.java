package com.tierconnect.xively;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aquiroz on 9/23/2015.
 */
public class Test {

    public static void main(String args[]){
        try {

            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost(
                    "http://xively-vizyx-saturn.tierconnect.com:8080/riot-core-services/api/reportExecution/tableSummary/5");
            postRequest.addHeader("api_key", "root");
            StringEntity input = new StringEntity("{\"\":\"\"}");
            input.setContentType("application/json");
            postRequest.setEntity(input);

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println("SALIDAT"+output);
            }


            JSONObject jObject  = new JSONObject(output); // json
            JSONObject data = jObject.getJSONObject("data"); // get data object
            String projectname = data.getString("name"); // get the name from data.

            httpClient.getConnectionManager().shutdown();

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}