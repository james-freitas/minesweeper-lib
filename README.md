# Minesweeper Game API client library
The goal of this library is to demonstrate the use of the Minesweeper API


### How to use

1. Import the library in your build.gradle
```bash
implementation 'com.codeonblue.minesweeper:minesweeper-lib:1.0'
```
2. Use it in your code like shown bellow

```kotlin
    println(createGameAndReturnGameId())

    println(revealCellOn(
        gameId = "1",
        cellNumber = "1"
    ))

    println(markCellAndReturnCurrentCellStatus(
        gameId = "a723dbce-eaa3-498f-9887-57ca1d33bd44",
        cellNumber = "1",
        cellCurrentStatus = "UNCHECKED"
    ))
``` 