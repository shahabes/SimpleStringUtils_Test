package es.shahab.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringUtilsTest {

    private StringUtils stringUtils;
    private String mainString;

    @BeforeAll
    void init(){
        mainString = "Jon doe is a test expert.";
        stringUtils = new StringUtils(mainString);
    }

    @Test
    void findNormal() {
        var searchString = "expert";
        var index = stringUtils.find(searchString);
        assertEquals(index, mainString.indexOf(searchString));
    }

    @Test
    void findNull(){
        String searchString = null;
        var index = stringUtils.find(searchString);
        assertEquals(index, -1);
    }

    @Test
    void findEmpty(){
        var searchString = "";
        var index = stringUtils.find(searchString);
        assertEquals(index, -1);
    }

    @Test
    void findLargerSearchTerm(){
        var searchString = "Jon doe is a test expert. You know that...";
        var index = stringUtils.find(searchString);
        assertEquals(index, -1);
    }

    @Test
    void findTrimmed(){
        var searchString = "   is a test    ";
        var index = stringUtils.find(searchString);
        assertEquals(index, mainString.indexOf("is a test"));
    }
}