// Generics

func makeArray<Item>(repeating
    item: Item, numberOfTimes: Int) -> [Item] {

    var result: [Item] = []
    
    for _ in 0..<numberOfTimes {
        result.append(item)
    }
    
    return result
}

makeArray(repeating: "knock", numberOfTimes: 4)

enum OptionalValue<Wrapped> {
    case none
    case some(Wrapped)
}

var possibleInteger: OptionalValue<Int> = .none
possibleInteger = .some(100)

func anyCommonElements<T: Sequence, U: Sequence>
    (lhs: T, rhs: U) -> [T.Iterator.Element]
    where T.Iterator.Element: Equatable,
    T.Iterator.Element == U.Iterator.Element {
        
        var setUnion: [T.Iterator.Element] = []
        for lhsItem in lhs {
            for rhsItem in rhs {
                if lhsItem == rhsItem {
                    setUnion.append(lhsItem)
                }
            }
        }
        return setUnion
}

anyCommonElements(lhs: [1,2,3], rhs: [3])
print(anyCommonElements(lhs: [1,2,3], rhs: [2,3,4]))

