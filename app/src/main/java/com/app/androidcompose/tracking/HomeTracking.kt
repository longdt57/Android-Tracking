package com.app.androidcompose.tracking

import leegroup.module.analytics.AnalyticsManager
import leegroup.module.analytics.Tracking
import leegroup.module.analytics.event.AnalyticsEvent
import javax.inject.Inject

class HomeTracking @Inject constructor(
    private val analyticsManager: AnalyticsManager
) : Tracking.Launch {
    override val prefix: String get() = "HOME"

    override fun track(event: AnalyticsEvent) {
        analyticsManager.logEvent(event)
    }
}
