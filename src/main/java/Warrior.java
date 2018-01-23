public class Warrior extends Perso {

    private String job = "Guerrier";

    public Warrior()
    {
        super(
                200,
                10,
                "Aragorn"
        );
    }

    public String getJob()
    {
        return this.job;
    }

    public int getLifePoints()
    {
        return this.lifePoints;
    }

    public int getAttackPoints()
    {
        return this.attackPoints;
    }

    public boolean KO()
    {
        return this.lifePoints == 0;
    }

}
