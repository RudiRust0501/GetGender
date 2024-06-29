# SWAGLABS Mobile Apps
##Assignment for Sr. Automation QA Candidate (Flip.id)

## Features

- Add Product of SwabLabs
- Remove Product purchased
- Check Out on product purchased
- Payment flow 
- Small Mobile Apps for learning Mobile automations with Appium and Java



## Tech

How to Set up Android Automation Testing On MacOS/Windows

* Install Java
* Install Appium
* Install Xcode
* Install Xcode Command Line Tools
* WebDriver Agent
* Real Devices Or Simulator
* Install IDE (Eclipse or IntelliJ or Android Studio)


## Installation
Step 1: Install Java JDK
Please follow the instructions provided by Oracle to download and install Java JDK: https://www.oracle.com/java/technologies/javase-downloads.html.

* Set environment variables
* JAVA_HOME
* PATH
* Java-version


Configure Java_Home/Set environment variables on Windows
* Check Java installation on C:\Program files\Java\jdk1.8.0.1 (jdk version example)
* copy this path
* Go to Control Panel, choose Advanced System Settings
* Go to Properties, click Advanced Tab, click button Environment Variable
* Create New System variable
Variable Name  :  JAVA_HOME
Variable Value   :  C:\Program files\Java\jdk1.8.0.1
Click OK


#Check Java version on your Mac
Go to Terminal

```sh
java -version
```
Check Java compiler 

```sh
javac -version
```
If not setup can following on this web or you want to try other automation :
https://automationstepbystep.com

Step 2 : Install Homebrew (missing package manager for MacOS)
Install from https://brew.sh/
Run this command on Terminal:
```sh
/bin/bash -c "$(curl -fsSL 
```
source from : 
https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh

Step 3 : Install NodeJS and npm (node package manager)
Run this command on Terminal (Mac OS):
```sh
Brew install node
node -v
npm -v
```

on Windows download for NodeJS
https://nodejs.org/en/download
choose for Windows Installer  (.msi)

Create New System Variable on Windows
* Go to Control Panel, choose Advanced System Settings
* Go to Properties, click Advanced Tab, click button Environment Variable
* Create New System variable
Variable Name  :  NODE_HOME
Variable Value   :  C:\Program files\nodejs
Click OK


* Go to Control Panel, choose Advanced System Settings
* Go to Properties, click Advanced Tab, click button Environment Variable
* Create New/Add New Path
 C:\Program files\nodejs\node_modules\npm\bin

Step 4 : Install Appium
command on Teminal
```sh
npm install -g appium
or
npm install appium
```

Install Appium Desktop (Optional)


Step 5 : Get Xcode
Xcode is the development and debug environment on Mac.
Provides required tools, files for dev/automation for Mac and iOS apps
Go to App Store and search Xcode
Or download xcode from browser (xcode apple developer)
Or download for Apple Developers

Step 6 : Install XCode command line tools
Open terminal and run
```sh
xcode-select –install
```

Step 7 : Create Apple ID
Go to Xcode > preference > account
Add Apple ID

Step 8 : Install Carthage
Still on Terminal
```sh
brew install Carthage
```
In order to launch WebDriverAgent, your macOS will need to have Carthage installed
(Not needed for automation on Android)

Step 9 : Initialize WebDriverAgent Project 
On Terminal CD to WebDriverAgent Folder
WebDriverAgent will be found in : 
/path/where/installed/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent

For Appium Desktop :
/Applications/Appium.app/Contents/Resources/app/node_modules/appium-xcuitest-driver/WebDriverAgent

For Appium Installed through node :
/usr/local/lib/node_modules/appium-xcuitest-driver/WebDriverAgent
Mkdir -p Resources/WebDriverAgent.bundle./Script/bootstrap.sh -d

Note : this command needs Carthage to be installed
Go to Folder on MacOS = Command + Shift + G

If you don’t found which the position, you can go to terminal and type 
which appium

If you not yet install appium through node
Type this on terminal command :
```sh
npm install -g appium
```
XCUitest (iOS) - Appium
https://appium.io/docs/en/drivers/ios-xcuitest/
cd /usr/local/lib/node_modules/appium/node_modules/appium-xcuiteest-driver/WebDriverAgent/

For uninstall NPM and appium :
```sh
npm uninstall -g appium
```

Step 10 : Open WebDriverAgent.xcodeproj in Xcode
Set JAVA_HOME on Appium UI
/Library/Java/JavaVirtualMachines/jdk-17.0.2.jdk/Contents/Home

Set ANDROID_HOME on Appium UI
/Users/indochatqa1/Library/Android/sdk

Step 11 : Install mjpeg-consumer module
```sh
npm i -g mjpeg-consumer 
```

Set-simulator-location
```sh
brew install lyft/formulae/set-simulator-location 
```

Step 12 : Install Appium Inspector for Mac
```sh
brew install gstreamer gst-plugins-base gst-plugins-good gst-plugins-bad gst-plugins-ugly gst-libav
```
brew install bundletool

Additional Notes :
For Check Java Home on your Mac
```sh
java -XshowSettings:properties -version 2>&1 > /dev/null | grep 'java.home'
or
/usr/libexec/java_home --v
```

