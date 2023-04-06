import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamApp {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0x10000002);
        baos.write(0x02);
        try {
            baos.write(new byte[]{0x02});
        } catch (IOException __) {
        }
        baos.writeBytes(new byte[]{0x02});
        baos.write(0x03);
        byte[] result = baos.toByteArray();
        System.out.println(Arrays.toString(result));
    }
}
