package com.codeonblue.minesweeper

import com.codeonblue.minesweeper.client.MineSweeperClient

const val BASE_URL = "https://minesweep-api.herokuapp.com"

fun createGameAndReturnGameId(baseUrl: String? = BASE_URL) =
    MineSweeperClient(baseUrl).getGameId()

fun markCellAndReturnCurrentCellStatus(
    baseUrl: String? = BASE_URL,
    gameId: String,
    cellNumber: String,
    cellCurrentStatus: String
): String {
    return MineSweeperClient(baseUrl).markCellAndReturnCurrentCellStatus(
        gameId,
        cellNumber,
        cellCurrentStatus
    )
}

fun revealCellOn(
    baseUrl: String? = BASE_URL,
    gameId: String,
    cellNumber: String
): Map<String, Int> {
    return MineSweeperClient(baseUrl).revealCell(gameId, cellNumber)
}