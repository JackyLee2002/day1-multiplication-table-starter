package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String formattedMultiplicationTable = builder.generateMultiplicationTable(start, end);

        System.out.println(formattedMultiplicationTable);
    }

    public String generateMultiplicationTable(int start, int end) {
        Boolean isStartNoBiggerThanEnd = isStartNotBiggerThanEnd(start, end);
        Boolean areNumbersWithinRange = areNumbersWithinRange(start, end);
        if (isStartNoBiggerThanEnd == null || areNumbersWithinRange == null) {
            return null;
        }
        if (isStartNoBiggerThanEnd && areNumbersWithinRange) {
            String formattedMultiplicationTable =  createFormattedMultiplicationTableString(start, end);
            return formattedMultiplicationTable;
        } else {
            return null;
        }
    }

    public Boolean areNumbersWithinRange (int start, int end)  {
        return (1 <= start && start <= 1000) && (1 <= end && end <= 1000) ? true : null;
    }

    public Boolean isStartNotBiggerThanEnd (int start, int end) {
        return start <= end ? true : null;
    }

    public String createFormattedMultiplicationTableString (int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i <= end; i++) { // generate line with line break
            for (int j = start; j <= i; j++) { // generate multiplication expression with space
                stringBuilder.append(String.format("%d*%d=%d", j, i, j*i));
                if (j != i) stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
