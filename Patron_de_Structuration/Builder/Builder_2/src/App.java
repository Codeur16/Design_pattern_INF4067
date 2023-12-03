import com.directeur.Directeur;
import com.monteur.MonteurPizza;
import com.monteur.MonteurPizzaPiquante;
import com.monteur.MonteurPizzaReine;

public class App {
    public static void main(String[] args) throws Exception {
        Directeur directeur = new Directeur();

        MonteurPizza mp = new MonteurPizzaPiquante();
        

        directeur.setMonteurPizza(mp);

        directeur.construirePizza();
        System.out.println("Pizza Piquante");
        directeur.getPizza().print();

        MonteurPizza mp1 = new MonteurPizzaReine();
    
        directeur.setMonteurPizza(mp1);
        directeur.construirePizza();
        System.out.println("Pizza Reine");
        directeur.getPizza().print();

    
    }
}
