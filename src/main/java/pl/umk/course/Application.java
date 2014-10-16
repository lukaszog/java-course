package pl.umk.course;

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
        } catch (EncodingExcpetion encodingExcpetion) {
            System.out.println("Error: " + encodingExcpetion.getMessage());
        }
    }

    public Application(Encoder encoder) {
        this.encoder = encoder;
    }

    private final Encoder encoder;
}
