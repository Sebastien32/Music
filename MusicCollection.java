import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import  java.io.FileNotFoundException;
import  java.io.FileReader;
import  java.io.IOException;
import java.lang.Boolean;
public class MusicCollection
{
    // An ArrayList to contain all songs in this collection
    private ArrayList<Song> myMusic;
    public MusicCollection()
    {
        // Initializes myMusic as an empty ArrayList of type Song
        myMusic = new ArrayList<Song>();
    }

    public void addSong(Song toAdd)
    {
        // Adds a song to myMusic
        myMusic.add(toAdd);
    }

    public void removeSong(String removalName)
    {
        ArrayList<Song> toRemove = searchName(removalName);
        if(toRemove.size() == 0)
        {
            System.out.println("Search could not find song. Removal Failed.");
        }
        if(toRemove.size() > 1)
        {
            System.out.println("More than one song found. None removed.");
        }
        if(toRemove.size() == 1)
        {
            myMusic.remove(myMusic.indexOf(toRemove.get(0)));
            System.out.println("Song \"" + toRemove.get(0).getName() + "\" removed.");
        }
    }

    public void alphabetize()
    {
        // Sorts all songs in myMusic alphabetically by song name
        for(Song test: myMusic)
        {
            //TODO
        }
    }

    public void printAllPlaylist()
    {
        // Prints the playlist name (song name, artist, and album) of every song in myMusic
        for(Song test: myMusic)
        {
            test.printPlaylistName();
        }
    }

    public void printAllFull()
    {
        // Prints the full name (including tags) of every song in myMusic
        for(Song test: myMusic)
        {
            test.printFullName();
        }
    }

    public ArrayList<Song> searchName(String searchPhrase)
    {
        // An ArrayList of songs to be returned at the end of the method
        ArrayList<Song> returnList = new ArrayList<Song>();
        // For all songs in myMusic
        for(Song test: myMusic)
        {
            // If the index of the search key is greater than zero (song name contains search key)
            if(test.getName().toLowerCase().indexOf(searchPhrase.toLowerCase()) >= 0)
            {
                // Add the song to the list of songs to return
                returnList.add(test);
            }
        }
        // Return all songs matching the criteria
        return returnList;
    }

    public ArrayList<Song> searchArtist(String searchPhrase)
    {
        // An ArrayList of songs to be returned at the end of the method
        ArrayList<Song> returnList = new ArrayList<Song>();
        // For all songs in myMusic
        for(Song test: myMusic)
        {
            // If the index of the search key is greater than zero (artist name contains search key)
            if(test.getArtist().toLowerCase().indexOf(searchPhrase.toLowerCase()) >= 0)
            {
                // Add the song to the list of songs to return
                returnList.add(test);
            }
        }
        // Return all songs matching the criteria
        return returnList;
    }

    public ArrayList<Song> searchAlbum(String searchPhrase)
    {
        // An ArrayList of songs to be returned at the end of the method
        ArrayList<Song> returnList = new ArrayList<Song>();
        // For all songs in myMusic
        for(Song test: myMusic)
        {
            // If the index of the search key is greater than zero (album name contains search key)
            if(test.getAlbum().toLowerCase().indexOf(searchPhrase.toLowerCase()) >= 0)
            {
                // Add the song to the list of songs to return
                returnList.add(test);
            }
        }
        // Return all songs matching the criteria
        return returnList;
    }

    public ArrayList<Song> searchSpotifyID(String searchPhrase)
    {
        // An ArrayList of songs to be returned at the end of the method
        ArrayList<Song> returnList = new ArrayList<Song>();
        // For all songs in myMusic
        for(Song test: myMusic)
        {
            // If the index of the search key is greater than zero (Spotify ID contains search key)
            if(test.getFullName().toLowerCase().indexOf(searchPhrase.toLowerCase()) >= 0)
            {
                // Add the song to the list of songs to return
                returnList.add(test);
            }
        }
        // Return all songs matching the criteria
        return returnList;
    }

