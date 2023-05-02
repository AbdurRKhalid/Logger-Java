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
