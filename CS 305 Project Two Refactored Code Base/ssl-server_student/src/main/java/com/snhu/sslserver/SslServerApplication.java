package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

//Added route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController{
	@RequestMapping("/hash")
    public String myHash(){
    	String data = "Hello World Check Sum!";
    	String hexString = "";
    	try {
			MessageDigest digestObj = MessageDigest.getInstance("SHA-256");
			String inputString = "Hello World Check Sum!";
			byte[] digestByteArray = inputString.getBytes();
			byte[] hashValue = digestObj.digest(digestByteArray);
			
			for (byte i : hashValue) {
	            hexString += String.format("%02X", i);
	        }
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
       
        return "<p>data: "+data+"</p><br><p>Name of Cipher Algorithm Used: AES</p><br><p>Value: "+hexString;
    }
}