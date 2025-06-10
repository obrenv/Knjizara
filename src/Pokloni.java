public class Pokloni extends Proizvodi{
    private String naziv;


    public Pokloni(String tip, String opis, int cena, String naziv) {
        super(tip, opis, cena);
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


}
