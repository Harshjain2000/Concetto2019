package com.rishabh.concetto2019.Utilities.Networking;

/**
 * Created by Rishabh Agarwal on 23/09/2019
 */

public class Utils
{
    private Utils(){}

    public static String BaseUrl="http://10.42.0.1:8080/";

    public static ClientAPI getClientAPI()
    {
        return RetrofitClient.getClient(BaseUrl).create(ClientAPI.class);
    }
}
