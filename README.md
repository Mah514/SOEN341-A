# SOEN341-A
This is a command-line program which demonstrates various software design strategies while performing simple tasks.
The program performs the following tasks:

copy: Copy sourceFile to destinationFile

charcount: Count characters in a sourcefile

linecount: Count lines in a sourcefile

wordcount: Count words in a sourcefile

wc: Count characters, lines, and words


The command-line program supports the following options, each have short version(s)s and a long version.

HelpOption = "-?" | "-h" | "-help" : Print the usage of the program

VerboseOption = "-v" | "-verbose" : Verbose during the execution of the program

BannerOption = "-b" | "-banner" : Print the banner of the program


When the verbose option is enabled, the execution of:

• copy prints a dot (.) for every character copied from the source to the destination file.

• wc prints c for every character found, w for every word found, and l for every line found.
