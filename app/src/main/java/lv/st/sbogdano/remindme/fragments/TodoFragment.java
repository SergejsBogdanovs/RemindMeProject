package lv.st.sbogdano.remindme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lv.st.sbogdano.remindme.R;

public class TodoFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static TodoFragment getInstance(Context context) {
        Bundle args = new Bundle();
        TodoFragment fragment = new TodoFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_label_todo));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(LAYOUT, container, false);

        return view;
    }

}
