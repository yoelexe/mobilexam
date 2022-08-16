package com.example.exam_karen_final

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    /*protected lateinit var videoView: VideoView
    protected lateinit var mediaPlayer: MediaPlayer
    protected var currentVideoPosition: Int = 0 */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //videoView = findViewById(R.id.videoView)

        /*val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.video)

        videoView.setVideoURI(uri)
        videoView.start()

        videoView.setOnPreparedListener { mp ->
            mediaPlayer = mp
            mediaPlayer.isLooping = true

            if(currentVideoPosition != 0){
                mediaPlayer.seekTo(currentVideoPosition)
                mediaPlayer.start()
            }
        }*/

        thread {
            Thread.sleep(4500);
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    /*override fun onPause() {
        super.onPause()

        currentVideoPosition = mediaPlayer.currentPosition
        videoView.pause()
    }

    override fun onResume() {
        super.onResume()

        videoView.start()
    }

    override fun onDestroy() {
        super.onDestroy()

        mediaPlayer.release()
    }*/


}