    public ArrayList<Song> searchFullName(String searchPhrase)
    {
        // An ArrayList of songs to be returned at the end of the method
        ArrayList<Song> returnList = new ArrayList<Song>();
        // For all songs in myMusic
        for(Song test: myMusic)
        {
            // If the index of the search key is greater than zero (full name contains search key)
            if(test.getFullName().toLowerCase().indexOf(searchPhrase.toLowerCase()) >= 0)
            {
                // Add the song to the list of songs to return
                returnList.add(test);
            }
        }
        // Return all songs matching the criteria
        return returnList;
    }

    public ArrayList<Song> searchTags(int[] searchTags)
    {
        // An ArrayList of songs to be returned at the end of the method
        ArrayList<Song> returnList = new ArrayList<Song>();
        // To ensure the search array is properly formatted, make sure it is the right length
        // If the searchTag array does not contain values
        if(!(searchTags.length == Song.NUMBER_OF_TAGS))
        {
            // Print error statement
            System.out.println("Search array wrong length");
            // Restart the program
            return null;
        }
        // Declares an array of what values we will need to match
        Boolean[] searchTagsBoolean = new Boolean[Song.NUMBER_OF_TAGS];
        // For each index of the array of the array
        for(int i = 1; i < Song.NUMBER_OF_TAGS; i++)
        {
            // If the value of searchTags (the input array) is 1
            if(searchTags[i - 1] == 1)
            {
                // Set the value of searchTagsBoolean to true
                searchTagsBoolean[i - 1] = true;
            }
            // If the value of searchTags (the input array) is 2
            if(searchTags[i - 1] == 2)
            {
                // Set the value of searchTagsBoolean to false
                searchTagsBoolean[i - 1] = false;
            }
            // Note that all values of zero in searchTags are left uninitialized in searchTagsBoolean
        }
        // Now for every song in myMusic (the array of all songs in the collection
        for(Song test: myMusic)
        {
            // Assume the track is a match
            boolean match = true;
            // For each category/tag
            for(int i = 1; i < Song.NUMBER_OF_TAGS; i++)
            {
                // If it is important to search this tag (searchTags != 0) and the song values don't match the search parameters
                if(!(searchTags[i - 1] == 0) && !(test.getTags().get(i - 1) == searchTagsBoolean[i - 1]))
                {
                    // Mark the song as not a match
                    match = false;
                }
            }
            // If the song is a match for all search tags/parameters
            if(match)
            {
                // Add the song to the list of songs to be returned at the end of the method
                returnList.add(test);
            }
        }
        // Return the list of matching songs
        return returnList;
    }

