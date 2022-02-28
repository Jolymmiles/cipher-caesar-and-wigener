import Cipher.CaesarCipher;
import Cipher.ChiffredeVigenere;

public class Aplication {
    public static void main(String[] args){
        char testChar = 'a';
        System.out.println(testChar + ": " + (int) testChar);
        char testCharThree = 'z';
        System.out.println(testCharThree + ": " + (int) testCharThree);
        char testCharTwo = 'A';
        System.out.println(testCharTwo + ": " + (int) testCharTwo);
        char testCharFour = 'Z';
        System.out.println(testCharFour + ": " + (int) testCharFour);
        System.out.println(CaesarCipher.makeCipher("A", 2));
        System.out.println(CaesarCipher.deleteCipher("C", 2));

        System.out.println(ChiffredeVigenere.makeCipher("dog", "lemon"));
        System.out.println(ChiffredeVigenere.deleteCipher("dog", "lemon"));
    }
}
