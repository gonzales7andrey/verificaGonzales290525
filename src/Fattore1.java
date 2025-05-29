public class Fattore1 extends Thread {
    // (3 + 2a) espressione
    private double a; // valore
    public Fattore1(double a){
        this.a = a;
    }
    
    @Override
    public void run(){ //Codice che il Thread andrà a eseguire quando viene messo in stato ready dal main con .start()
        System.out.println("Sono il thread del fattore 1 (3 + 2a) "); // Faccio il controllo per ogni fattore dell'espressione, cioè vedo il risultato che ognuno ha
        System.out.println("Questo e' il risultato del mio fattore: " + getEspressione() + "\n");
    }

    public double getEspressione(){ 
        return (3 + 2*a); //Restituisce il valore del fattore assegnato al Thread
    }

}
