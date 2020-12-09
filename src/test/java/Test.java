import maow.javasdf.document.Document;
import maow.javasdf.io.SDFReader;
import maow.sdf.json.util.JSONConvertedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Document document = new SDFReader(new FileReader("SDF.sdf")).readDocument();
        JSONConvertedWriter jcw = new JSONConvertedWriter(document, new FileWriter("JSON.json"));
        jcw.write().flush().close();
    }
}
