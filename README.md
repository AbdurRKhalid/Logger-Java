### Logger Exercise

This repository contains the implementation of a Basic and Generic Logger. The version of Java that has been used in this project is 18.

The project can be build using the following command:
```
mvn clean install
```

## Explanation about the Code
_enum LogLevel_ contains the basic levels of the Logger.

_interface LogTarget_ contains the basic *log()* method that can be overridden due to specified situation.

_EmailLogTarget class_ contains the implementation of *log()* method based on specific requirements.

_Logger class_ contains the implemntation of specifying the minimum log level and all other checking.

## Regarding Extra Points
1. Heavy usage: Performance of the Logger under heavy usage here depends upon many factors that includes how the console, email and calling to external server or API has been defined.
2. BIG O: Other than comparison there is no problem as due to comparison the time complaxity goes to O(N), other methods have constant time complexity which is O(1).
3. Safety in Multi Threading: Due to use of Synchronized keyword, we can say that only single thread can access the log targets and minimum level.
