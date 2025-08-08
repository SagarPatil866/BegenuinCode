
# Hybrid Automation Framework Setup (Web & Mobile Automation)

## Prerequisites

Before setting up and running the project, ensure you have the following installed on your machine:

###  IDE
- **Eclipse** or **IntelliJ IDEA** for writing and executing tests.

###  Java (17 or above)
- Install Java 17 or later.
- Verify the installation by running:
  
 `java -version`
 
###  Maven
- Install Maven by following the official guide: [Maven Installation Guide](https://maven.apache.org/install.html)
- Verify the installation by running:
Audio audio audio
 `mvn -version`

###  Setting Up Environment Variables (Windows)
If Java and Maven are not installed, install them and set up the **Environment Variables** correctly.
This applies to both **System Variables** and **User Variables**.
    
##  Running Tests via Maven

### Before Execution
1. Open the pom.xml file.
2. Uncomment the **SuiteXML** file you wish to execute and comment out the others.
3. Open the terminal and run:

   `mvn clean`

4. After the clean command executes successfully, run:
   
   `mvn integration-test`

5. The specified test suite in pom.xml will execute successfully.

---

##  Running Tests via TestNG
1. Right-click on the project folder.
2. Select **Run As** → **TestNG Suite**.

---

##  Project Structure

### Web Automation

| Component | Description |
|-----------|-------------|
| **Page Objects** | Located in com.locators |
| **Test Classes** | Located in com.genuine |
| **Configuration & Driver Setup** | Located in com.begenuin.utils |
| **SuiteXML Files** | Located in the build folder |
| **Driver Source Files** | Mac/Windows drivers in the drivers folder |

###  Mobile Automation (Android)

###  Prerequisites for Mobile Automation

To set up and run mobile automation, make sure the following tools and software are installed:

| Tool / Software                  | Purpose                                                                 |
|----------------------------------|-------------------------------------------------------------------------|
| **Appium (Server)**              | Executes mobile tests and shows logs                                    |
| **Android Studio**               | Manages virtual and physical Android devices                            |
| **Xcode** *(iOS only)*           | Required for running iOS tests                                          |
| **ADB (Android Debug Bridge)**   | Verifies if Android devices are connected                               |
| **Node.js & npm**                | Needed to install Appium and related packages                           |
| **Appium Inspector**             | Inspects UI elements of mobile apps                                     |
| **APK / IPA File**               | The mobile app to be tested (e.g., `Genuin_SDK_1.1.13_42.apk` or `Genuin_SDK_1.1.13_42.ipa`) |


#### Setup Steps
##### For Android:
1. Install **Appium** by following the [Appium Installation Guide](https://github.com/appium/appium).
2. Set up **Android Studio** and configure SDK & AVD Manager.
3. Install **ADB** and verify the installation by running:
   
   `adb devices`

####  Running Mobile Automation Tests

##### For Android:
1. Connect your Android device and verify its connection using:

   `adb devices`

2. Start the **Appium Server** by running:

   `appium`

3. Open **IntelliJ IDEA** and execute the following Maven commands:
   
   `mvn clean`
   
   `mvn test`
   
   `mvn integration-test`

4. Use **Appium Inspector** to verify the app is running correctly.
5. If using **Appium Server GUI**, configure the Java and Android paths, then start the server.
6. Ensure no other Appium servers are running before execution.

# Automation Framework Setup (ios)

A step-by-step guide to set up iOS automation testing using Appium and Xcode.

## Requirements

- macOS with Xcode installed  
- iOS device for testing  
- Appium 2.15.0  
- Appium Inspector  
- Node.js & npm (latest)  
- IPA or SDK file from the team  
- IDE (Eclipse or IntelliJ)

## Tools Used

- Appium: 2.15.0  
- Appium Inspector  
- Xcode (via App Store)  
- Node.js (via Homebrew or official installer)  
- Any IDE: Eclipse / IntelliJ

## Installation Steps

### 1. Xcode Setup

**Step 1**: Check if Xcode is already installed:  
`xcodebuild -version
`

**Step 2**: Check for compatible versions:  
https://developer.apple.com/support/xcode/

**Step 3**: Download Xcode from:
- App Store  
- https://developer.apple.com/xcode/

**Step 4**: Confirm Xcode setup  
`
/usr/bin/xcodebuild -version
`

### 2. Xcode Command Line Tools

**Check if installed**:  
`
xcode-select -p
`

**Install if needed**:
`
xcode-select --install
sudo xcode-select -s /Applications/Xcode.app/Contents/Developer
`

Or download from: https://developer.apple.com/download/all/

### 3. Install Appium

**Check Node.js & npm**:
`
node -v
npm -v
`

Download from: https://nodejs.org/en/download/

**Using Homebrew**:
`
brew install node
brew install npm
`

**Install Appium**:
`
npm i appium@2.15.0
`

**Verify Installation**:
`
appium -v
which appium
`

**Install Appium Doctor (Optional)**:
`
npm install -g appium-doctor
appium-doctor --ios
`

**Appium GUI**:  
Download: https://github.com/appium/appium-desktop/releases  
Use `.dmg` for macOS

### 4. Install iOS Driver (XCUITest)

Open terminal and run:
`
appium driver list
appium driver install xcuitest
`

Check driver requirements: https://appium.github.io/appium-xcuitest-driver/7.15/installation/requirements/

## Xcode & WebDriverAgent Setup

If using Appium GUI:
`
open /Applications/Appium\ Server\ GUI.app/Contents/Resources/app/node_modules/appium/node_modules/appium-webdriveragent/webdriveragent.xcodeproj
`

Path:  
Contents → Resources → app → node_modules → appium → node_modules → appium-webdriveragent → webdriveragent.xcodeproj

### Connect iOS Device

**Check UDID**:
`idevice_id -l
`

If command not found:
`
brew install libimobiledevice
`

**Update Target Info**:


- Set team: your Apple account or company account  
- Bundle identifier: `com.begenuin.genuinsdk` (must be unique)  
- Set iOS version >= 10.0


**Ensure device is connected and shown in Xcode**:

### Build the Project

Use `Cmd + B` or click build icon:
and run also

after that 
again go to this path 

`open /Applications/Appium\ Server\ GUI.app/Contents/Resources/app/node_modules/appium/node_modules/appium-webdriveragent`

Contents → Resources → app → node_modules → appium → node_modules → appium-webdriveragent → webdriveragent.xcodeproj
 
 and run this scrupt in the terminal 

`xcodebuild -project WebDriverAgent.xcodeproj -scheme WebDriverAgentRunner -destination ‘id=00008020-000xxx’ test -allowProvisioningUpdates`

and make enter 

### For any quary open the appium inspector and see the error and also the start the Appium server for that  

and better understanding  look the wordfile
(https://docs.google.com/document/d/13a8dsbMj-BWUwsUPH65NyT2iXEkk4gYLMe2nG61873E/edit?usp=sharing)










