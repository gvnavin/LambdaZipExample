package com.lambazip;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * Created by gnavin on 2/26/17.
 */
public class Hello2 {

    public String hello2Handler(int myCount, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Hello2 received v2 : " + myCount);
        return String.valueOf(myCount + 1);
    }

}
