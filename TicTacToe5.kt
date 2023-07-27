package tictactoe

fun showGame(gameField: MutableList<MutableList<Char>>) {
    println("---------")
    for (i in 0..2) {
        println("| ${gameField[i].joinToString().replace(",", "")} |")
    }
    println("---------")
}

fun main() {
    var countO = 0
    var countX = 0
    var countGlobal = 0

    val gameField = MutableList(3) { MutableList(3) { ' ' } }

    showGame(gameField)

    var flag = true
    do {
        try {
            val cor = readln().split(" ").map { it.toInt() }

            if (gameField[cor[0] - 1][cor[1] - 1] != 'X' && gameField[cor[0] - 1][cor[1] - 1] != 'O') {
                when {
                    countX == 0 && countO == 0 -> {
                        gameField[cor[0] - 1][cor[1] - 1] = 'X'
                        countX++
                    }

                    countX == countO -> {
                        gameField[cor[0] - 1][cor[1] - 1] = 'X'
                        countX++
                    }

                    countX > countO -> {
                        gameField[cor[0] - 1][cor[1] - 1] = 'O'
                        countO++
                    }
                }
                countGlobal++
            } else {
                println("This cell is occupied! Choose another one!")
            }
//                    flag = false
            showGame(gameField)
            when {
//      horizontal combination FOR "X"
                gameField[0][0] == 'X' && gameField[0][1] == 'X' && gameField[0][2] == 'X' -> {
                    println("X wins")
                    flag = false
                }

                gameField[1][0] == 'X' && gameField[1][1] == 'X' && gameField[1][2] == 'X' -> {
                    println("X wins")
                    flag = false
                }

                gameField[2][0] == 'X' && gameField[2][1] == 'X' && gameField[2][2] == 'X' -> {
                    println("X wins")
                    flag = false
                }
//      vertical combination FOR "X"
                gameField[0][0] == 'X' && gameField[1][0] == 'X' && gameField[2][0] == 'X' -> {
                    println("X wins")
                    flag = false
                }

                gameField[0][1] == 'X' && gameField[1][1] == 'X' && gameField[2][1] == 'X' -> {
                    println("X wins")
                    flag = false
                }

                gameField[0][2] == 'X' && gameField[1][2] == 'X' && gameField[2][2] == 'X' -> {
                    println("X wins")
                    flag = false
                }
//      horizontal combination FOR "O"
                gameField[0][0] == 'X' && gameField[0][1] == 'X' && gameField[0][2] == 'X' -> {
                    println("O wins")
                    flag = false
                }

                gameField[1][0] == 'O' && gameField[1][1] == 'O' && gameField[1][2] == 'O' -> {
                    println("O wins")
                    flag = false
                }

                gameField[2][0] == 'O' && gameField[2][1] == 'O' && gameField[2][2] == 'O' -> {
                    println("O wins")
                    flag = false
                }
//      vertical combination FOR "O"
                gameField[0][0] == 'O' && gameField[1][0] == 'O' && gameField[2][0] == 'O' -> {
                    println("O wins")
                    flag = false
                }

                gameField[0][1] == 'O' && gameField[1][1] == 'O' && gameField[2][1] == 'O' -> {
                    println("O wins")
                    flag = false
                }

                gameField[0][2] == 'O' && gameField[1][2] == 'O' && gameField[2][2] == 'O' -> {
                    println("O wins")
                    flag = false
                }
//      diagonal combination for O
                gameField[0][0] == 'O' && gameField[1][1] == 'O' && gameField[2][2] == 'O' -> {
                    println("O wins")
                    flag = false
                }

                gameField[2][0] == 'O' && gameField[1][1] == 'O' && gameField[0][2] == 'O' -> {
                    println("O wins")
                    flag = false
                }
//      diagonal combination for X
                gameField[0][0] == 'X' && gameField[1][1] == 'X' && gameField[2][2] == 'X' -> {
                    println("X wins")
                    flag = false
                }

                gameField[2][0] == 'X' && gameField[1][1] == 'X' && gameField[0][2] == 'X' -> {
                    println("X wins")
                    flag = false
                }
                countGlobal == 9 -> {
                    println("Draw")
                    flag = false
                }
            }
        } catch (e: NumberFormatException) {
            println("You should enter numbers!")
        } catch (e: IndexOutOfBoundsException) {
            println("Coordinates should be from 1 to 3!")
        }
    } while (flag)
}