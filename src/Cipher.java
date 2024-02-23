
/**
 * Project 2 -- Cipher
 * 
 * This is an implementation of encryption and decryption algorithms of a
 * substitution cipher
 * 
 * @author Sena Gurkan
 * 
 * @class BIL 122
 * 
 * @date 9/4/2021 birinci gonderdigimde keyword public yaptigim icin ikinci defa gonderiyorum.
 * 
 */
import java.util.Scanner;
public class Cipher {

    final String plaintextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Plaintext Alphabet
    private String keyword; // The Secret Keyword
    private String ciphertextAlphabet; // Ciphertext Alphabet
    
    /**
     * Class constructor initializes the keyword and creates the Ciphertext Alphabet
     * 
     * @param key the secret keyword used to create the ciphertext alphabet
     */
    public Cipher(String key) {
     this.keyword=key;
     this.ciphertextAlphabet=initCiphertextAlphabet();
    }

    /**
     * removes all duplicate occurrences of characters from a String
     * 
     * @param s String with duplicate occurrences of characters
     * @return String with no duplicate characters in it
     */
    public static String removeDups(String s) {
String result="";
for(int j=0;j<s.length();j++){
    int ctr=0;
    for(int z=0;z<result.length();z++){
        if(result.charAt(z)==s.charAt(j)){
            ctr++;
        }
    }
    if(ctr==0){
        result=result + s.charAt(j);
    }
    
    }
return result;
}
    

    /**
     * generates the ciphertext alphabet from the keyword
     * 
     * @return String of ciphertext alphabet generated from the keyword
     */
    public String initCiphertextAlphabet() {
        keyword=keyword.toUpperCase();
     String nkey = "";
     for(int j=0;j<keyword.length();j++){
    int ctr=0;
    for(int z=0;z<nkey.length();z++){
        if(nkey.charAt(z)==keyword.charAt(j)){
            ctr++;
        }
    }
    if(ctr==0){
        nkey=nkey + keyword.charAt(j);
    }
    
    }
		for(int j=0;j<plaintextAlphabet.length();j++){
    int ctr=0;
    for(int z=0;z<nkey.length();z++){
        if(nkey.charAt(z)==plaintextAlphabet.charAt(j)){
            ctr++;
        }
    }
    if(ctr==0){
        nkey=nkey + plaintextAlphabet.charAt(j);
    }
    
    }
	
return nkey;
    }

    /**
     * Encrypts a message in plaintext
     * 
     * @param message the message to be encrypted in ciphertext alphabet
     * @return the encrypted message in ciphertext alphabet
     */
    public String encrypt(String message) {
 message=message.toUpperCase();
 String newMessage="";
    for(int i=0;i<message.length();i++){
        int ctr=0;
        for(int j=0;j<plaintextAlphabet.length();j++){
            if(message.charAt(i)==plaintextAlphabet.charAt(j)){
                newMessage=newMessage+ciphertextAlphabet.charAt(j);
                ctr++;
            }
        }
            if(ctr==0){
                newMessage=newMessage+message.charAt(i);
            }
        }
    return newMessage;
    }
    /**
     * Encrypts a message in plaintext
     * 
     * @param ciphertext ciphertext in ciphertext alphabet
     * @return the decrypted message in plaintext alphabet
     */
    public String decrypt(String ciphertext) {
ciphertext= ciphertext.toUpperCase();
String result="";
        for(int i=0;i<ciphertext.length();i++){
           int ctr=0;
           for(int j=0;j<ciphertextAlphabet.length();j++){
               if(ciphertext.charAt(i)==ciphertextAlphabet.charAt(j)){
                   result=result+plaintextAlphabet.charAt(j);
                   ctr++;
               }
               
           }
           if(ctr==0){
               result=result+ciphertext.charAt(i);
           }
            }
            return result;
    }
}
