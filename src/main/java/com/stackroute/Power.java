package com.stackroute;
import java.util.*;

public class Power {
        int n=0;
       static boolean getDisplay(int n)
        {
            if(n == 0)
                return true;
            while(n != 1)
            {
                if(n % 4 != 0)
                    return false;
                n = n / 4;
            }
            return true;


    }

    }