class Counter {
    var count = 0
    func increment() {
        count += 1
    }

    func increment(by amount: Int) {
        count += amount
    }

    func reset() {
        count = 0
    }
}

let counter = Counter()
counter.increment(by: 5)
counter.reset()

struct Point {
    var x = 0.0, y = 0.0
    /*
    func isToTheRight(x: Double) -> Bool {
        return self.x > x
    }
    */

    mutating func moveBy(x deltaX: Double, y deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}

var somePoint = Point(x: 1.0, y: 1.0)
// This wont work if somePoint is a let
somePoint.moveBy(x: 2.0, y: 2.0)

/*
let somePoint = Point(x: 4.0, y: 5.0)
if somePoint.isToTheRight(x: 1.0) {
    print("This point is to the right")
}
*/

enum TriState {
    case off, low, high
    mutating func next() {
        switch self {
            case .off:
                self = .low
            case .low:
                self = .high
            case .high:
                self = .off
        }
    }
}

var light = TriState.low
light.next()

class SomeClass {
    class func someTypeMethod() {
        print("test")
    }
}

SomeClass.someTypeMethod()