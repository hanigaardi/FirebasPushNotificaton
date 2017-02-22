package makers.ar_d.firebaspushnotificaton.FirebaseServices;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Diethel on 2/22/2017.
 */
//TODO: 3 add 2 firebase services in package + add to manifest
public class MyFirebaseIdServices extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
    //do something you need
    }
}
