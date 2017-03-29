package abstractFactoryPattern.versaceFactory;

import abstractFactoryPattern.Jackets;
import abstractFactoryPattern.Scarves;
import abstractFactoryPattern.Shirts;
import abstractFactoryPattern.UIAbstractFactory;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class VersaceUIFactory implements UIAbstractFactory {
    @Override
    public Jackets getJackets() {
        return new VersaceJacketsImpl();
    }

    @Override
    public Scarves getScarves() {
        return new VersaceScarvesImpl();
    }

    @Override
    public Shirts getShirts() {
        return new VersaceShirtsImpl();
    }
}
