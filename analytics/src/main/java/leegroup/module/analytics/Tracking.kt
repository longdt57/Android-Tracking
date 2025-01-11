package leegroup.module.analytics

import leegroup.module.analytics.event.AnalyticsEvent

interface Tracking {

    fun track(event: AnalyticsEvent)

    interface PrefixTracking : Tracking {
        val prefix: String
    }

    interface Launch : PrefixTracking {
        fun launch() = track(
            AnalyticsEvent("${prefix}_LAUNCH")
        )
    }

    interface BackClick : PrefixTracking {
        fun clickBack() = track(
            AnalyticsEvent("${prefix}_CLICK_BACK")
        )
    }

    interface CancelClick : PrefixTracking {
        fun clickCancel() = track(
            AnalyticsEvent("${prefix}_CLICK_CANCEL")
        )
    }

    interface CloseClick : PrefixTracking {
        fun clickClose() = track(
            AnalyticsEvent("${prefix}_CLICK_CLOSE")
        )
    }

    interface SaveClick : PrefixTracking {
        fun clickSave() = track(
            AnalyticsEvent("${prefix}_CLICK_SAVE")
        )
    }

    interface Close : PrefixTracking {
        fun close() = track(
            AnalyticsEvent("${prefix}_CLOSE")
        )
    }
}
