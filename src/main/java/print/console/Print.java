package print.console;

import beauty.shoes.Boots;
import beauty.shoes.Sandals;
import beauty.shoes.Sneakers;
import design.console.Design;
import shoes.Shoes;

import java.util.List;

public class Print {

    public static void printer(List<Shoes> shoes)
    {
        printRow(shoes, printHeader(" N ", "ТИП ОБУВИ", "ПРОИЗВОДИТЕЛЬ", "РАЗМЕР", "    ЦВЕТ    ", "  ФИРМА  ", "ОТКРЫТОСТЬ", "РАЗМЕР КАБЛУКА", "  СЕЗОН  "));
    }

    public static StringBuilder printHeader(String ... headers)
    {
        int index = 0;
        String []colors = { Design.RED, Design.PURPLE, Design.YELLOW, Design.GREEN, Design.BLUE, Design.CYAN };
        StringBuilder headerFields = new StringBuilder();
        StringBuilder headerRow = new StringBuilder();
        for (String header : headers)
        {
            headerRow.append(Design.BOLD + Design.LIGHT_WHITE + "+").append("-".repeat(header.length() + 2));
        }
        headerRow.append(Design.BOLD + Design.LIGHT_WHITE + "+\n");
        for (String header : headers)
        {
            if (index > colors.length - 1)
            {
                index = 0;
            }
            headerFields.append(Design.BOLD).append(Design.LIGHT_WHITE).append("| ").append(colors[index]).append(header).append(Design.BOLD).append(Design.LIGHT_WHITE).append(" ");
            index += 1;
        }
        headerFields.append(Design.BOLD + Design.LIGHT_WHITE + "|\n");
        System.out.print(headerRow);
        System.out.print(headerFields);
        System.out.print(headerRow);
        return headerRow;
    }
    public static void printRow(List<Shoes> shoes, StringBuilder row)
    {
        int counter = 1;
        for (Shoes obj : shoes)
        {
            switch(obj.getClass().getSimpleName())
            {
                case "Sandals":
                    Sandals sandals = (Sandals) obj;
                    System.out.printf(sandals.toString(), counter,
                            "Босоножки", sandals.getProducer(), sandals.getSize(), sandals.getColor(),
                            "-", sandals.getOpenness(), "-", "-");
                    break;
                case "Boots":
                    Boots boots = (Boots) obj;
                    System.out.printf(boots.toString(), counter,
                            "Сапоги", boots.getProducer(), boots.getSize(), boots.getColor(),
                            "-", "-", boots.getHeelSize(), boots.getSoleType());
                    break;
                case "Sneakers":
                    Sneakers sneakers = (Sneakers) obj;
                    System.out.printf(sneakers.toString(), counter,
                            "Кроссовки", sneakers.getProducer(), sneakers.getSize(), sneakers.getColor(),
                            sneakers.getFirmProducer(), "-", "-", "-");
                    break;
            }
            counter += 1;
            System.out.print(row);
        }
    }
}

