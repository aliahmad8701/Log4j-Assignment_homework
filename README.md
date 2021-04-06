# Log4j Assignment
![Alt text](https://lh3.googleusercontent.com/proxy/66ka38lx2tjuPxEX_3WLUssSz9wX47uYsKWMstGNGbJDceZCd6XDALR6XWUZcHBV3_GWYu4DSttR7wMjp05t-D_8wsuXYIe6w-ErNqB1TulJRgXP63Y?raw=true "Title")


The assignment demonstrates the use of the following two features of [Apache Log4j 2](https://logging.apache.org/log4j/2.x/):

-   [Markers](https://logging.apache.org/log4j/2.x/manual/markers.html)
-   [Thread Context](https://logging.apache.org/log4j/2.x/manual/thread-context.html)

Markers provide a means for tagging log messages that enables the filtering of messages of various types. For example, different markers can be used for logging user interface events and database operations. Thread Context enables automatic insertion of values from key-value pairs into log messages.

Create an Apache Maven project with the following two dependencies:

-   [`org.apache.logging.log4j:log4j-api:2.14.1`](https://search.maven.org/artifact/org.apache.logging.log4j/log4j-api/2.14.1/jar)
-   [`org.apache.logging.log4j:log4j-core:2.14.1`](https://search.maven.org/artifact/org.apache.logging.log4j/log4j-core/2.14.1/jar)

Create a `Main` class whose `main` method logs the lines of a nursery rhyme in a loop, where the number of iterations must be provided as a command-line argument. The lines of the poem must be logged at various levels. You must use at least two different markers for logging. All but one of the log messages generated in the loop must be marked with a marker. For example, you can use different markers for assertions (e.g., The mouse ran up the clock.) and gibberish (e.g., Hickory, dickory, dock.). You must add some delay between the iterations with the [`Thread.sleep(long millis)`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#sleep(long)) method.

Create a `log4j2.xml` configuration file that configures a `ConsoleAppender` and an appropriate number of `FileAppender`s as follows.

All log messages must be shown on the console. Log messages marked with different markers must be written to different files. For this purpose, you must use [`MarkerFilter`](https://logging.apache.org/log4j/2.x/manual/filters.html#MarkerFilter)s. Log messages not marked with any marker must be written to a separate file using a [`NoMarkerFilter`](https://logging.apache.org/log4j/2.x/manual/filters.html#NoMarkerFilter).

Log messages written to the console and log files must contain the current iteration number. The iteration number must be automatically inserted with the [`ThreadContext`](https://logging.apache.org/log4j/2.x/log4j-api/apidocs/org/apache/logging/log4j/ThreadContext.html) class and the [`%X`](https://logging.apache.org/log4j/2.x/manual/layouts.html#PatternMDC) conversion pattern of [`Pattern Layout`](https://logging.apache.org/log4j/2.x/manual/layouts.html#PatternLayout). It is not allowed to refer to the iteration number in the logging methods.

A separate `FileAppender` must be configured such that messages logged during the curfew hours (i.e., between 20:00 and 05:00) must be written to a separate file. This requires a properly configured [`TimeFilter`](https://elearning.unideb.hu/mod/assign/code>https://logging.apache.org/log4j/2.x/manual/filters.html#TimeFilter</code).

