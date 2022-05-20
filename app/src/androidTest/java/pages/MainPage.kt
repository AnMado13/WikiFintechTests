package pages

import org.wikipedia.R
import actions.Actions

class MainPage {
    private val idMoreContainer = R.id.nav_more_container

    fun clickMoreContainer(){
        Actions {
            clickId(idMoreContainer)
        }
    }

    companion object {
        inline operator fun invoke(block: MainPage.() -> Unit) = MainPage().block()
    }
}