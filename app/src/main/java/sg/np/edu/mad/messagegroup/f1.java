package sg.np.edu.mad.messagegroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class f1 extends Fragment {
    //pump controls fragment 1
    @Override
    public View onCreateView(LayoutInflater pump, ViewGroup cluster, Bundle savedInstanceState){
        View v = pump.inflate(R.layout.f1, cluster, false);
        return v;
    }
}
