public abstract class Proizvodi {

    private String tip;
    private String opis;
    private int cena;

    public Proizvodi(String tip, String opis, int cena) {
        this.tip = tip;
        this.opis = opis;
        this.cena = cena;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Proizvodi{" +
                "tip='" + tip + '\'' +
                ", opis='" + opis + '\'' +
                ", cena=" + cena +
                '}';
    }
}
