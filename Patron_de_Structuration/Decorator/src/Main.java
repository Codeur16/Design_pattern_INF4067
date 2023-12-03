import com.decorator.decorateur.DecorateurCurseurHorizontal;
import com.decorator.decorateur.DecorateurCurseurVertical;
import com.decorator.decorateur.DecorateurFenetre;
import com.decorator.fenetre.Fenetre;
import com.decorator.fenetre.FenetreSimple;

public class Main {
    public static void main(String[] args) {

        Fenetre f = new FenetreSimple();

        DecorateurFenetre decorateurFenetreVerticale = new DecorateurCurseurVertical(f);

        DecorateurFenetre decorateurFenetreHorizontal = new DecorateurCurseurHorizontal(decorateurFenetreVerticale);

        decorateurFenetreHorizontal.decrire();

    }
}