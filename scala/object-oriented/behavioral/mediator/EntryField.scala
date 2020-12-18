class EntryField(director : DialogDirector) extends Widget(director) {
    var text : String

    def SetText(text : String) {
        this.text = text
    }
}