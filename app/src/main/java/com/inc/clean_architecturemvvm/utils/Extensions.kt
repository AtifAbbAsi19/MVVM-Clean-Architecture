package com.inc.clean_architecturemvvm.utils

import android.content.res.Resources
import android.widget.ImageView
import androidx.annotation.RawRes
import androidx.databinding.BindingAdapter
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

fun ImageView.loadServerImage(url: String?) {

    if (url.isNullOrEmpty()) return
    Picasso.get()
        .load(url)
        .into(this)

}

@BindingAdapter("url")
fun ShapeableImageView.loadImage(url: String?) {
    if (url.isNullOrEmpty()) return
    this.loadServerImage(url)
}

fun Resources.getRawTextFile(@RawRes id: Int) =
    openRawResource(id).bufferedReader().use { it.readText() }
