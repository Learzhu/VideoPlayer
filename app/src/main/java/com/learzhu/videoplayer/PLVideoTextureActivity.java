package com.learzhu.videoplayer;

import android.media.session.MediaController;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import com.pili.pldroid.player.widget.PLVideoTextureView;

public class PLVideoTextureActivity extends AppCompatActivity {

    //    private MediaController mMediaController;
    private android.widget.MediaController mMediaController;
    private PLVideoTextureView mVideoTextureView;
    private Toast mToast = null;
    private String mVideoPath = null;
    private int mRotation = 0;
    private int mDisplayAspectRatio = PLVideoTextureView.ASPECT_RATIO_FIT_PARENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_plvideo_texture);
        mVideoTextureView = (PLVideoTextureView) findViewById(R.id.videoView);

    }

}
