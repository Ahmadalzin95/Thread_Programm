package serie6;

public class Main {
    public static void main(String[] args) {

        Redner r1 = new Redner( "Ich mag es, frei reden zu duerfen.", false);
        Redner r2 = new Redner("Hoffentlich redet mir niemand rein.", false);
        Redner r3 = new Redner("Versteht man mich?", false);
        r1.start();
        r2.start();
        r3.start();
        try {
            r1.join();
            r2.join();
            r3.join();
        }
        catch (InterruptedException ex){
            ex.printStackTrace(System.err);
        }
        System.out.println("\nDrei Reden abgeschlossen.");

        r1 = new Redner( "Ich mag es, frei reden zu duerfen. ", true);
        r2 = new Redner("Hoffentlich redet mir niemand rein. ", true);
        r3 = new Redner("Versteht man mich? ", true);

        r1.start();
        r2.start();
        r3.start();
        try {
            r1.join();
            r2.join();
            r3.join();
        }
        catch (InterruptedException ex){
            ex.printStackTrace(System.err);
        }
    }
}
