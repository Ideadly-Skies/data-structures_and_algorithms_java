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
        int rotIndex, index;        

        for(int i = 0; i < ciphertext.length(); i++){
            index = ALPHABET.indexOf(ciphertext.charAt(i)); 
            if (index < shift) {
                rotIndex = ALPHABET.length() + (index - shift);
            } else {
                rotIndex = index - shift; 
            }
            
            decrypted += Character.toString(ALPHABET.charAt(rotIndex));
        }

        return decrypted;
    }

    /**
     * Vigenere cipher encryption 
     * 
     * @param plaintext the input string
     * @param key the key string
     * @return the encrypted ciphertext string
    */
    public static String vigenereEncrypt(String plaintext, String key) {
        // start with an empty output
        String encryption = "";

        // iterate over the letters in the plaintext
        for (int i = 0; i < plaintext.length(); i++){
            // get the ith letter of the plaintext 
            char ch = plaintext.charAt(i);

            // determine matching letter of the key 
            // 
            // use the mod operation to wrap around the key
            int keyIndex = i % key.length();
            char keyCh = key.charAt(keyIndex);

            // use the key letter's alphabet position for the shift
            int shift = ALPHABET.indexOf(keyCh) + 1;
            
            // encrypt the letter and append it to the output
            // 
            // encrypt needs a string input
            // Character.toString(converts a character to a string)
            encryption += encrypt(Character.toString(ch), shift);
        }

        // return the encrypted text
        return encryption;
    }

    public static String vigenereDecrypt(String encrypted, String key) {
        // start with an empty decryption
        String decryption = "";

        // iterate over all of the letters in the decrypt
        for (int i = 0; i < encrypted.length(); i++){
            // get the ith letter of the encrypted 
            char ch = encrypted.charAt(i);

            // determine matching letter of the key
            // 
            // use the mod operation to wrap around the key
            int keyIndex = i % key.length();
            char keyCh = key.charAt(keyIndex);

            // use the key letter's alphabet position for the shift
            int shift = ALPHABET.indexOf(keyCh) + 1;

            // decrypt the letter and append it to the output
            // 
            // decrypt needs a string input
            decryption += decrypt(Character.toString(ch), shift);
        }

        return decryption;
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


        // Vigenere decryption 
        message = "TRAVELEAST";
        String key = "CAT";
        
        System.out.printf("%s: %s\n", "The original message: ", message);

        // encrypt the message
        cipher = vigenereEncrypt(message, key);
        System.out.printf("%s: %s\n", "The encrypted message: ", cipher);
        
        // decrypt the message
        decrypted = vigenereDecrypt(cipher, key);
        System.out.printf("%s: %s\n", "The decrypted message: ", decrypted);
    }
}