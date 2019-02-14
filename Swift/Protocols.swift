protocol ExampleProtocol {
    
    var simpleDescription: String {
        get
    }
    
    mutating func adjust()
}

extension Int: ExampleProtocol {
    var simpleDescription: String {
        return "The number \(self)"
    }
    mutating func adjust() {
        self += 42
    }
}
print(7.simpleDescription)

extension Double {
    var absoluteValue: Double {
        if self >= 0 {
            return self
        } else {
            return self - 2 * self
        }
    }
}

var blazeit: Double = -4.20
print(blazeit.absoluteValue)
