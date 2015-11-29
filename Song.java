//TODO: Fix for any number of tags 
import java.util.Arrays;
public class Song
{
    public static final String[]  EXAMPLE = {"Favorites", "Secondary", "Other", "Fast", "Slow", "N/A", "Oldies", "Acapella", "Embarrassed", "Workout", "Classical", "Opera", "Christmas", "Buddy Holly", "Musicals", "XC", "Consideration", "Connor", "Karen", "Talia", "HIMYM", "Disney", "The Sound of Music", "Les Miserables"};
    private String name;
    private String artist;
    private String album;
    private String spotifyID;
    private String inputLength;
    private int songLength;
    private Boolean[] tags = new Boolean[24];
    private Boolean favorites;
    private Boolean secondary;
    private Boolean other;
    private Boolean fast;
    private Boolean slow;
    private Boolean notapplicable;
    private Boolean oldies;
    private Boolean acapella;
    private Boolean embarrassed;
    private Boolean workout;
    private Boolean classical;
    private Boolean opera;
    private Boolean christmas;
    private Boolean buddyHolly;
    private Boolean musicals;
    private Boolean xc;
    private Boolean consideration;
    private Boolean connor;
    private Boolean karen;
    private Boolean talia;
    private Boolean himym;
    private Boolean disney;
    private Boolean theSoundOfMusic;
    private Boolean lesMiserables;

    public Song(String name, Boolean nameError, String artist, String album, String inputLength, String spotifyID, Boolean favorites, Boolean secondary, Boolean other, Boolean fast, Boolean slow, Boolean notapplicable, Boolean oldies, Boolean acapella, Boolean embarrassed, Boolean workout, Boolean classical, Boolean opera, Boolean christmas, Boolean buddyHolly, Boolean musicals, Boolean xc, Boolean consideration, Boolean connor, Boolean karen, Boolean talia, Boolean himym, Boolean disney, Boolean theSoundOfMusic, Boolean lesMiserables)
    {
        if(nameError)
        {
            int first = name.indexOf("~~");
            int second = name.indexOf("~~", first + 1);
            this.name = name.substring(0, first) + "\"" + name.substring(first + 2, second) + "\"" + name.substring(second + 2);
        }
        else
        {
            this.name = name;
        }
        this.artist = artist;
        this.album = album;
        this.inputLength = inputLength;
        this.songLength = 60 * Integer.parseInt(inputLength.substring(2, 4)) + Integer.parseInt(inputLength.substring(5, 7));
        this.spotifyID = spotifyID;
        this.favorites = favorites;
        this.secondary = secondary;
        this.other = other;
        this.fast = fast;
        this.slow = slow;
        this.notapplicable = notapplicable;
        this.oldies = oldies;
        this.acapella = acapella;
        this.embarrassed = embarrassed;
        this.workout = workout;
        this.classical = classical;
        this.opera = opera;
        this.christmas = christmas;
        this.buddyHolly = buddyHolly;
        this.musicals = musicals;
        this.xc = xc;
        this.consideration = consideration;
        this.connor = connor;
        this.karen = karen;
        this.talia = talia;
        this.himym = himym;
        this.disney = disney;
        this.theSoundOfMusic = theSoundOfMusic;
        this.lesMiserables = lesMiserables;
        tags[0] = favorites;
        tags[1] = secondary;
        tags[2] = other;
        tags[3] = fast;
        tags[4] = slow;
        tags[5] = notapplicable;
        tags[6] = oldies;
        tags[7] = acapella;
        tags[8] = embarrassed;
        tags[9] = workout;
        tags[10] = classical;
        tags[11] = opera;
        tags[12] = christmas;
        tags[13] = buddyHolly;
        tags[14] = musicals;
        tags[15] = xc;
        tags[16] = consideration;
        tags[17] = connor;
        tags[18] = karen;
        tags[19] = talia;
        tags[20] = himym;
        tags[21] = disney;
        tags[22] = theSoundOfMusic;
        tags[23] = lesMiserables;
    }

    public String getName()
    {
        return name;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getAlbum()
    {
        return album;
    }

    public String getLengthString()
    {
        return inputLength;
    }

    public int getLengthInt()
    {
        return songLength;
    }

    public String getSpotifyID()
    {
        return spotifyID;
    }

    public Boolean[] getTags()
    {
        return tags;
    }

    public Boolean getFavorites()
    {
        return favorites;
    }

    public Boolean getSecondary()
    {
        return secondary;
    }

    public Boolean getOther()
    {
        return other;
    }

    public Boolean getFast()
    {
        return fast;
    }

    public Boolean getSlow()
    {
        return slow;
    }

    public Boolean getnotapplicable()
    {
        return notapplicable;
    }

    public Boolean getOldies()
    {
        return oldies;
    }

    public Boolean getAcapella()
    {
        return acapella;
    }

    public Boolean getEmbarrassed()
    {
        return embarrassed;
    }

    public Boolean getWorkout()
    {
        return workout;
    }

    public Boolean getClassical()
    {
        return classical;
    }

    public Boolean getOpera()
    {
        return opera;
    }

    public Boolean getChristmas()
    {
        return christmas;
    }

    public Boolean getBuddyHolly()
    {
        return buddyHolly;
    }

    public Boolean getMusicals()
    {
        return musicals;
    }

    public Boolean getXC()
    {
        return xc;
    }

    public Boolean getConsideration()
    {
        return consideration;
    }

    public Boolean getConnor()
    {
        return connor;
    }

    public Boolean getKaren()
    {
        return karen;
    }

    public Boolean getTalia()
    {
        return talia;
    }

    public Boolean getHIMYM()
    {
        return himym;
    }

    public Boolean getDisney()
    {
        return disney;
    }

    public Boolean getTheSoundOfMusic()
    {
        return theSoundOfMusic;
    }

    public Boolean getLesMiserables()
    {
        return lesMiserables;
    }

    public String getPlaylistName()
    {
        String fullName = getName() + " - " + getArtist() + " - " + getAlbum();
        return fullName;
    }

    public String getFullName()
    {
        String fullName = getName() + " - " + getArtist() + " (" + getAlbum() + " - " + getLengthString() + ")";
        for(int i = 0; i < 24; i++)
        {
            if(tags[i] == true)
            {
                fullName += " " + EXAMPLE[i];
            }
        }
        return fullName;
    }

    public void printPlaylistName()
    {
        System.out.println(getPlaylistName());
    }

    public void printFullName()
    {
        System.out.println(getFullName());
    }
}
