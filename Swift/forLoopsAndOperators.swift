// range operators

// closed range (a...b) a -> b range, for-in loops
for index in 1...5 {
    print("\(index) times 5 is \(index * 5)")
}

// half range operators
let names = ["Anna", "Alex", "Brian", "Jack"]
let count = names.count
for i in 0..<count {
    print("Person \(i) in names is: \(names[i])") // arrays start @ 0
}

// one sided ranges
for name in names[2...] {
    print(name)
}
// brian & jack

for name in names[...2] {
    print(name)
}
// anna, alex, & brian

for name in names[..<2] {
    print(name)
}
// anna & alex

let range = ...5
range.contains(7) // false

// logical operations
// !not, &&and, ||or

let allowedEntry = false
if !allowedEntry {
    print("ACCESS DENIED")
}

let hasDoorKey = false
let knowsOverridePassword = true
if hasDoorKey || knowsOverridePassword {
    print("welcome")
} else {
    print("ACCESS DENIED")
}
// prints "Welcome"

let enteredDoorCode = true
let passedRetinaScan = true
if enteredDoorCode &&
        passedRetinaScan ||
        hasDoorKey ||
        knowsOverridePassword {
    print("Welcome")
} else {
    print("ACCESS DENIED")
}
// prints "Welcome"


