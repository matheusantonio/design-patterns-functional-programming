abstract class Widget(val director : DialogDirector){

    def Changed() : Unit = this.director.WidgetChanged(this)

}