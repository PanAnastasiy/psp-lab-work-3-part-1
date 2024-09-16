package main;


/*Задание. Создать соответствующие классы.
  Создайте дополнительный класс WriterInfo, для вывода информации о классах.
*/

import beauty.shoes.Boots;
import beauty.shoes.Sandals;
import beauty.shoes.Sneakers;
import design.console.Console;
import design.console.Design;
import design.console.Developer;
import design.console.Message;
import menu.MenuMain;
import print.console.Print;
import shoes.Shoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Shoes> objects = new ArrayList<>();
        objectCreation(objects);

        MenuMain menu = new MenuMain();
        while (true)
        {
            menu.menuOfMain();
            switch(menu.getChoice())
            {
                case '1':
                    Console.clear();
                    Print.printer(objects);
                    Message.waitForEnter();
                    break;
                case '2':
                    Console.clear();
                    Developer.printInfoOfDeveloper();
                    Message.waitForEnter();
                    break;
                case '3':
                    Console.clear();
                    Message.printMessage("Осуществляем выход из программы...", Design.PURPLE, Design.RED);
                    System.exit(0);
                default:
                    Console.clear();
                    Message.printMessage("Выбран некорректный номер задачи...", Design.PURPLE, Design.RED);
                    Message.waitForEnter();
            }
        }
    }

    public static void objectCreation(List<Shoes> objects)
    {

        objects.add(new Boots());
        objects.add(new Boots(30, "Коричневые", 4));
        objects.add(new Boots("Япония", 44, "Синие", 4, false));
        objects.add(new Boots("Япония", 44, "Синие", 4, true));

        objects.add(new Sneakers());
        objects.add(new Sneakers("Германия", 48, "Белые", "Puma"));
        objects.add(new Sneakers(34, "Кашатановые", "Nike"));

        objects.add(new Sandals("Франция", 40, "Красные", true));
        objects.add(new Sandals());
        objects.add(new Sandals(37, "Голубые", false));

    }
}