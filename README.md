
# Broadcast Receiver
![App Screenshot](https://s3.eu-west-2.amazonaws.com/uploads.3alampro.com/old/monthly_2017_10/types-broadcast.thumb.PNG.9d980eec2ec08a61f4b8d7616836dc6d.PNG)

Broadcast receiver is an android component which allow you to register for system or application events. All registered receivers for an event are notified by the Android runtime once this event happens.

- Normal Broadcast
Normal broadcasts are not orderly. Therefore, the registered receivers often run all at the same time. This is very efficient, but the Receivers are unable to utilize the results.

- Ordered Broadcast
One broadcast is delivered to one receiver at a time and Receivers can use the result.

The order is defined using android: priority attribute , The receivers with greater priority would receive the broadcast first

- Sticky Broadcast
Sticky broadcasts should not be used. They provide no security (anyone can access them)
and was deprecated in API level 21

- Local Broadcast

## What is the benefit of using broadcast receivers ??

to handle/respond events like Battery low , WIFI Availability , incoming calls , incoming SMS , Bluetooth device connected , Charger connect and disconnect

another advantage is you do not have to keep app running in which the broadcast receiver is declared
____

### notes

onReceive(Context context , Intent intent) // this method gets executed whenever the broadcast receiver gets triggered
