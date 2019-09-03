package com.manufacturer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import br.com.bcapi.Constants;

public class PinKBDActivity extends AppCompatActivity {

    private static final String TAG = PinKBDActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: start");
        super.onCreate(savedInstanceState);
        setFinishOnTouchOutside(false);

        final int PIN_LAYOUT_ID = getIntent().getIntExtra(Constants.PinLayout.PIN_KBD_LAYOUT_ID, 0);
        setContentView(PIN_LAYOUT_ID);

        final int PIN_KBD_BUTTONS_LAYOUT_ID = getIntent().
                getIntExtra(Constants.PinLayout.PIN_KBD_BUTTONS_LAYOUT_ID, 0);
        LinearLayout layout = findViewById(PIN_KBD_BUTTONS_LAYOUT_ID);

        Button btn0 = layout.findViewWithTag(Constants.PinLayout.BTN_0_TAG);
        Button btn1 = layout.findViewWithTag(Constants.PinLayout.BTN_1_TAG);
        Button btn2 = layout.findViewWithTag(Constants.PinLayout.BTN_2_TAG);
        Button btn3 = layout.findViewWithTag(Constants.PinLayout.BTN_3_TAG);
        Button btn4 = layout.findViewWithTag(Constants.PinLayout.BTN_4_TAG);
        Button btn5 = layout.findViewWithTag(Constants.PinLayout.BTN_5_TAG);
        Button btn6 = layout.findViewWithTag(Constants.PinLayout.BTN_6_TAG);
        Button btn7 = layout.findViewWithTag(Constants.PinLayout.BTN_7_TAG);
        Button btn8 = layout.findViewWithTag(Constants.PinLayout.BTN_8_TAG);
        Button btn9 = layout.findViewWithTag(Constants.PinLayout.BTN_9_TAG);
        Button btnCancel = layout.findViewWithTag(Constants.PinLayout.BTN_CANCEL_TAG);
        Button btnClear = layout.findViewWithTag(Constants.PinLayout.BTN_CLEAR_TAG);
        Button btnConfirm = layout.findViewWithTag(Constants.PinLayout.BTN_CONFIRM_TAG);

        PinKBDReferences pinKBDReferences = new PinKBDReferences(
                btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnCancel,
                btnClear, btnConfirm, this
        );

        PinKBDReferencesHelper.INSTANCE().setPinKBDReferences(pinKBDReferences);
        Log.i(TAG, "onCreate: end");
    }
}