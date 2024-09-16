package beauty.shoes;

import design.console.Design;
import shoes.Shoes;

public class Sneakers extends Shoes {
    private final String firmProducer;
    public Sneakers()
    {
        super();
        this.firmProducer = "???";
    }
    public Sneakers(String producer, int size, String color, String firm) {
        super(producer, size, color);
        this.firmProducer = firm;
    }
    public Sneakers(int size, String color, String firm)
    {
        super(size, color);
        this.firmProducer = firm;
    }
    public String getFirmProducer()
    {
        return this.firmProducer;
    }
    @Override
    public String getBrand()
    {
        return "beauty.shoes.Sneakers";
    }
    @Override
    public String toString()
    {
        return Design.LIGHT_WHITE + Design.BOLD + "|" + Design.RED + Design.BOLD +
                " %-3d " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.PURPLE + Design.BOLD +
                " %-9s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.YELLOW + Design.BOLD +
                " %-13s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.GREEN + Design.BOLD +
                " %-6d " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.BLUE + Design.BOLD +
                " %-12s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.CYAN + Design.BOLD +
                " %-9s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.RED + Design.BOLD +
                " %-10s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.PURPLE + Design.BOLD +
                " %-14s " + Design.LIGHT_WHITE + Design.BOLD +
                "|" + Design.YELLOW + Design.BOLD +
                " %-9s " + Design.LIGHT_WHITE + Design.BOLD +
                "|\n";
    }

}
