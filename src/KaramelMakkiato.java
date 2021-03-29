public class KaramelMakkiato extends Beverage {

    public KaramelMakkiato()
    {
        m_description = "KaramelMakkiato";
    }

    @Override
    public String getDescription()
    {
        return m_description;
    }

    @Override
    public double cost()
    {
        return 10.0;
    }

    @Override
    public  void setsize(String size)
    {
        this.size = size;
    }

    @Override
    public String getsize()
    {
        return size;
    }

}
