package project;

/**
 * Implement the substitution Cipher
 */
public class Cipher {
    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    
    
    /**
     * encrypt -- perform Caesar-style rotation
     *  
     * @param plaintext the input string of uppercase letters
     * @param shift the number of position to rotate
     * @return the encrypted ciphertext string
     */
    public static String encrypt(String plaintext, int shift) {
        String encrypted = ""; 
        
        for(int i = 0; i < plaintext.length(); i++){
            int index = ALPHABET.indexOf(plaintext.charAt(i));
            int rotIndex = (index + shift) % ALPHABET.length(); 
            char cipherChar = ALPHABET.charAt(rotIndex);

            encrypted += cipherChar;
        } 
    
        return encrypted;
    }

    /**
     * 
     * @param ciphertext
     * @param shift
     * @return
     */
    public static String decrypt(String ciphertext, int shift) {
        String decrypted = "";

        for(int i = 0; i < ciphertext.length(); i++){
            char ch = ciphertext.charAt(i);
            int index = ALPHABET.indexOf(ch);
            int rotIndex = (index - shift) % 26;
            char decryptedChar = ALPHABET.charAt(rotIndex);

            decrypted += decryptedChar;
        }

        return decrypted;
    }
    
    /**
     * main -- entry point for the application
     * @param args
     */
    public static void main(String[] args){
        
        String message = "TRAVELEAST";        
        int rotation = 3;
        
        System.out.printf("%s: %s\n", "The original message: ", message);

        // Encrypt the message
        String cipher = encrypt(message, rotation);
        System.out.printf("%s: %s\n", "The encrypted message: ", cipher);

        // Decrypt the cipher
        String decrypted = decrypt(cipher, rotation);
        System.out.printf("%s: %s\n", "The decrypted message: ", decrypted);
    }
}