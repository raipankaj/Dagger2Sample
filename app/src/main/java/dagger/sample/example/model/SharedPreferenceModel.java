package dagger.sample.example.model;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class SharedPreferenceModel {

    private SharedPreferences sharedPreferences;

    @Inject
    public SharedPreferenceModel(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public void addInt(String key, int value) {
        sharedPreferences.edit().putInt(key, value).apply();
    }

    public void addString(String key, String value) {
        sharedPreferences.edit().putString(key, value).apply();
    }

    public void addLong(String key, long value) {
        sharedPreferences.edit().putLong(key, value).apply();
    }

    public void addFloat(String key, float value) {
        sharedPreferences.edit().putFloat(key, value).apply();
    }

    public void clearData(String key) {
        sharedPreferences.edit().remove(key).apply();
    }

    public void clearAll() {
        sharedPreferences.edit().clear().apply();
    }
}
