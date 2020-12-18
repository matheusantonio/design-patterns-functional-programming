object EntryField {

    case class EntryField(val text : String)

    def SetText(entryField : EntryField, text : String) = entryField.copy(text)
    def GetText(entryField : EntryField) = entryField.text
}
