import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GlavniMeni {

static void glavnaStrana(){

    System.out.println("╔══════════════════════════════════════════════════════════════╗");
    System.out.println("║                                                              ║");
    System.out.println("║                      KNJIŽARA VUKOVIĆ                        ║");
    System.out.println("║                                                              ║");
    System.out.println("║                        _                                     ║");
    System.out.println("║                       / \\      _-'                           ║");
    System.out.println("║                     _/|  \\-''- _ /                           ║");
    System.out.println("║                  __-' { |          \\                         ║");
    System.out.println("║                      /             \\                         ║");
    System.out.println("║                     /       \"o.  |o }                        ║");
    System.out.println("║                     |            \\ ;                         ║");
    System.out.println("║                                   ',                         ║");
    System.out.println("║                        \\_         __\\                        ║");
    System.out.println("║                          ''-_    \\.//                        ║");
    System.out.println("║                            / '-____'                         ║");
    System.out.println("║                          /                                   ║");
    System.out.println("║                        _'                                    ║");
    System.out.println("║                      _-'                                     ║");
    System.out.println("╠══════════════════════════════════════════════════════════════╣");
    System.out.println("╠══════════════════════════════════════════════════════════════╣");
    System.out.println("║ 1 ▐ 👀 Pregledaj proizvode                                   ║");
    System.out.println("║ 2 ▐ ➕ Dodaj knjigu                                          ║");
    System.out.println("║ 3 ▐ 🔍 Pretraži knjigu                                       ║");
    System.out.println("║ 4 ▐ ❌ Izbaci knjigu                                         ║");
    System.out.println("║ 5 ▐ 👤 Upravljaj korisnicima                                 ║");
    System.out.println("║ 6 ▐ 💾 Save & Exit                                           ║");
    System.out.println("╚══════════════════════════════════════════════════════════════╝");
    System.out.println("            Unesi izbor (1-6): ");
}





public static void glavniMeniOdabir(Knjizara knjizara){
    Scanner sc = new Scanner(System.in);

    while (true){
        int odabir = sc.nextInt();
        if(odabir == 1){
            pregledProizvoda(knjizara);
        }

        if(odabir == 2){
            dodajKnjigu();
        }

        if(odabir == 3){
           pretraziKnjigu();
        }

        if(odabir == 6){
            break;
        }

    }

}

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

public static void pregledProizvoda(Knjizara knjizara){
    clearConsole();

    for (Proizvodi x : knjizara.proizvodi){
        System.out.println(x);
    }
}

public static void dodajKnjigu(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Unesite autora:");
    String autor = sc.nextLine();

    System.out.println("Unesite naslov:");
    String naslov = sc.nextLine();

    System.out.println("Unesite cenu:");
    int cena = sc.nextInt();


    Proizvodi knjiga = new fizickeKnjige(cena, naslov,autor);
    Knjizara.Vukovic.proizvodi.add(knjiga);


}

    public static void pretraziKnjigu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite termin za pretragu:");
        String pretraga = sc.nextLine();
        List<Knjige> kastovaneKnjige = new ArrayList<>();

        for (Proizvodi x : Knjizara.Vukovic.proizvodi){
            if(x instanceof Knjige){
                kastovaneKnjige.add((Knjige)x);
            }
        }

        for(Knjige x : kastovaneKnjige){
            if(pretraga.toLowerCase().equals(x.getNaslov().toLowerCase()) || pretraga.toLowerCase().equals(x.getAutor().toLowerCase())){
                System.out.println(x);
            }
        }



    }




}
