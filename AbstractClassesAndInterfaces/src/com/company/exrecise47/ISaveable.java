package com.company.exrecise47;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
