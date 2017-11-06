package com.theatrix.factory;

import com.theatrix.domain.Show;
import com.theatrix.utility.KeyGenerator;

/**
 * Created by aubrey on 07/08/2017.
 */
public class ShowFactory {

    public static Show buildShows(Long id, String showName, String startTime, String endTime, Long MovieId){

        Show shows = new Show.Builder()
                .id(KeyGenerator.getEntityId())
                .showNameVal(showName)
                .startTimeVal(startTime)
                .endTimeVal(endTime)
                .movieVal(MovieId)
                .build();

        return shows;
    }
}