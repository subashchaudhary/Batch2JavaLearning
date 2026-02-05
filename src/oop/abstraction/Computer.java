package oop.abstraction;

public interface Computer {


    //all the variable are static, final

    static final String TYPE = "DESKTOP";



    //all the method are public abstract

    public abstract void start();

    public abstract void stop();

    //Note: We cannot create an object of Interface
}
