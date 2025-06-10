public class DrustveneIgre extends Proizvodi {
    String Naziv;
    String Opis;
    int brojIgraca;

    public DrustveneIgre(String tip, String opis, int cena, String naziv, String opis1, int brojIgraca) {
        super(tip, opis, cena);
        Naziv = naziv;
        Opis = opis1;
        this.brojIgraca = brojIgraca;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }
}
