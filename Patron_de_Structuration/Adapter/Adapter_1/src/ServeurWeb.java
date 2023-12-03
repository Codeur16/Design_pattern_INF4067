import composant.ComposantPdf;
import document.Document;
import document.DocumentHtml;
import document.DocumentPdf;

public class ServeurWeb {
    public static void main(String[] args) {
        ComposantPdf pdf = new ComposantPdf();
        Document docPdf = new DocumentPdf(pdf);

        docPdf.setContenu("Hello World");
        docPdf.dessine();

        Document docHtml = new DocumentHtml();
        docHtml.setContenu("Hello World");
    }
}
