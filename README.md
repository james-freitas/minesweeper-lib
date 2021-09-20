# Minesweeper Game API client library
The goal of this library is to demonstrate the use of the Minesweeper API


### How to use

- Import the library in your build.gradle
- Use it in your code

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