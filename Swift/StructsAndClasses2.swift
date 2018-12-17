struct Point {
    var x = 0.0 
    var y = 0.0
}

struct Size {
    var width = 0.0
    var height = 0.0
}

struct Rect {
    var origin = Point()
    var size = Size()
    var centre: Point {
        get {
            let centreX = origin.x
                + (size.width / 2)

            let centreY = origin.y
                + (size.height / 2)

            return Point(x: centreX, y: centreY)
        }
        set(newCentre) {
            origin.x = newCentre.x
                - (size.width / 2)

            origin.y = newCentre.y
                - (size.height / 2)
        }
    }
}

var square = Rect(origin: Point(x: 0.0, y: 0.0),
                    size: Size(width: 10.0, height: 10.0))
let initialSquareCentre = square.centre
square.centre = Point(x: 15.0, y: 15.0)

struct Cuboid {
    var width = 0.0
    var height = 0.0
    var depth = 0.0

    var volume: Double {
        return width * height * depth
    }
}

let twoThreeFour = Cuboid(width: 2.0,
                        height: 3.0, depth: 4.0)
print("twoThreeFour.volume")