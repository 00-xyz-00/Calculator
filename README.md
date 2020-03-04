# Homework - Week 1 Day 4

## Coding

Complete the calculator application we began in class, add new scientific functionality(sin, cos, x^2 .. etc) to the application when the device is in landscape orientation.
Extra Points
If the landscape orientation is done using a ConstraintLayout

![calculator_landscapre](/Users/fieldemployee/Desktop/Bootcamp/Week 1/Day 2/Assignment/scientificcalculator/calculator_landscapre.png)

![calculator_portrait](/Users/fieldemployee/Desktop/Bootcamp/Week 1/Day 2/Assignment/scientificcalculator/calculator_portrait.png)



## Research

1. ***Define the following terms: View, ViewGroup, View Hierarchy.***

   - **<u>*View:*</u>** occupies a rectangular area on the screen and is responsible for drawing and event handling.
   - **<u>*ViewGroup:*</u>** Base class for layouts and views containers, it is a view that contain other views (children).
   - **<u>*View Hierarchy:*</u>** It is modeled by a tree that represents the hierarchy of views (nested views (parents and children)).

2. ***Explain in detail how the following layouts render, and what unique items each has that must be implemented: ConstraintLayout, LinearLayout, CoordinatorLayout, GridLayout and RelativeLayout?***

   - **<u>*ConstraintLayout:*</u>** ViewGroup that allows to position and size widgets in a flexible way. Important items are:
     - Margins: **android:layout_marginStart**, **android:layout_marginEnd**, **android:layout_marginLeft**, **android:layout_marginTop**, **android:layout_marginRight**, **android:layout_marginBottom**
     - Dimension constraints: **android:minWidth**, **android:minHeight**, **android:maxWidth**, **android:maxHeight**, **android:layout_width**, **android:layout_height**
   - **<u>*LinearLayout:*</u>** layout to arrange view linerally horizontal or vertical. The items that have to be implemented are: **android:orientation**, **android:gravity**, and **android:layout_weight** on the child views.
   - ***<u>CoordinatorLayout:</u>*** used as a top-level application decor or as a container for a specific interaction with one or more child views. Important items are: **DefaultBehavior**, and for its children: **anchor**, **insetEdge** and **dodgeInsetEdges**
   - **<u>*GridLayout:*</u>** Places its childrend in a rectangular grid, thus, having indexable rows and columns. Important items are: **rowSpec**, **columnSpec**, **setOrientation**, **setRowCount**, **setColumnCount**, **leftMargin**, **topMargin**, **rightMargin**, **bottomMargin**, **setUseDefaultMargins**,**setGravity**.
   - **<u>*RelativeLayout:*</u>** Positions of the children can be described in relation to each other or the parent. Important items are: **android:layout_alignParentTop**, **android:layout_centerVertical**, **android:layout_below**, **android:layout_toRightOf**

3. ***How does Java garbage collection work?***

   It’s a Daemon thread that is making sure to suppress any Object that is not useful for the program, but waste space in the memory.

4. ***What are the main components of an Android application?***

   Activity, Provider (ContentProvider), Service and Receiver (BroadcastReceiver).

5. ***Explain lifecycle methods of an Activity.***

   - **<u>*onCreate():*</u>** Called once when an Activity is initially created. Always followed by onStart().

   - **<u>*onRestart():*</u>** Called after an activity has been stopped, prior to it to be started again. Always followed by onStart().

   - **<u>*onStart():*</u>** Called when the activity is becoming visible to the user. Followed by onResume() (activity in foreground) or onStop() (activity hidden).

   - **<u>*onResume():*</u>** Called when the activity will start interacting with the user. Always followed by onPause()

   - **<u>*onPause():*</u>** Called when activity loses foreground state, is no longer focusable or before transition to stopped/hidden or destroyed state. After that, onResume() is called if activity returns to the front or onStop() if it becomes invisible to the user.

   - **<u>*onStop():*</u>** Called when the activity is no longer visible to the user. It is followed by onRestart() if activity is coming back to interact with the user or onDestroy() if activity is going away.

   - **<u>*onDestroy():*</u>** Called before activity is destroyed (someone called Activity#finish or Activity#isFinishing is called).

   

