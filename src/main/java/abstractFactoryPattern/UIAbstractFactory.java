package abstractFactoryPattern;

/**
 * Created by Anastasiya on 26.03.2017.
 */
public interface UIAbstractFactory {
    //all methods in interfaces are public abstract by default
    public Jackets getJackets();
    public Scarves getScarves();
    public Shirts getShirts();
}
