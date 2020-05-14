package npz;

/**
 *
 * @author MSI
 */

public class Budynek implements Powierzchnia{
    
    public int powierzchniaDzialki;
    public int iloscPieter;
    public Pietro[] pietra;
    public Garaz[] garaze;

    @Override
    public double PoliczPole() {
        double pow = 0;
        for(Pietro p : pietra){
            pow += p.PoliczPole();
        }
        for(Garaz g : garaze){
            pow += g.PoliczPole();
        }
        return pow;
    }
    
}
