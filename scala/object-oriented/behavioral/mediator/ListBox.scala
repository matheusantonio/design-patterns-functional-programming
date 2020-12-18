class ListBox(director : DialogDirector) extends Widget(director){
    var selection : String

    def GetSelection() : String = selection

    def SetSelection(selection : String) {
        this.selection = selection
        Changed()
    }
}