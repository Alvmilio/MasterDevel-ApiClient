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
import retrofit2.http.Path;



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

    @GET("api/message/{id}")
    Call<ApiResponse> getMessage(@Header("XKey") String xkeyHeader, @Header("XRoute") String xrouteHader, @Header("XSignature") String xsignatureHeader, @Path("id") int id);

    @GET("api/messages/{tag}")
    Call<ApiResponse> getMessages(@Header("XKey") String xkeyHeader, @Header("XRoute") String xrouteHader, @Header("XSignature") String xsignatureHeader, @Path("tag") String tag);

    
    
}