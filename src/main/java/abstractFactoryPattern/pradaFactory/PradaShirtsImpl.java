package abstractFactoryPattern.pradaFactory;

import abstractFactoryPattern.Shirts;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class PradaShirtsImpl implements Shirts {
    @Override
    public String getShirtsCompany() {
        return "Prada Shirts";
    }
}
