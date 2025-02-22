let finalSquare = 25
var board = [Int](repeating: 0, count: finalSquare + 1)

board[03] = +08; board[06] = +11;
board[09] = +09; board[10] = +02
board[14] = -10; board[19] = -11;
board[22] = -02; board[24] = -08;
var square = 0
var diceRoll = 0

gameLoop: while square != finalSquare {
    diceRoll += 1
    if diceRoll == 7 {
        diceRoll = 1
    }
    switch square + diceRoll {
        case finalSquare:
            // diceRoll will move us to the final
            // square ending the game
            break gameLoop
        case let newSquare where newSquare >
                                    finalSquare:
            // diceRoll will move beyond the final
            // roll again
            continue gameLoop
        default:
            // this is a valid move, what's it effect
            square += diceRoll
            square += board[square]
    }
}

print("Game over")