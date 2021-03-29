public class HouseBlend extends Beverage{

    public HouseBlend()
    {
        m_description = "House Blend Coffee";
    }

    @Override
    public double cost()
    {
        return 0.89;
    }

    @Override
    public String getDescription()
    {
        return m_description;
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
