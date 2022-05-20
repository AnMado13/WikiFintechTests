import actions.Actions
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.wikipedia.R
import org.wikipedia.main.MainActivity
import pages.MainPage
import pages.SettingsPage

@RunWith(Parameterized::class)
class ParameterizedCase2(private val array: String) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun monthNumbers(): Collection<Array<String>> {
            return listOf(

            )
        }
    }


    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun doSkip() {
        Actions {
            clickId(R.id.fragment_onboarding_skip_button)
        }
        MainPage {
            clickMoreContainer()
        }
        SettingsPage {
            clickExploreFeed()
        }
    }


    @Test
    fun testCheckboxes() {

    }
}