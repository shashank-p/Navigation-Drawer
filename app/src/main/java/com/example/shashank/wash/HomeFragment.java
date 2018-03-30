package com.example.shashank.wash;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.shashank.wash.SubHome.SubHome1Fragment;
import com.example.shashank.wash.SubHome.SubHome2Fragment;
import com.example.shashank.wash.SubHome.SubHome3Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view){
        ImageButton imageButton1 = (ImageButton) view.findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(this);

        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(this);

        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(this);
    }

    private void changeFragment1(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubHome1Fragment()).commit();
    }

    private void changeFragment2(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubHome2Fragment()).commit();
    }

    private void changeFragment3(){
        getFragmentManager().beginTransaction().replace(R.id.mainLayout,new SubHome3Fragment()).commit();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton1:
                changeFragment1();
                break;
            case R.id.imageButton2:
                changeFragment2();
                break;
            case R.id.imageButton3:
                changeFragment3();
                break;
        }

    }

}
