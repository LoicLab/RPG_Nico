import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Combien de joueurs : ");
        int nbJoueurs = scan.nextInt();
        scan.nextLine();

        ArrayList<Perso> listPersonnages = new ArrayList<Perso>();

        for (int i = 0; i < nbJoueurs; i++) {
            System.out.println("Quelle est la classe du joueur " + (i + 1) + " : ");
            System.out.println("1.Guerrier \n 2.Mage \n 3.Healer");
            int choice = scan.nextInt();
            if (choice == 1){
                listPersonnages.add(new Warrior());
                scan.nextLine();
            } else if ( choice == 2){
                listPersonnages.add(new Mage());
                scan.nextLine();
            } else {
                listPersonnages.add(new Healer());
                scan.nextLine();
            }
        }


        int numeroDuPerso = 0;
        Perso dernierPerso;

        Monster mob = new Monster();
        mob.setAttackPoints();
        mob.setLifePoints();
        Perso quiTape = listPersonnages.get(numeroDuPerso);
        do {
            System.out.println("A qui de Taper : " + quiTape.getName()+" "+ quiTape.getJob());
            System.out.println("il reste "+ quiTape.getLifePoints()+ " Points de vie au "+ quiTape.getJob());
            System.out.println("il reste "+mob.getLifePoints()+ " Points de vie au monstre");

            if (quiTape.getJob() == "Warrior"){

                quiTape.attack(mob);

            } else if (quiTape.getJob() == "Mage"){
                System.out.println(" Veux tu:  1.Taper le monstre  ou \n 2.Te rendre 5 points de Vie");
                int choix = scan.nextInt();
                if (choix == 1 ){
                    quiTape.attack(mob);
                }else {
                    quiTape.healing();
                }
            } else if (quiTape.getJob() == "Healer"){
                System.out.println(" Veux tu:  1.Taper le monstre  ou \n 2.Veux tu donner 30 points de vie à un autre joueur");
                int choix = scan.nextInt();
                if (choix == 1 ){
                    quiTape.attack(mob);
                }else if ( choix == 2 ) {
                    System.out.println("qui veux tu soigner: 1.Le guerrier ou 2.le Mage ");
                    int soin = scan.nextInt();
                    if (soin ==1){
                        quiTape.bigHealing();
                    } else {
                        quiTape.bigHealing();
                    }
                }
            }


            numeroDuPerso++;

            if (numeroDuPerso >= listPersonnages.size()) {
                numeroDuPerso = 0;
            }

            System.out.println("Le monstre tape à son tour " );
            mob.attack(quiTape);

        } while (!mob.KO());

        System.out.println( "le Monstre est K.O !");
        System.out.println(quiTape.getName()+" "+quiTape.getJob()+" a fini la partie avec "+quiTape.getLifePoints());

    }
}
