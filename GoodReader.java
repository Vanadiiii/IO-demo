import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class GoodReader {
    public static void main(String[] args) throws IOException {
        final InputStream in = System.in;

        byte[] storage = new byte[100];

        byte offset = 0;
        while (offset < storage.length) {
            final int read = in.read(storage, offset, storage.length - offset);
            if (read == -1) {
                throw new IOException("Stream size less than 100");
            }
            offset += read;
        }

        System.out.println(Arrays.toString(storage));
    }
}

