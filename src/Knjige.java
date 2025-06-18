public abstract class Knjige extends Proizvodi {
    private String naslov;
    private String autor;
    private String zanr;

    public Knjige(String tip, String opis, int cena, String naslov, String autor, String zanr) {
        super(tip, opis, cena);
        this.naslov = naslov;
        this.autor = autor;
        this.zanr = zanr;
    }




    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    @Override
    public String toString() {
        return "Knjige{" +
                "naslov='" + naslov + '\'' +
                ", autor='" + autor + '\'' +
                ", zanr='" + zanr + '\'' +
                '}';
    }
}
