public class Glase extends Beverage {
    public Glase()
    {
        m_description = "Glase";
    }

    @Override
    public String getDescription()
    {
        return m_description;
    }

    @Override
    public double cost()
    {
        return 4.0;
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
