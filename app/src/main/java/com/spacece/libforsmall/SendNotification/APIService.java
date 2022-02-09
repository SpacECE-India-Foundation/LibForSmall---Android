package com.spacece.libforsmall.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAZ3D3tqM:APA91bEPehqEoGmWLIgNehlf-33qZAUKbXLkcfGavbIF44fkZfsA4PCdcZA15jmVAebYXexHBAB_9pb_EvH8d2NSoE6iv3nvy2PnXMrVgJObBljIEPqLKZG0282K0bIbrmPV__6xUloh"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
