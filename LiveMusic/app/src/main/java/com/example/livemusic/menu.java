package com.example.livemusic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.text.NumberFormat;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class menu extends AppCompatActivity  {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);


        }


        public void submitOrder(View view) {
            EditText fromField = (EditText) findViewById(R.id.From);
            Editable fromEditable = fromField.getText();
            String from = fromEditable.toString();

            EditText toField = (EditText) findViewById(R.id.to);
            Editable toEditable = toField.getText();
            String to = toEditable.toString();

            EditText artistField = (EditText) findViewById(R.id.artist);
            Editable artistEditable = artistField.getText();
            String artist = artistEditable.toString();

            EditText songField = (EditText) findViewById(R.id.song);
            Editable songEditable = songField.getText();
            String song = songEditable.toString();

            String message = createOrderSummary(from, to, artist, song);

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto: mamang_dangdut@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT,
                    getString(R.string.order_summary_email_subject, from));
            intent.putExtra(Intent.EXTRA_TEXT, message);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

        }

        private String createOrderSummary(String from, String to, String artist, String song) {
            String reqsong = getString(R.string.order_summary_From, from);
            reqsong += "\n" + getString(R.string.order_summary_to, to);
            reqsong += "\n" + getString(R.string.order_artist, artist);
            reqsong += "\n" + getString(R.string.order_song, song);

            reqsong += "\n" + getString(R.string.thank_you);
            return reqsong;
        }
   }




