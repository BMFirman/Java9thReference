var namesOfInts = [Int: String]()

namesOfInts[16] = "Sixteen"

// Empty a dict
namesOfInts = [:]

// Literals
var airports: [String: String] = ["YYZ": "Toronto", "DUB": "Dublin"]
print(airports)

// Access and modification
print("The airports dict contains \(airports.count) items")

print(airports.isEmpty)

// Adding new items
airports["LAX"] = "Los Angeles"

// Edit values, updateValue(_: forKey) this will return the old value
airports["LAX"] = "LA"

if let old = airports.updateValue("Dublin airport", forKey: "DUB") {
    print("Old value was \(old)")
}

let airportNameTest = airports["DUB"]

// Remove a key/value pair
// airports["DUB"] = nil
// let removed = airport.removeValue(forKey: "YYZ")

// Itterate over a dict
for (airportCode, airportName) in airports {
    print("\(airportCode): \(airportName)") 
}

// Retriving keys and values
for airportCode in airports.keys {
    print(airportCode)
}

for airportName in airports.values {
    print(airportName)
}

// Putting keys and values into arrays
let airportCodes = [String](airports.keys)
let airportNames = [String](airports.values)
