package com.waseefakhtar.pinterestlogin.ui.login

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.preferredHeight
import androidx.ui.layout.preferredWidth
import androidx.ui.material.*
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp

@Composable
fun LoginScreen() {
    Scaffold(
        bodyContent = { modifier ->
            Button(
                modifier = Modifier.fillMaxWidth().preferredHeight(42.dp),
                onClick = { },
                text = { Text(text = "Sign up") }
            )

        }
    )
    /*Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            AppDrawer(
                currentScreen = Screen.Home,
                closeDrawer = { scaffoldState.drawerState = DrawerState.Closed }
            )
        },
        topAppBar = {
            TopAppBar(
                title = { Text(text = "Jetnews") },
                navigationIcon = {
                    IconButton(onClick = { scaffoldState.drawerState = DrawerState.Opened }) {
                        Icon(vectorResource(R.drawable.ic_jetnews_logo))
                    }
                }
            )
        },
        bodyContent = { modifier ->
            HomeScreenContent(postsRepository, modifier)
        }
    )*/
}