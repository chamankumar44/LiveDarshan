package com.example.first.test.oriental.mymultiplatformapp.android.extra

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.example.first.test.oriental.mymultiplatformapp.interfaces.VideoPlayer

class AndroidVideoPlayer(private val context: Context) : VideoPlayer {
    override fun openVideo(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        context.startActivity(intent)
    }
}