import java.util.Scanner;

public class cap {
    private String cap_name;
    public String cap_color;
    public float cap_price;

    public cap(String name, String color, float price) {
        this.cap_name = name;
        this.cap_color = color;
        this.cap_price = price;
    }

    public cap(float price) {
        this.cap_price = price;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название шапочки:");
        cap_name = in.nextLine();
        System.out.println("Введите цвет шапочки:");
        cap_color = in.nextLine();
        System.out.println("Введите стоимость шапочки:");
        cap_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название шапочки:" + cap_name + " Цвет шапочки:" + cap_color + " Стоимость шапочки:" + cap_price);
    }
}