# Bowling Results Reporting System

This is an application for reporting bowling results in a table. The user of the system should be able to enter a text file with a sequence of game results in bowling, and then get the results in the form of a table.

## Launching

Download executable jar file from **Releases** section and run it in command line. As the first argument, you must specify the path to the text file with the sequence of game results. Java 17 is required to run it.

#### Command
    java -jar brrs-1.0.jar example.txt

![example-cmd](https://user-images.githubusercontent.com/29569674/224686413-9d76b4c9-c8d8-4547-b5d5-c9a9afc577e6.jpg)

#### Characters explanation
    [/] - spare , [X] - strike, [ ] - precedes a strike / no roll

#### Example text file

    Kamil Stoch
    1, 9, 0, 9, 9, 0, 6, 0, 1, 5, 7, 0, 8, 2, 7, 0, 9, 0, 10, 10, 0
    Dawid Kubacki
    0, 6, 9, 1, 10, 6, 3, 7, 1, 9, 0, 5, 5, 10, 7, 3, 7, 0
    Piotr Żyła
    7, 2, 9, 0, 9, 0, 9, 0, 9, 1, 9, 1, 10, 10, 8, 0, 7, 1
    Stefan Hula
    9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0

More example files can be found in [/examples](https://github.com/kosteklvp/bowling-results-reporting-system/tree/main/examples) folder.

File should contain lines with the player's name and a sequence of points alternating. Blank lines in between are allowed.
Only numbers between 0 and 10 are allowed. There can be from 11 to 21 numbers in one player sequence.
