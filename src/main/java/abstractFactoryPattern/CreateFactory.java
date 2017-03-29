package abstractFactoryPattern;

import abstractFactoryPattern.pradaFactory.PradaUIFactory;
import abstractFactoryPattern.versaceFactory.VersaceUIFactory;

import java.util.logging.Logger;

import static utils.CompanyConstants.*;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class CreateFactory {
    private static Logger log = Logger.getLogger(CreateFactory.class.getName());

    public void create(String company) {
        UIAbstractFactory factory = null;

        if(company.equals(namePradaCompany)) {
            factory = new PradaUIFactory();
            log.info("create PradaUIFactory");
        }
        else if(company.equals(nameVersaceCompany)) {
            factory = new VersaceUIFactory();
            log.info("create VersaceUIFactory");
        }

        if (factory != null) {
            Jackets jackets = factory.getJackets();
            log.info("getJackets: " + jackets.getJacketsCompany());
            Scarves scarves = factory.getScarves();
            log.info("getScarves: " + scarves.getScarvesCompany());
            Shirts shirts = factory.getShirts();
            log.info("getShirts: " + shirts.getShirtsCompany());
        }
    }
}
