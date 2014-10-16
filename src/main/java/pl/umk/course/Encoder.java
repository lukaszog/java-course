package pl.umk.course;

public interface Encoder {

    String encrypt(String input) throws EncodingExcpetion;
    String decrypt(String input) throws EncodingExcpetion;

}
