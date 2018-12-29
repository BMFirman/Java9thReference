class Product {
    let name: String
    init?(name: String) {
        if name.isEmpty {
            return nil
        }
        self.name = name
    }
}

class CartItem: Product {
    let quantity: Int
    init?(name: String, quantity: Int) {
        if quantity < 1 {
            return nil
        }
        self.quantity = quantity
        super.init(name: name)
    }
}

// Wont work if the inital quantity was less than 1
if let twoSocks = CartItem(name: "sock", quantity: 2) {
    print("Item \(twoSocks.name), quantity: \(twoSocks.quantity)")
}

class Document {
    var name: String?

    init() {
        // doc with nil name value
    }

    init?(name: String) {
        if name.isEmpty {
            return nil
        }
        self.name = name
    }
}

class AutomaticallyNamedDocument: Document {
    override init() {
        super.init()
        self.name = "[Untitled]"
    }
    override init(name: String) {
        super.init()
        if name.isEmpty {
            self.name = "[Untitled]"
        } else {
            self.name = name
        }
    }
}

let wordDoc = AutomaticallyNamedDocument()