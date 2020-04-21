package Decrypt;

public class Decrypt{
    private String mMessage;
    private int mKey;

    public int getmKey() {
        return mKey;
    }

    public String getmMessage() {
        return mMessage;
    }

    public static String decrypt(String plainText, int shift) {
        this.mMessage = plainText;
        this.mKey = shift;

        if(shift>26){
            shift = shift%26;
        }
        else if(shift<0){
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for(int i = 0, i<length, i++){
            char ch = plainText.charAt(i);
            if(Character.isletter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch-shift);
                    if(c<'a'){
                        cipherText += (char)(ch + (26-shift));
                    }
                    else{
                        cipherText += c;
                    }
                }
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch-shift);
                    if(c<'A'){
                        cipherText += (char)(ch + (26-shift));
                    }
                    else{
                        cipherText += c;
                    }
                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public static void main(String[] args){
        String text = "djdfk dkoe kdkm";
        String cipher = decrypt(text, 5);
        system.out.println(cipher);
    }
}
