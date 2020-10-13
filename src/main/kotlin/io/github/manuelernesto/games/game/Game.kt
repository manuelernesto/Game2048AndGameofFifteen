package io.github.manuelernesto.games.game

import io.github.manuelernesto.board.Direction


interface Game {
    fun initialize()
    fun canMove(): Boolean
    fun hasWon(): Boolean
    fun processMove(direction: Direction)
    operator fun get(i: Int, j: Int): Int?
}
