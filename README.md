# sampleSeleniumGRID


* Download binaries for browser
http://chromedriver.chromium.org/
or 
https://github.com/mozilla/geckodriver/releases
and put them in the same folder with selenium-standalone-server.jar
* start selenium serve (GRID)
```java -jar selenium-server-standalone-3.13.0.jar -role hub```
```java -jar selenium-server-standalone-3.13.0.jar -role node```
* run tests
```mvn clean test```
