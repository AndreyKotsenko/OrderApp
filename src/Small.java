public class Small extends Size{
    public Small(Beverage beverage)
    {
        super(beverage);
        this.m_cost = 1;
        this.m_description = "";
        this.setsize("Small");
        this.koef = 0.3;
    }

}
