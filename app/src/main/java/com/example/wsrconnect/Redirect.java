package com.example.wsrconnect;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class Redirect {



    public void GoToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);

    }

    public void GoToWSR(){
        GoToUrl("");
    }


}
