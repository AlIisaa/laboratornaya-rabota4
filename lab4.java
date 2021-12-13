import java.util.Scanner;
import java.util.Arrays;

public class lab4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Напишите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] newArray = null;
        System.out.println("Введите элементы массива через Enter:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
             }

        System.out.print ("Готовый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }

        System.out.println("Напишите число X:");
        int del = input.nextInt();

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == del){
                newArray = new int[array.length - 1];
                System.arraycopy(array, 0, newArray, 0, i);
                if (array.length - 1 - i >= 0) System.arraycopy(array, i + 1, newArray, i, array.length - 1 - i);
                break;
            }
        }
        System.out.println("Новый массив с удаленным числом:" + Arrays.toString(newArray));
    }
}
