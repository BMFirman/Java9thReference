func greet(person: String) -> String {
    let greeting = "Hello, " + person + "!"
    return greeting
}

print(greet(person: "Brian"))

// ret vars of functions can be ignored

func printAndCount(string: String) -> Int {
    print(string)
    return string.count
}

func printWithoutCounting(string: String) {
    let _ = printAndCount(string: string)
}

printWithoutCounting(string: "Hello World")

func minMax(array: [Int]) -> (min: Int, max: Int) {

    if array.isEmpty {
        // return nil, make sure to add a? after L21
    }

    var currentMin = array[0]
    var currentMax = array[0]

    for value in array[1..<array.count] {
        if value < currentMin {
            currentMin = value
        } else if value > currentMax {
            currentMax = value
        }
    }

    return (currentMin, currentMax)
}

let testArray: [Int] = [1, 2, 3, 4, 5, 6]
let testTuple: (Int, Int) = minMax(array: testArray)
print(testTuple)

let bounds = minMax(array: [0, 2, 4, 6, 8])
print("\(bounds.min), \(bounds.max)")

// Optional types ^

// argumentLabel parameterName
// in function body you use parameterName
// when calling the function you use the argumentLabel
// omit the label with _
func greet(person: String, from hometown: String)
                                        -> String {
    return "\(person), \(hometown)"
}

print(greet(person: "Bill", from: "Cupertino"))

func someFunction(_ firstParamName: Int,
                            secondParamName: Int) {
    // use firstParamName, and secondParamName
}

someFunction(1, secondParamName: 2)

// default parameter values

func someFunction(parameterWithoutDefault: Int,
            parameterWithDefault: Int = 12) {
    
}
someFunction(parameterWithoutDefault: 3,
            parameterWithDefault: 6)
// parameterWithDefault is 6
someFunction(parameterWithoutDefault: 4)
// parameterWithDefault is 12

// Viradic parameters
func average(_ numbers: Double...) -> Double {

    var total: Double = 0
    for number in numbers {
        total += number
    }

    return total / Double(numbers.count)
}

print(average(1, 2, 3, 4, 5, 6))

func swapTwoInts(_ a: inout Int, _ b: inout Int) {
    let temporaryA = a
    a = b
    b = temporaryA
}

var someInt = 3
var anotherInt = 107
print("\(someInt), \(anotherInt)")
swapTwoInts(&someInt, &anotherInt)
print("\(someInt), \(anotherInt)")





















