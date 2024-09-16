package beauty.shoes;

import design.console.Design;
import shoes.Shoes;

public class Sandals extends Shoes {
    private final boolean openness;
    public Sandals()
    {
        super();
        this.openness = false;
    }
    public Sandals(String producer, int size, String color, boolean openness) {
        super(producer, size, color);
        this.openness = openness;
    }

    public Sandals(int size, String color, boolean openness)
    {
        super(size, color);
        this.openness = openness;
    }
    public String getOpenness()
    {
        if (this.openness)
        {
            return "СИЛЬНО";
        }
        else {
            return "НЕТ";
        }
    }
    @Override
    public String getBrand()
    {
        return "beauty.shoes.Sandals";
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
