import com.bridge.color.BlueColor;
import com.bridge.color.RedColor;
import com.bridge.shape.Circle;
import com.bridge.shape.Rectangle;
import com.bridge.shape.Shape;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();

        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();


    }
}