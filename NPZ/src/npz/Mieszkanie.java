package npz;

/**
 *
 * @author Kuba-PISI
 */

public class Mieszkanie extends ElementPietra
{
    public String wizytowka;
    public Pomieszczenie[] mojePomieszczenia;
 
    @Override
    public double PoliczPole()
    {
        double powierzchnia = 0;
        
        for (Pomieszczenie p : mojePomieszczenia) 
        {
            powierzchnia += p.PoliczPole();
        }
        return powierzchnia;
    }
    
}
