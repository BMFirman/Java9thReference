// String literals
let someString = "Some string literal value"
let quotations =
    """
    Testing
    1
    2
    3
    4
    """
print(quotations)

let singleLineString = "These are the same"
let multiLineString = """
These are the same
"""
singleLineString == multiLineString

let softWrappedQuotation = """
Where should I begin, \
No clue \
Well what do you recomend?
"""
print(softWrappedQuotation)

let lineBreaks = """

This starts with a line break.
It ends with a line break.

"""
print(lineBreaks)

// Special Characters
// \0, \\, \t, \n, \r, \", \'
// uncode scalars \u{n} 1-8 digits
print("\u{1F604}")

let threeDoubleQuotationMarks = """
Escaping the first quotation mark \"""
Escaping all three quotation marks \"\"\"
"""

print(threeDoubleQuotationMarks)

// Strings are passed by value

// working with characters
for character in "Dog!" {
    print(character)
}

let exclamationMark: Character = "!"
let catCharacters: [Character] = ["C","a","t","!","🐱"]
let catString = String(catCharacters)
print(catString)

// Concatenation Strings and Characters
let string1 = "hello"
let string2 = " there"
var welcome = string1 + string2
var instruction = "look over"
instruction += string2
welcome.append(exclamationMark)
// you cant append anything to a character

// String interpolation
let multiplier = 3
let message = ("\(multiplier) times 2.5 is \(Double(multiplier) * 2.5)")

// Unicode scalars
// U+0000 - U+D7FF 21bits total
let frontDuck = "\u{1f425}"

// Grpaheme Clusters
let eAcute: Character = "\u{E9}"
let combinedAcute: Character = "\u{65}\u{301}"

let greeting = "Guten Tag!"
greeting[greeting.startIndex]
greeting[greeting.index(before: greeting.endIndex)]
greeting[greeting.index(after: greeting.startIndex)]
let index = greeting.index(greeting.startIndex, offsetBy: 7)
greeting[index]

var welcome2 = "Hello"
welcome2.insert("!", at: welcome2.endIndex)
welcome2.insert(contentsOf: " There", at: welcome2.index(before: welcome2.endIndex))
welcome2.insert(contentsOf: " General Kenobi", at: welcome.endIndex)

let dogString = "Dog‼🐶"


for codeUnit in dogString.utf8 {
    print("\(codeUnit) ", terminator: "")
}
print("")
