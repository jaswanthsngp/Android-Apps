package com.example.kotlindemobasics;
/*  LOg files and "TODOo statements"

1. Log: it is used to provide the information about the code status to the programmer and also tells what the level of severity of an
 individual log should be. It informes about 6 log levels according to the severity from high to low:
* 1. assert .a :
* 2.error  .e  :
* 3.warn  .w  :
* 4. info  .i  ::
* 5.debug  .d  :
* 6. verbose  .v  :

Syntac:      classname.methoName(name of class, message);  =>   Log.i(s,"hey i am error");
NOTE: if we write .w that means it will be showing all the levels above its severity
including this. Log statement should be placed as the first statment of the method
so that we get to know the separataion ifthe code is called multiple times.

2. TODOp statemets : these statements are used to put as a comment in each of the
class identified separately which is present in a application . So that later on each class can
be refered from the TODOs statements from the TODOm tab next to run tab at the bottom*/
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class P0LogFiles extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String s = getClass().getSimpleName(); //if there are multiple classes involved then this statement
        // will help me getting the exact classname becauseof which lof ic created.
        Log.i(s,"i am error");
        // search it in the TODOp tab at the bottom and you will se it to be referred. USeful when the app has many activities.
//IT should be the last statement in the body .
        //TODO Statemnt TD1
        }
}