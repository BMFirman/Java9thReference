var completionHandlers: [() -> Void] = []
func someFunctionWithEscapingClosure(completionHandler: @escaping () -> Void) {
    completionHandlers.append(completionHandler)
}

func someFuncWNonEscapingClosure(closure: ()
        -> Void) {
    closure()
}

class SomeClass {
    var x = 10

    func doSomething() {
        someFuncWNonEscapingClosure { self.x = 100 }
        someFuncWNonEscapingClosure { x = 200 }
    }
}

let instance = SomeClass()
instance.doSomething()
print(instance.x)
// Prints 200

completionHandlers.first?()
print(instance.x)
// Prints 100