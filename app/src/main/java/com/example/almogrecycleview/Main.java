package com.example.almogrecycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.intellij.lang.annotations.JdkConstants;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Main#newInstance} factory method to
 * create an instance of this fragment.
 */


public class Main extends Fragment implements RecyclerViewInterface {
    private ArrayList<DataModel> dataSet;

    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Main() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Main.
     */
    // TODO: Rename and change types and number of parameters
    public static Main newInstance(String param1, String param2) {
        Main fragment = new Main();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        recycleView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        layoutManager = new LinearLayoutManager(getActivity()); // new GridLayoutManager
        recycleView.setLayoutManager(layoutManager);

        recycleView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<DataModel>();

        for(int i=0 ; i<MyData.nameArray.length ; i++)
        {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    //MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]


            ));
        }



        CustomAdapter addapter = new CustomAdapter(getContext(),dataSet,this);
        recycleView.setAdapter(addapter);

         return view;
    }


    @Override
    public void onItemClick(int pos,View view) {
        String[] strArr = {"Ed (Matt Hill) is the strong, airheaded, dimwitted, and considerate of the three who has very short hair. He wears a red-and-white striped shirt, a green jacket with two white stripes on each sleeve and purple-blue jeans.",
                "Edd (Samuel Vincent) is the smartest of the Eds and the most polite, mature, curious, and somewhat ironic. As a result, he is more socially accepted by the rest of the kids than Ed and Eddy, usually acting as a peacemaker or offering the rest of the kids advice.",
                "Eddy (Tony Sampson) is the self-appointed leader of the Eds. He is arrogant, self-centered, ignorant, loudmouthed, immature, greedy, and hot-tempered.",
                "Jimmy (Keenan Christenson) is an insecure and innocent child, with a propensity to cry, and Sarah's best friend whom he is most often seen spending his time with.",
                "Kevin (Kathleen Barr) is a stereotypical jock. He is cynical, sarcastic and can be cruel at times. ",
                "Sarah (Janyse Jaud) is Ed's spoiled and short-tempered younger sister who acts cute and kind to the Eds only when it suits her."};
        int[] imgArr = {R.drawable.ed_big,R.drawable.edd_big,R.drawable.eddy_big,R.drawable.jimmy_big,R.drawable.kevin_big,R.drawable.sarah_big};
        Bundle bundle = new Bundle();
        bundle.putString("description",strArr[pos]);
        bundle.putInt("image",imgArr[pos]);
        getParentFragmentManager().setFragmentResult("bundle",bundle);
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.moveToSecondFrag();

    }

}