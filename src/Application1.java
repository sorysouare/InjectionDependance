import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class Application1 {
    public static void main(String[] args) {

        /*
        *  Injection de dépendance par instanciation static
        * */

            IDao dao= new DaoImpl();
            MetierImpl metier= new MetierImpl();
            metier.setDao(dao);
            System.out.println(metier.calcul());
    }
}