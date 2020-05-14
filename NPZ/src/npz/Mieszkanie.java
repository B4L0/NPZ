package npz;

/**
 *
 * @author Kuba-PISI
 */

public class Mieszkanie extends ElementPietra
{
    public String wizytowka;
    public Pomieszczenie[] pomieszczenia;
 
    @Override
    public double PoliczPole()
    {
        double powierzchnia = 0;
        
        for (Pomieszczenie p : pomieszczenia) 
        {
            powierzchnia += p.PoliczPole();
        }
        return powierzchnia;
    }
    
}
