# Android Tracking

[![Version](https://jitpack.io/v/longdt57/Android-Tracking.svg)](https://github.com/longdt57/Android-Tracking/releases)

## Gradle Setup

https://jitpack.io/#longdt57/Android-Tracking

### build.gradle
```
repositories {
  maven { url "https://jitpack.io" }
}

```
### [module]/build.gradle

```

dependencies {
  implementation 'com.github.longdt57:Android-Tracking:{version}'
}
```

## How to Use
```
class HomeTracking @Inject constructor(
    private val defaultTracking: DefaultTracking,
) : Tracking by defaultTracking,
    Tracking.Launch,
    Tracking.BackClick {

    override val prefix: String get() = "HOME"
    
    fun clickWelcome() = track(
        AnalyticsEvent("${prefix}_CLICK_WELCOME")
    )
}
```

```
@AndroidEntryPoint
class MainActivity ... {
    @Inject
    lateinit var tracker: HomeTracking

    override fun onCreate(savedInstanceState: Bundle?) {
      ...
       tracker.launch()
      ...
        tracker.clickBack()
      ...
    }
}

@HiltViewModel
class MainViewModel @Inject contructor(
    private val tracker: HomeTracking
): ViewModel() {

    ...
    tracker.clickWelcome()
    ....
}
```
