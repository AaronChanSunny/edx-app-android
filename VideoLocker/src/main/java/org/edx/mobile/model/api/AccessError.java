package org.edx.mobile.model.api;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

/**
 * Created by lindaliu on 7/13/15.
 */

public enum AccessError {
    @SerializedName("course_not_started")
    StartDateError,
    @SerializedName("not_visible_to_user")
    VisibilityError,
    @SerializedName("unfulfilled_milestones")
    MilestoneError,
    UnknownError;
}