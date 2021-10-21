package es.shahab;

import es.shahab.utils.StringUtils;

public class Main {

    public static void main(String[] args) {

        var mainString = "this is a test";
        var searchString = "a";

        System.out.println(new StringUtils(mainString).find(searchString));

    }
}
