package com.waseefakhtar.pinterestlogin

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import com.waseefakhtar.pinterestlogin.ui.AppTheme
import com.waseefakhtar.pinterestlogin.ui.login.LoginScreen

@Composable
fun PinterestLoginApp() {
    AppTheme(true) {
        AppContent()
    }
}

@Composable
private fun AppContent() {
    Surface(color = MaterialTheme.colors.background) {
        LoginScreen()
    }
}