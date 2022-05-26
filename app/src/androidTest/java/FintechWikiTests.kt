

import actions.Actions
import pages.MainPage
import pages.AboutAppPage
import panels.MorePanel

import android.content.Intent

import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.*

import androidx.test.rule.ActivityTestRule



import org.junit.Before
import org.junit.Rule
import org.junit.Test

import org.wikipedia.R
import org.wikipedia.main.MainActivity
import pages.SettingsPage


class FintechWikiTests {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun doSkip(){
        Actions {
            clickId(R.id.fragment_onboarding_skip_button)
        }
    }

    @Test
    fun testBrowserRedirection(){
        MainPage {
            clickMoreContainer()
        }
        MorePanel {
            Intents.init()
            clickDonateContainer()
            intended(hasAction(Intent.ACTION_CHOOSER))
            Intents.release()
        }
    }



    @Test
    fun testExistenceOfBlocks(){
        MainPage {
            clickMoreContainer()
        }
        MorePanel {
            clickSettingsContainer()
        }
        SettingsPage {
            clickAboutApp()
        }
        AboutAppPage {
            hasContributors()
            hasTranslators()
            hasLicense()
        }

    }
}