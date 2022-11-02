import java.util.Scanner;
import static java.lang.Math.abs;

public class swim {
    private static glasses _glasses;
    private static cap _cap;
    private static shorts _shorts;
    private static slippers _slippers;

    public swim(glasses _glasses, cap _cap, shorts _shorts, slippers _slippers) {
        this._glasses = _glasses;
        this._cap = _cap;
        this._shorts = _shorts;
        this._slippers = _slippers;
    }

    public swim(glasses _glasses) {
        this._glasses = _glasses;
    }

    public static void input() {
        _glasses.input();
        _cap.input();
        _shorts.input();
        _slippers.input();
    }

    public static void output() {
        _glasses.output();
        _cap.output();
        _shorts.output();
        _slippers.output();
    }

    public static void res() {
        float sum;
        sum = _glasses.glasses_price + _cap.cap_price + _shorts.shorts_price + _slippers.slippers_price;
        System.out.println("Итог: " + sum);
    }

    public static void color() {
        if ((_glasses.glasses_color.equals(_cap.cap_color)) && (_glasses.glasses_color.equals(_shorts.shorts_color)))
            System.out.println("У вас стильный total look");
        else
            System.out.println("У вас разноцветный комплект");
    }
}