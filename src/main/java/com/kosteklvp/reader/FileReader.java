package com.kosteklvp.reader;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Collections.emptyList;
import static lombok.AccessLevel.PRIVATE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;

@AllArgsConstructor(access = PRIVATE)
public class FileReader {

  private final Path pathToFile;

  public List<String> readAllLines() throws IOException {
    List<String> lines = emptyList();

    lines = Files.readAllLines(pathToFile, UTF_8);

    lines = removeBlank(lines);

    return lines;
  }

  private List<String> removeBlank(List<String> lines) {
    return lines.stream()
        .filter(StringUtils::isNotBlank)
        .toList();
  }

  public static FileReader of(String path) {
    return new FileReader(Paths.get(path));
  }

}
