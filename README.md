# Android View Animations in Java
[![Build Status](https://travis-ci.org/gayankuruppu/android-view-animations-java.svg?branch=master)](https://travis-ci.org/gayankuruppu/android-view-animations-java) [![](https://jitpack.io/v/gayankuruppu/android-view-animations-java.svg)](https://jitpack.io/#gayankuruppu/android-view-animations-java) [![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

Android animations for views such as Button, TextView, ImageView and etc. Just import the library and start coding ;)

# Usage
## Gradle
Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
		...
 		maven { url 'https://jitpack.io' }
	}
}
```
## Add the dependency
```
dependencies {
  	implementation 'com.github.gayankuruppu:android-view-animations-java:1.0.1'
}
```
## Import render animations
```
import render.animations.*;
```
## Start animation
```
TextView TextView = findViewById(R.id.TextView);

Render render = new Render(MainActivity.this);
render.setAnimation(Attention.Wobble(TextView));
render.start();
```
