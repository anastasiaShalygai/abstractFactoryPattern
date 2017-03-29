package abstractFactoryPattern.versaceFactory;

import abstractFactoryPattern.Shirts;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class VersaceShirtsImpl implements Shirts {
    @Override
    public String getShirtsCompany() {
        return "Versace Shirts";
    }
}
