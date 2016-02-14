//TODO: Fix for any number of tags
import java.util.Arrays;
import java.util.ArrayList;
public class Song
{
    public static final String[]  EXAMPLE = {"Favorites", "Secondary", "Other", "Fast", "Slow", "N/A", "Oldies", "Acapella",
        "Embarrassed", "Workout", "Classical", "Opera", "Christmas", "Buddy Holly", "Musicals", "XC", "Consideration",
        "Connor", "Karen", "Talia", "HIMYM", "Disney", "The Sound of Music", "Les Miserables", "Seussical", "Spanish", "Hamilton"};
    public static final int NUMBER_OF_TAGS = Song.EXAMPLE.length;
    private String name;
    private String artist;
    private String album;
    private String spotifyID;
    private String inputLength;
    private int songLength;
    private ArrayList<Boolean> tags = new ArrayList<Boolean>();
    private Boolean favorites;
    private Boolean secondary;
    private Boolean other;
    private Boolean fast;
    private Boolean slow;
    private Boolean notApplicable;
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
    private Boolean seussical;
    private Boolean spanish;
    private Boolean hamilton;

    public Song(String name, Boolean nameError, String artist, String album, String inputLength, String spotifyID, ArrayList<Boolean> tagData)
    {
        if(!(tagData.size() == NUMBER_OF_TAGS))
        {
            this.name = "Error";
            this.artist = "Error";
            this.album = "Error";
            this.spotifyID = "Error";
        }
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
        this.spotifyID = spotifyID;
        this.songLength = 60 * Integer.parseInt(inputLength.substring(2, 4)) + Integer.parseInt(inputLength.substring(5, 7));
        this.tags = tagData;
        this.favorites = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Favorites"));
        this.secondary = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Secondary"));
        this.other = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Other"));
        this.fast = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Fast"));
        this.slow = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Slow"));
        this.notApplicable = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("N/A"));
        this.oldies = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Oldies"));
        this.acapella = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Acapella"));
        this.embarrassed = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Embarrassed"));
        this.workout = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Workout"));
        this.classical = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Classical"));
        this.opera = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Opera"));
        this.christmas = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Christmas"));
        this.buddyHolly = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Buddy Holly"));
        this.musicals = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Musicals"));
        this.xc = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("XC"));
        this.consideration = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Consideration"));
        this.connor = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Connor"));
        this.karen = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Karen"));
        this.talia = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Talia"));
        this.himym = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("HIMYM"));
        this.disney = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Disney"));
        this.theSoundOfMusic = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("The Sound of Music"));
        this.lesMiserables = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Les Miserables"));
        this.seussical = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Seussical"));
        this.spanish = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Spanish"));
        this.hamilton = tagData.get(java.util.Arrays.asList(EXAMPLE).indexOf("Hamilton"));
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

    public ArrayList<Boolean> getTags()
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

    public Boolean getnotApplicable()
    {
        return notApplicable;
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

    public Boolean getSeussical()
    {
        return seussical;
    }

    public Boolean getSpanish()
    {
        return spanish;
    }

    public Boolean getHamilton()
    {
        return hamilton;
    }

    public String getPlaylistName()
    {
        String fullName = getName() + " - " + getArtist() + " - " + getAlbum();
        return fullName;
    }

    public String getFullName()
    {
        String fullName = getName() + " - " + getArtist() + " (" + getAlbum() + " - " + getLengthString() + ")";
        for(int i = 0; i < NUMBER_OF_TAGS; i++)
        {
            if(tags.get(i) == true)
            {
                fullName += " " + Song.EXAMPLE[i];
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
