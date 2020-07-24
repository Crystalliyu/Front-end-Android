package com.laioffer.lma.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.laioffer.lma.MainActivity;
import com.laioffer.lma.OnBoardingActivity;
import com.laioffer.lma.R;
import com.laioffer.lma.model.User;


public class SettingsFragment extends PreferenceFragmentCompat {
    final Context context = getContext();
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);

        Preference last_name = findPreference("first_name_preference");
        Preference first_name = findPreference("last_name_preference");
        final User user = User.getInstance(context);
        if (last_name != null) {
            last_name.setTitle(user.getLastName());
        }
        if (first_name != null) {
            first_name.setTitle(user.getFirstName());
        }

 /*
        Preference location_preference = findPreference("location");
        Log.d("location name","user.getLocation().getName()");
        location_preference.setTitle(user.getLocation().getName());

        // set sign out buttons
        Preference button = (Preference) findPreference(getString(R.string.logout));
        button.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                //User.logout();
                user.saveUserStats(getContext());
                //Log.d("logout","Yo, user logging out");
                Intent launchActivity = new Intent(getActivity(), OnBoardingActivity.class);
                startActivity(launchActivity);
                getActivity().finish();
                return true;
            }
        });*/

    }



}
/*public class SettingsFragment extends Fragment {

    private SettingsViewModel settingsViewModel;
    private SwipeRefreshLayout swipeRefreshLayout;
    private TextView textView_firstName;
    private TextView textView_lastName;
    private TextView textView_location;
    private int num = 0;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) root.findViewById(R.id.swipe_setting);
        textView_firstName = (TextView) root.findViewById(R.id.first_name);
        textView_lastName = (TextView) root.findViewById(R.id.last_name);
        textView_location = (TextView) root.findViewById(R.id.location_id);
        final Context context = getContext();
        final User user = User.getInstance(context);
        textView_firstName.setText(user.getFirstName());
        textView_lastName.setText(user.getLastName());
        textView_location.setText(user.getLocation().getName());
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textView_firstName.setText(user.getFirstName());
                        textView_lastName.setText(user.getLastName());
                        textView_location.setText(user.getLocation().getName());
                        swipeRefreshLayout.setRefreshing(false);
                    }
                },2000);
            }
        });

        final Button button = (Button)root.findViewById(R.id.button_sign_out);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.logout();
                user.saveUserStats(context);
                Intent launchActivity = new Intent(getActivity(), OnBoardingActivity.class);
                startActivity(launchActivity);
                getActivity().finish();
            }
        });
        return root;
    }
}*/


       /* settingsViewModel =
                ViewModelProviders.of(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        settingsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/