package leegroup.module.analytics

import leegroup.module.analytics.event.AnalyticsEvent
import javax.inject.Inject

open class DefaultTracking @Inject constructor(
    private val analyticsManager: AnalyticsManager
) : Tracking {

    override fun track(event: AnalyticsEvent) {
        analyticsManager.logEvent(event)
    }
}
