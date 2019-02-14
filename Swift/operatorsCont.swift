let name = "world"
if name == "world" {
    print("Hello, World")
} else {
    print("I'm sorry \(name), but I didn't recognise you")
}

// tuple comparison
(1, "zebra") < (2, "apple")
// true as 1 < 2, so apple/zebra are not compared

(3, "apple") < (3, "bird")
// true becuase 3 is equal to 3 and apple < bird

(4, "dog") == (4, "dog")
// 4 == 4, and dog == dog

("blue", -1) < ("purple", 1)
// blue < purple

//("blue", false) <("purple", true)
// we cant compare bools

// ternary
let contentHeight = 40
let hasHeader = true
let rowHeight = contentHeight + (hasHeader ? 50 : 20)

// nil-coalescing operator
// (a ?? b)
/*
    unwrap a if it contains a value or returns b if a is nil
    a is always optional, b must match a's type
 */

let defaultColorName = "red"
var userDefinedColorName: String? // defaults to nill
var colorNameToUse = userDefinedColorName ?? defaultColorName
// uDCN is a nil so the value in dCN is applied to cNTU

userDefinedColorName = "green"
colorNameToUse = userDefinedColorName ?? defaultColorName
// there is now a default value so it is applied


