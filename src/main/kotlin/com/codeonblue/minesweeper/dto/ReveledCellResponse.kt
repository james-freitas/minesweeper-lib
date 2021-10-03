package com.codeonblue.minesweeper.dto

data class ReveledCellResponse(
    val reveledCells: Map<String, Int>?,
    val gameStatus: String?
)
