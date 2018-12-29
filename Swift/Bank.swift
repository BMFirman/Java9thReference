class Bank {
    static var coinsInBank = 10_000

    static func distribute(coins numberOfCoinsRequested: Int)
        -> Int {
            let numberOfCoinsToVend = 
                min(numberOfCoinsRequested, coinsInBank)

            coinsInBank -= numberOfCoinsToVend
            return numberOfCoinsToVend
        }

        static func recive(coins: Int) {
            coinsInBank += coins
        }
}

class Player {
    var coinsInPurse: Int
    
    init(coins: Int) {
        coinsInPurse = Bank.distribute(coins: coins)
    }

    func win(coins: Int) {
        coinsInPurse += Bank.distribute(coins: coins)
    }

    deinit {
        Bank.recive(coins: coinsInPurse)
    }
}

var playerOne: Player? = Player(coins: 100)
print("A new player has joined the game with \(playerOne!.coinsInPurse) coins")

playerOne!.win(coins: 2_000)
print("PlayerOne won 2000 coins and has \(playerOne!.coinsInPurse) coins")

print("The bank now only has \(Bank.coinsInBank) coins left")

playerOne = nil
print("The bank now has \(Bank.coinsInBank) coins left")
