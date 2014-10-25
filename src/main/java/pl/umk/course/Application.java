package pl.umk.course;

import pl.umk.course.exceptions.EncodingException;
import pl.umk.course.utils.AlphabetValidator;
import pl.umk.course.utils.Encoder;
import pl.umk.course.utils.Rot13Encoder;

public class Application {

    public final static void main(String [] args) {
        Application application = new Application(new Rot13Encoder(new AlphabetValidator()));

        if (args.length != 1) {
            System.out.println("Error: Give one arg with text");
            return;
        }

        application.run(args[0]);
    }

    public void run(String arg) {
        try {
            System.out.println(encoder.encrypt(arg));
        } catch (EncodingException encodingException) {
            System.out.println("Error: " + encodingException.getMessage());
        }
    }

    public Application(Encoder encoder) {
        this.encoder = encoder;
    }

    private final Encoder encoder;
}
