package maow.sdf.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import maow.javasdf.adapter.LanguageAdapter;
import maow.javasdf.document.Document;

public class JSONAdapter implements LanguageAdapter<String> {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public String convert(Document document) {
        return gson.toJson(document);
    }
}
