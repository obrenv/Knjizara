public class elektronskeKnjige extends Knjige {
    private int velicinaFajla;

    public elektronskeKnjige(String tip, String opis, int cena, String naslov, String autor, String zanr, int velicinaFajla) {
        super(tip, opis, cena, naslov, autor, zanr);
        this.velicinaFajla = velicinaFajla;
    }

    public int getVelicinaFajla() {
        return velicinaFajla;
    }

    public void setVelicinaFajla(int velicinaFajla) {
        this.velicinaFajla = velicinaFajla;
    }
}
