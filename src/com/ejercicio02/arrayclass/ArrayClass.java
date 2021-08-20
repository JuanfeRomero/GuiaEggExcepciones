package com.ejercicio02.arrayclass;

import java.util.Arrays;

public class ArrayClass {
    String[] stringArray;
    int[] intArray;

    public ArrayClass(int stringArray, int intArray) {
        this.stringArray = new String[stringArray];
        this.intArray = new int[intArray];
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    @Override
    public String toString() {
        return "ArrayClass{" +
                "\nstringArray=" + Arrays.toString(stringArray) +
                "\n, intArray=" + Arrays.toString(intArray) +
                '}';
    }
}
