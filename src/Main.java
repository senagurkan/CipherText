/**
 * Main class of the Java program. 
 * 
 */

 public class Main {
    public static void main(String[] args) {
        String keyy = "medeniyet2021";
        String msg1 = "Merhaba Medeniyet";
        String mess="This is";
        String key = "";
        Cipher c = new Cipher(key);
        String expected1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String actual = c.initCiphertextAlphabet();
        key = "quiz";
        c = new Cipher(key);
        String expected = "QUIZABCDEFGHJKLMNOPRSTVWXY0123456789";
        System.out.println(expected1);
        System.out.println(expected);
actual=c.encrypt("sena gurkan");
System.out.println(actual);

    }
}
