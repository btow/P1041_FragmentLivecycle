package com.example.samsung.p1041_fragmentlivecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by samsung on 28.04.2017.
 */

public class Fragment1 extends Fragment {

    private String message = "";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        message = getString(R.string.the_fragment_1) + getString(R.string.on_attach);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message = getString(R.string.the_fragment_1) + getString(R.string.on_create);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        message = getString(R.string.the_fragment_1) + getString(R.string.on_create_view);
        Messager.sendToAllRecipients(this.getContext(), message);
        return inflater.inflate(R.layout.fragment_1, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        message = getString(R.string.the_fragment_1) + getString(R.string.on_activity_created);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onStart() {
        super.onStart();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_start);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onResume() {
        super.onResume();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_resume);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onPause() {
        super.onPause();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_pause);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onStop() {
        super.onStop();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_stop);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_destroy_view);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_destroy);
        Messager.sendToAllRecipients(this.getContext(), message);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        message = getString(R.string.the_fragment_1) + getString(R.string.on_detach);
        Messager.sendToAllRecipients(this.getContext(), message);
    }
}
