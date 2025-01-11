package leegroup.module.analytics

import leegroup.module.analytics.event.AnalyticsEvent

interface Tracking {
    val prefix: String

    fun track(event: AnalyticsEvent)

    interface Launch : Tracking {
        fun launch() = track(
            AnalyticsEvent("${prefix}_LAUNCH")
        )
    }

    interface BackClick : Tracking {
        fun clickBack() = track(
            AnalyticsEvent("${prefix}_CLICK_BACK")
        )
    }

    interface CancelClick : Tracking {
        fun clickCancel() = track(
            AnalyticsEvent("${prefix}_CLICK_CANCEL")
        )
    }

    interface CloseClick : Tracking {
        fun clickClose() = track(
            AnalyticsEvent("${prefix}_CLICK_CLOSE")
        )
    }

    interface SaveClick : Tracking {
        fun clickSave() = track(
            AnalyticsEvent("${prefix}_CLICK_SAVE")
        )
    }

    interface Close : Tracking {
        fun close() = track(
            AnalyticsEvent("${prefix}_CLOSE")
        )
    }
}
