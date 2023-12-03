import com.composite.Paragraph;
import com.composite.Section;
import com.composite.Text;

public class Main {
    public static void main(String[] args) {


        Text text = new Paragraph();

        text.setTitre("Titre");
        text.setPreambule("Preambule");

        Section section = new Section();

        section.ajout(text);

        System.out.println("Longeur de Section : "+section.longeur());

        for (int i = 0; i < 5; i++) {
            Text newText = new Paragraph();

            newText.setTitre("Titre");
            newText.setPreambule("Preambule");

            section.ajout(newText);

        }

        System.out.println("Nouvelle Longeur de Section : "+section.longeur());




    }
}