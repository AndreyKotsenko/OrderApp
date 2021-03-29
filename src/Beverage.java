public abstract class Beverage {
    protected String m_description;
    protected double m_cost;
    protected String size;
    public double koef;
    public abstract String getDescription();
    public abstract double cost();
    public abstract void setsize(String size);
    public abstract String getsize();
}

