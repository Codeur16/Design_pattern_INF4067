package document;

public class DocumentHtml extends  Document{
    @Override
    public int dessine() {
        System.out.println("Dessine le document html");
        return 0;
    }

    @Override
    public int imprime() {
        System.out.println("Impression du document html");
        return 0;
    }

    @Override
    public int setContenu(String contenu) {
        return 0;
    }
}
