public class Healer extends Perso {

    private int heal = 30;
    private String job ="Soigneur";
    
    public String coucou;

    public Healer()
    {
        super(
                50,
                5,
                "Jenna"
        );
    }

    public String getJob()
    {
        return this.job;
    }

    public int getLifePoints()
    {
        return lifePoints;
    }

    public int getAttackPoints()
    {
        return attackPoints;
    }

    public void healing()
    {
        lifePoints = lifePoints + 30;
    }

    public boolean KO()
    {
        return this.lifePoints == 0;
    }

}
