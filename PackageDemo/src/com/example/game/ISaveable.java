package com.example.game;

import java.util.List;

/**
 * Created by Bobbie on 6/1/2016.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);


}
