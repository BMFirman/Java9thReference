enum ServerResponse {
    case result(String, String)
    case failure(String)
    case unknown(Int)
}

let success = ServerResponse.result("6:00 am", "8:09 pm")
let failure = ServerResponse.failure("Out of cheese.")
let unknown = ServerResponse.unknown(404)

switch success {
case let .result(sunrise, sunset):
    print("Sunrise is at \(sunrise) and sunset is at \(sunset).")
case let .failure(message):
    print("Failure... \(message)")
case let .unknown(returnCode):
    print("Error the return code \(returnCode) is not found.")
}
