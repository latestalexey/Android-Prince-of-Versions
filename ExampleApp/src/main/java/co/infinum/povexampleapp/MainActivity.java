package co.infinum.povexampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        Button commonUsage = (Button) findViewById(R.id.btn_open_common_usage);
        Button networkWithLogin = (Button) findViewById(R.id.btn_open_network_with_login);
        Button customParser = (Button) findViewById(R.id.btn_open_custom_parser);
        Button stream = (Button) findViewById(R.id.btn_open_stream_example);
        commonUsage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCommonUsageClick();
            }
        });
        networkWithLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNetworkWithLoginClick();
            }
        });
        customParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCustomParserClick();
            }
        });
        stream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onStreamLoaderClick();
            }
        });
    }

    public void onCommonUsageClick() {
        startActivity(new Intent(this, CommonUsageExample.class));
    }

    public void onNetworkWithLoginClick() {
        startActivity(new Intent(this, NetworkWithLoginExample.class));
    }

    public void onCustomParserClick() {
        startActivity(new Intent(this, CustomParserExample.class));
    }

    public void onStreamLoaderClick() {
        startActivity(new Intent(this, StreamLoaderExample.class));
    }
}
