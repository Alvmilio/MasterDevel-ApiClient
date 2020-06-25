package apiclient;


import apiclient.GUI.Credential;
import apiclient.GUI.Message;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;



/**
 *
 * @author Asus
 */
public interface Service {

    @Headers( "Content-Type: application/json" )
    @PUT("api/credential")
    Call<ApiResponse> putCredential(@Body Credential credential);

    @Headers( "Content-Type: application/json" )
    @POST("api/message")
    Call<ApiResponse> postMessage(@Header("XKey") String xkeyHeader, @Header("XRoute") String xrouteHader, @Header("XSignature") String xsignatureHeader, @Body Message credential);

}