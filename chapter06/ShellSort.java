package ch6.ex4;

import java.util.Scanner;

public class ShellSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셸 정렬(버전 1)");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }

        shellSort(x, input);

        System.out.println("오름차순으로 정렬을 진행하였습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void shellSort(int x[], int input){
        for(int h = input / 2; h > 0; h /= 2){
            for(int i = h; i < input; i++){
                int j;
                int tmp = x[i];
                for(j = i - h; j >= 0 && x[j] > tmp; j -= h){
                    x[j + h] = x[j];
                }
                x[j + h] = tmp;
            }
        }
    }
}
