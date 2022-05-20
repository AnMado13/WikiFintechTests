package actions


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice


class Actions {

    fun clickId(id: Int){
        onView(withId(id)).perform(click())
    }

    fun clickText(id: Int){
        onView(withText(id)).perform(click())
    }

    fun hasText(id: Int){
        onView(withText(id)).check(matches(isDisplayed()))
    }

    fun scrollToBottom(){
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.swipe(20, 800, 20, 100, 5) //костыль
    }


    companion object {
        inline operator fun invoke(block: Actions.() -> Unit) = Actions().block()
    }
}