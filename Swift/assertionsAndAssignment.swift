// assertions
let age = 1
assert(age >= 0, "cant be younger than 0")
// fails as age !>= 0

if age > 10 {
    print("Test1")
} else if age > 0 {
    print("Test2")
} else {
    assertionFailure("A persons age can be less than zero")
}

// precondtions
// thig might be false but has to be true
let index = 69
precondition(index > 0, "Index must be greater than 0")

let x = true
(x ? print("true"): print("false"))

// assignment operations

let b = 10
var a = 5
a = b
// a = 10

let (z, y) = (1, 2)
// x = 1, y = 2
// add+, sub-, mult*, div/

let greeting = "Hello " + "World"

// % remainer
let remaining = -9 % 4

// -9 = (4 * -2) + -1

let three = 3
let minusThree = -three
let plusThree = -minusThree

// compound assignment
var g = 1
g += 2