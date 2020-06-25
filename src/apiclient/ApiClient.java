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

/**hola,adios,efe,pe,erre
 *
 * 1cc9227e0d9d900a9819f8eaf9119823e2b92cdc78abedcd81d43fc827ba1d25
 * @author Asus
 
 
 X-Route:/message/<id>;id:0
 122ec8c8c38312301d906577832aa8a0d922014999a6d6f839bd45a29ced7efe
 
 X-Route:/message/<id>;id:1
 32118b230ddb9287814ad5fc915b1cf3121355a0c05fc6d496bb907a56dc2afe
 
 X-Route:/message/<id>;id:2 
 d06ee2423661de24ab82273eded459811086c37d7aac79a090ed6332d27bc9e4
 second message to insert
 *msg "master devel"
 * tags nodejs,java,api
 * hash : f88c25c9a83a33525f02cf38a9149782d88671079e864578289506ae08057115
 
 msg "pruebas finales"
 tags nodejs,hola
 hash: 23750715f3b316434b4a7731e77c09cb7042a92bd708cba67753502799568520 
 *
 fetch by tag nodejs
 hash 5b6dc187fff2818ed3127d395a65a8b153803f367d727b6d11c18bc14c04cd59

fetch by tag hola
hash ba220c616dcc79cba9ba16a945305ba5d732fdb4b017933ceeafd3a821296746
 
 * 
 * 
 
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
