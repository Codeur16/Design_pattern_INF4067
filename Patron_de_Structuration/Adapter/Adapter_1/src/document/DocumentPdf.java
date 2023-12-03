package document;

import composant.ComposantPdf;

public class DocumentPdf extends Document{

    public ComposantPdf outilPdf;

    public DocumentPdf(ComposantPdf outilPdf) {
        this.outilPdf = outilPdf;
    }
    @Override
    public int dessine() {
        System.out.println("Dessine le document pdf");
        outilPdf.pdfPrepareAffichage();
        return 0;
    }

    @Override
    public int imprime() {
        System.out.println("Impression du document pdf");
        return outilPdf.pdfEnvoieImprimante();


    }

    @Override
    public int setContenu(String contenu) {
        this.outilPdf.pdfFixeContenu(contenu);
        return 0;
    }
}
