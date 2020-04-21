package Encrypt;

public class Encrypt{

    public static String encrypt(String plainText, int shift) {
        if(shift>26){
            shift = shift%26;
        }
        else if(shift<0){
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        return cipherText;
    }
}
