package com.example.shashank.wash;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.shashank.wash.SubServices.SubServices1Fragment;
import com.example.shashank.wash.SubServices.SubServices2Fragment;
import com.example.shashank.wash.SubServices.SubServices3Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment implements View.OnClickListener {

        public ServicesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_services, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view){
        ImageButton imageButton4 = (ImageButton) view.findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(this);

        ImageButton imageButton5 = (ImageButton) view.findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(this);

        ImageButton imageButton6 = (ImageButton) view.findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(this);

    }

    private void changeFragment4(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubServices1Fragment()).commit();
    }

    private void changeFragment5(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubServices2Fragment()).commit();
    }

    private void changeFragment6(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubServices3Fragment()).commit();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton4:
                changeFragment4();
                break;
            case R.id.imageButton5:
                changeFragment5();
                break;
            case R.id.imageButton6:
                changeFragment6();
                break;
        }

    }

}
