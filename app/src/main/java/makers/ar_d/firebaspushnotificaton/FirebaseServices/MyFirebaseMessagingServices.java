package makers.ar_d.firebaspushnotificaton.FirebaseServices;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import makers.ar_d.firebaspushnotificaton.Config.Config;

/**
 * Created by Diethel on 2/22/2017.
 */
//TODO:4 add messaging services + add to manifest
public class MyFirebaseMessagingServices extends FirebaseMessagingService{
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        handleNotification(remoteMessage.getNotification().getBody());
    }

    private void handleNotification(String body) {
        //sync config
        Intent pushNotification = new Intent(Config.STR_PUSH);
        //send broadcast to app
        pushNotification.putExtra("message", body);
        LocalBroadcastManager.getInstance(this).sendBroadcast(pushNotification);
    }
}
