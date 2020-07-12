# template-repository

## Description

The existing repository is a template, I can generate new repositories with the same directory structure, branches, and files.

## Contents

- [Setup Steps](#setup-steps)
- [How to run the project locally](#how-to-run-the-project-locally)
- [Tools](#tools)
- [Update Dependencies](#update-dependencies)
- [Releases](#releases)
- [Helpful resources](#helpful-resources)

## Setup Steps

Go to the app module build.gradle and add the following dependencies

```kotlin
implementation 'com.github.bumptech.glide:glide:4.9.0'
implementation 'androidx.cardview:cardview:1.0.0'
implementation 'com.squareup.retrofit2:retrofit:2.8.1'
implementation 'com.squareup.retrofit2:converter-gson:2.8.1'
implementation "androidx.recyclerview:recyclerview:1.1.0"
implementation "com.squareup.okhttp3:okhttp:4.4.0"
androidTestImplementation "com.squareup.okhttp3:mockwebserver:4.4.0"
androidTestImplementation 'com.jakewharton.espresso:okhttp3-idling-resource:1.0.0'
androidTestImplementation 'androidx.test:rules:1.2.0'
androidTestImplementation 'androidx.test:runner:1.2.0'
```

Go to the `AndroidManifest.xml` and allow internet permission

```kotlin
<uses-permission android:name="android.permission.INTERNET"/>
```

In the `AndroidManifest.xml`, make sure you add the name of the application you will use, in this instance it is `BusApp`.

```kotlin
android:name="BusApp"
```

In the `styles.xml`, make sure you change the style's parent if you don't want to show the action bar

```kotlin
<style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
```

The api we are fetching is not a normal list, it is an object that contains an array `results`, in the array `results` has the list of data we want. See how this api is different from other apis.

```kotlin
{
  "errorcode": "0",
  "errormessage": "",
  "numberofresults": 3,
  "stopid": "184",
  "timestamp": "08/07/2020 23:29:20",
  "results": [
    {
      "arrivaldatetime": "08/07/2020 23:31:42",
      "duetime": "2222",
      "departuredatetime": "08/07/2020 23:31:42",
      "departureduetime": "2",
      "scheduledarrivaldatetime": "08/07/2020 23:33:00",
      "scheduleddeparturedatetime": "08/07/2020 23:33:00",
      "destination": "O'Connell St",
      "destinationlocalized": "Sr. Uí Chonaill",
      "origin": "Harristown",
      "originlocalized": "Baile Anraí",
      "direction": "Outbound",
      "operator": "bac",
      "operatortype": "1",
      "additionalinformation": "",
      "lowfloorstatus": "no",
      "route": "4",
      "sourcetimestamp": "08/07/2020 23:24:15",
      "monitored": "true"
    },
```

## How to run the project locally

To run the unit tests locally.

```kotlin
./gradlew testdebugUnitTest
```

To run the ui tests locally, but first we need an emulator to be open.

```kotlin
./gradlew connectedCheck
```

## Tools

**Linter:** we use the following linter [link](https://github.com/github/super-linter).

**Uploading Artifacts:**  we use the following way to upload Artifacts, they allow you to persist data like test results after a job has completed, see the following documentation [link](https://docs.github.com/en/actions/configuring-and-managing-workflows/persisting-workflow-data-using-artifacts).

**Creating a Mock Server:** we use a mock server with Postman to quickly test apis, to see how to create a mock server, see the following video [link](https://www.youtube.com/watch?v=rJY8uUH2TIk). 

## Update Dependencies

**Npm:** How to update a npm package.
- [link](https://docs.npmjs.com/cli/update).

**Gemfile:** How to update a Gemfile package.
- [link](https://bundler.io/man/bundle-update.1.html#UPDATING-A-LIST-OF-GEMS).

## Releases

How to manage releases in a repository [link](https://help.github.com/en/github/administering-a-repository/managing-releases-in-a-repository). 

## Helpful resources

The following link provides very helpful information on Retrofit and mocking using MockWebServer.
- [link](https://www.raywenderlich.com/10091980-testing-rest-apis-using-mockwebserver).

The following link goes into leveling up your ui tests with MockWebServer
- [link](https://tech.okcupid.com/ui-tests-with-mockwebserver/).

The following link provides a guide on consuming apis with Retrofit
- [link](https://github.com/codepath/android_guides/wiki/Consuming-APIs-with-Retrofit).

The following link helps if you get the following error `Failed to open QEMU pipe 'qemud:network': Invalid argument`.
- [link](https://stackoverflow.com/a/57726127).

The following link provides information if you failed to define the application in the manifest.
- [link](https://stackoverflow.com/a/10607418).

The following link provides information on how to use the image dependency Glide, which is good for gifs.
- [link](https://github.com/bumptech/glide).