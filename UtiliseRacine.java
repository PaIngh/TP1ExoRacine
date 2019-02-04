/*
    Rendu Exercice TP1 Exo 2

    Réalisé en binome avec :

    -   HUAULT JEAN
    -   INGHELBRECHT PAUL-ANTOINE
 */

import java.util.concurrent.ExecutionException;
import java.util.*; // permet d'apporter toutes les librairies java.

public class UtiliseRacine {

    public static void main(String[] argv)
    {
        Racine extracteur = new Racine(0.01);
        /*
        Pour gerer les exceptions, nous avons réalisé un try catch.
         */
        try {
            double operande= (Double.valueOf(argv[0])).doubleValue();
            if (operande < 0) {
                throw new NegativeNumberExecption(operande); //émettre l'exception
            }
            double valeurRacine;
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
                    (valeurRacine-Math.sqrt(operande)));
            extracteur.setPrecision(0.00001);
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
                    (valeurRacine-Math.sqrt(operande)));
        }
        catch (NegativeNumberExecption e)
        {
            System.out.println("Negative operande !"); //message si l'opérande est negative.
        }
    }

}
