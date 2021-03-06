package tornadofx.kitchensink.samples.masterdetail.simple.view

import tornadofx.View
import tornadofx.hbox

class MainView : View("Person Editor") {
    override val root = hbox {
        this += PersonList::class
        this += PersonEditor::class
    }
}
