package com.hui305.util;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hui_stone on 2019/1/1 0001.
 */
public class RandomUtil {

    private static Random random = new Random();

    public static int[] getRandomIntArrayInRange(int min,int max){
        return random.ints(min,(max+1)).limit(10).toArray();
    }
    public static int getRandomIntInRange(int min,int max){
        return random.ints(min,(max+1)).limit(1).findFirst().getAsInt();

    }
    public static void main(String[] args) {
        int[] array = RandomUtil.getRandomIntArrayInRange(100,200);
        Arrays.stream(array).forEach(System.out::println);

        int value = getRandomIntInRange(100,200);
        System.out.println("=============> "+ value);
    }
}
