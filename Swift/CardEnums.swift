enum Rank: Int {
    
    case ace = 1
    case two, three, four, five, six, seven, eight, nine, ten
    case jack, queen, king
    
    func simpleDescription() -> String {
        switch self {
        case .ace:
            return "ace"
        case .jack:
            return "jack"
        case .queen:
            return "queen"
        case .king:
            return "king"
        default:
            return String(self.rawValue)
        }
    }
}

let ace = Rank.ace
let ace2 = Rank.ace
let aceRawValue = ace.rawValue
let king = Rank.king
let kingRawValue = king.rawValue
let nine = Rank.nine
let nineRawValue = nine.rawValue

func rankComparator(rankOne: Rank, rankTwo: Rank) -> Bool {
    return rankOne.rawValue == rankTwo.rawValue
}

enum Suit {
    case spades, hearts, diamonds, clubs
    
    func simpleDescription() -> String {
        switch self {
        case .spades:
            return "spades"
        case .hearts:
            return "hearts"
        case .diamonds:
            return "diamonds"
        case .clubs:
            return "clubs"
        }
    }
    
    func colour() -> String {
        switch self {
        case .spades:
            return "black"
        case .hearts:
            return "red"
        case .diamonds:
            return "red"
        case .clubs:
            return "black"
        }
    }
}

let hearts = Suit.hearts
let heartsDescription = hearts.simpleDescription()
let heartsColor = hearts.colour()

print(rankComparator(rankOne: ace, rankTwo: ace2))


