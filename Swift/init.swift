struct Celsius {
    var temperatureInCelsius: Double
    init(fromFahrenheit fahrenheit: Double) {
        temperatureInCelsius = (fahrenheit - 32.0) / 1.8
    }

    init(fromKelvin kelvin: Double) {
        temperatureInCelsius = kelvin - 273.15
    }

    init(_ celsius: Double) {
        temperatureInCelsius = celsius
    }
}
let boilingPointOfWater = Celsius(fromFahrenheit: 212.0)
// boilingPointOfWater.temperatureInCelsius is 100.0
let freezingPointOfWater = Celsius(fromKelvin: 273.15)
// freezingPointOfWater.temperatureInCelsius is 0.0
let bodyTemp = Celsius(37.0)

// Optionals

class Question {
    var text: String
    var response: String?

    init(text: String) {
        self.text = text
    }

    func ask() {
        print(text)
    }
}
let question = Question(text: "Do you like food")
question.ask()
question.response = "Everyone likes food"

struct Size {
    var width = 0.0, height = 0.0
}

struct Point {
    var x = 0.0, y = 0.0
}

struct Rect {
    var origin = Point()
    var size = Size()

    init() {
        // empty
    }

    init(origin: Point, size: Size) {
        self.origin = origin
        self.size = size
    }


    // This is used when the origin is no provided
    init(centre: Point, size: Size) {
        let originX = centre.x - (size.width / 2)
        let originY = centre.y - (size.height / 2)

        self.init(origin: Point(x: originX, y: originY), 
            size: size)
    }
}

let basicRect = Rect()
let complexRect = Rect(centre: Point(x: 4.0, y: 4.0),
                    size: Size(width: 3.0, height: 3.0))
print(complexRect.origin)

class Food {
    var name: String

    init(name: String) {
        self.name = name
    }

    convenience init() {
        self.init(name: "Unnamed")
    }
}

class RecipeIngredient: Food {
    var quantity: Int
    init(name: String, quantity: Int) {
        self.quantity = quantity
        super.init(name: name)
    }
    override convenience init(name: String) {
        self.init(name: name, quantity: 1)
    }
}

let sixEggs = RecipeIngredient(name: "Eggs", quantity: 6)

class ShoppingListItem: RecipeIngredient {
    var purchased = false
    var description: String {
        var output = "\(quantity) x \(name)"
        output += purchased ?  " ✔" : " ✘"
        return output
    }
}

var breakfastList = [
    ShoppingListItem(),
    ShoppingListItem(name: "Bacon"),
    ShoppingListItem(name: "Eggs", quantity: 6),
]
breakfastList[0].name = "Orange juice"
breakfastList[0].purchased = true
for item in breakfastList {
    print(item.description)
}

enum TemperatureUnit {
    case kelvin, celsius, fahrenheit
    init?(symbol: Character) {
        switch symbol {
        case "K":
            self = .kelvin
        case "C":
            self = .celsius
        case "F":
            self = .fahrenheit
        default:
            return nil
        }
    }
}

var kelvin = TemperatureUnit(symbol: "K")
var unknown = TemperatureUnit(symbol: "X")

if unknown == nil {
    print("This is not a defined temperature unit, so initialization failed.")
}