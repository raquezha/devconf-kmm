# DevConf KMM

Simple project which let's developer to enter their topics to be presented in their Developers Conference.
https://terrakok.github.io/kmp-web-wizard/

### How to Run Project

#### 1. Android
```
run android from the Run Configuration
```

#### 2. iOS
```
run ios from the Run Configuration
or open ios/ios.xcodeproj in Xcode and Run
```

#### 3. Desktop
```
$ ./gradlew :app-desktop:run
```
#### 4. Web
```
$ cd devconf-kmm/app-web
$ kobweb run
``` 
## Features
___
DevConf App provides the following features:
- Register a topic
- View current topic details
- View list of topics
- Remove topics they register
- Can be used in any platform: Android, iOS, Desktop, Web


## App Structure
___
The project currently has 4 main modules:
1. **android** - This module contains the android application's UI built using Jetpack compose.
2. **desktop** - This module contains the desktop application's UI built using Compose Multiplatform.
3. **ios** - This module contains iOS code that holds the ios UI using Compose Multiplatform.
4. **web** - Will be using [kobweb](https://kobweb.varabyte.com/) for this one.
5. **shared** - Contains the domain, data layers, and shared business logic.  

## Architecture
- [ballast](https://github.com/copper-leaf/ballast) - Opinionated Application State Management framework for Kotlin Multiplatform.
- 
## Libraries
___
- [arrow-kt](https://arrow-kt.io/) - Idiomatic functional programming.
- [koin](https://insert-koin.io/) -The pragmatic Kotlin & Kotlin Multiplatform Dependency Injection framework.
- [ktorfit](https://github.com/Foso/Ktorfit) - HTTP client/Kotlin Symbol Processor for Kotlin Multiplatform ( Android, iOS, Js, Jvm, Linux) using KSP and Ktor clients inspired by Retrofit.
- [napier](https://github.com/AAkira/Napier) - Logger library for Kotlin Multiplatform.
- [mockk](https://github.com/mockk/mockk) - Library for creating mocks for tests.
- [firebase](https://firebase.google.com/) - Firebase!
- [door](https://github.com/UstadMobile/door) - a Kotlin Symbol Processor that builds on Room and makes it possible to use Room databases, DAOs and entities with Kotlin Multiplatform (using expect/actual)

## Color Scheme
___
Figma: https://bit.ly/devconf-colors

## UI Tool Bridge
___
[Relay](https://developer.android.com/jetpack/compose/tooling/relay) is a tool that bridges the gap between two different UI tools, Figma and Jetpack Compose. 

This allows Google Developer Creators to use the strengths of both tools to create better UIs for their apps.
helps Google Developer Creators to create Jetpack Compose apps faster and more efficiently by enabling them to import UI packages directly from Figma.


## Resources
- [Kotlin Multiplatform libraries](https://libs.kmp.icerock.dev/)
- [Compose Compiler to Kotlin Compatibility Map](https://developer.android.com/jetpack/androidx/releases/compose-kotlin)
- [Compatibility guide for Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform-compatibility-guide.html)
- [Compose Multiplatform Compatibility and Version Guide](https://github.com/JetBrains/compose-multiplatform/blob/master/VERSIONING.md#kotlin-compatibility)
- [KMM UI Architecture](https://medium.com/nerd-for-tech/kmm-ui-architecture-part-1-6362e14ee52a)
- https://kotlinlang.org/docs/multiplatform-mobile-getting-started.html
- https://github.com/AAkira/Kotlin-Multiplatform-Libraries
- https://github.com/VictorKabata/Notflix
- https://github.com/worstkiller/firebaseloginkmm
- https://github.com/charlee-dev/ballast/tree/main/examples/compose_sharedui_kmm
- [Xcode Kotlin](https://github.com/touchlab/xcode-kotlin)
## Contributing
___
Pull request is always welcome!

## License 
___

    Copyright 2023 Jan Celada
    
    Permission is hereby granted, free of charge, to any person obtaining
    a copy of this software and associated documentation files (the
    "Software"), to deal in the Software without restriction, including
    without limitation the rights to use, copy, modify, merge, publish,
    distribute, sublicense, and/or sell copies of the Software, and to
    permit persons to whom the Software is furnished to do so, subject to
    the following conditions:
    
    The above copyright notice and this permission notice shall be
    included in all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
    EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
    MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
    NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
    LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
    OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
    WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
