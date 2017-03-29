package demo;


import abstractFactoryPattern.CreateFactory;
import static utils.CompanyConstants.*;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        CreateFactory factory = new CreateFactory();
        factory.create(namePradaCompany);
        factory.create(nameVersaceCompany);
    }
}
