package com.ucsdextandroid2.todoroom

import android.net.Uri
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


/**
 * Created by rjaylward on 2019-07-05
 */

@Entity(tableName = "notes")
@Parcelize
data class Note(
        @PrimaryKey val datetime: Long = System.currentTimeMillis(),
        @ColumnInfo(name = "title") val title: String?,
        @ColumnInfo(name = "text") val text: String?,
        @ColumnInfo(name = "image_uri") val imageUri: Uri? = null
): Parcelable