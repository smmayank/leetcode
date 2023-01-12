package com.github.smmayank.leetcode;


public @interface Problem {

    String name() default "";

    int id() default 0;

    String url() default "";
}
