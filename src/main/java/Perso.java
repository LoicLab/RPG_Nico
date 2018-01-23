public abstract class Perso {
    protected String name;
    protected int lifePoints;
    protected int attackPoints;
    protected String job;
    private int heal = 5;
    private int bigHeal = 30;

    public Perso(int lifePoints, int attackPoints, String name)
    {
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.name = name;
        this.job = job;
    }

    public String getName()
    {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int getLifePoints()
    {
        return this.lifePoints ;
    }

    public String getJob()
    {
        return this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAttackPoints()
    {
        return this.attackPoints;
    }

    public void attack(Monster mob)
    {
        mob.defense(getAttackPoints());
    }

    public int defense(int nb)
    {
       this.lifePoints = this.lifePoints - nb;

        if (this.lifePoints < 0) {
           this.lifePoints = 0;
            return this.lifePoints;
        } else {
            return this.lifePoints;
        }

    }

    public  void healing(){
        this.lifePoints = this.lifePoints + heal;
    }

    public void bigHealing(){
        this.lifePoints = this.lifePoints + bigHeal;
    }
}
