// error handling

func canThrowError() throws {
    
}

// errors propogate until they are dealt with

do {
    try canThrowError()
} catch {
    
}

func makeASandwich() throws {
    // ...
}

/*
do {
    try makeASandwich()
    eatASandwich()
} catch SandwichError.outOfCleanDishes {
    washDishes()
} catch SandwichError.missingIngredients(let ingredients) {
    buyGroceries(ingredients)
}
 */


