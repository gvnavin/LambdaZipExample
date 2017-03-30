package com.lambazip;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * Created by gnavin on 2/26/17.
 */
public class Hello {

    public String myHandler(int myCount, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Hello received v2 : " + myCount + 100);
        return String.valueOf(myCount + 100);
    }

}
