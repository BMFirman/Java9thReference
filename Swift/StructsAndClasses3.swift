class StepCounter {
    var totalSteps: Int = 0 {
        willSet(newTotalSteps) {
            print("About to set totalSteps to \(newTotalSteps)")
        }

        didSet {
            if totalSteps > oldValue {
                print("Added \(totalSteps - oldValue) steps")
            }
        }
    }
}

let stepCounter = StepCounter()
stepCounter.totalSteps = 200

stepCounter.totalSteps = 360

stepCounter.totalSteps = 896

struct SomeStructure {
    static var stortedTypeProperty = "Some Val"
    static var computedTypeProperty: Int {
        return 1
    }
}

enum SomeEnum {
    static var stortedTypeProperty = "Some Val"
    static var computedTypeProperty: Int {
        return 6
    }
}

class SomeClass {
    static var stortedTypeProperty = "Some Val"
    static var computedTypeProperty: Int {
        return 27
    }

    class var overridableComputerTypeProperty: Int
            {
                return 107
            }
}

print(SomeStructure.stortedTypeProperty)
SomeStructure.stortedTypeProperty = "Another Value"
print(SomeStructure.stortedTypeProperty)

print(SomeEnum.computedTypeProperty)
print(SomeClass.computedTypeProperty)