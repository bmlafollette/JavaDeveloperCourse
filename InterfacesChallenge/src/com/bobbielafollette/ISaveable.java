package com.bobbielafollette;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bobbie on 6/1/2016.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);


}
