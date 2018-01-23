public class Mage extends Perso {

    private int heal = 5;
    private String job = "Mage";

    public Mage()
    {
        super(
                100,
                20,
                "Gandalf"
        );
    }

    public String getJob()
    {
        return this.job;
    }

    public String getName()
    {
        return super.getName();
    }

    public int getLifePoints()
    {
        return this.lifePoints;
    }

    public int getAttackPoints()
    {
        return this.attackPoints;
    }

    public int getHeal()
    {
        return this.heal;
    }

    public int healingMage()
    {
        this.lifePoints = lifePoints + this.heal;
        return this.lifePoints;
    }

    public boolean KO()
    {
        return this.lifePoints == 0;
    }
}
