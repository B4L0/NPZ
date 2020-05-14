package npz;

/**
 *
 * @author MSI
 */

public class Pietro implements Powierzchnia{
    
    public int iloscPomiesczen;
    public int numerPietra;
    public ElementPietra[] elementy;
    
    @Override
    public double PoliczPole() {
        double pow = 0;
        for (ElementPietra e : elementy) {
            pow += e.PoliczPole();
        }
        return pow;
    }
    
}
