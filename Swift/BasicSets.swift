var letters = Set<Character>()
print("letters is of type Set<Character> with \(letters.count) items.")
letters.insert("a")

// Can auto infer set type is litterals are all the same
var genres: Set<String> = ["rock", "drum and bass"]

if genres.isEmpty {
    print("none")
} else {
    print("some")
}

genres.insert("jazz")

if let removedGenre =
            genres.remove("rock") {
    print("I no longer like \(removedGenre)")
} else {
    print("I never cared for that")
}

print(genres.contains("drum and bass"))

// Itterating over sets
for genre in genres {
    print("\(genre)")
}

// Sorting sets < operator
for genre in genres.sorted() {
    print("\(genre)")
}

// Set operations, union, intersection, subtracting, symetricDifference

let oddDigits: Set = [1, 3, 5, 7, 9]
let evenDigits: Set = [0, 2, 4, 6, 8]
let singleDigitPrimeNumbers: Set = [2, 3, 5, 7]
 
print(oddDigits.union(evenDigits).sorted())
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(oddDigits.intersection(evenDigits).sorted())
// []
print(oddDigits.subtracting(singleDigitPrimeNumbers).sorted())
// [1, 9]
print(oddDigits.symmetricDifference(singleDigitPrimeNumbers).sorted())
// [1, 2, 9]

// Equality, sub/superSets
// isStrictSubset is also avilable
print(oddDigits.isSubset(of: evenDigits))
print(oddDigits.isSuperset(of: evenDigits))
print(oddDigits.isDisjoint(with: evenDigits))