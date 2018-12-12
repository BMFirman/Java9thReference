let numLegs = ["Spider": 8, "Ant": 6, "Cat": 4]

for (animal, legCount) in numLegs {
    print("\(animal): \(legCount)")
}

for index in 1...5 {
    print("\(index) times 5 is: \(index * 5)")
}

let base = 3
let power = 10
var answer = 1
for _ in 1...power {
    answer *= base
}

print(answer)

let minuites = 60
for tickMark in 0..<minuites {
    // Render every second
}

let minuiteInterval = 5
for tickMark in stride(from: 0, to: minuites, by: minuiteInterval) {
    // Render the tick mark every 5 minuites
}

// Closed ranges are also availible with stride(from:through:by:)

let hours = 12
let hourInterval = 3

for tickMark in stride(from: 3, through: hours, by: hourInterval) {
    // Render the tickmark every 3 hours
}

// While loops
// while condition {}

