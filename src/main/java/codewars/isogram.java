package codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class isogram {

    //проверка является ли слова изограммой (ни одна буква в слове не повторяется)
    // если есть повторяющиеся буквы вернуть false
    // если нет вернуть true

    public static boolean  isIsogram(String str) {


        return true;
    }

    @Test
    public void FixedTests() {
        assertTrue(isogram.isIsogram("Dermatoglyphics"));
        assertTrue(isogram.isIsogram("isogram"));
        assertFalse(isogram.isIsogram("moose"));
        assertFalse(isogram.isIsogram("isIsogram"));
        assertFalse(isogram.isIsogram("aba"));
        assertFalse(isogram.isIsogram("moOse"));
        assertTrue(isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(isogram.isIsogram(""));
    }
}
