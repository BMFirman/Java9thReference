var customersInLine = ["Chris", "Alex", "Ewa", "Barry"]

print(customersInLine.count)
// print 4

let customerProvider = { customersInLine.remove(at: 0)}

print(customersInLine.count)
// print 3

print("Now serving \(customerProvider())!")
// Now serving x

print(customersInLine.count)

func serve(customer customerProvider: () -> String) {
    print("Now serving \(customerProvider())!")

}

serve(customer: { customersInLine.remove(at: 0) } )
