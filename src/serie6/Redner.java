package serie6;

public class Redner extends Thread{

    private String rede;
    private boolean beachtetReihenfolge;

    public Redner(String rede, boolean beachtetReihenfolge){
        this.rede = rede;
        this.beachtetReihenfolge = beachtetReihenfolge;
    }

    @Override
    public void run(){

       if (this.beachtetReihenfolge){
            Podium.geordnetesReden(rede);
       }
       else {
           Podium.ungeordnetesReden(rede);
       }
    }

}
