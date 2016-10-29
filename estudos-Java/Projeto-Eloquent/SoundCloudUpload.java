package console;

/**
 * Created by rapiddo-note on 18/05/2016.
 */

import de.voidplus.soundcloud.*;

public class SoundCloudUpload {

    public static void main(String[] args) {
        String audioFilePath = "C:/som/organfinale.wav";

        SoundCloud soundcloud = new SoundCloud(
                "fb8abf0683e5f4af70bfdfcc37a4300b",
                "856ad2677ce1de91b6f8844eb614b3d9"
        );
        soundcloud.login(
                "izamglima@gmail.com",
                "tijolo12345"
        );
        Track track = soundcloud.postTrack(new Track("title of the song", audioFilePath));
        System.out.println("Post !!!");
    }
}
