import java.util.HashMap;

/**
 * Created by agoodman on 4/27/16.
 */
public class TextParser {
    String impText;
    public TextParser(){
        TextImporter imp = new TextImporter();
        impText = imp.getText();

    }
    public String getImpText(){
        return impText;
    }
}
