package com.codeonblue.minesweeper

import com.codeonblue.minesweeper.client.MineSweeperClient
import com.codeonblue.minesweeper.dto.ReveledCellResponse

const val BASE_URL = "https://minesweep-api.herokuapp.com"

fun createGameAndReturnGameId(baseUrl: String? = BASE_URL) =
    MineSweeperClient(baseUrl).getGameId()

fun markCellAndReturnCurrentCellStatus(
    baseUrl: String? = BASE_URL,
    gameId: String,
    cellNumber: String
): String {
    return MineSweeperClient(baseUrl).markCellAndReturnCurrentCellStatus(
        gameId,
        cellNumber
    )
}

fun revealCellOn(
    baseUrl: String? = BASE_URL,
    gameId: String,
    cellNumber: String
): ReveledCellResponse {
    return MineSweeperClient(baseUrl).revealCell(gameId, cellNumber)
}