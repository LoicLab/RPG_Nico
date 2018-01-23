import java.util.Scanner;

public class Monster {

    private int lifePoints ;
    private int attackPoints ;


    public int setLifePoints()
    {
        lifePoints = (int)(Math.random() * (300-50)) + 50;
        this.lifePoints = lifePoints;
        return lifePoints;
    }

    public int setAttackPoints()
    {
        attackPoints = (int)(Math.random() * (20-5)) + 5;
        this.attackPoints = attackPoints;
        return attackPoints;
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


    public void attack(Perso quiTape)
    {
        int crit = (int) (Math.random());
        if ( crit  == 0.1 ){
            this.attackPoints = this.attackPoints *2;
            quiTape.defense(getAttackPoints());
        } else {
            quiTape.defense(getAttackPoints());
        }

    }

    public void defense(int nb) {
        this.lifePoints = this.lifePoints - nb;

        if (this.lifePoints < 0) {
            this.lifePoints = 0;
        }
    }

}
