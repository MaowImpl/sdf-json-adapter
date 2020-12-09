package maow.sdf.json.util;

import maow.javasdf.document.Document;
import maow.javasdf.io.conversion.AbstractConvertedWriter;
import maow.sdf.json.JSONAdapter;

import java.io.IOException;
import java.io.Writer;

public class JSONConvertedWriter extends AbstractConvertedWriter {
    public JSONConvertedWriter(Document document, Writer out) {
        super(document, out);
    }

    public JSONConvertedWriter write() throws IOException {
        write(document);
        return this;
    }

    @Override
    public void write(Document document) throws IOException {
        final JSONAdapter adapter = new JSONAdapter();
        final String json = adapter.convert(document);
        out.write(json);
    }

    public JSONConvertedWriter flush() throws IOException {
        out.flush();
        return this;
    }

    public void close() throws IOException {
        out.close();
    }
}
