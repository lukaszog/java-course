package pl.umk.course;

import com.google.common.collect.Lists;

import java.util.List;

public class Rot13 {

    public static final List<Character> ALPHABET = Lists.charactersOf("abcdefghijklmnopqrstuvwxyz");

    public String encrypt(String input) throws EncodingExcpetion {
        String result = "";

        validateInput(input.toCharArray());

        for (Character c : input.toCharArray()) {
            result += encodeCharacter(c);
        }

        return result;
    }

    private void validateInput(char[] chars) throws EncodingExcpetion {
        for (Character c : chars) {
            if (!ALPHABET.contains(c) && c != ' ') {
                throw new EncodingExcpetion("Invalid character: \"" + c + "\"");
            }
        }
    }

    private Character encodeCharacter(Character c) {
        if (c == ' ') {
            return ' ';
        }
        Integer charPosition = ALPHABET.indexOf(c);
        Integer encryptedCharPosition = (charPosition + 13) % 26;
        Character encryptedChar = ALPHABET.get(encryptedCharPosition);
        return encryptedChar;
    }

}
