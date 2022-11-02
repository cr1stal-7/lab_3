import java.util.Scanner;

public class slippers {
    private String slippers_name;
    private int slippers_size;
    public float slippers_price;

    public slippers(String name, int size, float price) {
        this.slippers_name = name;
        this.slippers_size = size;
        this.slippers_price = price;
    }

    public slippers(float price) {
        this.slippers_price = price;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название сланцев:");
        slippers_name = in.nextLine();
        System.out.println("Введите размер сланцев:");
        slippers_size = in.nextInt();
        System.out.println("Введите стоимость сланцев:");
        slippers_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название сланцев:" + slippers_name + " Размер сланцев:" + slippers_size + " Стоимость сланцев:" + slippers_price);
    }
}