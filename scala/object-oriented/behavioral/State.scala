package object-oriented.behavioral

object State{

    trait State{
        def pressButton() : State
    }

    class OnState() extends State {
        def pressButton() : State = new OffState()
    }

    class OffState() extends State {
        def pressButton() : State = new OnState()
    }

    class Lamp(state : State) {
        def pressButton() : Unit {
            this.state = state.pressButton()
        }
    }

}