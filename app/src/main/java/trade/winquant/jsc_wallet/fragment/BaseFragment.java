package trade.winquant.jsc_wallet.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {
    protected Bundle args;

    public static <T extends Fragment> T getInstance(Class clazz, Bundle args) {
        T lFragment = null;
        try {
            lFragment = (T) clazz.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        lFragment.setArguments(args);
        return lFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        args = getArguments();
    }
}
