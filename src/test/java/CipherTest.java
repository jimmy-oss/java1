import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CipherTest {

    //Testing the instantiation of the Cipher class to the property cipher as an instance
    //using assertTrue which only checks if the result of the test is successful with true or false response
    @Test
    public void createCipher_instanceOfCipher(){
        Cipher cipher = new Cipher("test string");
        assertTrue(cipher instanceof Cipher);
    }

    //Test methods to test the getInputString method
    //here using assertEquals which checks if the result of the input string is as entered by user
    @Test
    public void runGetInput_returnString_String(){
        Cipher cipher = new Cipher("test string");
        assertEquals("test string", cipher.getInputString());
    }

    //testing encryption using a right shift
    @Test
    public void runEncrypt_shiftLettersBy1_String() {
        Cipher cipher = new Cipher("a");
        assertEquals("b", cipher.encryptText("right",1));
    }

    //testing  encryption by using shift of left by 1
    @Test
    public void runEncrypt_shiftLettersToLeftBy1_String() {
        Cipher cipher = new Cipher("b");
        assertEquals("a", cipher.encryptText("left",1));
    }

    //testing decryption by a right shift of 1
    @Test
    public void runDecrypt_receiveInput_String(){
        Cipher cipher = new Cipher("test");
        assertTrue(cipher.decryptText("right", 1) instanceof String);
    }

    //testing decryption of input string z with a right shift by 1 and using assertEquals to check if the result of the test is a
    @Test
    public void runDecrypt_decryptShiftBy1_String() {
        Cipher cipher = new Cipher("z");
        assertEquals("a", cipher.decryptText("right",1));
    }

    //random changes here
}