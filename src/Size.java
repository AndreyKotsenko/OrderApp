public class Size extends Beverage {

    protected Beverage beverage;
    public Size(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + " " + this.m_description;
    }

    @Override
    public double cost()
    {
        return this.m_cost + beverage.cost();
    }

    @Override
    public void setsize(String size)
    {
        this.size = size;
    }

    @Override
    public String getsize()
    {
        return size;
    }

}
