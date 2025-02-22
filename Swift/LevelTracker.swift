struct LevelTracker {
    static var highestUnlockedLevel = 1
    var currentLevel = 1

    static func unlock(_ level: Int) {
        if level > highestUnlockedLevel {
            highestUnlockedLevel = level
        }
    }

    static func isUnlocked(_ level: Int) -> Bool {
        return level <= highestUnlockedLevel
    }

    @discardableResult
    mutating func advance(to level: Int) -> Bool {
        if LevelTracker.isUnlocked(level) {
            currentLevel = level
            return true
        } else {
            return false
        }
    }
}

class Player {
    var tracker = LevelTracker()
    let playerName: String

    func complete(level: Int) {
        LevelTracker.unlock(level + 1)
        tracker.advance(to: level + 1)
    }

    init (name: String) {
        playerName = name
    }
}

var john = Player(name: "John")
john.complete(level: 1)
print("Highest unlocked level is now \(LevelTracker.highestUnlockedLevel)")

var beto = Player(name: "Beto")

john.complete(level: 5)

if beto.tracker.advance(to: 6) {
    print("Player on level 6")
} else {
    print("Level n has not been unlocked")
}

