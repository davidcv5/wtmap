package com.challdoit.waitingmap.model.places;

import java.util.List;

/**
 * Created by David on 8/23/14.
 */
public class Hours {
    public boolean openNow;
    public List<Period> periods;

    public class Period {
        public Time open;
        public Time close;
    }
}
