Get time ago android library
=========================================
[![JitPack](https://jitpack.io/v/JabirDev/get-time-ago.svg)](https://jitpack.io/#JabirDev/git-time-ago)

## Gradle
Add JitPack repository:
```java
repositories {
        maven { url 'https://jitpack.io' }
    }
```
And the dependency:
```java
dependencies {
    implementation 'com.github.JabirDev:get-time-ago:1.0.0'
}
```

## Screenshot
![get-time-ago](https://raw.github.com/JabirDev/get-time-ago/master/device-2019-12-17-145104.png.png)

## Usage

It's very simple to use, you just need to passing a date. This an example to get time ago.

```java
TextView tv = findViewById(R.id.textView);
@SuppressLint("SimpleDateFormat") SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'+'");
try {
   Date date = df.parse("2019-12-17T14:33:00+");
   tv.setText(TimeAgo.get(date));
} catch (ParseException e) {
   e.printStackTrace();
   tv.setText(e.getMessage());
}
```
