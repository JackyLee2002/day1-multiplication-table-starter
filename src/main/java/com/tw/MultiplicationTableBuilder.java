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
        Boolean isStartNotBiggerThanEnd = isStartNotBiggerThanEnd(start, end);
        Boolean areNumbersWithinRange = areNumbersWithinRange(start, end);
        if (isStartNotBiggerThanEnd == null || areNumbersWithinRange == null) {
            return null;
        }
        if (isStartNotBiggerThanEnd && areNumbersWithinRange) {
            return createFormattedMultiplicationTableString(start, end);
        } else {
            return null;
        }
    }

    public Boolean areNumbersWithinRange (int start, int end)  {
        return (1 < start && start <= 1000) && (1 < end && end <= 1000) ? true : null;
    }

    public Boolean isStartNotBiggerThanEnd (int start, int end) {
        return start <= end ? true : null;
    }

    public String createFormattedMultiplicationTableString(int start, int end) {
        return java.util.stream.IntStream.rangeClosed(start, end)
                .mapToObj(
                        i -> java.util.stream.IntStream.rangeClosed(start, i)
                        .mapToObj(j -> String.format("%d*%d=%d", j, i, j * i))
                        .collect(java.util.stream.Collectors.joining(" ")))
                .collect(java.util.stream.Collectors.joining("\n")) + "\n";
    }
}
