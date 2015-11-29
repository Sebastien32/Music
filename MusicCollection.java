import java.util.ArrayList;
import java.util.Scanner;
public class MusicCollection
{
    // An ArrayList to contain all songs in this collection
    private ArrayList<Song> myMusic;

    public MusicCollection()
    {
        // Initializes myMusic as an empty ArrayList of type Song
        myMusic  = new ArrayList<Song>();
        // TODO: Adds all songs in database to this collection
        // This is a sample Song
        myMusic.add(new Song("1, 2, ~~3, ~~4", true, "Plain White T's", "Big Bad World", "0:02:58", "5VWmMZCfJ4yVkJw9ZLFXej", true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    public void addSong(Song toAdd)
    {
        // Adds a song to myMusic
        myMusic.add(toAdd);
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
        // If the searchTag array does not contain 24 values
        if(!(searchTags.length == 24))
        {
            // Print error statement
            System.out.println("Search array wrong length");
            // Restart the program
            return null;
        }
        // Declares an array of what values we will need to match
        Boolean[] searchTagsBoolean = new Boolean[24];
        // For index 0 through 24 (1 through 25) of the array
        for(int i =1; i < 25; i++)
        {
            // If the value of searchTags (the input array) is 
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
            for(int i = 1; i < 25; i++)
            {
                // If it is important to search this tag (searchTags != 0) and the song values don't match the search parameters
                if(!(searchTags[i - 1] == 0) && (!test.getTags()[i - 1] == searchTagsBoolean[i - 1]))
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

    public static void main(String[] args)
    {
        // Repeat after completion
        while(true)
        {
            // Create a new MusicCollection object with a cool name and initialize it
            MusicCollection coolName = new MusicCollection();
            // Alphabetize the songs in coolName, just in case they are added out of order
            coolName.alphabetize();
            // Declare a new Scanner called in to take inputs from the user
            Scanner in = new Scanner(System.in);
            // Declare an int that stores the mode that the program is in
            int mode;
            // Declare a String to store the user's name
            String username;
            // Ask the user what their name is
            System.out.println("What is your name?");
            username = in.next();
            // Ask the user what mode they would
            System.out.println("Greetings, " + username + "! How may I help you?");
            System.out.println("1) I would like to search my songs by text (playlist name)");
            System.out.println("2) I would like to search my songs by text (full name)");
            System.out.println("3) I would like to search my songs by tag (playlist name");
            System.out.println("4) I would like to search my songs by tag (full name");
            System.out.println("5) Exit the program");
            // If the next input is an int
            while(in.hasNextInt())
            {
                // Set mode to the inputted int
                mode = in.nextInt();
                // If the input is invalid
                if(!(mode >= 1  && mode <= 5))
                {
                    // Tell the user not to be an idiot
                    System.out.println("Don't be an idiot...");
                    // Exit the loop
                    break;
                }
                // If the selected mode is 1 (search by text, return playlist name)
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
                                test.printPlaylistName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                test.printPlaylistName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                test.printPlaylistName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                test.printPlaylistName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                test.printPlaylistName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                // If the selected mode is 2 (search by text, return full name)
                if(mode == 2)
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
                                // Print out the full name of the song
                                test.printFullName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                // Print out the full name of the song
                                test.printFullName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                // Print out the full name of the song
                                test.printFullName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                // Print out the full name of the song
                                test.printFullName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                                // Print out the full name of the song
                                test.printFullName();
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
                                    time += days + " days, ";
                                }
                                // If the total length exceeds one hour
                                if(hours > 0 || days > 0)
                                {
                                    // Add the number of hours and the word "hours" to the return String
                                    time += hours + " hours, ";
                                }
                                // If the total length exceeds one minute
                                if(minutes > 0 || hours > 0 || days > 0)
                                {
                                    // Add the number of minutes and the word "minutes" to the return String
                                    time += minutes + " minutes, ";
                                }
                                // Add the number of seconds and the word "seconds" to the return String
                                time += seconds + " seconds.";
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
                // If the selected mode is 3 (search by tag, return playlist name)
                if(mode == 3)
                {
                    // Clear the output display
                    // TODO: Reprint from before to look like tags are all that is changing
                    System.out.print("\u000C");
                    // Create an empty array of tags to be searched
                    int[] tagsToSearch = new int[24];
                    // Instruct the user how to use the weird interface
                    System.out.println("Enter a number to toggle each tag. None -> True -> False");
                    // Create a String to store the value of the display for each tag and initialize it as "Error"
                    // Display should never be shown as "Error" as it is set to a value in the next line
                    String display = "Error";
                    // For each index of the array (tag)
                    for(int i = 1; i < 25; i++)
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
                        System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": "  + display);
                    }
                    // Tell the user that inputting "25" will conduct the search now (with all songs included in the results because tagsToSearch is empty)
                    System.out.println("25) Search!");
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
                        // If the input was "25"
                        if(toSwitch == 25)
                        {
                            // For all songs in the list of matching list (using the searchTags method)
                            for(Song test: coolName.searchTags(tagsToSearch))
                            {
                                // Print out the playlist name of the song (name, artist, and album)
                                test.printPlaylistName();
                            }
                            // Exit the loop
                            break;
                        }
                        // If the input is invalid
                        if(!(toSwitch >= 1 && toSwitch <= 24))
                        {
                            // Tell the user not to be an idiot
                            System.out.println("Don't be an idiot...");
                            // Exit the loop
                            break;
                        }
                        // Any tags toggled more than three times are reset to zero
                        tagsToSearch[toSwitch - 1] = (tagsToSearch[toSwitch - 1] + 1) % 3;
                        // For each index of the array (tag)
                        for(int i = 1; i < 25; i++)
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
                            System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": "  + display);
                        }
                        // Tell the user that inputting "25" will conduct the search now (with all songs included in the results because tagsToSearch is empty)
                        System.out.println("25) Search!");
                        // For each index of the array (tag)
                        for(int i = 1; i < 25; i++)
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
                // If the selected mode is 4 (search by tag, return full name)
                if(mode == 4)
                {
                    // Clear the output display
                    // TODO: Reprint from before to look like tags are all that is changing
                    System.out.print("\u000C");
                    // Create an empty array of tags to be searched
                    int[] tagsToSearch = new int[24];
                    // Instruct the user how to use the weird interface
                    System.out.println("Enter a number to toggle each tag. None -> True -> False");
                    // Create a String to store the value of the display for each tag and initialize it as "Error"
                    // Display should never be shown as "Error" as it is set to a value in the next line
                    String display = "Error";
                    // For each index of the array (tag)
                    for(int i = 1; i < 25; i++)
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
                        System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": "  + display);
                    }
                    // Tell the user that inputting "25" will conduct the search now (with all songs included in the results because tagsToSearch is empty)
                    System.out.println("25) Search!");
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
                        // If the input was "25"
                        if(toSwitch == 25)
                        {
                            // For all songs in the list of matching list (using the searchTags method)
                            for(Song test: coolName.searchTags(tagsToSearch))
                            {
                                // Print out the full name of the song
                                test.printFullName();
                            }
                            // Exit the loop
                            break;
                        }
                        // If the input is invalid
                        if(!(toSwitch >= 1 && toSwitch <= 24))
                        {
                            // Tell the user not to be an idiot
                            System.out.println("Don't be an idiot...");
                            // Exit the loop
                            break;
                        }
                        // Any tags toggled more than three times are reset to zero
                        tagsToSearch[toSwitch - 1] = (tagsToSearch[toSwitch - 1] + 1) % 3;
                        // For each index of the array (tag)
                        for(int i = 1; i < 25; i++)
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
                            System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": "  + display);
                        }
                        // Tell the user that inputting "25" will conduct the search now (with all songs included in the results because tagsToSearch is empty)
                        System.out.println("25) Search!");
                        // For each index of the array (tag)
                        for(int i = 1; i < 25; i++)
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
                if(mode == 5)
                {
                    return;
                }
            }
        }
    }
}
