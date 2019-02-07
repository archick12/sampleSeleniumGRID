# sampleSeleniumGRID


* Download selenium-server-standalone.jar and put it in the projects root folder
https://www.seleniumhq.org/download/
* Download binraies for browser and put them in the same folder with selenium-server-standalone.jar
1) https://github.com/mozilla/geckodriver/releases
2) http://chromedriver.chromium.org/
* Start GRID server
```
chmod +x selenium-server-standalone-3.13.0.jar
java -jar selenium-server-standalone-3.13.0.jar -role hub
java -jar selenium-server-standalone-3.13.0.jar -role node
```
* Run test
```mvn clean test```
*