Step 13 Download Android Studio and find out the Android SDK Path
Download Android Studio from
https://developer.android.com/studio?gclid=Cj0KCQjwoeemBhCfARIsADR2QCsmB2WBHQbnX4aMVNwyPEESErgsSBLzDxNRi3BcMf0f7RirmNwWNz8aAhqXEALw_wcB&gclsrc=aw.ds

Create New/Edit Path System variable
* Go to Control Panel, choose Advanced System Settings
* Go to Properties, click Advanced Tab, click button Environment Variable

C:\User\......\AppData\Local\Android\sdk\tools\bin
C:\User\......\AppData\Local\Android\sdk\tools
and    C:\User\......\AppData\Local\Android\sdk\platform-tools

This is after complete all setting, you can check all setting is already done on macOS, with this command on Terminal
```sh
vi ~/.bash_profile
```

Configure Emulator/Virtual Device
1. open Android Studio
2. Create new Project (just dummy project)
3. After all file loaded, choose Tools menu → AVD Manager and SDK Manager
4. Click AVD Manager, then will show Your Virtual Device
5. Choose Create Virtual Device
6. Select what kind device you need
7. Click Next and if you don’t have virtual device you need, you can choose download first
8. Create AVD Name (any AVD name you like)
9. Finish

Add Other Editor
Install Eclipse IDE or IntelliJ IDEA


## Plugins
...
Install TestNG Plug In on Eclipse
1. Go to Help menu —→ Eclipse Marketplace
2. Search/Find TestNG (TestNG for Eclipse)
3. Install and Restart Eclipse after Install success

DO NOT SKIP - Important Note on dependencies version compatibility
Please go through below checklist and make sure you have correct configurations. If not you will run into issues
1.  Node version minimum should be 16. you can check your version with below command
node -v
If it is less than 16, please upgrade
2.  use latest Appium Server 2.0 version. If you use older Version 1.22, then you will run into issues.
If you have less than 2 version, use below steps to install correctly
```sh
npm uninstall -g appium
Delete  appium folder in node modules
npm install -g appium@next
```
3.  Appium Java client 8.0.0 has few bugs. So please select the  version Greater than 8.0.0 from mavenrepository.com. ( Always select latest available)
4.  Do not include any Selenium dependencies as of now in your project, I will later show what packages needs to be installed once we move into framework lectures,
5.  If you use Mac, check for profile using bash profile or -zsh, if your Mac use -zsh so you need set JAVA HOME and ANDROID HOME on -zsh, with this command open ~/.zprofile
edit and save, then run this command : source ~/.zprofile

## Development
So, as of now,  Below is Latest perfect working ( Appium & TestNG ) Combination  which you can have in your POM.xml Project for smoother execution 
<dependency>
<groupId>io.appium</groupId>
<artifactId>java-client</artifactId>
<version>8.5.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.8.0</version>
</dependency>

Install Appium Driver
check available driver on Terminal :
```sh
appium driver list
```
So you need uiautomator2 driver to automate your android device or emulator
for install is simply just use this command :
```sh
appium driver install uiautomator2
```
for IOS Automate just install xcuitest 


#Instructions for local execution
How to run Appium on your Mac
1. Open Appium Inspector and Set Up Appium Inspector
Remote Host = 127.0.0.1
Remote Port =4723
Remote Path =/wd/hub

2. Set Desired Capabilities on Appium Inspector
for example :
{
  "platformName": "Android",
  "appium:deviceName": "Pixel 5 API 32",
  "appium:app": "/Users/indochatqa1/Downloads/facebook.apk",
  "appium:automationName": "UIAutomator2",
  "appium:platformVersion": "12.0",
  "appium:noReset": true
}

Save your Desired Capabilities for next run

For reference about Desired Capabilities, please read on this doc :
https://appium.io/docs/en/2.0/guides/caps/

3. Open Appium (Appium Server)
Set on General
Server Address set to : 127.0.0.1 (for local host)
Server Port : 4723

don’t forget for Edit Configurations, set Environment Variables for ANDROID_HOME and JAVA_HOME
ANDROID_HOME = /Users/indochatqa1/Library/Android/sdk
JAVA_HOME = /Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home/bin

Check for that path, for same Laptop/PC or OS (Windows) maybe will have different path for this.
After Set this Path, click Save and Restart Appium Server.

If you still wrong for set ANDROID_HOME or JAVA_HOME, will show error message.

4. Open Android Studio
After Android Studio opened, please 
* Create new project 
* Download ADB for Android Emulator/Virtual Device
* Create Emulator, choose the device and Run the emulator
for this i use Pixel 3a API 32

prepare for sample .apk for test running on Appium and for get the element of some mobile applications.

5. Check Appium Server, if server already running and Android Studio for Emulator already running. then now Start Session on Appium Inspector

After all 3 apps is running well, we can start to find the element, send Keys, Click etc on Appium Inspector
for example on this video :
https://drive.google.com/file/d/15b0oihncMzSBX9WLerMG2T2YIOtYMaNQ/view?usp=share_link
we can start Recording for each step and get the element








