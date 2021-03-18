package com.hybris.internship.streamAPI.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingFiles {

    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("src/main/resources/wordFile.txt"));

        lines
                .filter(s -> s.length() > 6)
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        Stream<String> lines1 = Files.lines(Paths.get("src/main/resources/wordFile.txt"));
        List<String> words = lines1
                .filter(s -> s.contains("th"))
                .collect(Collectors.toList());
        words.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        Stream<String> rows = Files.lines(Paths.get("src/main/resources/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(s -> s.split(","))
                .filter(strings -> strings.length > 3)
                .count();
        System.out.println(rowCount + " good rows");

        Stream<String> rows1 = Files.lines(Paths.get("src/main/resources/stockDataCsv.txt"));
        rows1
                .map(s -> s.split(","))
                .filter(strings -> strings.length > 3)
                .filter(strings -> Integer.parseInt(strings[1].trim()) > 15)
                .forEach(s -> System.out.println(s[0].trim() + " " + s[2].trim() + " " + s[3].trim()));

        lines.close();
        lines1.close();
        rows.close();
        rows1.close();
    }
}
