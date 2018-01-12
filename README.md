### **PageIndicatorView**
[ ![Download](https://api.bintray.com/packages/romandanylyk/maven/pageindicatorview/images/download.svg) ](https://bintray.com/romandanylyk/maven/pageindicatorview/_latestVersion)[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-PageIndicatorView-green.svg?style=true)](https://android-arsenal.com/details/1/4555)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

<img src="https://github.com/dinhtho/CircleIndicator/blob/master/image.png" width="500"/>
`PageIndicatorView` is light library to indicate ViewPager's selected page with different animations and ability to customise it as you need.

![](https://raw.githubusercontent.com/romandanylyk/PageIndicatorView/master/assets/preview_anim_drop.gif)

### **Integration**
To add `pageindicatorview` to your project, first make sure in root `build.gradle` you have specified the following repository:
```groovy
    repositories {
        jcenter()
    }
```
>***Note***: by creating new project in Android Studio it will have `jcenter` repository specified by default, so you will not need to add it manually.

Once you make sure you have `jcenter` repository in your project, all you need to do is to add the following line in `dependencies` section of your project `build.gradle`.

See latest library version [ ![Download](https://api.bintray.com/packages/romandanylyk/maven/pageindicatorview/images/download.svg) ](https://bintray.com/romandanylyk/maven/pageindicatorview/_latestVersion)
```groovy
compile 'com.romandanylyk:pageindicatorview:X.X.X'
```
If your project already use `appcompat-v7` support library, you can omit `PageIndicatorView` dependencies by adding a single .aar file to your project, that will decrease total amount of methods used in your project.

```groovy
compile 'com.romandanylyk:pageindicatorview:X.X.X@aar'
```

Keep in mind, that `PageIndicatorView` has min [API level 14](https://developer.android.com/about/dashboards/index.html) and these dependencies:

```groovy
 compile 'com.android.support:support-annotations:25.3.0'
 compile 'com.android.support:support-compat:25.3.0'
 compile 'com.android.support:support-core-ui:25.3.0'
```

### **Usage Sample**
Usage of `PageIndicatorView` is quite simple. All you need to do is to declare a view in your `layout.xml`  and call `setSelection` method to select specific indicator - that's it!

```java
PageIndicatorView pageIndicatorView = findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setCount(5); // specify total count of indicators
        pageIndicatorView.setSelection(2);
```


But if you're as lazy as I'm - then there is another option to handle `PageIndicatorView`

```xml
     <com.rd.PageIndicatorView
        android:id="@+id/pageIndicatorView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        app:piv_animationType="scale"
        app:piv_dynamicCount="true"
        app:piv_interactiveAnimation="true"
        app:piv_selectedColor="@color/gray_50"
        app:piv_unselectedColor="@color/gray_300"
        app:piv_viewPager="@id/viewPager"
        attrs:piv_padding="12dp"
        attrs:piv_radius="8dp" />
```