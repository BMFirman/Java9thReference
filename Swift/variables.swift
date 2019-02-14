// neumeric literals

let decimalInteger = 17
let binaryInteger = 0b10001 // 17
let octalInteger = 0o21 // 17
let hexInteger = 0x11 // 17
let expFloat = 1.25e2 // 1.25 * 10^2
let expHexFloat = 0xFp2 // 15 * 2^2

let paddedDouble = 000123.456
let oneMillion = 1_000_000.000_000_000_0001
let twoThousand: UInt16 = 2_000
let one: UInt8 = 1
let two001 = twoThousand + UInt16(one)

let three = 3
let pointOneFourOneFiveNine = 0.14159
let pi = Double(three) + pointOneFourOneFiveNine

// floats are truncated instead of rounded
let integerPi = Int(pi)

// typeAlias
typealias AudioSample = UInt16
var maxAudioAmplitude = AudioSample.max

// tuples
let http404Error = (404, "Not Found", "test")
// http404Error(Int, String)

let (statusCode, statusError, _) = http404Error

print("statusCode:  \(statusCode)")
print("statusError:  \(statusError)")
print("\n")
print("statusCode:  \(http404Error.0)")
print("statusError:  \(http404Error.1)")

let http200Status = (statusCode: 200, description: "OK")

print("\(http200Status.statusCode)")
print("\(http200Status.description)")

// optionals
let possibleNumber = "123"
let convertedNumber = Int(possibleNumber)

var serverResponseCode: Int? = 404
// serverResonseCode contains the actual value
serverResponseCode = nil
// nil must be used with nonoperational constants

// nil can be a default
var surveryAnswer: String?

if convertedNumber != nil {
    print("some int number is in convertedNumber: \(convertedNumber!)")
}

// optionalBinding
// values created from optional binding are only used within the if
// statement body
if let actualNumber = Int(possibleNumber) {
    print("\"\(possibleNumber)\" has and intger value of \(actualNumber)")
} else {
    print("\"\(possibleNumber)\" could not be converted to an integer")
}

if let firstNumber = Int("4"), let secondNumber = Int("42"),
    firstNumber < secondNumber && secondNumber < 100 {
        print("\(firstNumber) < \(secondNumber) < 100")
}

if let firstNumber = Int("4") {
    if let secondNumber = Int("42") {
        if firstNumber <
        secondNumber &&
            secondNumber < 100 {
                print("\(firstNumber) < \(secondNumber) < 100")
        }
    }
}

// implicitlyUnwrapped!
// permission to use value without explicit unwrapping
let possibleString: String? = "An optional string"
let forcedString: String = possibleString! // ! is required
let assumedString: String! = "Implicitly unwrapped optional String"
let implicitString: String = assumedString


if assumedString != nil {
    print(assumedString!)
}

if let definiteString = assumedString {
    print(definiteString)
}
