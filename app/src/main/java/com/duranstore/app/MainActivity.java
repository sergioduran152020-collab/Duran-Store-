package com.duranstore.aplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

import java.net.URLEncoder;

public class MainActivity extends Activity {

    private final String WHATSAPP = "573189019093";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout principal = new LinearLayout(this);
        principal.setOrientation(LinearLayout.VERTICAL);
        principal.setPadding(20, 20, 20, 20);
        principal.setBackgroundColor(Color.rgb(5, 12, 28));

        ScrollView scroll = new ScrollView(this);
        scroll.addView(principal);

        ImageView banner = new ImageView(this);
        banner.setImageResource(R.drawable.banner);
        banner.setAdjustViewBounds(true);
        banner.setScaleType(ImageView.ScaleType.CENTER_CROP);
        principal.addView(banner);

        TextView titulo = new TextView(this);
        titulo.setText("💎 DURAN STORE 💎");
        titulo.setTextColor(Color.WHITE);
        titulo.setTextSize(28);
        titulo.setGravity(Gravity.CENTER);
        titulo.setPadding(0, 25, 0, 10);
        principal.addView(titulo);

        TextView info = new TextView(this);
        info.setText("Diamantes Free Fire\nEntrega de 1 a 20 minutos\nPago por Nequi: 3189019093");
        info.setTextColor(Color.WHITE);
        info.setTextSize(17);
        info.setGravity(Gravity.CENTER);
        info.setPadding(0, 10, 0, 25);
        principal.addView(info);

        agregarBoton(principal, "💎 110 Diamantes — $3.573 COP", "110 Diamantes - $3.573 COP");
        agregarBoton(principal, "💎 341 Diamantes — $10.719 COP", "341 Diamantes - $10.719 COP");
        agregarBoton(principal, "💎 572 Diamantes — $18.124 COP", "572 Diamantes - $18.124 COP");
        agregarBoton(principal, "💎 1166 Diamantes — $33.659 COP", "1166 Diamantes - $33.659 COP");
        agregarBoton(principal, "💎 2398 Diamantes — $66.802 COP", "2398 Diamantes - $66.802 COP");
        agregarBoton(principal, "💎 6160 Diamantes —
