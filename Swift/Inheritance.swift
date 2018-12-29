class Vehicle {
    var currentSpeed = 0.0

    var description: String {
        return "traveling at \(currentSpeed) mph"
    }

    func makeNoise() {
        // do nothing
    }
}

let someVehicle = Vehicle()

print("\(someVehicle.description)")

class Bicycle: Vehicle {
    var hasBasket = false
}

class Tandem: Bicycle {
    var numPassengers = 0
}

class Train: Vehicle {
    var engineTemp = 420

    override var currentSpeed: Double {
        didSet {
            engineTemp = Int(currentSpeed / 10.0) + 1
        }
    }

    override func makeNoise() {
        print("Choo Choo")
    }

    override var description: String {
        return super.description + " and has a engine temp of \(engineTemp)"
    }
}

var aTrain = Train()
print(aTrain.description)
