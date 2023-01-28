import java.util.Scanner;
public class Main {
    public static void main(String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите элементы массива: ");
            int n = in.nextInt();
            int[] mas = {n};
            int sum = 0;
            int min = mas[0];
            for (int i = 0; i <= mas.length - 1; i++){
                mas[i]= in.nextInt();
            }
            for(int i : mas){
                sum += i;
                if(i < min) {
                    min = i;
                }
            }
            double avg = (double) sum / mas.length;
            double summa = avg + min;
            System.out.println(summa);
        }
    }
