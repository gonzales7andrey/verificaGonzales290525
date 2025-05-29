import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Espressione: (3 + 2a) * [ (5b - 7) + (8 - 3c) ]");

        Scanner valoreA = new Scanner(System.in); // Prendo i valori dalla console tramite input dell'utente utilizzando lo Scanner
        System.out.println("Inserisci il valore a"); //comunicazione all'utente di cosa deve inserire
        double a = valoreA.nextDouble(); // Salvo il valore in una variabile double

        Scanner valoreB = new Scanner(System.in);
        System.out.println("Inserisci il valore b");
        double b = valoreB.nextDouble();

        Scanner valoreC = new Scanner(System.in);
        System.out.println("Inserisci il valore c");
        double c = valoreC.nextDouble();

        Fattore1 f1 = new Fattore1(a);   // creo un thread che si occupa del primo fattore della espressione (3 + 2a)
        f1.start();     // dò il via al thread f1 
        try{ // faccio il controllo nel caso il thread restituisca un errore
            f1.join(); // aspetta che il thread finisca di svolgere il suo lavoro
            f1.sleep(2000); // metto in pausa, così che tutti i thread non mandino immediatamente tutto nella console
        }
        catch(Exception e){
            System.out.println("Errore"); //comunicazione all'utente 
        }

        Fattore2 f2 = new Fattore2(b);
        f2.start();
        try{
            f2.join();
            f2.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Errore");
        }
        

        Fattore3 f3 = new Fattore3(c);
        f3.start();
        try{
            f3.join();
            f3.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Errore");
        }
        System.out.println("Dunque l'espressione e' " + f1.getEspressione() + " * (" + f2.getEspressione() + " + " + f3.getEspressione() + ")");
        System.out.println(f1.getEspressione() + " * " + (f2.getEspressione() + f3.getEspressione()));
        try{
            f1.sleep(1000);
            f2.sleep(1000);
            f3.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Errore");
        }
        
        System.out.println("Il risultato dell'espressione e' " + f1.getEspressione() * (f2.getEspressione() + f3.getEspressione()));
        
    }
}
