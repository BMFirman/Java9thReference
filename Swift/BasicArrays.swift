var someInts = [Int]()

print("someInts is of type [Int] with \(someInts.count) items.")

// Array with default values
var threeDoubles = Array(repeating: 0.0, count: 3)

// Add two arrays together
var anotherThreeDoubles = Array(repeating: 2.5, count: 3)

var sixDoubles = threeDoubles + anotherThreeDoubles

// Arrays using array literals
// Init with two items
var shoppingList: [String] = ["eggs", "milk"]

// Type inference means you can do this
var newShoppingList = ["eggs", "milk"]

func printListSize(shoppingList: [String]) { 
    print("The shopping list contains \(shoppingList.count) items")
}
// boolean isEmpty can be used
if shoppingList.isEmpty {
    print("the shoppingList is empty")
} else {
    printListSize(shoppingList: shoppingList)
}

shoppingList.append("flour")
shoppingList += ["baking powder"]

// Retriving values
var firstItem = shoppingList[0]

// Changing values
shoppingList[0] = "six eggs"

// Change multiple values
shoppingList[0...2] = ["bananas", "apples"]

// Insert at postition
shoppingList.insert("maple syrup", at: 0)

// Remove at position, returns the removed value
shoppingList.remove(at: 0)

// Remove the last value
shoppingList.removeLast()

for item in shoppingList {
    print(item)
}

// ForIn enumerations
for (index, value) in shoppingList.enumerated() {
    print("Item \(index + 1): \(value)")
}