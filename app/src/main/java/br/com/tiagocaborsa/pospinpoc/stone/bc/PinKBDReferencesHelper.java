package br.com.tiagocaborsa.pospinpoc.stone.bc;

import android.util.Log;

public class PinKBDReferencesHelper implements ConfigPinKBDReferences {

    private static final String TAG = PinKBDReferencesHelper.class.getName();
    private PinKBDReferences pinKBDReferences;

    @Override
    public void setPinKBDReferences(PinKBDReferences pinKBDReferences) {
        Log.d(TAG, "setPinKBDReferences: " + pinKBDReferences);
        this.pinKBDReferences = pinKBDReferences;
    }

    public PinKBDReferences getPinKBDReferences() {
        return pinKBDReferences;
    }

}