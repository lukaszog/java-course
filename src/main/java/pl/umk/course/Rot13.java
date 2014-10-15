package pl.umk.course;

import java.util.ArrayList;
import java.util.List;

public class Rot13 {

    public String encrypt(String abc) throws EncodingExcpetion {
        String result = "";

        List<Character> alphabet = new ArrayList<Character>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

        char[] chars = abc.toCharArray();

        for (Character c : chars) {
            if (!alphabet.contains(c)) {
                throw new EncodingExcpetion("Invalid character: \"" + c + "\"");
            }
        }

        for (Character c : chars) {
            Integer charPosition = Integer.valueOf(c);
            Integer encryptedCharPosition = charPosition + 13;
            Character encryptedChar = Character.toChars(encryptedCharPosition)[0];
            result += encryptedChar;
        }

        return result;
    }

}
