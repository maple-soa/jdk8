package com.maple.jdk8;

import java.util.Arrays;
import java.util.List;

public class LoopTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("GitHub代码提交");
    }
}
