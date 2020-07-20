package functional.behavioral

object State{

    case class LampState(pressButton : () => Lamp)

    case class Lamp(state : LampState)

    def pressButton(lamp : Lamp) : Lamp =
        lamp.state.pressButton()

    val onState : LampState = LampState(() => offState)

    val offState : LampState = LampState(() => onState)

}