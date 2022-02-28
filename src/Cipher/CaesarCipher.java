package Cipher;

public class CaesarCipher {
    public static String makeCipher(String inputData, Integer offset) {
        StringBuilder newOutputString = new StringBuilder();
        for (int i = 0; i < inputData.length(); i++) {
            int tempVar = inputData.charAt(i);
            if (tempVar >= 97 & tempVar <= 122) {
                if (tempVar + offset > 122) {
                    newOutputString.append((char) (tempVar + offset - 123 + 97));
                } else {
                    newOutputString.append((char) (tempVar + offset));
                }
            } else if (tempVar >= 65 & tempVar <= 90) {
                if (tempVar + offset > 90) {
                    newOutputString.append((char) (tempVar + offset - 91 + 65));
                } else {
                    newOutputString.append((char) (tempVar + offset));
                }
            } else {
                newOutputString.delete(0, newOutputString.length());
                newOutputString.append("Ваш язык не поддерживается в данный момент времени, пожалуйста, обратитесь в поддержку");
                break;
            }
        }
        return newOutputString.toString();
    }

    public static String deleteCipher(String inputData, Integer offset){
        StringBuilder newOutputString = new StringBuilder();
        for (int i = 0; i < inputData.length(); i++) {
            int tempVar = inputData.charAt(i);
            if (tempVar >= 97 & tempVar <= 122) {
                if (tempVar + offset > 122) {
                    newOutputString.append((char) (tempVar - offset - 123 + 97));
                } else {
                    newOutputString.append((char) (tempVar - offset));
                }
            } else if (tempVar >= 65 & tempVar <= 90) {
                if (tempVar + offset > 90) {
                    newOutputString.append((char) (tempVar - offset - 91 + 65));
                } else {
                    newOutputString.append((char) (tempVar - offset));
                }
            } else {
                newOutputString.delete(0, newOutputString.length());
                newOutputString.append("Ваш язык не поддерживается в данный момент времени, пожалуйста, обратитесь в поддержку");
                break;
            }
        }
        return newOutputString.toString();

    }


}
