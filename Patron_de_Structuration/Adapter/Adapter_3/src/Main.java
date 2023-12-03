import com.Icarre.ICarre;
import com.Rectangle.Rectangle;
import com.adaptateur.AdaptRectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Perimetre du rectangle : " + rectangle.perimetre());

        // Adaptateur
        ICarre carre = new AdaptRectangle(rectangle);

        System.out.println("Perimetre du carre : " + carre.perimetre());

        System.out.println("Aire du Carre : " + carre.aire());
    }
}