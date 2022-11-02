import java.util.Scanner;

public class shorts {
    private String shorts_name;
    public String shorts_color;
    public float shorts_price;

    public shorts(String name, String color, float price) {
        this.shorts_name = name;
        this.shorts_color = color;
        this.shorts_price = price;
    }

    public shorts(float price) {
        this.shorts_price = price;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название шорт:");
        shorts_name = in.nextLine();
        System.out.println("Введите цвет шорт:");
        shorts_color = in.nextLine();
        System.out.println("Введите стоимость шорт:");
        shorts_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название шорт:" + shorts_name + " Цвет шорт:" + shorts_color + " Стоимость шорт:" + shorts_price);
    }
}