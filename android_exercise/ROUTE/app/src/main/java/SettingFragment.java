import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.bumjun.route.R;

import java.util.ArrayList;

public class SettingFragment extends Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_setting,container,false);

        ArrayList<String> arSetting = new ArrayList<String>();
        arSetting.add("Logout");
        arSetting.add("Velocity control");
        arSetting.add("Sound control");
        arSetting.add("Version");

        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arSetting);

        ListView list = (ListView)findViewById(R.id.settingList);
        list.setAdapter(Adapter);
        list.setDivider(new ColorDrawable(Color.WHITE));
        list.setDividerHeight(2);
        return rootView;
    }
}
