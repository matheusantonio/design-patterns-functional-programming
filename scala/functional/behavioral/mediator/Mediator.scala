object FontDialogDirector {

    import EntryField._
    import ListBox._

    def ChangeWidget[A, B](
        changedWidget : A,
        affectedWidgets : B,
        f : (A, B) => (A, B)) 
    : (A, B) = f(changedWidget, affectedWidgets)


    def ChangeSelectionFunction(selection : String) = 
        (listBox : ListBox, entryField : EntryField) => 
            (SetSelection(listBox, selection), 
             SetText(entryField, selection))

}

object EntryField {

    case class EntryField(val text : String)

    def SetText(entryField : EntryField, text : String) = 
        entryField.copy(text)

    def GetText(entryField : EntryField) = 
        entryField.text
}

object ListBox {

    case class ListBox(val selection : String)
    
    def SetSelection(listBox : ListBox, selection : String) = 
        listBox.copy(selection=selection)

    def GetSelection(listBox : ListBox) = 
        listBox.selection
}
