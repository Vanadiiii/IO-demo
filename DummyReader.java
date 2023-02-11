import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class DummyReader {
    public static void main(String[] args) throws IOException {
        final InputStream in = System.in;

        byte[] storage = new byte[100];
        in.read(storage);

        System.out.println(Arrays.toString(storage));
    }
}

