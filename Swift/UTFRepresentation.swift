let simpleString = "ThisIsAString"

for codeUnit in simpleString.utf8 {
    print("\(codeUnit) ", terminator: "")
}

print("")

for codeUnit in simpleString.utf16 {
    print("\(codeUnit) ", terminator: "")
}

print("")

for scalar in simpleString.unicodeScalars {
    print("\(scalar.value) ", terminator: "")
}

print("")

for scalar in simpleString.unicodeScalars {
    print("\(scalar)")
}