package com.laioffer.lma.ui.overview;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.laioffer.lma.MainActivity;
import com.laioffer.lma.SetupActivity;
import com.laioffer.lma.model.Machine;
//import com.laioffer.lma.model.Machine.MachineBuilder;
import androidx.lifecycle.LiveData;
import com.laioffer.lma.model.Machine;
import com.laioffer.lma.model.User;
import com.laioffer.lma.network.Account;
import com.laioffer.lma.network.MachinesList;
import com.laioffer.lma.utils.Encryption;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;


// deprecated class
public class OverviewViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public Handler handler = new Handler();
//    public OverviewViewModel() {
//        mText = new MutableLiveData<>();
////        Thread thread = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                final List<Machine> list = MachinesList.checkMachineStatus();
////
////                Handler threadHandler = new Handler(Looper.getMainLooper());
////                threadHandler.post(new Runnable() {
////                    @Override
////                    public void run() {
////                        int totalNum = list.size();
////                        int num = countAvailableMachines(list);
////                        mText.setValue("The number of available machines are " + num + " out of " + totalNum);
////                        list.clear();
////                    }
////                });
////            }
////        });
////        thread.start();
//
//    }
//
//    private int countAvailableMachines(List<Machine> list) {
//        int count = 0;
//        for (Machine m : list) {
//            if (m.getIsAvailable() == "true") {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public LiveData<String> getText() {
//        return mText;
//    }
//
//
//    private MutableLiveData<List<Machine>> machines;
//    public LiveData<List<Machine>> getMachines() {
//        if (machines == null) {
//            machines = new MutableLiveData<List<Machine>>();
//            loadMachines();
//        }
//        return machines;
//    }
//
////    private void loadMachines() {
////
////        Thread thread = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                final List<Machine> list = MachinesList.checkMachineStatus();
////
////                Handler threadHandler = new Handler(Looper.getMainLooper());
////                threadHandler.post(new Runnable() {
////                    @Override
////                    public void run() {
////                        //int totalNum = list.size();
////                        //int num = countAvailableMachines(list);
////                        //mText.setValue("The number of available machines are " + num + " out of " + totalNum);
////                        machines.setValue(list);
////                        list.clear();
////                    }
////                });
////            }
////        });
////        thread.start();
////    }


}