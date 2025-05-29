
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Espressione: (3 + 2a) * [ (5b - 7) + (8 - 3c) ]");
        Fattore1 f1 = new Fattore1(2); // creo un thread che si occupa del primo fattore della espressione (3 + 2a)
        f1.start(); // dò il via al thread f1 
        f1.join(); // aspetta che il thread finisca di svolgere il suo lavoro
        
        try{
            f1.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Errore");
        }

        Fattore2 f2 = new Fattore2(2);
        f2.start();
        f2.join();

        try{
            f2.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Errore");
        }

        Fattore3 f3 = new Fattore3(2);
        f3.start();
        f3.join();

        try{
            f3.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Errore");
        }

        System.out.println("Il risultato dell'espressione e' " + f1.getEspressione() * (f2.getEspressione() + f3.getEspressione()));
        
    }
}
