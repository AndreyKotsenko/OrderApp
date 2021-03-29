import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GUI extends JFrame {

    private JButton buttonAdd = new JButton("Add");
    private JButton buttonPrint = new JButton("Print");
    private JTextField inputCount = new JTextField("", 5);
    private JLabel labelCount = new JLabel("Count:");
    private JLabel labelCoffee = new JLabel("Coffee:");
    private JLabel labelSize = new JLabel("Size:");
    private JLabel labelAdditive = new JLabel("Additive:");
    private final String[] data1 = { "Espresso", "HouseBlend" ,"KaramelMakkiato "  ,"Mokka","Glase"};
    private final String[] data2 = { "Mocha","Soy", "Slivki", "Karamel", "Университет"};
    private final String[] data3 = { "Small","Middle", "Big"};
    JList<String> list1 = new JList<String>(data1);
    JList<String> list2 = new JList<String>(data2);
    JList<String> list3 = new JList<String>(data3);
    ArrayList<Beverage> chek=new ArrayList<Beverage>();
    ArrayList<Double> quantity = new ArrayList<Double>();
    String print ="";



    public GUI() {
        super("Decorator");
        this.setBounds(100,100,450,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Beverage beverage1=null;
                switch(list1.getSelectedIndex())
                {
                    case 0:
                    {beverage1 = new Espresso();
                        break; }
                    case 1:
                    {beverage1 = new HouseBlend();
                        break; }
                    case 2:
                    {beverage1 = new Glase();
                        break; }
                    case 3:
                    {beverage1 = new Mokka();
                        break; }
                    case 4:
                    {beverage1 = new KaramelMakkiato();
                        break; }
                    default:
                    {
                        JOptionPane.showMessageDialog(GUI.this,
                                "Вы не выбрали напиток");
                        break; }
                }
                switch(list3.getSelectedIndex())
                {
                    case 0:
                    {beverage1 = new Small(beverage1);
                        break; }
                    case 1:
                    {beverage1 = new Middle(beverage1);
                        break; }
                    case 2:
                    {beverage1 = new Big(beverage1);
                        break; }
                    default:
                    { JOptionPane.showMessageDialog(GUI.this,
                            "Вы не выбрали размер");
                        break; }
                }
                switch (list2.getSelectedIndex())
                {
                    case 0:
                    {break;
                    }
                    case 1:
                    {beverage1 = new Mocha(beverage1);
                        break; }
                    case 2:
                    {beverage1 = new Soy(beverage1);
                        break; }
                    case 3:
                    {beverage1 = new Slivki(beverage1);
                        break; }
                    case 4:
                    {beverage1 = new Karamel(beverage1);
                        break; }
                    case 5:
                    {beverage1 = new Cognac(beverage1);
                        break; }
                    default:
                    {break; }
                }

                if (inputCount.getText() == "")
                {quantity.add(1.0); }
                else
                    quantity.add(Double.valueOf(inputCount.getText()));
                chek.add(beverage1);
                print +=beverage1.getDescription() + " " + beverage1.cost() +"\n";

            }
        });

        buttonPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             print = "Счет:";
             for(int i=0;i<chek.size();i++) {
                print += "\n" + quantity.get(i) +" x "+chek.get(i).getDescription()+" "+chek.get(i).getsize()+"............. "+chek.get(i).cost()+"$";}
            double a = 0;
            for (int i = 0; i < chek.size(); i++)
            quantity.set(i,quantity.get(i) * chek.get(i).cost());
            for (int i = 0; i < chek.size(); i++)
            a += quantity.get(i);
            print +="\n" + "Общий счет: "+ a +"$";
                chek.clear();
                quantity.clear();
            JOptionPane.showMessageDialog(null,
                        print,
                        "Output",
                        JOptionPane.PLAIN_MESSAGE);
    }
        });

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,2,2,2));
        container.add(labelCount);
        container.add(inputCount);
        container.add(labelCoffee);
        container.add(new JScrollPane(list1));
        container.add(labelAdditive);
        container.add(new JScrollPane(list2));
        container.add(labelSize);
        container.add(new JScrollPane(list3));
        container.add(buttonAdd);
        container.add(buttonPrint);
    }

}
