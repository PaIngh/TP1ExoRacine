/*
    Ceci est une classe d'exception qui va afficher un message d'erreur lorsque le paramètre, ici operande est négatif.
*/

public class NegativeNumberExecption extends Exception {

    public NegativeNumberExecption ()
    {
        super ("error : negative number !");
    }

    public NegativeNumberExecption (double number)
    {
        super ("error : negative number !" + number);
    }
}
