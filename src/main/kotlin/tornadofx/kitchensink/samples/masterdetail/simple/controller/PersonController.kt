package tornadofx.kitchensink.samples.masterdetail.simple.controller

import javafx.collections.FXCollections
import tornadofx.Controller
import tornadofx.kitchensink.samples.masterdetail.simple.model.Person
import tornadofx.kitchensink.samples.masterdetail.simple.model.PhoneNumber

class PersonController : Controller() {
    val persons = FXCollections.observableArrayList<Person>()

    init {
        // Add some test persons for the demo
        persons.add(Person(42, "John Doe", listOf(PhoneNumber("47", "33349700"), PhoneNumber("47", "333943222"))))
        persons.add(Person(43, "Jane Doe", listOf(PhoneNumber("1", "312 213 21"))))
    }
}
