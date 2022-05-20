package pages
import actions.Actions
import android.os.SystemClock
import org.wikipedia.R

class SettingsPage {
    private val stringAboutApp = R.string.about_description
    private val stringExploreFeed = R.string.preference_title_customize_explore_feed


    fun clickAboutApp(){
        Actions {
            scrollToBottom()
            SystemClock.sleep(3000)
            clickText(stringAboutApp)
        }
    }

    fun clickExploreFeed(){
        Actions{
            clickText(stringExploreFeed)
        }
    }

    companion object {
        inline operator fun invoke(block: SettingsPage.() -> Unit) = SettingsPage().block()
    }
}