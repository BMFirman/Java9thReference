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

enum Barcode {
     case upc(Int, Int, Int, Int)
     case qrCode(String)
}

var barcode = Barcode.upc(1,2,3,4)
barcode = .qrCode("Hello")

// Raw Values

enum ASCIIControlCharacter: Character {
    case tab = "\t"
}

// Implicit assignment
enum Planet: Int {
    // It follows that venus = 2, earth = 3
    case mercury = 1, venus, earth
}

enum Compass2: String {
    // The implicit raw values are the following as strings
    case north, south, east, west
}

let earthsOrder = Planet.earth.rawValue
let possiblePlanet = Planet(rawValue: 3)

let positionToFind = 11
if let somePlanet = Planet(rawValue: positionToFind) {
    switch somePlanet {
        case .earth:
            print("Harmless")
        default:
            print("Not safe for humans")
    }
} else {
    print("There isn't a planet at that postion")
}
