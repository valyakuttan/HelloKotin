package aquarium

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    //getter & setters for a property
    var volume: Int
    get() {return  width * height * length / 1000}
    set(value) { height = value * 1000 / (width * length)}
}