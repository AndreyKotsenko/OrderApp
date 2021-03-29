public class Mokka extends Beverage {

    public Mokka()
    {
        m_description = "Mokka";
    }

    @Override
    public String getDescription()
    {
        return m_description;
    }

    @Override
    public double cost()
    {
        return 6.0;
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
