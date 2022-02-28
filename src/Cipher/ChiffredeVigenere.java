package Cipher;

public class ChiffredeVigenere {
    public static String makeCipher(String inputData, String offset){
        String test = " ";
        int iterator = 0;
        StringBuilder newOutputString = new StringBuilder();
        for (int i = 0; i < inputData.length(); i++){
            if (test.equals(inputData.charAt(i))){
                continue;
            }
            int tempVar = inputData.charAt(i);
            int tempVarForOffset = inputData.charAt(iterator);
            if (iterator == offset.length()){
                iterator = 0;
            } else {
                iterator++;
            }
            newOutputString.append((char) ((tempVar + tempVarForOffset) % 28));
        }

        return newOutputString.toString();

    }

    public static String deleteCipher(String inputData, String offset){
        String test = " ";
        int iterator = 0;
        StringBuilder newOutputString = new StringBuilder();
        for (int i = 0; i < inputData.length(); i++){
            if (test.equals(inputData.charAt(i))){
                continue;
            }
            int tempVar = inputData.charAt(i);
            int tempVarForOffset = inputData.charAt(iterator);
            if (iterator == offset.length()){
                iterator = 0;
            } else {
                iterator++;
            }
            newOutputString.append((char) ((tempVar - tempVarForOffset) % 28));
        }

        return newOutputString.toString();
    }
}
