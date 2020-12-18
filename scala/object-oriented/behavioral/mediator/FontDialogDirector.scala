class FontDialogDirector extends DialogDirector {
    
    val list : ListBox
    val field : EntryField
    
    def CreateWidgets() {
        this.list = new ListBox(this)
        this.field = new EntryField(this)
    }

    def WidgetChanged(widget : Widget) {
        this.field.SetText(
            this.list.GetSelection()
        )
    }

}