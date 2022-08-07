# MVVM-Clean-Architecture
Below are requirments on which project is developed

*	object oriented programming approach 
*	Clean Architecture (MVVM)
*	Use of Hilt
*	Use of Jetpack components (NavGraph, DataBinding)
*	Kotlin (Coroutines)
*	Retrofit and GSON
*	unit test and code coverage 


## Getting Started

### Prerequisites

* A device running Android 5.0 or newer
* [Android Studio](https://developer.android.com/studio/index.html) - The latest version of Android Studio


## Steps For Cloning Repository 

You can clone a repository from local computer to make it easier to test and Build this project.

* Click On Project
* Click on Code Button , a drop down containing repository link will appear.
* Copy the link and Paste it in your terminal by applying git clone repo-link command.
* Open Android Studio, Open Porject by navigating to project folder and select, open and buidl project.


To Test Coverage Report, open Project Build Folder App Level and run below given method.

```
task jacocoTestReport(type: JacocoReport, dependsOn: ['testDebugUnitTest', 'createDebugCoverageReport'])

```

this method will generate complete test coverage report inform of html

```
CleanArchitectureMVVM/app/build/reports/tests/testDebugUnitTest/index.html
```

Simply Copy and paste this link in you web-browser and check test coverage report


## Libraries Used For Unit Testings :
* Kluent for assertions 
* MockK for mocking
* Jacoco for test coverage report





