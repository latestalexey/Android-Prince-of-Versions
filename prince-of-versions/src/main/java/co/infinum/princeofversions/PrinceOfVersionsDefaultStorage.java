package co.infinum.princeofversions;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Implementation of {@link Storage} which stores data in default {@link SharedPreferences}.
 */
public class PrinceOfVersionsDefaultStorage implements Storage {

    private static final String KEY = "PrinceOfVersions_LastNotifiedUpdate";

    private SharedPreferences sp;

    public PrinceOfVersionsDefaultStorage(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public String lastNotifiedVersion(String defaultValue) {
        return sp.getString(KEY, defaultValue);
    }

    @Override
    public void rememberLastNotifiedVersion(String version) {
        sp.edit().putString(KEY, version).apply();
    }
}