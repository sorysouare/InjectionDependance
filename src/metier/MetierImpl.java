package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;
    private double number;

    /*
    * Couplace faible
    * */
    @Override
    public double calcul() {
        double d=dao.getData();
        number=12;
        return d*number;
    }

     public void setDao(IDao dao) {
        this.dao = dao;
    }
}
