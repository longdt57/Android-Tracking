package com.app.androidcompose.tracking

import leegroup.module.analytics.DefaultTracking
import leegroup.module.analytics.Tracking
import javax.inject.Inject

class HomeTracking @Inject constructor(
    private val defaultTracking: DefaultTracking,
) : Tracking by defaultTracking,
    Tracking.Launch {

    override val prefix: String get() = "HOME"
}
