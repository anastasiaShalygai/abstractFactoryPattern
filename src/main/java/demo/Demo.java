package demo;


import abstractFactoryPattern.CreateFactory;

import static utils.CompanyConstants.namePradaCompany;
import static utils.CompanyConstants.nameVersaceCompany;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        CreateFactory factory = new CreateFactory();
        factory.create(namePradaCompany);
        factory.create(nameVersaceCompany);

        /*UIAbstractFactory versace = new VersaceUIFactory();
        UIAbstractFactory prada = new PradaUIFactory();
        factory.clothCreator(versace);
        factory.clothCreator(prada);*/

    }
}
