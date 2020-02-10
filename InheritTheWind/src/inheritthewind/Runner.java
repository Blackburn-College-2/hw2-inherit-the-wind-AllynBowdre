package inheritthewind;

/**
 *
 * @author allyn
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Weather-Tron. Here's your report: ");
        Temperature run = new Temperature();
        for(int x = 1; x <= 10; x++ ){
            System.out.println("Day " + x + " : ");
            System.out.println(run);
            run.getNextMorn();
            System.out.println("\n\n");
        }
    }
    
}
