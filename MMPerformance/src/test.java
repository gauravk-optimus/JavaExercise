import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class  test{  
	URL url = new URL(uriPath);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
InputStream in = connection.getInputStream();
ZipInputStream zipIn = new ZipInputStream(in);
ZipEntry entry = new zipIn().getNextEntry();

while(entry != null) {

    System.out.println(entry.getName());
    if (!entry.isDirectory()) {
        // if the entry is a file, extracts it
        System.out.println("===File===");

    } else {
        System.out.println("===Directory===");
    }
    zipIn.closeEntry();
    entry = zipIn.getNextEntry();

}
}}