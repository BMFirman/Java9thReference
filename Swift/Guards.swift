func greet(person: [String: String]) {
    guard let name = person["name"] else {
        return
    }

    print("Hello \(name)!")

    guard let location = person["location"] else {
        print("Hope the weathers good")
        return
    }

    print("Hope the weather is good in \(location)")
}

greet(person: ["name": "John"])

greet(person: ["name": "Jane", "location": "Cupertino"])