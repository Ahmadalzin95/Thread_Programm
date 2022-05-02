package serie6;

public class Podium {

    public static synchronized void geordnetesReden(String rede){

        for (int i = 0; i<rede.length(); i++){
            System.out.print(rede.charAt(i));

            try {
                Thread.sleep(50);
            }
            catch (InterruptedException ex){
                ex.printStackTrace(System.err);
            }
        }
    }

    public static void ungeordnetesReden(String rede){

        for (int i = 0; i<rede.length(); i++){
            System.out.print(rede.charAt(i));

            try {
                Thread.sleep(50);
            }
            catch (InterruptedException ex){
                ex.printStackTrace(System.err);
            }
        }
    }
}
