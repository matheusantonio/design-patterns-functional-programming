object ListBox {

    case class ListBox(val selection : String)
    
    def SetSelection(listBox : ListBox, selection : String) = listBox.copy(selection=selection)
    def GetSelection(listBox : ListBox) = listBox.selection
}
