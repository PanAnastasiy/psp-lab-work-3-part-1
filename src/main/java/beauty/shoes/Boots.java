package beauty.shoes;

import design.console.Design;
import shoes.Shoes;

public class Boots extends Shoes
{
    private final int heelSize;
    private boolean soleType;
    public Boots()
    {
        super();
        this.heelSize = 0;
        this.soleType = false;
    }
    public Boots(String producer, int size, String color, int heelSize, boolean soleType) {
        super(producer, size, color);
        this.heelSize = heelSize;
        this.soleType = soleType;
    }
    public Boots(int size, String color, int heelSize)
    {
        super(size, color);
        this.heelSize = heelSize;
    }
    public int getHeelSize()
    {
        return this.heelSize;
    }
    public String getSoleType()
    {
        if (this.soleType)
        {
            return "Демисезон";
        }
        else {
            return "Зимние";
        }
    }
    @Override
    public String getBrand()
    {
        return "";
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
