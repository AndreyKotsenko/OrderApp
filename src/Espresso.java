public class Espresso extends  Beverage {

    public Espresso()
    {
        m_description = "Espresso";
    }

    @Override
    public String getDescription()
    {
        return m_description;
    }

    @Override
    public double cost()
    {
        return 1.99;
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
