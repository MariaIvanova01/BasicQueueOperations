package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countToOffer = input[0];
        int countToPoll = input[1];
        int elToSearch = input[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < countToOffer; i++) {
            queue.offer(scan.nextInt());
        }
        for (int i = 0; i < countToPoll; i++) {
            queue.poll();
        }
        if (queue.contains(elToSearch)){
            System.out.println("true");
        }else if (!queue.contains(elToSearch)){
            if (queue.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(queue));
            }
        }
    }
}
