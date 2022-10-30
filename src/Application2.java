import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws Exception{
        /*
         * Injection de dépendance par instaciation dynamique
         * */

        Scanner clavier = new Scanner(new File("config.txt"));
        String daoClassName = clavier.nextLine();
        Class daoClass = Class.forName(daoClassName);
        IDao dao = (IDao) daoClass.newInstance();

        String metierClassName=clavier.nextLine();
        Class metierClass=Class.forName(metierClassName);
        IMetier metier=(IMetier) metierClass.newInstance();

            /*
            * Invoquer une methode dynamiquement
        * */
        Method m= metierClass.getMethod("setDao", IDao.class);
        m.invoke(metier, dao);

        System.out.println(metier.calcul());

    }
}
