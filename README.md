# quick-percent
A simple kotlin extension library to play with percentage calculation

## Installation

```groovy
implementation 'com.theapache64.quick-percent:quick-percent:0.0.1-alpha02'
```

## Usage

##### To find percent of any number

**Input**

```kotlin
Log.d(TAG, "What is 20% of 1000? -> ${20.percentOf(1000)} ")
```

**Output**

```
What is 20% of 1000? -> 200 
```

##### To find what percent of a number

**Input**

```kotlin
Log.d(TAG, "200 is what percent of 1000? -> ${200.isWhatPercentOf(1000)}")
```

**Output**

```
 200 is what percent of 1000? -> 20
```

## TODO

 - [ ] Add more functions
 
## Author

theapache64