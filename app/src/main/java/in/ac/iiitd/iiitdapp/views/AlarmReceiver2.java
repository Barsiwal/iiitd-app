package in.ac.iiitd.iiitdapp.views;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import br.com.goncalves.pugnotification.notification.PugNotification;
import in.ac.iiitd.iiitdapp.R;

public class AlarmReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        PugNotification.with(context)
                .load()
                .title("You Have a Class")
                .message("PCSMA Lecture")
                .bigTextStyle("bigtext")
                .smallIcon(R.drawable.logo)
                .largeIcon(R.drawable.n)
                .flags(Notification.DEFAULT_ALL)
                .simple()
                .build();
        // For our recurring task, we'll just display a message
        Toast.makeText(context, "I'm running", Toast.LENGTH_SHORT).show();
    }
}
