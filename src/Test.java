public class Test {
    public static void main(String[] args) {
        Knjizara Vukovic = new Knjizara();

        Proizvodi knjiga1 = new fizickeKnjige("knjiga", "Avanture mladoga coveka", 500, "Tom Sojer", "Mark Tven", "Komedija", 350);
        Proizvodi knjiga2 = new fizickeKnjige("knjiga", "Putovanje kroz distopijski svet", 700, "1984", "Džordž Orvel", "Distopija", 328);
        Proizvodi knjiga3 = new fizickeKnjige("knjiga", "Tragedija jedne porodice", 650, "Ana Karenjina", "Lav Tolstoj", "Drama", 864);
        Proizvodi knjiga4 = new fizickeKnjige("knjiga", "Borba za slobodu", 600, "Les Miserables", "Viktor Igo", "Istorijski roman", 1232);
        Proizvodi knjiga5 = new fizickeKnjige("knjiga", "Fantastična avantura hobita", 550, "Hobit", "Dž. R. R. Tolkin", "Fantastika", 310);
        Proizvodi knjiga6 = new fizickeKnjige("knjiga", "Priča o dvoje ljubavnika", 480, "Romeo i Julija", "Vilijam Šekspir", "Tragedija", 220);
        Proizvodi knjiga7 = new fizickeKnjige("knjiga", "Putovanje kroz lavirint identiteta", 520, "Frankenštajn", "Meri Šeli", "Gotski roman", 280);


        Proizvodi poklon = new Pokloni("poklon", "Za objasnjavanje programerskih koncepata", 250, "Gumena patkica" );
        Proizvodi poklon1 = new Pokloni("poklon", "Da imaju sa kime da pricaju ljudi", 500, "Lopta Willson");

        Vukovic.proizvodi.add(knjiga1);
        Vukovic.proizvodi.add(knjiga2);
        Vukovic.proizvodi.add(knjiga3);
        Vukovic.proizvodi.add(knjiga4);
        Vukovic.proizvodi.add(knjiga5);
        Vukovic.proizvodi.add(knjiga6);
        Vukovic.proizvodi.add(knjiga7);


        Vukovic.proizvodi.add(poklon);
        Vukovic.proizvodi.add(poklon1);

        GlavniMeni.glavnaStrana();
        GlavniMeni.glavniMeniOdabir(Vukovic);

    }
}
