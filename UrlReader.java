import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class UrlReader {
  public static void main(String[] args) throws IOException {
    InputStream in = new URL("http://www.google.com").openStream();
    System.out.println(new String(in.readAllBytes(), StandardCharsets.UTF_8));
  }
}
