# Android View Animations in Java
[![Build Status](https://travis-ci.org/gayankuruppu/android-view-animations-java.svg?branch=master)](https://travis-ci.org/gayankuruppu/android-view-animations-java) [![](https://jitpack.io/v/gayankuruppu/android-view-animations-java.svg)](https://jitpack.io/#gayankuruppu/android-view-animations-java) [![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14) ![GitHub repo size](https://img.shields.io/github/repo-size/gayankuruppu/android-view-animations-java)

### Animations

To animate the view, add the class name and specific animation method name`setAnimation` to an view. You can include the method `setDuration` to specify duration of animation. Default value for `duration` is `1000 Milliseconds`. Finally you need to add one of the following classes to the view:

| Class Name        |                    |                     |                      |
| ----------------- | ------------------ | ------------------- | -------------------- |
| `Attention`       | `Bounce`           | `Fade`              | `Flip`               |
| `Rotate`          | `Slide`            | `Zoom`              |                      |

| `Attention`       |                    |                    |                    |
| ----------------- | ------------------ | ------------------ | ------------------ |
| `Bounce`          |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/1-attention-bounce.c6335f3d.gif">| `Flash`              |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/2-attention-flash.27fb56e5.gif">|
| `Pulse`           |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/3-attention-pulse.ee6d1fae.gif">| `Ruberband`              |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/4-attention-ruberband.a701fa5b.gif">|
| `Shake`           |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/5-attention-shake.62d9243a.gif">| `Standup`              |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/6-attention-standup.553e1945.gif">|
| `Swing`           |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/7-attention-swing.602dd7aa.gif">| `Tada`              |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/8-attention-tada.faa9f3c1.gif">|
| `Wave`            |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/9-attention-wave.9a37979d.gif">| `Wobble`              |<img width="200" alt="portfolio_view" src="https://gayankuruppu.github.io/android-view-animations-java/static/media/10-attention-wobble.42ac8c56.gif">|



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
