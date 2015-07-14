package org.edx.mobile.model.api;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lindaliu on 7/14/15.
 */
public enum StartType {
    @SerializedName("String")
    StringStart,
    @SerializedName("Timestamp")
    TimestampStart,
    @SerializedName("Empty")
    NoneStart
}
