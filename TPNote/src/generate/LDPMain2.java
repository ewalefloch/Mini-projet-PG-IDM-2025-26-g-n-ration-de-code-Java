package generate;

public class LDPMain2 {

    public static void main(String[] args) {
        System.out.println("Début du processus...");
        
            
            // Activité : Init
            Calcul calc = new Calcul();
            int valeur1 = 5;
            int valeur2 = 10;
            int resA = 0;
            int resB = 0;
            
            
            
            // --- Début Fourche : Separation ---
            
            Thread threadBrancheFactorielle = new Thread(new Runnable() {
            public void run() {
            // Branche BrancheFactorielle
            
            // Activité : BrancheFactorielle
            resA = calc.factorial(valeur1);
            
            
            // Fin de la branche du thread
            
            
            }
            });
            Thread threadBranchePuissance = new Thread(new Runnable() {
            public void run() {
            // Branche BranchePuissance
            
            // Activité : BranchePuissance
            resB = calc.power(valeur1, valeur2);
            
            
            // Fin de la branche du thread
            
            
            }
            });
            
            // Démarrage des threads
            threadBrancheFactorielle.start();
            threadBranchePuissance.start();
            // --- Fin fourche ---
            
            
            // --- Jonction : Synchronisation (Attente des threads) ---
            try {
            threadBrancheFactorielle.join();
            threadBranchePuissance.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            
            // Activité : Finalisation
            Logger log = new Logger();
            log.printValue(resA);
            log.printValue(resB);
            
            
            
            
            
            
            
            
            
            
        
        System.out.println("Fin du processus.");
    }
}
