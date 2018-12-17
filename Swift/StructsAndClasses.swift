struct SomeStruct {

}

class SomeClass {

}

struct Resolution {
    var width = 0
    var height = 0
}

class VideoMode {
    var resolution = Resolution()
    var interlaced = false
    var frameRate = 0.0
    var name: String?
}

let someResolution = Resolution()
let someVideomode = VideoMode()

someVideomode.resolution.width = 1280

let vga = Resolution(width: 640, height: 480)
let hd = Resolution(width: 1920, height: 1080)
var cinema = hd
cinema.width = 2048

enum CompassPoint {
    case north, south, east, west
    mutating func turnNorth() {

    }
}

var currentDirection = CompassPoint.west
let rememberedDirection = currentDirection
currentDirection.turnNorth()

// Classes are reference types

let tenEighty = VideoMode()
tenEighty.resolution = hd
tenEighty.interlaced = true
tenEighty.name = "1080i"
tenEighty.frameRate = 25.0

struct FixedLengthRange {
    var firstVal: Int
    let length: Int
}

var rangeOfThreeItems = FixedLengthRange(firstVal: 0,
            length: 3)
rangeOfThreeItems.firstVal = 6

class DataImporter {
    var filename = "data.txt"
}

class DataManager {
    lazy var importer = DataImporter()
    var data = [String]()
}

let manager = DataManager()
manager.data.append("Some data")

print(manager.importer.filename)