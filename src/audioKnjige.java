public class audioKnjige extends Knjige {
    private int duzinaUMinutima;

    public audioKnjige(String tip, String opis, int cena, String naslov, String autor, String zanr, int duzinaUMinutima) {
        super(tip, opis, cena, naslov, autor, zanr);
        this.duzinaUMinutima = duzinaUMinutima;
    }

    public int getDuzinaUMinutima() {
        return duzinaUMinutima;
    }

    public void setDuzinaUMinutima(int duzinaUMinutima) {
        this.duzinaUMinutima = duzinaUMinutima;
    }
}
