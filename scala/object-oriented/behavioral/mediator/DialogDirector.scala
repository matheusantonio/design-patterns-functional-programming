trait DialogDirector {
    
    def ShowDialog() {
        // Operação que exibe o Dialog
    }

    def CreateWidgets() : Unit
    def WidgetChanged(widget : Widget) : Unit
}