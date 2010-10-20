package com.learnsecurity;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

/**
 * This program generates a AES key, retrieves its raw bytes, and
 * then reinstantiates a AES key from the key bytes.
 * The reinstantiated key is used to initialize a AES cipher for
 * encryption and decryption.
 */

public class AES {
	
	/**
	 * Turns array of bytes into string
	 *
	 * @param buf	Array of bytes to convert to hex string
	 * @return	Generated hex string
	 */
	public static String asHex (byte buf[]) {
		StringBuffer strbuf = new StringBuffer(buf.length * 2);
		int i;
		
		for (i = 0; i < buf.length; i++) {
			if (((int) buf[i] & 0xff) < 0x10)
				strbuf.append("0");
			
			strbuf.append(Long.toString((int) buf[i] & 0xff, 16));
		}
		
		return strbuf.toString();
	}
	
	public static KeyGenerator kgen;
	public static SecretKey skey;
	public static SecretKeySpec skeySpec;
	
	/**
	 * Initializes the AES encryption engine.
	 * 
	 * @param seed	The seed for the ecryption engine.
	 */
	public static void init(String seed) throws Exception {
		
		// LAB_TODO: Get the KeyGenerator
		// LAB_TODO: Create a SecureRandom object
		// LAB_TODO: Initialize the KeyGenerator
		// LAB_TODO: Generate a key
		// LAB_TODO: Create a SecretKeySpec
		
	}
	
	/**
	 * Encrypts the given string using AES.
	 * 
	 * @param message	The message to be encrypted.
	 * @return	The cipher text in Base64 encoding.
	 */
	public static String encrypt(String message) throws Exception {
		// Instantiate the cipher

	    // LAB_TODO: ENCRYPT HERE (Hint: Use Cipher object)
	    return null;

	}
	
	/**
	 * Decrypts the given cipher text.
	 * 
	 * @param enc	The cipher text to be decrypted.
	 * @return	The decrypted message.
	 */
	public static String decrypt(String enc) throws Exception {

	    // LAB_TODO: DECRYPT HERE (Hint: Use Cipher object)
	    return null;
	}
}
