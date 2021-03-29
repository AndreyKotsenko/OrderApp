public class CondimentDecoretor extends Beverage {

    protected Beverage beverage;
    public CondimentDecoretor(Beverage beverage)
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

        return this.m_cost + beverage.cost()+beverage.koef;
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
