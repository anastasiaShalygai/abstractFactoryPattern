package abstractFactoryPattern.pradaFactory;

import abstractFactoryPattern.Jackets;
import abstractFactoryPattern.Scarves;
import abstractFactoryPattern.Shirts;
import abstractFactoryPattern.UIAbstractFactory;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class PradaUIFactory implements UIAbstractFactory {
    @Override
    public Jackets getJackets() {
        return new PradaJacketsImpl();
    }

    @Override
    public Scarves getScarves() {
        return new PradaScarvesImpl();
    }

    @Override
    public Shirts getShirts() {
        return new PradaShirtsImpl();
    }
}
