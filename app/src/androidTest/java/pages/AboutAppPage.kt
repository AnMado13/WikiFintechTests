package pages

import actions.Actions
import org.wikipedia.R

class AboutAppPage {
    private val stringContributors = R.string.about_contributors_heading
    private val stringTranslators = R.string.about_translators_heading
    private val stringLicense = R.string.about_app_license_heading

    fun hasContributors(){
        Actions{
            hasText(stringContributors)
        }
    }

    fun hasTranslators(){
        Actions{
            hasText(stringTranslators)
        }
    }

    fun hasLicense(){
        Actions{
            hasText(stringLicense)
        }
    }

    companion object {
        inline operator fun invoke(block: AboutAppPage.() -> Unit) = AboutAppPage().block()
    }
}