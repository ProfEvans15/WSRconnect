package com.example.wsrconnect;

import static java.net.Proxy.Type.DIRECT;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity {

    //MAKE BUTTONS BUTTONS
    Button WSRlinkButton, IcampusLinkButton, PTClinkButton, KWWLLinkButton, HighSchoolButton;

    //Make links
    String WSRLINK = "https://www.wsr.k12.ia.us/";
    String ICampusLINK = "https://waverlyia.infinitecampus.org/campus/portal/waverlyshellrock.jsp";
    String PTClink = "https://www.wsr.k12.ia.us/conference-scheduling";
    String KWWLradarLink = "https://www.kwwl.com/weather/interactive-radar/?weather_zip=50677#weather-container-1105891";


    //TODO Fix this
    //intent is to open PTC during PTC time on. May have to do an online BOOL switch, For now it is left always on
    //Parent Teacher Conference(PTC)
    /*
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
    //dates to be compare
    Date today = new Date();
    Date PTCstart;
    Date PTCend;

    {
        try {
            PTCstart = sdf.parse("01-09-2022");
            PTCend = sdf.parse("06-18-2022");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        TODO
         make activity_main.xml look better graphically

        TODO
         make button for Schedules and individual content
             Include:
             -High School
             -Middle School
             -Elementary
        TODO
         #link WSR event page, Maybe a live link? "https://northeastiaconference.org/public/genie/56/school/7/#"

        TODO
         *Add PTC link "https://www.wsr.k12.ia.us/conference-scheduling"
         update PTC button to only appear during the PTC time

        TODO
         Add KWWL website "https://www.kwwl.com/weather/interactive-radar/?weather_zip=50677#weather-container-1105891"

        TODO
         High School add:
         -HS Bell Schedule
         -Call Out button with link to the call out form "https://docs.google.com/a/wsr.k12.ia.us/forms/d/e/1FAIpQLSeEEwCsX5HKsViO4m67HSqZ-2m_kkwAIjtuRj0n9B6QVN8gcA/viewform"
         -Add Staff Directory
         -Link to course guid [SU]{under useful resources}
         -Link to Announcements
         -Another link to ICampus "https://waverlyia.infinitecampus.org/campus/portal/waverlyshellrock.jsp"

        */
        //INIT Buttons and link them to their ID
        WSRlinkButton = (Button) findViewById(R.id.WSRbutton);
        IcampusLinkButton = (Button) findViewById(R.id.Icampus);
        PTClinkButton = (Button) findViewById(R.id.PTCbutton);
        KWWLLinkButton = (Button) findViewById(R.id.KWWLbutton);
        HighSchoolButton = (Button) findViewById(R.id.HighSchoolButton);


        //set visibility
        //TODO FIX
        /*
        if(IsPTC()){
            PTClinkButton.setVisibility(View.GONE);
        }
        */

        //Make on button click Listeners
        WSRlinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(WSRLINK);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri); startActivity(intent);

            }
        });

        IcampusLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(ICampusLINK);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        PTClinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(PTClink);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        KWWLLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(KWWLradarLink);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri); startActivity(intent);

            }
        });

        HighSchoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_high_school);

            }
        });

    }

    /*
    private Boolean IsPTC(){

        if(today.before(PTCstart)) {
            return true;
        }
        else{
            return false;
        }
    }
*/
}