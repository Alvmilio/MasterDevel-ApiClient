/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiclient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.util.Base64;
import java.nio.charset.Charset;

/**
 *
 * @author Asus
 */
public class ApiClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        GUI gui = new GUI();
        gui.setVisible(true);
        gui.show();
        
        

        
    }
    
}
