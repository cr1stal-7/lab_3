import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	int k = 0;
	glasses _glasses = new glasses("glasses_name", "glasses_color" , 0);
	cap _cap = new cap("cap_name", "cap_color", 0);
	shorts _shorts = new shorts("shorts_name", "shorts_color", 0);
	slippers _slippers = new slippers("slippers_name", 0, 0);
	swim set = new swim(_glasses, _cap, _shorts, _slippers);
	swim.input();
	while (k != 4) {
		System.out.println("Введите:");
		System.out.println("1 - Для вывода вашего комплекта");
		System.out.println("2 - Для вывода итоговой стоимости");
		System.out.println("3 - Для анализа цветовой гаммы");
		System.out.println("4 - Завершить работу программы");
		Scanner in = new Scanner(System.in);
        k = in.nextInt();
		switch (k) {
		case 1:
			swim.output();
			break;
		case 2:
			swim.res();
			break;
		case 3:
			swim.color();
			break;
		}
	}
	}
}