package com.waseefakhtar.pinterestlogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview
import com.waseefakhtar.pinterestlogin.ui.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PinterestLoginApp()
        }
    }
}