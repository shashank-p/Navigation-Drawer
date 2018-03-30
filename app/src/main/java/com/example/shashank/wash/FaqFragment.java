package com.example.shashank.wash;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.shashank.wash.SubFaq.SubFaq1Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FaqFragment extends Fragment implements View.OnClickListener {


    public FaqFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faq, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view){
        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    private void changeFragment7(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubFaq1Fragment()).commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                changeFragment7();
                break;
        }
    }
}
