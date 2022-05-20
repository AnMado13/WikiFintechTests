package panels

import actions.Actions
import org.wikipedia.R


class MorePanel {
    private val idDonateContainer = R.id.main_drawer_donate_container
    private val idSettingsContainer = R.id.main_drawer_settings_container

    fun clickDonateContainer(){
        Actions {
            clickId(idDonateContainer)
        }
    }

    fun clickSettingsContainer(){
        Actions {
            clickId(idSettingsContainer)
        }
    }

    companion object {
        inline operator fun invoke(block: MorePanel.() -> Unit) = MorePanel().block()
    }
}