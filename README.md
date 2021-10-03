# Minesweeper Game API client library
The goal of this library is to demonstrate the use of the Minesweeper API


### How to use

- Publish the library locally (run the command bellow in the root folder of this project)
```bash
./gradlew publishToMavenLocal
```

- Import the library in the `build.gradle` of your client project
```bash
implementation 'com.codeonblue.minesweeper:minesweeper-lib:1.0'
```
- Use it in your client project like shown bellow

```kotlin
    // Prints the id of the new game created
    val gameId = createGameAndReturnGameId()
    println(gameId)
    println()

    // Prints all cells that could be reveled and the game status
    val reveledCellResponse = revealCellOn(
        gameId = gameId,
        cellNumber = "1"
    )
    println("Reveled cells")
    println(reveledCellResponse.reveledCells.toString())
    println()
    println("Game status: ${reveledCellResponse.gameStatus}")
    println()

    // Prints the status of the cell marked
    println(markCellAndReturnCurrentCellStatus(
        gameId = gameId,
        cellNumber = "1"
    ))
``` 