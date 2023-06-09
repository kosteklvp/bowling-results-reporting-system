package com.kosteklvp.data;

import static lombok.AccessLevel.PRIVATE;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
public class DataFactory {

  static Stream<Arguments> resultsAndListsOfKnockedPinsProvider() {
    return Stream.of(
        arguments(300, List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)),
        arguments(0, List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)),
        arguments(90, List.of(9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0)),
        arguments(150, List.of(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5)),
        arguments(137, List.of(7, 2, 9, 0, 9, 0, 9, 0, 9, 1, 9, 1, 10, 10, 8, 0, 7, 1)),
        arguments(135, List.of(0, 6, 9, 1, 10, 6, 3, 7, 1, 9, 0, 5, 5, 10, 7, 3, 7, 0)),
        arguments(100, List.of(1, 9, 0, 9, 9, 0, 6, 0, 1, 5, 7, 0, 8, 2, 7, 0, 9, 0, 10, 10, 0)),
        arguments(92, List.of(9, 1, 9, 0, 8, 0, 0, 10, 7, 2, 0, 4, 8, 1, 0, 6, 3, 0, 8, 0)),
        arguments(112, List.of(3, 5, 7, 0, 3, 7, 0, 3, 3, 3, 10, 9, 1, 8, 2, 6, 2, 9, 1, 6)),
        arguments(157, List.of(8, 2, 10, 7, 1, 7, 1, 8, 0, 9, 0, 10, 10, 9, 1, 10, 7, 0)),
        arguments(133, List.of(9, 1, 8, 2, 10, 7, 3, 5, 3, 3, 4, 8, 2, 0, 7, 8, 2, 0, 10, 8)),
        arguments(146, List.of(10, 10, 6, 0, 10, 10, 0, 9, 7, 0, 7, 0, 9, 1, 9, 1, 7)),
        arguments(179, List.of(9, 1, 10, 10, 7, 3, 6, 3, 9, 1, 10, 9, 1, 9, 1, 9, 0)),
        arguments(89, List.of(3, 4, 9, 0, 3, 0, 0, 9, 5, 5, 10, 3, 0, 0, 1, 10, 0, 7)),
        arguments(113, List.of(9, 1, 4, 4, 9, 0, 9, 0, 9, 1, 9, 0, 9, 0, 9, 0, 9, 0, 10, 8, 0)),
        arguments(30, List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2)),
        arguments(118, List.of(1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 9)),
        arguments(149, List.of(8, 2, 5, 4, 9, 0, 10, 10, 5, 5, 5, 3, 6, 3, 9, 1, 9, 1, 10)),
        arguments(122, List.of(8, 0, 7, 0, 5, 3, 9, 1, 9, 1, 10, 8, 0, 5, 1, 3, 7, 9, 0)),
        arguments(133, List.of(8, 2, 9, 0, 4, 4, 7, 2, 9, 0, 10, 10, 8, 0, 3, 5, 9, 1, 7)),
        arguments(163, List.of(5, 3, 3, 3, 3, 4, 10, 10, 10, 5, 3, 3, 7, 10, 10, 4, 3)),
        arguments(154, List.of(7, 1, 3, 3, 4, 5, 4, 5, 10, 10, 10, 10, 5, 5, 2, 3)),
        arguments(154, List.of(3, 2, 3, 7, 10, 10, 10, 10, 4, 3, 3, 3, 3, 3, 3, 6)),
        arguments(148, List.of(4, 3, 4, 4, 5, 6, 4, 5, 10, 10, 10, 10, 4, 3, 2, 3)),
        arguments(143, List.of(9, 0, 0, 2, 3, 5, 10, 10, 10, 10, 6, 2, 2, 2, 6, 2)),
        arguments(169, List.of(5, 5, 4, 5, 8, 2, 10, 0, 10, 10, 6, 2, 10, 4, 6, 10, 10)),
        arguments(186, List.of(5, 5, 4, 0, 8, 1, 10, 0, 10, 10, 10, 10, 4, 6, 10, 10, 5)),
        arguments(292, List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2)),
        arguments(287, List.of(8, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 7)),
        arguments(271, List.of(9, 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2)));
  }

  static Stream<List<Integer>> listsOfKnockedPinsProvider() {
    return Stream.of(
        List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10),
        List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        List.of(9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0),
        List.of(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
        List.of(7, 2, 9, 0, 9, 0, 9, 0, 9, 1, 9, 1, 10, 10, 8, 0, 7, 1),
        List.of(0, 6, 9, 1, 10, 6, 3, 7, 1, 9, 0, 5, 5, 10, 7, 3, 7, 0),
        List.of(1, 9, 0, 9, 9, 0, 6, 0, 1, 5, 7, 0, 8, 2, 7, 0, 9, 0, 10, 10, 0),
        List.of(9, 1, 9, 0, 8, 0, 0, 10, 7, 2, 0, 4, 8, 1, 0, 6, 3, 0, 8, 0),
        List.of(3, 5, 7, 0, 3, 7, 0, 3, 3, 3, 10, 9, 1, 8, 2, 6, 2, 9, 1, 6),
        List.of(8, 2, 10, 7, 1, 7, 1, 8, 0, 9, 0, 10, 10, 9, 1, 10, 7, 0),
        List.of(9, 1, 8, 2, 10, 7, 3, 5, 3, 3, 4, 8, 2, 0, 7, 8, 2, 0, 10, 8),
        List.of(10, 10, 6, 0, 10, 10, 0, 9, 7, 0, 7, 0, 9, 1, 9, 1, 7),
        List.of(9, 1, 10, 10, 7, 3, 6, 3, 9, 1, 10, 9, 1, 9, 1, 9, 0),
        List.of(3, 4, 9, 0, 3, 0, 0, 9, 5, 5, 10, 3, 0, 0, 1, 10, 0, 7),
        List.of(9, 1, 4, 4, 9, 0, 9, 0, 9, 1, 9, 0, 9, 0, 9, 0, 9, 0, 10, 8, 0),
        List.of(1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2),
        List.of(1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 9),
        List.of(8, 2, 5, 4, 9, 0, 10, 10, 5, 5, 5, 3, 6, 3, 9, 1, 9, 1, 10),
        List.of(8, 0, 7, 0, 5, 3, 9, 1, 9, 1, 10, 8, 0, 5, 1, 3, 7, 9, 0),
        List.of(8, 2, 9, 0, 4, 4, 7, 2, 9, 0, 10, 10, 8, 0, 3, 5, 9, 1, 7),
        List.of(5, 3, 3, 3, 3, 4, 10, 10, 10, 5, 3, 3, 7, 10, 10, 4, 3),
        List.of(7, 1, 3, 3, 4, 5, 4, 5, 10, 10, 10, 10, 5, 5, 2, 3),
        List.of(3, 2, 3, 7, 10, 10, 10, 10, 4, 3, 3, 3, 3, 3, 3, 6),
        List.of(4, 3, 4, 4, 5, 6, 4, 5, 10, 10, 10, 10, 4, 3, 2, 3),
        List.of(9, 0, 0, 2, 3, 5, 10, 10, 10, 10, 6, 2, 2, 2, 6, 2),
        List.of(5, 5, 4, 5, 8, 2, 10, 0, 10, 10, 6, 2, 10, 4, 6, 10, 10),
        List.of(5, 5, 4, 0, 8, 1, 10, 0, 10, 10, 10, 10, 4, 6, 10, 10, 5),
        List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2),
        List.of(8, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 7),
        List.of(9, 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2));
  }

  public static Stream<String> linesProvider() {
    return Stream.of(
        "Paweł Kowalski",
        "1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2",
        "Krzysztof Król",
        "9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9",
        "Izabela Kania",
        "4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4",
        "Adam Małysz",
        "10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10",
        "Kamil Stoch",
        "1, 9, 0, 9, 9, 0, 6, 0, 1, 5, 7, 0, 8, 2, 7, 0, 9, 0, 10, 10, 0",
        "Dawid Kubacki",
        "0, 6, 9, 1, 10, 6, 3, 7, 1, 9, 0, 5, 5, 10, 7, 3, 7, 0",
        "Piotr Żyła",
        "7, 2, 9, 0, 9, 0, 9, 0, 9, 1, 9, 1, 10, 10, 8, 0, 7, 1",
        "Dawid Kubacki",
        "5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5",
        "Stefan Hula",
        "9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0",
        "Klemens Murańka",
        "0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0",
        "Cristiano Ronaldo",
        "9, 1, 9, 0, 8, 0, 0, 10, 7, 2, 0, 4, 8, 1, 0, 6, 3, 0, 8, 0",
        "Leo Messi",
        "3, 5, 7, 0, 3, 7, 0, 3, 3, 3, 10, 9, 1, 8, 2, 6, 2, 9, 1, 6",
        "Robert Lewandowski",
        "8, 2, 10, 7, 1, 7, 1, 8, 0, 9, 0, 10, 10, 9, 1, 10, 7, 0",
        "Michał Wojciechowski",
        "9, 1, 8, 2, 10, 7, 3, 5, 3, 3, 4, 8, 2, 0, 7, 8, 2, 0, 10, 8",
        "Karol Małolepszy",
        "10, 10, 6, 0, 10, 10, 0, 9, 7, 0, 7, 0, 9, 1, 9, 1, 7",
        "Gracjan Warszawski",
        "9, 1, 10, 10, 7, 3, 6, 3, 9, 1, 10, 9, 1, 9, 1, 9, 0",
        "Piotr Kostański",
        "3, 4, 9, 0, 3, 0, 0, 9, 5, 5, 10, 3, 0, 0, 1, 10, 0, 7",
        "Mateusz 1",
        "1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2",
        "Mateusz 2",
        "9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9",
        "Mateusz 3",
        "1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6",
        "Mateusz 4",
        "9, 1, 4, 4, 9, 0, 9, 0, 9, 1, 9, 0, 9, 0, 9, 0, 9, 0, 10, 8, 0",
        "Arek",
        "1, 2, 3, 4, 5, 5, 6, 4, 7, 3, 8, 2, 9, 1, 10, 0, 1, 2, 3",
        "Darek",
        "0, 0, 0, 0, 3, 0, 7, 1, 0, 0, 3, 3, 1, 1, 4, 2, 1, 1, 0, 0",
        "Marek",
        "3, 3, 1, 1, 4, 2, 1, 1, 0, 0, 3, 3, 1, 1, 4, 2, 1, 1, 2, 3",
        "Jarek",
        "1, 2, 3, 4, 1, 2 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 4, 4",
        "Czarek",
        "10, 10, 9, 1, 9, 0, 9, 0, 5, 4, 10, 9, 0, 9, 1, 10, 4, 4");
  }

  public static Stream<Integer> singleDigitIntegersProvider() {
    return Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
  }

  public static Stream<Integer> multiDigitIntegersProvider() {
    return Stream.of(-100, -10, 11, 232, 1343, 10);
  }

  public enum ExampleFile {
    EXAMPLE_1("src/test/resources/examples/example1.txt"),
    EXAMPLE_2("src/test/resources/examples/example2.txt"),
    EXAMPLE_3("src/test/resources/examples/example3.txt"),
    EXAMPLE_4("src/test/resources/examples/example4.txt"),
    EXAMPLE_5("src/test/resources/examples/example5.txt"),
    EXAMPLE_6("src/test/resources/examples/example6.txt"),
    EXAMPLE_7("src/test/resources/examples/example7.txt");

    private final String path;

    ExampleFile(String path) {
      this.path = path;
    }

    public String getPath() {
      return path;
    }
  }

}
