package au.edu.swin.sdmd.l05_detailedimages

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Location(val name: String, val author: String,
                    val latitude: Float, val longitude: Float,
                    //parcelable implementation object
                    val visited: Boolean = false):Parcelable {
}