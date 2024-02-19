package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {

    private IDao dao;//Couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*11.4;
        return res;
    }

    public IDao getDao() {
        return dao;
    }

    /**
     * pour permettre d intecter ds la variable dao
     * un obj d une classe qui implemente l interface IDAO
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
