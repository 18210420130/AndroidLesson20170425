package top.yunp.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import top.yunp.databinding.databinding.ActivityMainBinding;

/**
 * Created by plter on 5/24/17.
 */

public class Presenter {


    private ActivityMainBinding binding;
    private Context context;

    public Presenter(ActivityMainBinding binding, Context context) {
        this.binding = binding;
        this.context = context;

        binding.setUser(new User("XiaoHua"));

//        binding.tvOut.setText("Hello Android");

        binding.btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public ActivityMainBinding getBinding() {
        return binding;
    }

    public Context getContext() {
        return context;
    }
}
