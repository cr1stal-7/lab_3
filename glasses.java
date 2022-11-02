import java.util.Scanner;

public class glasses {
    private String glasses_name;
    public String glasses_color;
    public float glasses_price;

    public glasses(String name, String color, float price) {
        this.glasses_name = name;
        this.glasses_color = color;
        this.glasses_price = price;
    }

    public glasses(float price) {
        this.glasses_price = price;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название очков:");
        glasses_name = in.nextLine();
        System.out.println("Введите цвет очков:");
        glasses_color = in.nextLine();
        System.out.println("Введите стоимость очков:");
        glasses_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название очков:" + glasses_name + " Цвет очков:" + glasses_color + " Стоимость очков:" + glasses_price);
    }
}