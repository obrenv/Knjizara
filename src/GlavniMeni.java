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

    }

}

public static void pregledProizvoda(Knjizara knjizara){
    clearConsole();

    for (Proizvodi x : knjizara.proizvodi){
        System.out.println(x);
    }
}

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }




}
