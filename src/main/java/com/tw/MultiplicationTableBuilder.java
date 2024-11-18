package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public Boolean areNumbersWithinRange (int start, int end)  {
        return (1 <= start && start <= 1000) && (1 <= end && end <= 1000) ? true : null;
    }

    public Boolean isStartNotBiggerThanEnd (int start, int end) {
        return start <= end ? true : null;
    }
}