    public  void  run()
    {
        String  csvFile  =  "/home/sebastien/Downloads/Music v4.1.0 - FINAL (2).csv";
        BufferedReader  br  =  null;
        String  line  =  "";
        String  cvsSplitBy  =  ",";
        try
        {
            br  =  new  BufferedReader(new  FileReader(csvFile));
            while  ((line  =  br.readLine())  !=  null)
            {
                //  use  comma  as  separator
                String[]  song  =  line.split(cvsSplitBy);
                boolean[] song2 = new boolean[Song.NUMBER_OF_TAGS];
                for(int i = 5; i < Song.NUMBER_OF_TAGS + 4; i++)
                {
                    song2[i - 5] = Boolean.parseBoolean(song[i]);
                }
                ArrayList<Boolean> song3 = new ArrayList<Boolean>();
                for(int i = 0; i < song2.length; i++)
                {
                    song3.add(song2[i]);
                }
                myMusic.add(new Song(song[0], song[1], song[2], song[3], song[4], song3));
            }
        }

        catch  (FileNotFoundException  e)  {
            e.printStackTrace();
        }  catch  (IOException  e)  {
            e.printStackTrace();
        }  finally  {
            if  (br  !=  null)  {
                try  {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args)
    {
        // Repeat after completion
        // Create a new MusicCollection object with a cool name and initialize it
        MusicCollection coolName = new MusicCollection();
        // ReadCVS obj = new ReadCVS();
        long startTime = System.currentTimeMillis();
        coolName.run();
        long endTime = System.currentTimeMillis();
        long timeDiff = endTime - startTime;
        System.out.println("Reading file took " + timeDiff + " milliseconds for " + coolName.myMusic.size() + " lines");
        // Alphabetize the songs in coolName, just in case they are added out of order
        coolName.alphabetize();
        // Declare a new Scanner called in to take inputs from the user
        Scanner in = new Scanner(System.in);
        while(true)
        {
            // Declare an int that stores the mode that the program is in
            int mode;
            // Declare an int that stores the return format the user would like
            int returnFormat;
            // Ask the user what mode they would
            System.out.println("Greetings! How may I help you?");
            System.out.println("1) I would like to search my songs by text");
            System.out.println("2) I would like to search my songs by tag");
            System.out.println("3) I would like to print all songs");
            System.out.println("4) Debug songs");
            System.out.println("5) Exit the program");
            // If the next input is an int
            while(in.hasNextInt())
            {
                // Set mode to the inputted int
                mode = in.nextInt();
                // If the input is invalid
                if(!(mode >= 1 && mode <= 5))
                {
                    // Tell the user not to be an idiot
                    System.out.println("Don't be an idiot...");
                    // Exit the loop
                    break;
                }
                if(mode == 5)
                {
                    return;
                }
                if(mode == 4)
                {
                    for(Song test: coolName.myMusic)
                    {
                        if(test.getName() == null || test.getArtist() == null || test.getAlbum() == null || test.getSpotifyID() == null)
                        {
                            test.printFullName();
                        }
                    }
                    break;
                }
                System.out.println("What format would you like your results in?");
                System.out.println("1) Playlist name (Song name, artist, and album)");
                System.out.println("2) Full name (Song name, artist, album, length, and all tags)");
                returnFormat = in.nextInt();
                if(!(returnFormat >= 1 && returnFormat <= 2))
                {
                    // Tell the user not to be an idiot
                    System.out.println("Don't be an idiot...");
                    // Exit the loop
                    break;
                }
                // If the selected mode is 1 (search by text)
                if(mode == 3)
                {
                    // For all songs in the list of matching list (using the searchTags method)
                    int count = 0;
                    // Declare an int to store the total length (in seconds) of the songs returned by the searches
                    int totalLength = 0;
                    // For every song in the list of matching songs (using the searchName method)
                    for(Song test: coolName.myMusic)
                    {
                        // Print out the playlist name of the song (name, artist, and album)
                        if(returnFormat == 1)
                        {
                            test.printPlaylistName();
                        }
                        if(returnFormat == 2)
                        {
                            test.printFullName();
                        }
                        // Add one to the count of total matches
                        count++;
                        // Add the length of test (current Song) to the totalLength of all matches
                        totalLength+= test.getLengthInt();
                    }
                    // Display the number of matches returned by the search
                    System.out.println("Search complete: " + count + " results found");
                    // Calculate the number of seconds to display
                    int seconds = (totalLength) % 60;
                    // Calculate the number of minutes to display
                    int minutes = (totalLength / (60)) % 60;
                    // Calculate the number of hours to display
                    int hours = (totalLength / (60 * 60)) % 24;
                    // Calculate the number of days to display
                    int days = (totalLength / (60 * 60 * 24));
                    // Declare a String representing the total length of the songs returned by the search
                    String time = "";
                    // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                    if(totalLength != 0)
                    {
                        // If the total length exceeds one day
                        if(days > 0)
                        {
                            // Add the number of days and the word "days" to the return String
                            time += days + " day(s), ";
                        }
                        // If the total length exceeds one hour
                        if(hours > 0 || days > 0)
                        {
                            // Add the number of hours and the word "hours" to the return String
                            time += hours + " hour(s), ";
                        }
                        // If the total length exceeds one minute
                        if(minutes > 0 || hours > 0 || days > 0)
                        {
                            // Add the number of minutes and the word "minutes" to the return String
                            time += minutes + " minute(s), ";
                        }
                        // Add the number of seconds and the word "seconds" to the return String
                        time += seconds + " second(s).";
                        // Display the total length of matches returned by the search
                        System.out.println("Playtime: " + time);
                    }
                    break;
                }
                if(mode == 1)
                {
                    // Declare an int that stores the value of the search type the program is conducting
                    int searchType;
                    // Declare a String to store the search text
                    String searchPhrase;
                    // Ask the user what type of text search they would like to perform
                    System.out.println("What would you like to search by?");
                    System.out.println("1) Search by song name");
                    System.out.println("2) Search by artist name");
                    System.out.println("3) Search by album name");
                    System.out.println("4) Search by Spotify ID");
                    System.out.println("5) Search by full name");
                    // If the next input is an int
                    while(in.hasNextInt())
                    {
                        // Set type to the inputted int
                        searchType = in.nextInt();
                        // If the input is invalid
                        if(!(searchType >= 1 && searchType <= 5))
                        {
                            // Tell the user not to be an idiot
                            System.out.println("Don't be an idiot...");
                            // Exit the loop
                            break;
                        }
                        // If the search type is 1 (search by song name)
                        if(searchType == 1)
                        {
                            // Ask the user for the phrase to search for
                            System.out.println("Enter search phrase");
                            // Store the input in String searchPhrase
                            searchPhrase = in.next();
                            // Declare an int to store the total number of matches returned by the searches
                            int count = 0;
                            // Declare an int to store the total length (in seconds) of the songs returned by the searches
                            int totalLength = 0;
                            // For every song in the list of matching songs (using the searchName method)
                            for(Song test: coolName.searchName(searchPhrase))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
                                // Add one to the count of total matches
                                count++;
                                // Add the length of test (current Song) to the totalLength of all matches
                                totalLength+= test.getLengthInt();
                            }
                            // Display the number of matches returned by the search
                            System.out.println("Search complete: " + count + " results found");
                            // Calculate the number of seconds to display
                            int seconds = (totalLength) % 60;
                            // Calculate the number of minutes to display
                            int minutes = (totalLength / (60)) % 60;
                            // Calculate the number of hours to display
                            int hours = (totalLength / (60 * 60)) % 24;
                            // Calculate the number of days to display
                            int days = (totalLength / (60 * 60 * 24));
                            // Declare a String representing the total length of the songs returned by the search
                            String time = "";
                            // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                            if(totalLength != 0)
                            {
                                // If the total length exceeds one day
                                if(days > 0)
                                {
                                    // Add the number of days and the word "days" to the return String
                                    time += days + " day(s), ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hour(s), ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minute(s), ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " second(s).";
                                // Display the total length of matches returned by the search
                                System.out.println("Playtime: " + time);
                            }
                            // Print a random empty line
                            System.out.println();
                            // Exit the loop
                            break;
                        }
                        if(searchType == 2)
                        {
                            // Ask the user for the phrase to search for
                            System.out.println("Enter search phrase");
                            // Store the input in String searchPhrase
                            searchPhrase = in.next();
                            // Declare an int to store the total number of matches returned by the searches
                            int count = 0;
                            // Declare an int to store the total length (in seconds) of the songs returned by the searches
                            int totalLength = 0;
                            // For every song in the list of matching songs (using the searchName method)
                            for(Song test: coolName.searchArtist(searchPhrase))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
                                // Add one to the count of total matches
                                count++;
                                // Add the length of test (current Song) to the totalLength of all matches
                                totalLength+= test.getLengthInt();
                            }
                            // Display the number of matches returned by the search
                            System.out.println("Search complete: " + count + " results found");
                            // Calculate the number of seconds to display
                            int seconds = (totalLength) % 60;
                            // Calculate the number of minutes to display
                            int minutes = (totalLength / (60)) % 60;
                            // Calculate the number of hours to display
                            int hours = (totalLength / (60 * 60)) % 24;
                            // Calculate the number of days to display
                            int days = (totalLength / (60 * 60 * 24));
                            // Declare a String representing the total length of the songs returned by the search
                            String time = "";
                            // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                            if(totalLength != 0)
                            {
                                // If the total length exceeds one day
                                if(days > 0)
                                {
                                    // Add the number of days and the word "days" to the return String
                                    time += days + " day(s), ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hour(s), ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minute(s), ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " second(s).";
                                // Display the total length of matches returned by the search
                                System.out.println("Playtime: " + time);
                            }
                            // Print a random empty line
                            System.out.println();
                            // Exit the loop
                            break;
                        }
                        if(searchType == 3)
                        {
                            // Ask the user for the phrase to search for
                            System.out.println("Enter search phrase");
                            // Store the input in String searchPhrase
                            searchPhrase = in.next();
                            // Declare an int to store the total number of matches returned by the searches
                            int count = 0;
                            // Declare an int to store the total length (in seconds) of the songs returned by the searches
                            int totalLength = 0;
                            // For every song in the list of matching songs (using the searchName method)
                            for(Song test: coolName.searchAlbum(searchPhrase))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
                                // Add one to the count of total matches
                                count++;
                                // Add the length of test (current Song) to the totalLength of all matches
                                totalLength+= test.getLengthInt();
                            }
                            // Display the number of matches returned by the search
                            System.out.println("Search complete: " + count + " results found");
                            // Calculate the number of seconds to display
                            int seconds = (totalLength) % 60;
                            // Calculate the number of minutes to display
                            int minutes = (totalLength / (60)) % 60;
                            // Calculate the number of hours to display
                            int hours = (totalLength / (60 * 60)) % 24;
                            // Calculate the number of days to display
                            int days = (totalLength / (60 * 60 * 24));
                            // Declare a String representing the total length of the songs returned by the search
                            String time = "";
                            // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                            if(totalLength != 0)
                            {
                                // If the total length exceeds one day
                                if(days > 0)
                                {
                                    // Add the number of days and the word "days" to the return String
                                    time += days + " day(s), ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hour(s), ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minute(s), ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " second(s).";
                                // Display the total length of matches returned by the search
                                System.out.println("Playtime: " + time);
                            }
                            // Print a random empty line
                            System.out.println();
                            // Exit the loop
                            break;
                        }
                        if(searchType == 4)
                        {
                            // Ask the user for the phrase to search for
                            System.out.println("Enter search phrase");
                            // Store the input in String searchPhrase
                            searchPhrase = in.next();
                            // Declare an int to store the total number of matches returned by the searches
                            int count = 0;
                            // Declare an int to store the total length (in seconds) of the songs returned by the searches
                            int totalLength = 0;
                            // For every song in the list of matching songs (using the searchName method)
                            for(Song test: coolName.searchSpotifyID(searchPhrase))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
                                // Add one to the count of total matches
                                count++;
                                // Add the length of test (current Song) to the totalLength of all matches
                                totalLength+= test.getLengthInt();
                            }
                            // Display the number of matches returned by the search
                            System.out.println("Search complete: " + count + " results found");
                            // Calculate the number of seconds to display
                            int seconds = (totalLength) % 60;
                            // Calculate the number of minutes to display
                            int minutes = (totalLength / (60)) % 60;
                            // Calculate the number of hours to display
                            int hours = (totalLength / (60 * 60)) % 24;
                            // Calculate the number of days to display
                            int days = (totalLength / (60 * 60 * 24));
                            // Declare a String representing the total length of the songs returned by the search
                            String time = "";
                            // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                            if(totalLength != 0)
                            {
                                // If the total length exceeds one day
                                if(days > 0)
                                {
                                    // Add the number of days and the word "days" to the return String
                                    time += days + " day(s), ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hour(s), ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minute(s), ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " second(s).";
                                // Display the total length of matches returned by the search
                                System.out.println("Playtime: " + time);
                            }
                            // Print a random empty line
                            System.out.println();
                            // Exit the loop
                            break;
                        }
                        if(searchType == 5)
                        {
                            // Ask the user for the phrase to search for
                            System.out.println("Enter search phrase");
                            // Store the input in String searchPhrase
                            searchPhrase = in.next();
                            // Declare an int to store the total number of matches returned by the searches
                            int count = 0;
                            // Declare an int to store the total length (in seconds) of the songs returned by the searches
                            int totalLength = 0;
                            // For every song in the list of matching songs (using the searchName method)
                            for(Song test: coolName.searchFullName(searchPhrase))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
                                // Add one to the count of total matches
                                count++;
                                // Add the length of test (current Song) to the totalLength of all matches
                                totalLength+= test.getLengthInt();
                            }
                            // Display the number of matches returned by the search
                            System.out.println("Search complete: " + count + " results found");
                            // Calculate the number of seconds to display
                            int seconds = (totalLength) % 60;
                            // Calculate the number of minutes to display
                            int minutes = (totalLength / (60)) % 60;
                            // Calculate the number of hours to display
                            int hours = (totalLength / (60 * 60)) % 24;
                            // Calculate the number of days to display
                            int days = (totalLength / (60 * 60 * 24));
                            // Declare a String representing the total length of the songs returned by the search
                            String time = "";
                            // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                            if(totalLength != 0)
                            {
                                // If the total length exceeds one day
                                if(days > 0)
                                {
                                    // Add the number of days and the word "days" to the return String
                                    time += days + " day(s), ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hour(s), ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minute(s), ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " second(s).";
                                // Display the total length of matches returned by the search
                                System.out.println("Playtime: " + time);
                            }
                            // Print a random empty line
                            System.out.println();
                            // Exit the loop
                            break;
                        }
                    }
                    // Exit the loop
                    break;
                }
                // If the selected mode is 2 (search by tag)
                if(mode == 2)
                {
                    // Clear the output display
                    // TODO: Reprint from before to look like tags are all that is changing
                    System.out.print("\u000C");
                    // Create an empty array of tags to be searched
                    int[] tagsToSearch = new int[Song.NUMBER_OF_TAGS];
                    // Instruct the user how to use the weird interface
                    System.out.println("Enter a number to toggle each tag. None -> True -> False");
                    // Create a String to store the value of the display for each tag and initialize it as "Error"
                    // Display should never be shown as "Error" as it is set to a value in the next line
                    String display = "Error";
                    // For each index of the array (tag)
                    for(int i = 1; i < Song.NUMBER_OF_TAGS; i++)
                    {
                        // If the tag is 0 (i.e. don't search this tag)
                        if(tagsToSearch[i - 1] == 0)
                        {
                            // Set display to "None"
                            display = "None";
                        }
                        // If the tag is 1 (i.e. this tag must be true)
                        if(tagsToSearch[i - 1] == 1)
                        {
                            // Set display to "True"
                            display = "True";
                        }
                        // If the tag is 2 (i.e. this tag must be false)
                        if(tagsToSearch[i - 1] == 2)
                        {
                            // Set display to "False"
                            display = "False";
                        }
                        // Print out a line stating the tag's number and current value
                        System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": " + display);
                    }
                    // Tell the user that inputting the max value will conduct the search now (with all songs included in the results because tagsToSearch is empty)
                    System.out.println("" + (Song.NUMBER_OF_TAGS + 1) + ") Search!");
                    // Declare an int to store the value of what tag to switch the value of
                    int toSwitch;
                    // If the next input is an int
                    while(in.hasNextInt())
                    {
                        //TODO: Fix and reprint before dialogue so that just the array refreshes?
                        // Clear the output display
                        System.out.print("\u000C");
                        // Set toSwitch to the inputted value
                        toSwitch = in.nextInt();
                        // If the input was the search value, then search
                        if(toSwitch == Song.NUMBER_OF_TAGS + 1)
                        {
                            // For all songs in the list of matching list (using the searchTags method)
                            int count = 0;
                            // Declare an int to store the total length (in seconds) of the songs returned by the searches
                            int totalLength = 0;
                            // For every song in the list of matching songs (using the searchName method)
                            for(Song test: coolName.searchTags(tagsToSearch))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
                                // Add one to the count of total matches
                                count++;
                                // Add the length of test (current Song) to the totalLength of all matches
                                totalLength+= test.getLengthInt();
                            }
                            // Display the number of matches returned by the search
                            System.out.println("Search complete: " + count + " results found");
                            // Calculate the number of seconds to display
                            int seconds = (totalLength) % 60;
                            // Calculate the number of minutes to display
                            int minutes = (totalLength / (60)) % 60;
                            // Calculate the number of hours to display
                            int hours = (totalLength / (60 * 60)) % 24;
                            // Calculate the number of days to display
                            int days = (totalLength / (60 * 60 * 24));
                            // Declare a String representing the total length of the songs returned by the search
                            String time = "";
                            // If the total length of all songs returned by the search is greater than zero (i.e. there were any matches)
                            if(totalLength != 0)
                            {
                                // If the total length exceeds one day
                                if(days > 0)
                                {
                                    // Add the number of days and the word "days" to the return String
                                    time += days + " day(s), ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hour(s), ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minute(s), ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " second(s).";
                                // Display the total length of matches returned by the search
                                System.out.println("Playtime: " + time);
                            }
                            // Exit the loop
                            break;
                        }
                        // If the input is invalid
                        if(!(toSwitch >= 1 && toSwitch <= Song.NUMBER_OF_TAGS))
                        {
                            // Tell the user not to be an idiot
                            System.out.println("Don't be an idiot...");
                            // Exit the loop
                            break;
                        }
                        // Any tags toggled more than three times are reset to zero
                        tagsToSearch[toSwitch - 1] = (tagsToSearch[toSwitch - 1] + 1) % 3;
                        // For each index of the array (tag)
                        for(int i = 1; i <= Song.NUMBER_OF_TAGS; i++)
                        {
                            // If the tag is 0 (i.e. don't search this tag)
                            if(tagsToSearch[i - 1] == 0)
                            {
                                // Set display to "None"
                                display = "None";
                            }
                            // If the tag is 1 (i.e. this tag must be true)
                            if(tagsToSearch[i - 1] == 1)
                            {
                                // Set display to "True"
                                display = "True";
                            }
                            // If the tag is 2 (i.e. this tag must be false)
                            if(tagsToSearch[i - 1] == 2)
                            {
                                // Set display to "False"
                                display = "False";
                            }
                            // Print out a line stating the tag's number and current value
                            System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": " + display);
                        }
                        // Tell the user that inputting the max value will conduct the search now (with all songs included in the results because tagsToSearch is empty)
                        System.out.println("" + (Song.NUMBER_OF_TAGS + 1) + ") Search!");
                        // For each index of the array (tag)
                        for(int i = 1; i < Song.NUMBER_OF_TAGS; i++)
                        {
                            // Print out a numerical array to quickly show the values of each index
                            System.out.print(tagsToSearch[i - 1] + " ");
                        }
                        // Print a random empty line
                        System.out.println();
                    }
                    // Print a random empty line
                    System.out.println();
                    // Exit the loop
                    break;
                }
            }
        }
    }
}
