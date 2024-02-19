package ext;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vc")
public class DaoImpCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur ");
        double data=77;
        return data;
    }
}
