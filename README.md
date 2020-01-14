# maven-surefire-plugin does not seem to pick up junit5-testreporter's messages
I created this project by copying https://github.com/junit-team/junit5-samples/tree/master/junit5-migration-maven, then introducing some
 changes aiming to illustrate the following behaviour: 

The message published by a Jupiter-API-TestReporter injected into a Test does not appear neither in the generated surefire report nor in console output.

[This surefire JIRA issue](https://issues.apache.org/jira/browse/SUREFIRE-1603 "Pass TestReporter entries to the reports generated by
 Surefire") seems to support my observation.
 
 Or am I not configuring the surefire plugin properly?  

`~/junit5-testreporter$ ./mvnw -U clean test`  
```
[...]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.project.TestReporterUsageTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.039 s - in com.example.project.TestReporterUsageTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.073 s
[INFO] Finished at: 2020-01-14T14:49:59+01:00
[INFO] ------------------------------------------------------------------------

```
Execution in IntelliJ IDE seems to [pick up the published message properly.](./Test%20Results%20-%20TestReporterUsageTest.html)
