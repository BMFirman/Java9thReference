class NamedShape {
    var numberOfSides: Int = 0
    var name: String
    
    init(name: String) {
        self.name = name
    }
    
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

class Square: NamedShape {
    var sideLength: Double
    
    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 4
    }
    
    func area() -> Double {
        return sideLength * sideLength
    }
    
    override func simpleDescription() -> String {
        return "A square with sides of length \(sideLength)"
    }
}

let testSquare = Square(sideLength: 4, name: "Square")
print(testSquare.simpleDescription())

class Circle: NamedShape {
    var radius: Double = 0.0
    
    init(radius: Double, name: String) {
        self.radius = radius
        super.init(name: name)
    }
    
    override func simpleDescription() -> String {
        return "The circle has a radius of \(radius) and an area of \(area(radius: self.radius))"
    }
    
    func area(radius: Double) -> Double {
        return Double.pi * pow(number: radius, exponent: 2.0)
    }
    
    func pow(number: Double, exponent: Double) -> Double {
        var i = 0
        var base = number
        let exp = Int(exponent)
        while i<exp{
            base = base * base
            i = i + 1
        }
        return base
    }
}

let testCircle = Circle(radius: 3.0, name: "Circle")
print(testCircle.simpleDescription())

class EqualateralTriangle: NamedShape {
    var sideLength: Double
    
    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
    }
    
    var perimeter: Double {
        
        get {
            return 3.0 * sideLength
        }
        
        set {
            self.sideLength = newValue / 3
        }
    }
    
    override func simpleDescription() -> String {
        return "The sidelength of the equalateral triangle is \(sideLength) and the perimeter is \(perimeter)"
    }
}

let testTriangle = EqualateralTriangle(sideLength: 4.2, name: "testTriangle")
print(testTriangle.perimeter)
print(testTriangle.sideLength)
print(testTriangle.simpleDescription())
testTriangle.perimeter = 3.0
print(testTriangle.perimeter)
print(testTriangle.simpleDescription())

class TriangleAndSquare {
    var triangle: EqualateralTriangle {
        willSet {
            square.sideLength = newValue.sideLength
        }
    }
    
    var square: Square {
        willSet {
            triangle.sideLength = newValue.sideLength
        }
    }
    
    init(size: Double, name: String) {
        square = Square(sideLength: size, name: name)
        triangle = EqualateralTriangle(sideLength: size, name: name)
    }
}

var triangleAndSqaure = TriangleAndSquare(size: 21.0, name: "compound Shape")
print(triangleAndSqaure.square.sideLength)
print(triangleAndSqaure.triangle.sideLength)
triangleAndSqaure.square.sideLength = 42.0
print(triangleAndSqaure.square.simpleDescription())
print(triangleAndSqaure.square.area())

let optionalSquare : Square? = Square(sideLength: 12.0, name: "Useless anyway")
let sideLength = optionalSquare?.sideLength

