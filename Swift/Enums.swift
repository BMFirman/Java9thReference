enum Compass {
    case north
    case south
    case east
    case west
}

var direction = Compass.east
direction = .west

switch direction {
    case .north:
        print("Heading north")
    case .south:
        print("Heading south")
    case .east:
        print("Heading east")
    case .west:
        print("West")
}

enum Drink: CaseIterable {
    case coffee, tea, juice
}

let numChoices = Drink.allCases.count
print("\(numChoices) drink choices")