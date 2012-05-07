package br.ucb.fct.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class Encrypter {
	public static String encripta (String senha) {  
		try {  
            MessageDigest digest = MessageDigest.getInstance("MD5");  
            digest.update(senha.getBytes()); 
            return new BASE64Encoder().encode(digest.digest());  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();   
        }  
        return senha; 
    }  
}
