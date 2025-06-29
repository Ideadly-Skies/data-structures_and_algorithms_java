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
     * Polybius encoding
     * 
     * @param plaintext the input string
     * @return the plaintext encoded using the standard English square
     */
    public static String polybiusEncrypt(String plaintext){
        String output = "";

        for (int i = 0; i < plaintext.length(); i++){
            // determine the alphabet position of letter i
            char ch = plaintext.charAt(i);
            int index = ALPHABET.indexOf(ch);

            // letters j or higher are shifted down by one position
            if (index >= 9){
                index--;
            }

            // calculate row and col 
            int row = index / 5;
            int col = index % 5;

            // append to output
            // Integer.toString() converts an int to a string
            output += Integer.toString(row);            
            output += Integer.toString(col); 
        }

        return output;
    }

    public static String polybiusDecrypt(String encrypted){
        String decoded = "";

        for(int i = 0; i < encrypted.length(); i += 2){
            // convert string row and col to int 
            int row = encrypted.charAt(i) - '0'; 
            int col = encrypted.charAt(i + 1) - '0';

            // calculate position
            int position = row * 5 + col; 
            
            // letters i and above should be incremented by one
            if (position >= 9){
                position++;
            }

            // add char at position to decoded 
            decoded += ALPHABET.charAt(position);
        }

        return decoded;
    }

    // nihilist encrypt
    public static String nihilistEncrypt(String plaintext, String key){
        String nihilistEncryption = "";

        // iterate through each character in plaintext
        for(int i = 0; i < plaintext.length(); i++){
            char ch = plaintext.charAt(i); 
            
            int keyIndex = (i % key.length()); 
            char keyAtIndex = key.charAt(keyIndex);

            // encrypt plaintext char and keyAtIndex with polybius 
            // 
            // store results in a temporary variable 
            String tempTextEncrypt = Character.toString(ch);
            String tempKeyEncrypt = Character.toString(keyAtIndex);

            String plainTextEncrypted = polybiusEncrypt(tempTextEncrypt);
            String tempKeyEncrypted = polybiusEncrypt(tempKeyEncrypt); 
            
            // sum both plainTextEncrypted with keyEncrypted
            // 
            // to provide the ith value of the nihilist encryption 
            int cipher = Integer.parseInt(plainTextEncrypted) + Integer.parseInt(tempKeyEncrypted);

            // encrypt the letter and append it to the output
            // single-digit numbers get a leading zero
            if (cipher < 10){
                nihilistEncryption += "0";
            }

            nihilistEncryption += Integer.toString(cipher); 
        }

        return nihilistEncryption;
    }

    // nihilist decrypt
    public static String nihilistDecrypt(String encryption, String key){
        String output = "";        

        // iterate through each encryption digit pair
        for (int i = 0; i < encryption.length(); i += 2){

            int keyIndex = (i % key.length());
            char keyValue = key.charAt(keyIndex);

            // ecnrypt key to nihilist encryption
            int keyEncryption = Integer.parseInt(polybiusEncrypt(Character.toString(keyValue))); 
            
            // subtract encrypted pair with key encryption
            int originalEncryption = Integer.parseInt(Character.toString(encryption.charAt(i))
            + Character.toString(encryption.charAt(i+1))) - keyEncryption;

            System.out.printf("original encryption: %d\n", originalEncryption);

            output = vigenereDecrypt(Integer.toString(originalEncryption), key);
        }

        return output;
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

        // Polybius Square
        cipher = polybiusEncrypt(message); 
        System.out.printf("%s: %s\n", "The encrypted message: ", cipher);

        decrypted = polybiusDecrypt(cipher);
        System.out.printf("%s: %s\n", "The decrypted message: ", decrypted);

        // nihilist encrypt
        String nihilist = nihilistEncrypt(message, key);
        System.out.printf("%s: %s\n", "The encrypted message: ", nihilist);
        
        decrypted = nihilistDecrypt(nihilist, key);
        System.out.printf("%s: %s\n", "The decrypted message: ", decrypted);
    }
}