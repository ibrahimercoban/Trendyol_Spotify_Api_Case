import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SpotifyPlaylistApiTest extends BaseTest{

    @Test
    public void playlistJourney(){
        String userId = user.getUserId(200);
        String playlistId = createPlaylist.createPlayList(userId,201,"playlistBody");
        Assert.assertEquals( 0,playlists.getPlaylistSize(playlistId, 200));
        List<String> trackList = new ArrayList<>();
        trackList.add(search.findTrack("Someone Like You",200));
        trackList.add(search.findTrack("Rolling in the Deep",200));
        trackList.add(search.findTrack("Set Fire to the Rain",200));
        trackList.add(search.findTrack("Hello",200));
        playlists.addTracks(trackList,playlistId,201);
        Assert.assertTrue( playlists.getPlaylistSize(playlistId, 200) == 4);
        playlists.deleteTrack(trackList.get(2),playlistId,200);
        Assert.assertTrue(playlists.getPlaylistSize(playlistId, 200) == 3);
    }
}
