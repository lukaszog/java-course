package pl.umk.course;

public class Rot13 {

    public String encrypt(String abc) {
        String result = "";

        char[] chars = abc.toCharArray();

        for (Character c : chars) {
            Integer charPosition = Integer.valueOf(c);
            Integer encryptedCharPosition = charPosition + 13;
            Character encryptedChar = Character.toChars(encryptedCharPosition)[0];
            result += encryptedChar;
        }

        return result;
    }

}
