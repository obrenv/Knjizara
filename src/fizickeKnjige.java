public class fizickeKnjige extends Knjige {


    private int brojStranica;

    public fizickeKnjige(String tip, String opis, int cena, String naslov, String autor, String zanr, int brojStranica) {
        super(tip, opis, cena, naslov, autor, zanr);
        this.brojStranica = brojStranica;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public void setBrojStranica(int brojStranica) {
        this.brojStranica = brojStranica;
    }

    @Override
    public String toString() {
        return getAutor() + " " + getNaslov() + " " + getCena();
    }
}
