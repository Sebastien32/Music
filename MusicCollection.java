import java.util.Arrays;
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
        // newCircle(new int(6))
        myMusic.add(new Song("1, 2, 3, 4", false, "Plain White T's", "Big Bad World", "0:03:18", "5VWmMZCfJ4yVkJw9ZLFXej", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("2 Heads", false, "Coleman Hell", "2 Heads", "0:03:33", "3bi8yEuK44vLcbjHkPH0u1", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("21 Guns", false, "Green Day", "21st Century Breakdown", "0:05:21", "64yrDBpcdwEdNY9loyEGbX", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("50 Ways to Say Goodbye", false, "Train", "California 37", "0:04:07", "2NniAhAtkRACaMeYt48xlD", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("1983", false, "Neon Trees", "Habits", "0:03:42", "4DJLcyfnyEGlUejAEAX4az", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("A Heart Full Of Love", false, "Eddie Redmayne;Amanda Seyfried;Samantha Barks", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:01", "2AuGrWzTXX61Mq8rfT98jQ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("A Heart Full Of Love - Reprise", false, "Amanda Seyfried;Hugh Jackman;Eddie Redmayne;Patrick Godfrey", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:30", "4LJJ8dJaSCwcSszWay9SFz", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("A Little Night Music (From ~~Alien~~)", true, "Wolfgang Amadeus Mozart;Christopher Warren-Green;London Chamber Orchestra (Lco)", "The Greatest Classical Music Ever! 50 Best Classical Music in the Movies", "0:05:52", "0nwEbDvaGKh8XvWKxFRBNP", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("A Sky Full of Stars", false, "Coldplay", "Ghost Stories", "0:04:28", "0FDzzruyVECATHXKHFs9eJ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("A Spoonful Of Sugar", false, "Julie Andrews", "Disney's Greatest Volume 3", "0:04:08", "7zJt1GZUlZVHyf75wNvQNd", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("ABC Café / Red & Black", false, "Eddie Redmayne;Aaron Tveit;Students", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:04:21", "0RmH0VjGdppj6vccWhs3x4", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Accidentally In Love", false, "Counting Crows", "Accidentally In Love", "0:03:08", "4ccM2xBxicGigjLqt6A0YY", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Ain't No Mountain High Enough - Stereo Version", false, "Marvin Gaye;Tammi Terrell", "The Very Best Of Marvin Gaye", "0:02:26", "28wGX1hoLCRbBZbEqITvE3", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All Alone", false, "fun.", "Some Nights (Spotify Exclusive)", "0:03:03", "47XL5AzqSH1SsOEl7QSvXW", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All Alright", false, "fun.", "Some Nights (Spotify Exclusive)", "0:03:57", "3xsMa7CA11iRjhmIdEy2N6", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All I Ever Wanted - Radio Edit", false, "Basshunter", "Now You're Gone", "0:02:56", "0lhlNZ2Oe3LQHVuuR2W7k3", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All I Want for Christmas Is You", false, "Mariah Carey", "Merry Christmas", "0:04:01", "0bYg9bo50gSsH3LtXe2SQn", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All Of The Stars", false, "Ed Sheeran", "The Fault In Our Stars: Music From The Motion Picture", "0:03:54", "3SZLtkoHoECHHuOnNkNCuS", new ArrayList<Boolean>(Arrays.asList(false, null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All Star", false, "Smash Mouth", "Astro Lounge", "0:03:20", "3cfOd4CMv2snFaKAnMdnvK", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All The Faint Lights", false, "Steve Moakler", "All The Faint Lights", "0:04:32", "46j1Ia8VAnR4uxsCRpzx3R", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All The Right Moves", false, "OneRepublic", "Waking Up (Deluxe)", "0:03:58", "2CJD3LSIVidK6nu4suUusa", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All These Things That I've Done", false, "The Killers", "Hot Fuss", "0:05:01", "0kYUrLVQOfx21xuXu7OGrT", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("All This Time", false, "OneRepublic", "Waking Up (Deluxe)", "0:04:02", "48FuVo0KwE3N7Fqmc8cT4r", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("American Pie", false, "Don McLean", "The Best Of Don McLean", "0:08:35", "2QgWuCtBpNIpl5trmKCxRf", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("And She Was - Remastered", false, "Talking Heads", "The Best Of Talking Heads (US Release)", "0:03:37", "0uXDKiBgFexDfxCGEgFa4k", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Angel in Blue Jeans", false, "Train", "Angel in Blue Jeans", "0:03:24", "2OpY5KKUvkYAkiY8FEG1Wi", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Angels on the Moon", false, "Thriving Ivory", "Thriving Ivory", "0:04:12", "6V9w1UM717xMgJj3AsvgcC", new ArrayList<Boolean>(Arrays.asList(false, null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Angels We Have Heard On High", false, "Andrea Bocelli", "My Christmas (US Standard Version)", "0:03:53", "4Yzjc00hzROQ0WQZc2q0eR", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Animal", false, "Neon Trees", "Habits", "0:03:32", "1fBl642IhJOE5U319Gy2Go", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Anna Sun", false, "WALK THE MOON", "Walk The Moon", "0:05:21", "3e0yTP5trHBBVvV32jwXqF", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Any Way You Want It", false, "Journey", "Departure", "0:03:21", "71SvEDmsOwIWw1IozsZoMA", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Arsonist's Lullabye", false, "Hozier", "From Eden EP", "0:04:26", "1UWhx0pFZccP4jdCIZsj7U", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("At The End Of The Day", false, "Hugh Jackman;Anne Hathaway;The Factory Girls;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:04:26", "1VUChQjlhCIDGF724QpKb9", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("At The Hop", false, "Danny & The Juniors", "At The Hop", "0:02:34", "0MHBcs8i2GXPO2EjHW9RRy", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Avalanche", false, "WALK THE MOON", "TALKING IS HARD", "0:03:38", "3JxaZPq4UjkOaxnpyMUtAC", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Awake My Soul", false, "Mumford & Sons", "Sigh No More", "0:04:12", "634RgAT58WTgRQFoxOZd78", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Babel", false, "Mumford & Sons", "Babel (Deluxe Edition)", "0:03:27", "2ex0FIifaRjxnIw0JdR4l5", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Bad", false, "The Cab", "Symphony Soldier", "0:03:19", "3igu6bCzkaIrioZIhK3p2n", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Bagatelle In A Minor, WoO 59, ~~Für Elise~~", true, "Finghin Collins", "The 50 Greatest Pieces Of Classical Music", "0:03:16", "098vNgNNwouJbAu7dhG56o", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Banana Boat Song (Day-O)", false, "Harry Belafonte", "Calypso", "0:03:03", "4fHDlIntTsRGSyTg5UYZYC", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Barbara Ann - 2012 Stereo Mix", false, "The Beach Boys", "Made In California", "0:02:13", "0jCtkH81Bmuha6DktqsIJ2", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Beggars At The Feast", false, "Sasha Baron Cohen;Helena Bonham Carter", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:00:29", "1SjbEXcbrNV1Ms21dnoJku", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Baba O'Riley", false, "The Who", "Thirty Years Of Maximum R&B", "0:04:57", "66MTlHwUl24CzwRnx8nh7S", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Best Day Of My Life", false, "American Authors", "Best Day Of My Life", "0:03:14", "5k31cAfP8yymw8v0AYQIjr", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Best Day of Your Life", false, "Katie Herzig", "The Waking Sleep", "0:03:23", "46RclkKyTMHyZpvYVTTXGO", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Between The Raindrops", false, "Lifehouse;Natasha Bedingfield", "Between The Raindrops", "0:04:45", "396epax77NIKgJQltQHJgU", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Bizet: Carmen, Act 1: ~~L'amour est un oiseau rebelle~~ (Habanera)", true, "Georges Bizet;Georges Pretre;Choeurs Rene Duclos;Maria Callas;Orchestre de l'Opéra National de Paris", "Bizet: Carmen", "0:04:22", "2r1FiNXh5mDNEP8K07YRVp", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Black or White - Remastered Version", false, "Michael Jackson", "Michael Jackson's This Is It", "0:04:16", "2PdFSWL1Zpg0lRnujLnNJJ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Blood Stutter", false, "Handsome Ghost", "Blood Stutter - Single", "0:03:37", "55bwpavHoYVUv55RQ6kzhi", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Blowin' in the Wind", false, "Bob Dylan", "The Essential (2014 Revised)", "0:02:47", "6KjqfAk6vLV5V8eOPz8EhH", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Blue Moon", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:02:15", "54eOtB9Vz0nli6U5Ez00ep", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Blue Suede Shoes", false, "Elvis Presley", "Elvis 75 - Good Rockin' Tonight", "0:02:00", "5wVttinuTqtg7PPWY9xO3T", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Bohemian Rhapsody", false, "Queen", "A Night At The Opera (Deluxe Remastered Version)", "0:05:54", "7tFiyTwD0nx5a1eklYtX2J", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Boulevard Of Broken Dreams - feat. John Gallagher Jr., Rebecca Naomi Jones, Stark Sands, Company [Album Version]", false, "Green Day", "The Original Broadway Cast Recording 'American Idiot' Featuring Green Day", "0:04:22", "41pFyxOpS119Pb8JEzhx0w", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Brandenburg Concerto No. 3 in G BWV1048 (1997 Digital Remaster): I. [Allegro]", false, "Zbigniew Czapczynaki/Polish Chamber Orchestra/Philip Pickett/Jerzy Maksymiuk/Rachel Beckett", "100 Best Film Classics", "0:05:18", "1TRZpr52bgB63PxfMFIptJ", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Brandenburg Concerto No. 5, BWV 1050: I. Allegro", false, "Slovac Chamber Orchestra & Bohdan Warchal", "100 Most Essential Classical Favorites", "0:10:18", "6OLqLZtc0B3gz6hfVRm45K", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Break Your Plans", false, "The Fray", "Helios", "0:03:47", "6eqapEKyzvzux3ARXDJ9k0", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Breakeven", false, "The Script", "The Script", "0:04:21", "38xWaVFKaxZlMFvzNff2aW", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Breath and Life", false, "Audiomachine", "Chronicles", "0:01:50", "5ugCgHftDye3SLUM8tSVH0", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Bring Him Home", false, "Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:37", "5hzjEYR3PxrxhG7ZXVoM6U", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Broken Strings", false, "James Morrison;Nelly Furtado", "Songs For You, Truths For Me (International Exclusive Bundle)", "0:04:10", "6jBUP2KCe821yqf1hiBqPR", new ArrayList<Boolean>(Arrays.asList(false, null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Buffalo Soldier", false, "Bob Marley & The Wailers", "Legend (Deluxe Edition)", "0:04:16", "59ByyDNkqRGxBom9nHssxf", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Build Me Up Buttercup", false, "The Foundations", "The Very Best Of The Foundations", "0:03:00", "3iwujDVtiJQwqbvjVS6LZV", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Building The Barricade", false, "Aaron Tveit;Eddie Redmayne;Russell Crowe;Students;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:43", "2srOyvH3BOa4KpjxugXJCy", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("California Girls - 2002 Stereo Mix", false, "The Beach Boys", "Made In California", "0:02:46", "1oXKjqiQUzS3grGzuqx0v3", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Can You Feel the Love Tonight", false, "Joseph Williams;Sally Dworsky;Nathan Lane;Ernie Sabella;Kristle Edwards", "The Lion King", "0:02:57", "5E8yddtSG3sH4hw2SfwcgW", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Can't Help Falling In Love", false, "Elvis Presley", "Elvis 30 #1 Hits", "0:02:57", "4hAUynwghvrqDXs1ejKNEq", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Can't Hold Us - feat. Ray Dalton", false, "Macklemore & Ryan Lewis", "The Heist", "0:04:18", "3bidbhpOYeV4knp8AIu8Xn", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Canon In D Major", false, "London Philharmonic Orchestra;David Parry", "The 50 Greatest Pieces Of Classical Music", "0:03:30", "6J3utBV5g7Jg6i7RL9xreP", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Carmen Suite No. 2: Habanera", false, "Georges Bizet;London Philharmonic Orchestra", "Classical Hits of France", "0:02:12", "7aluYz8NwrA002zAaPmwI4", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Carmen: Act I: Prelude", false, "Georges Bizet;Alexandrina Milcheva;Nikola Nikolov;Liliana Vassileva;Nicola Ghiuselev;Stefka Popangelova;Tsvetanka Arshinkova;Milen Paounov;Verter Vrachovsky;Pavel Gerdjikov;Georgi Genov;Sofia National Opera Chorus;Sofia National Opera Orchestra;Ivan Marinov", "Bizet, G.: Carmen [Opera]", "0:04:00", "0iAQsZjX0RPV2ggS6mTVjS", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Carousel", false, "Jason Walker", "Keep Me Watching", "0:03:05", "1cOYfeInuA5iI9tRwowEZc", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Carry On", false, "fun.", "Some Nights (Spotify Exclusive)", "0:04:38", "7gpy7sfWPNuOKmUNs3XQYE", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Castle On A Cloud", false, "Isabelle Allen", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:11", "5PG1OBetpMvXc1yN0P7b7L", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Cecilia", false, "Simon & Garfunkel", "Greatest Hits", "0:02:49", "11CeyEFt21BvAICfd4U8FA", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Chances", false, "Five For Fighting", "Slice", "0:03:35", "7zH23pGF5kj6KOwaYgBcZd", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Changing Of The Seasons", false, "Two Door Cinema Club", "Changing Of The Seasons", "0:03:42", "4Bvwg6cdVpJOHRRUKZBDAp", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Chariots Of Fire", false, "Vangelis", "Themes", "0:03:31", "3hBgVOpgET0AGtdwc5D8Qy", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Chasing Cars", false, "Snow Patrol", "Eyes Open (Non-EU Version)", "0:04:27", "11bD1JtSjlIgKgZG2134DZ", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Cheeseburger In Paradise", false, "Jimmy Buffett", "Boats, Beaches, Bars & Ballads", "0:02:52", "3e5WMDl9rvpDrTBknNLwlj", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Chim Chim Cher-ee - From ~~Mary Poppins~~", true, "Dick Dyke;Julie Andrews;Karen Dotrice;Matthew Garber", "Disney's Greatest Volume 2", "0:02:46", "23NtySnCSYOnjuhuLErsS5", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Chocolate", false, "The 1975", "The 1975", "0:03:44", "44Ljlpy44mHvLJxcYUvTK0", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Circle of Life", false, "Carmen Twillie;Lebo M.", "The Lion King", "0:03:59", "0HU5JnVaKNTWf6GykV9Zn8", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Clair de Lune", false, "Claude Debussy;Classical Lullabies", "Classical Bedtime Lullabies", "0:03:18", "27tMR7hE702dnVF5Xbj4lO", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Climb Ev'ry Mountain", false, "Peggy Wood", "The Sound of Music - Original Soundtrack Recording", "0:02:16", "1Eeb3nwdr3e1tyCYgb1oqd", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("Clocks", false, "Coldplay", "A Rush Of Blood To The Head", "0:05:07", "0BCPKOYdS2jbQ8iyB56Zns", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Closing Time", false, "Semisonic", "20th Century Masters: The Millennium Collection: Best Of Semisonic", "0:04:34", "1A5V1sxyCLpKJezp75tUXn", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Come Go With Me", false, "The Del-Vikings", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:40", "5eDSiapuy2s1UI4owFQOXi", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Come Go With Me", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:02:17", "3XxwdU13609bTGaAFRg3PA", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Come On Eileen", false, "Dexys Midnight Runners", "Too Rye Ay", "0:04:47", "0EMmVUYs9ZZRHtlADB88uz", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Coming Home", false, "Diddy - Dirty Money;Skylar Grey", "Last Train To Paris (Explicit Version)", "0:03:58", "6Iocm6VMu6bVNYwiDoyQFW", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Con Te Partirò", false, "Francesco Sartori;Andrea Bocelli", "Romanza", "0:04:11", "7r3EaAW4FiPCRnPYZ7azfl", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Cough Syrup", false, "Young the Giant", "Young the Giant (Special Edition)", "0:04:09", "1UqhkbzB1kuFwt2iy4h29Q", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Counting Stars", false, "OneRepublic", "Native (Deluxe)", "0:04:17", "1fh2TfUOtOoXEE8qQynYEC", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Crooked Teeth", false, "Death Cab for Cutie", "Plans", "0:03:23", "1crbFuCkGL4kXnAGd63RXq", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Crossfire", false, "Brandon Flowers", "Flamingo (Deluxe Edition)", "0:04:16", "3tVIvV7pUSsQPz6BAz5JSE", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Crying Waiting Hoping", false, "Chris Isaak", "Listen To Me: Buddy Holly", "0:02:26", "1Vj32nJoRzLFlDrz7tjvoP", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Dancing Queen", false, "ABBA", "ABBA Gold", "0:03:51", "2ATDkfqprlNNe9mYWodgdc", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Daylight", false, "Maroon 5", "Overexposed (Deluxe)", "0:03:45", "6TwfdLbaxTKzQi3AgsZNzx", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Demons", false, "Imagine Dragons", "Night Visions", "0:02:55", "3LlAyCYU26dvFZBDUIMb7a", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Devil in Disguise", false, "Elvis Presley", "Lilo & Stitch", "0:02:30", "1twTKld7jtVdbwk4ltBxj6", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Diamonds On the Soles of Her Shoes", false, "Paul Simon", "Graceland (25th Anniversary Deluxe Edition)", "0:05:49", "71GvlH0VdeClloLIkHrAVu", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Do You Hear The People Sing?", false, "Aaron Tveit;Eddie Redmayne;Students;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:03", "0g8H61FNXHHhMVHB0jwdzH", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Do You Hear What I Hear - Remastered", false, "Perry Como", "Greatest Christmas Songs", "0:03:13", "2EeueHuHpE8MzcpFaptcQb", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Do You Hear What I Hear? - 2006 - Remaster", false, "Bing Crosby", "Bing Crosby - Christmas Classics", "0:02:45", "5aDoUmxBsbdpS16alksb5Z", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Do-Re-Mi", false, "Julie Andrews;Charmian Carr;Heather Menzies;Nicholas Hammond;Duane Chase;Angela Cartwright;Debbie Turner;Kym Karath", "The Sound of Music - Original Soundtrack Recording", "0:05:32", "1L6NSZq5R7lMcVw0YOrUE9", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Don't Stop Believin'", false, "Journey", "The Essential Journey", "0:04:08", "77NNZQSqzLNqh2A9JhLRkg", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Don't Stop Believin' (Glee Cast Version)", false, "Glee Cast", "Glee: The Music, Volume 1", "0:03:52", "6rjnRocdCULjLF61x2NR5e", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Don't Stop Me Now", false, "Queen", "Jazz (Deluxe Remastered Version)", "0:03:29", "7hQJA50XrCWABAu5v6QZ4i", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Don't You Remember", false, "Adele", "21", "0:04:03", "24cKN8P2uGWypxTw5WaNlq", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Don't You Worry Child (Radio Edit) [feat. John Martin]", false, "Swedish House Mafia;John Martin", "Don't You Worry Child (feat. John Martin)", "0:03:32", "2V65y3PX4DkRhy1djlxd9p", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Down", false, "Jason Walker", "Jason Walker", "0:04:05", "5UQGObp0GyFOEnza3RZLX8", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Down To The River To Pray - O Brother, Where Art Thou? Soundtrack", false, "Alison Krauss", "O Brother, Where Art Thou? (Soundtrack)", "0:02:55", "5tePn9lOIMHfFaqoTxFrio", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Drink With Me", false, "Aaron Tveit;Eddie Redmayne;Daniel Huttlestone;Students", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:42", "0Xg3ImLtrcuVDhCsEgj4lM", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Drive By", false, "Train", "Drive By", "0:03:16", "1wAXODAAL6hY64ZdhrnjBO", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Drive Darling", false, "BOY", "Mutual Friends", "0:04:24", "5LTgXILxa4dCIyjzoWmSjf", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Drops of Jupiter", false, "Train", "Drops Of Jupiter", "0:04:19", "2hKdd3qO7cWr2Jo0Bcs0MA", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Edelweiss (Reprise)", false, "Julie Andrews;Bill Lee;Charmian Carr;Heather Menzies;Nicholas Hammond;Duane Chase;Angela Cartwright;Debbie Turner;Kym Karath", "The Sound of Music - Original Soundtrack Recording", "0:01:49", "5q7VEpK3tqQTSgLkbTlaYv", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("Electric Love", false, "BØRNS", "Electric Love", "0:03:38", "2tnUFMh3wQk6LHhECsDDlV", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Empty Chairs At Empty Tables", false, "Eddie Redmayne", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:11", "29bONW7GKEq7ZDBqiQC2PV", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Epilogue", false, "Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:08:24", "5Yg4B6O0OGS5DFr327RV4i", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Escape (The Pina Colada Song)", false, "Jack Johnson", "The Secret Life Of Walter Mitty (Music From And Inspired By The Motion Picture)", "0:04:02", "3dnswoe0E6Rf1vKdKzNdKs", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Every Teardrop Is a Waterfall", false, "Coldplay", "Mylo Xyloto", "0:04:00", "2U8g9wVcUu9wsg6i7sFSv8", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Everybody Talks", false, "Neon Trees", "Everybody Talks", "0:02:59", "5JGxJFdgOQdJZdmyEzDtTj", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Everyday", false, "Buddy Holly", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:07", "3ozftYu1yZlCGXkNFBYL6p", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Everyday", false, "Patrick Stump", "Listen To Me: Buddy Holly", "0:02:38", "22fzUAmhH04mH2g1SVUuX3", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Everything's A Ceiling", false, "Death Cab for Cutie", "Kintsugi", "0:03:39", "3ZeM7VDc7Mbyvrimq4YVCV", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Everytime We Touch", false, "Cascada", "Everytime We Touch", "0:03:16", "1eOHw1k2AoluG4VyjBHLzX", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Eye of the Tiger", false, "Survivor", "Rocky IV", "0:04:05", "2KH16WveTQWT6KOG9Rg6e2", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Fantine’s Arrest", false, "Anne Hathaway;Hugh Jackman;Russell Crowe", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:59", "6Wu4zbiQH6eWUti4NgdjBR", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Fantine’s Death", false, "Anne Hathaway;Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:52", "47JhUpExCronIR7puEZJLh", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Fear", false, "OneRepublic", "Waking Up (Deluxe)", "0:03:46", "4vHv0wijsOm4HROUXXdMwZ", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Feliz Navidad", false, "José Feliciano", "Feliz Navidad", "0:03:02", "3rLAEFEQyNq0I9BFq4P3XG", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("First", false, "Cold War Kids", "Hold My Home", "0:03:20", "0aGSUNleFqs5HNEJcwqvXJ", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Fix You", false, "Coldplay", "X & Y", "0:04:55", "7LVHVU3tWfcxj5aiPFEW4Q", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Follow My Feet", false, "The Unlikely Candidates", "Follow My Feet", "0:02:38", "6nuuEHnnA5SsmirtCmBvIU", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Footloose", false, "Kenny Loggins", "Footloose (15th Anniversary Collectors' Edition)", "0:03:46", "2vz1CsL5WBsbpBcwgboTAw", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("For the Longest Time", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:03:43", "0PuWvFJqZPJAxZNrFgw8xL", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Forever And Always", false, "Parachute", "The Way It Was", "0:04:08", "3NCg46FWgnANZc9HQHQOQR", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Forever and Ever", false, "Royal Wood", "Forever and Ever - Single", "0:03:36", "3MeuVUh1mtkbRxsnK40pTU", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Fun, Fun, Fun", false, "The Beach Boys", "Made In California", "0:02:13", "5f82T5j1LQoRC3Mk4OT4Uq", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Get A Job", false, "The Silhouettes", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:47", "0Udg3UYleHSfruGmjhfrEq", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Glow In The Dark", false, "Jason Gray", "Post Script", "0:03:50", "0BiTRF7SSvNpChtBeYYM41", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Go Tell It On the Mountain", false, "Millennial Choirs & Orchestras;Brandon Stewart;Brett Stewart", "O Holy Night", "0:03:45", "69SBzXPvKCdNOnjE0HKsEm", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Go The Distance - From ~~Hercules~~", true, "Roger Bart", "Disney's Greatest Volume 2", "0:03:14", "6Cm2obgFRdd1IcTR6FnbiS", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("God Rest Ye Merry Gentlemen/We Three Kings", false, "Barenaked Ladies;Sarah McLachlan", "Barenaked For The Holidays", "0:03:26", "6eou298JmAGYShrwYuLxJ2", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Golden Slumbers / Carry That Weight / the End", false, "The Beatles Recovered Band", "Beatles Biggest Hits!", "0:05:57", "4CSeAfCas4dNV8uUsDsqV6", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Gone, Gone, Gone", false, "Phillip Phillips", "The World From The Side Of The Moon (Deluxe)", "0:03:29", "5L79aNYCTKiZq7vaOElXYj", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Good Life", false, "OneRepublic", "Waking Up", "0:04:13", "6OtCIsQZ64Vs1EbzztvAv4", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Good Lovin'", false, "The Rascals", "The Big Chill 15th Anniversary", "0:02:30", "2gE3e3y6t8wvQH9pGaIzC3", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Great Balls Of Fire", false, "Jerry Lewis", "Stand By Me [Original Motion Picture Soundtrack]", "0:01:52", "3ofKS0iKXdtl2Lf5i9JQ19", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hakuna Matata", false, "Nathan Lane;Ernie Sabella;Jason Weaver;Joseph Williams", "The Lion King", "0:03:33", "5k3U0OGYBccHdKJJu3HrUN", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Half Moon", false, "Blind Pilot", "We Are The Tide", "0:03:28", "1AnyjGWJuh3PdDZJA0UrOp", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hall of Fame", false, "The Script;will.i.am", "#3", "0:03:22", "1X1DWw2pcNZ8zSub3uhlNz", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hallelujah", false, "Rufus Wainwright", "Hallelujah", "0:04:09", "2T1clAQg0yqVcDDYD7v86V", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hallelujah", false, "Jeff Buckley", "So Real: Songs From Jeff Buckley", "0:06:54", "5qv0ohJV2QNwga79jLNDYQ", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hallelujah", false, "Rufus Wainwright", "The L Word", "0:04:09", "6JUALLwHnidbO4eM09ArIh", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hallelujah", false, "Leonard Cohen", "The Essential Leonard Cohen", "0:04:38", "3uzYzmLLLayS9l3m0obKPF", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Happy Xmas (War Is Over) - 2010 Digital Remaster", false, "John Lennon", "Power To The People - The Hits", "0:03:33", "3zJw3rugfpVrmBeDDnUYzy", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Haven't Met You Yet", false, "Michael Bublé", "Crazy Love", "0:04:04", "4fIWvT19w9PR0VVBuPYpWA", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("He's A Pirate (~~Pirates Of The Caribbean~~)", true, "David Garrett", "Encore (International)", "0:03:01", "2cqKjFPKveFtl4Dp19m6no", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hear Me", false, "Imagine Dragons", "Night Visions", "0:03:52", "3Agiwcd2KjBOG2MkckhC3i", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Heartbreak Hotel", false, "Elvis Presley", "Elvis 75 - Good Rockin' Tonight", "0:02:07", "20a2CwrOsSJFEwXhLiOl2Q", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Heaven", false, "The Walkmen", "Heaven", "0:04:22", "3US6iSyLP2uS07gjjU2ZkG", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false))));
        myMusic.add(new Song("Hello (feat. Dragonette)", false, "Martin Solveig;Dragonette", "Hello", "0:03:11", "3sl4dcqSwxHVnLfqwF2jly", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Herz und Mund und Tat und Leben, Cantata BWV 147 : Jesu, joy of man's desiring", false, "Johann Sebastian Bach", "Classical Study Music", "0:03:28", "0g2naD7yms4MBvh7jpdf7w", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hey Brother", false, "Avicii", "TRUE", "0:04:15", "4RXpgGM7A4Hg7cFBoH5KyF", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hey There Delilah", false, "Plain White T's", "Hey There Delilah", "0:03:46", "1NarGDteHRuDA9OfGyQ2MG", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hey, Soul Sister", false, "Train", "Hey, Soul Sister", "0:03:36", "0KpfYajJVVGgQ32Dby7e9i", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("High", false, "Young Rising Sons", "Young Rising Sons", "0:02:45", "4gTwPFGhIIlYtlo59jbVUB", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Ho Hey", false, "The Lumineers", "The Lumineers", "0:02:43", "5BSndweF91KDqyxANsZcQH", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hold Each Other", false, "A Great Big World;Futuristic", "Hold Each Other", "0:03:37", "4hkAO5HepzonUEJkXUT6e5", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Holly Jolly Christmas", false, "Burl Ives", "80 Childrens Christmas Songs", "0:02:16", "1s9lZxNkGVUhzCoR34XbLa", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hollywood's Not America", false, "Ferras", "Aliens & Rainbows", "0:03:15", "5wizvr1JlRR3XWmKkOmEtV", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Home", false, "Phillip Phillips", "Home", "0:03:29", "2ZQyksYO4zzhyHNcueL0CP", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hotel Ceiling", false, "Rixton", "Me And My Broken Heart", "0:03:10", "3KxJM0XxHebqkHrjioySC5", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hound Dog", false, "Elvis Presley", "Elvis 75 - Good Rockin' Tonight", "0:02:16", "14JwP65BLEj5p8NPDj7ajJ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("How to Save a Life", false, "The Fray", "How To Save A Life", "0:04:22", "5fVZC9GiM4e8vu99W0Xf6J", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Hurt Me Tomorrow", false, "K'NAAN", "Hurt Me Tomorrow", "0:03:47", "1Njg1r6TSmk8AhA5fxSAOZ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Bet My Life", false, "Imagine Dragons", "Smoke + Mirrors", "0:03:12", "15DrrIod12Tc2IoMaHiwlQ", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Can See Clearly Now - Edit", false, "Johnny Nash", "I Can See Clearly Now", "0:02:44", "0DcrhZ12WcCqruCs8ibXSf", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Dreamed A Dream", false, "Anne Hathaway", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:04:37", "7CNVenAoty0IomwFPaMaaH", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, null, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("I Get Around - 2001 - Remaster", false, "The Beach Boys", "10 Great Songs", "0:02:14", "7Fng0zvM0XLoMHyINeu8Kj", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Have Confidence", false, "Julie Andrews", "The Sound of Music - Original Soundtrack Recording", "0:03:26", "0ZWQQtODuFLSvmU3fglT0p", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("I Lived", false, "OneRepublic", "Native (Deluxe)", "0:03:54", "29yLZTWlWFtAKjVpMQzTEK", new ArrayList<Boolean>(Arrays.asList(true, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Want Crazy - Encore", false, "Hunter Hayes", "I Want Crazy", "0:03:56", "2tC3NZsLgXr9CXvOKon19c", new ArrayList<Boolean>(Arrays.asList(false, null, null, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Will Follow You Into The Dark", false, "Death Cab for Cutie", "Plans", "0:03:09", "3kZC0ZmFWrEHdUCmUqlvgZ", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Will Wait", false, "Mumford & Sons", "Babel (Deluxe Edition)", "0:04:36", "3kyxRga5wDGbKdmxXssbps", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I Won't Give Up", false, "Jason Mraz", "I Won't Give Up", "0:04:00", "05pKAafT85jeeNhZ6kq7HT", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I'll Make a Man Out of You", false, "Donny Osmond;Chorus - Mulan", "Mulan (Soundtrack)", "0:03:21", "28UMEtwyUUy5u0UWOVHwiI", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("I'm A Believer - Radio Edit", false, "Smash Mouth", "All Star Smash Hits", "0:03:03", "5M5mzimlah21xlC1rAuIuY", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, null, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I'm Lookin' For Someone To Love", false, "Imelda May", "Listen To Me: Buddy Holly", "0:02:08", "2Dxs3ACA274MPtefPWaEXA", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("I'm Yours", false, "Jason Mraz", "We Sing. We Dance. We Steal Things.", "0:04:02", "1EzrEOXmMH3G43AXT1y7pA", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("If You Ever Come Back", false, "The Script", "Science & Faith", "0:04:02", "6cLxNwJmqxLbmbGPP8ulQr", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("If You Want To Sing Out, Sing Out", false, "Cat Stevens", "Gold", "0:02:44", "1UDeGeTBw2GdbNKqFUzGyu", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Iko Iko", false, "The Belle Stars", "Rain Man / Original Motion Picture Soundtrack", "0:02:53", "3FBgNT3PC3R8q3lBnAQWvh", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Il barbiere di Siviglia / Act 1: No.2 Cavatina: ~~Largo al factotum~~", true, "Gioachino Rossini;Dmitri Hvorostovsky;Philharmonia Orchestra;Ion Marin", "Dmitri Hvorostovsky / Portrait", "0:04:56", "6wRcTF4492foSZMTbqTsAn", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Il Est Ne Le Divin Enfant", false, "Vienna Boys' Choir", "Merry Christmas - Carols From North America & Europe", "0:02:18", "1Lvd3W50kIXDS90eJBWCRH", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("In My Life", false, "Amanda Seyfried;Eddie Redmayne;Samantha Barks;Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:04:16", "36vPj8etuV0nTqjpvpp2CA", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("In the Still of the Night", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:03:09", "10dia2iL9YWckDnz44UfDl", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Introvert", false, "The Ludwigs", "Introvert", "0:03:14", "4NcnUlYkeWw00e93lPeVZZ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("It Came Upon A Midnight Clear", false, "Burl Ives", "The Very Best Of Burl Ives Christmas", "0:02:09", "6UfWInpeyrk0g1I3wSZSo9", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("It Was Love", false, "The Elected", "Sun, Sun, Sun", "0:03:35", "1FXZ9CCmNn45IhWSVadgSz", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false))));
        myMusic.add(new Song("It's A Small World", false, "The Disneyland Children's Chorus", "Disney's Greatest Volume 2", "0:03:02", "5ouuPi1o6eOVSgHn2exemw", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("It's Time", false, "Imagine Dragons", "Night Visions", "0:03:57", "6BtmXhTJMM9sBTHeYYASGz", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("It’s So Easy", false, "Zooey Deschanel", "Listen To Me: Buddy Holly", "0:02:55", "32ybmIc7wdJVukRVbJ1UNM", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Javert At The Barricade", false, "Russell Crowe;Aaron Tveit;Daniel Huttlestone;Students", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:45", "5vGS7VK20DyQ7n4e1TWkrK", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Javert's Suicide", false, "Russell Crowe", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:55", "01O2sFXHb72XiXRyOFlkI7", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Jenny Was A Friend Of Mine", false, "The Killers", "Hot Fuss", "0:04:03", "4QK4pMWEwlXxwg1zp08xpl", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Johnny B. Goode", false, "Chuck Berry", "20th Century Masters: The Millennium Collection: Best Of Chuck Berry", "0:02:41", "2XGHdmjsumZRkaL8LhBb1e", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Joy To The World", false, "Nat King Cole", "Christmas With Bing Crosby / Nat 'King' Cole / Dean Martin", "0:01:25", "5jjsm4Jjq8xjDaue3rW9Go", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Joy to the World", false, "The Traditional;Marilyn Horne;Dr. Jerold Ottley;Mormon Tabernacle Choir;Columbia Symphony Orchestra", "I'll Be Home For Christmas", "0:02:22", "0ty9rlCOiQSZWby2ywODnF", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Jump in the Line", false, "Harry Belafonte", "Greatest Hits", "0:03:44", "6KkAC41nNRiWA6w3ZD9cJ8", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Just Another Girl", false, "The Killers", "Direct Hits", "0:04:22", "3aVyHFxRkf8lSjhWdJ68AW", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Just Give Me a Reason", false, "P!nk;Nate Ruess", "The Truth About Love", "0:04:02", "4VC5nFbYO4avKksJ9jN4pY", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Kiss Me", false, "Sixpence None The Richer", "6 PICKS: Essential Radio Hits EP", "0:03:24", "75fuzn623bYyKISKlFHdCw", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Kiss the Girl", false, "Samuel E. Wright", "Little Mermaid (Special Edition)", "0:02:43", "4HGIPyqDxSf863tPOwXiLJ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("L'Arlesienne Suite No. 1: Prelude", false, "Georges Bizet;London Philharmonic Orchestra", "Classical Hits of France", "0:06:53", "6DxTfO5QI3sKRmh4XFSeVp", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("L-O-V-E - 2000 Digital Remaster", false, "Nat King Cole", "The Unforgettable Nat King Cole", "0:02:33", "7E3rc13GL2I5wA6CIFXaxs", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("La Bamba", false, "Ritchie Valens", "At The Hop", "0:02:05", "3WBid3DLx72ThILxlNNcJX", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false))));
        myMusic.add(new Song("Lay Me Down", false, "Avicii", "TRUE", "0:05:00", "5iKOpf0SZDSGkJRhkwgSrl", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Lean on Me - Single Version", false, "Bill Withers", "Still Bill", "0:04:17", "1oEAgyttglJYkh909Byp4B", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Learning The Game", false, "Natalie Merchant", "Listen To Me: Buddy Holly", "0:03:28", "2Df9geWhuxvsyYfLa0PlqV", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Let Her Go", false, "Passenger", "All the Little Lights", "0:04:12", "6GmUVqe73u5YRfUUynZK6I", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Let The Good Times Roll", false, "Shirley & Lee", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:25", "48UygVtYSfcjeEyCtNR8nI", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Let Your Heart Hold Fast", false, "Fort Atlantic", "Fort Atlantic", "0:03:46", "0poxIvI8mH3TZcGp4T7BWs", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false))));
        myMusic.add(new Song("Let's Be Still", false, "The Head and the Heart", "Let's Be Still", "0:04:28", "5IJnj6Um7jVuRPT4WGj1z6", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Life's for the Living", false, "Passenger", "All the Little Lights", "0:04:33", "3vlfgHt6MZTzuSPsDcSQ8b", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Listen To Me", false, "Brian Wilson", "Listen To Me: Buddy Holly", "0:02:41", "0kl5ngyNMpeL9C2bch2YkF", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Little Bitty Pretty One", false, "Frankie Lymon & The Teenagers", "Frankie Lymon & The Teenagers Greatest Hits", "0:02:42", "0kpaf7mILGingFx0hg3XXg", new ArrayList<Boolean>(Arrays.asList(false, true, false, null, null, null, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Little Fall Of Rain", false, "Eddie Redmayne;Samantha Barks", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:32", "0hIy3U1BoNA28NRBzU6ECp", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Little Talks", false, "Of Monsters and Men", "Into The Woods", "0:04:27", "0uZ0orE84drZZzPKxCWSmR", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Livin' On A Prayer", false, "Bon Jovi", "Bon Jovi Greatest Hits", "0:04:10", "7qQnBfwXrw2tZNFG4Uf57N", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Living Louder", false, "The Cab", "Symphony Soldier", "0:04:43", "4C7LW7lJOqEO5eKWgu1p13", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Locked Out Of Heaven", false, "Bruno Mars", "Unorthodox Jukebox", "0:03:53", "1qCdYQdkWvm4cYXAuOlbyc", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Look Down", false, "Hugh Jackman;Russell Crowe;Convicts", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:16", "3bRHPkiV43QCgzAJ5IuV65", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Losing My Religion", false, "R.E.M.", "Out Of Time (U.S. Version)", "0:04:27", "74EV0g12ihUoOUXMprFpZB", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Lost Stars", false, "Adam Levine", "Lost Stars", "0:04:27", "7rdGrVIoqwPWOULauvglio", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Lost!", false, "Coldplay", "Viva La Vida Or Death And All His Friends", "0:03:56", "1STAWoWHYJh2UVUx41pYMD", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Love Somebody", false, "Maroon 5", "Overexposed (Deluxe)", "0:03:49", "0HnaqUxvHP5LaWdmWwJpiS", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Luck", false, "American Authors", "American Authors", "0:03:39", "06gpP3tBcFGCKjg0ilajMX", new ArrayList<Boolean>(Arrays.asList(null, null, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Lucky Strike", false, "Maroon 5", "Overexposed", "0:03:05", "6tVrmsbI5HVDgOlFSTrQjB", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Lullaby", false, "OneRepublic", "Waking Up (Deluxe)", "0:04:36", "76b0tV3rkhmn0dyqtVbVe4", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mad World", false, "Michael Andrews;Gary Jules", "Donnie Darko", "0:03:07", "6FvSJjsxM3o5ctpexdB31e", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Man on a Wire", false, "The Script", "No Sound Without Silence", "0:04:05", "4b30rxe4kxjNl8YpE17Sew", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Marchin On", false, "OneRepublic", "Waking Up (Deluxe)", "0:04:11", "2IPpyxIgVLoDmYGIffJrol", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Maria", false, "Evadne Baker;Annalee;Portia Nelson;Marni Nixon", "The Sound of Music - Original Soundtrack Recording", "0:03:16", "0XO2Xt526jdJ4ccDV2T1Yr", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("Marry Me", false, "Train", "Save Me, San Francisco (Golden Gate Edition)", "0:03:25", "0VZ9xPNa6ROafP6GYYuv2S", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Marry You", false, "Bruno Mars", "Doo-Wops & Hooligans", "0:03:50", "22PMfvdz35fFKYnJyMn077", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Marry You (Glee Cast Version)", false, "Glee Cast", "Glee: The Music, Volume 4", "0:03:45", "3IFo5x0HWlvRu0QIAtefor", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Master Of The House", false, "Sacha Baron Cohen;Helena Bonham Carter;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:04:48", "3WoatVXvmr0qK7xVcVIyPi", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Matilda", false, "Harry Belafonte", "Harry Belafonte Fifty Favourites", "0:03:13", "5IFBINmDIIjvfdOLlOnWdu", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Maybe Baby", false, "Pat Monahan", "Listen To Me: Buddy Holly", "0:02:26", "3vKsu5qQrJ4KX3UjWimOZP", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Midnight Starlight", false, "Jason Walker", "Midnight Starlight", "0:04:14", "0QqmDnmXJKncPf7t4GVfrf", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mister Sandman", false, "Emmylou Harris", "Profile II", "0:02:20", "48ASbLiJlwc9vVcFz2r4Zx", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Moonshadow", false, "Cat Stevens", "The Best Of Cat Stevens 20th Century Masters The Millennium Collection", "0:02:49", "4ZWpkfAJg4BhgRNPuF5E0Q", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Morning Has Broken", false, "Cat Stevens", "The Best Of Cat Stevens 20th Century Masters The Millennium Collection", "0:03:19", "3T0BH50Ea5sI66yguYghFS", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mountain Sound", false, "Of Monsters and Men", "My Head Is An Animal", "0:03:31", "60ZGteAEtPCnGE6zevgUcd", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mr. Brightside", false, "The Killers", "Hot Fuss", "0:03:42", "7oK9VyNzrYvRFo7nQEYkWN", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mr. Lee", false, "The Bobbettes", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:15", "6zLGmxUA1ClhzCByaxtkNK", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mr. Tambourine Man", false, "Bob Dylan", "Bringing It All Back Home", "0:05:30", "3RkQ3UwOyPqpIiIvGVewuU", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Mrs. Robinson", false, "Simon & Garfunkel", "Greatest Hits", "0:03:54", "3CJ60azPXtva8OdBsxSA7a", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("My Favorite Things", false, "Julie Andrews", "The Sound of Music - Original Soundtrack Recording", "0:02:18", "4IGXfhZYM3gFQVcNtWQ9pB", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("My Girl", false, "The Temptations", "An American Love Story", "0:02:50", "0Vpswx5knuuXW8HmNK1LrT", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("My Songs Know What You Did In The Dark (Light Em Up)", false, "Fall Out Boy", "Save Rock And Roll", "0:03:06", "7s0lDK7y3XLmI7tcsRAbW0", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("My Sweet Summer", false, "Dirty Heads", "My Sweet Summer", "0:03:22", "5Bxw5hB45rJKvd0wdGQQeR", new ArrayList<Boolean>(Arrays.asList(false, null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Never Let You Go", false, "Jocelyn", "Cover Songs", "0:03:49", "64yhsT9Aw1Q4BICElsb0kd", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("New Divide", false, "Linkin Park", "Transformers: Revenge Of The Fallen The Album", "0:04:28", "6Wx88Mv6b9ofjKMKkdwOJd", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Next Year", false, "Two Door Cinema Club", "Beacon (Deluxe Version)", "0:04:11", "0RXphrOyw4NbiKsOX1SeDh", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("No Good in Goodbye", false, "The Script", "No Sound Without Silence", "0:05:07", "0Dv4DdNy1xnhNcCd9YVoiH", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Nocturne in E-Flat Major, Op. 9, No. 2", false, "Peter Schmalfuss", "100 Most Essential Classical Favorites", "0:04:45", "4eoHJhrEssbk0BWENmZTyo", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Not Fade Away", false, "Stevie Nicks", "Listen To Me: Buddy Holly", "0:03:59", "24CbJLhXSc1PWcLTRibHMW", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("O Holy Night", false, "Nat King Cole", "The Christmas Song", "0:02:58", "356dWMVMXLJI6OEoq0ITf1", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("O Holy Night!", false, "Faith Hill", "Joy To The World", "0:04:57", "1IW52o1mbOCpoFIvsCD4wo", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("O Tannenbaum", false, "Vienna Boys' Choir", "Merry Christmas - Carols From North America & Europe", "0:01:44", "3CaLaBaO84oYRJKpXamgwF", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Oblivion", false, "Bastille", "Bad Blood", "0:03:16", "6ZeQp2XTOiPCePWRfCHSo5", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Oh, Pretty Woman", false, "Roy Orbison", "The Soul of Rock and Roll", "0:03:02", "51MSJzGARL0xJQcuTeTIrc", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("On My Own", false, "Samantha Barks", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:11", "3Mr6ofzF6ZuYiqHh8qNud3", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("On The Beautiful Blue Danube, Op. 314", false, "London Philharmonic Orchestra;David Parry", "The 50 Greatest Pieces Of Classical Music", "0:05:51", "0WgZ3QtiOInyOjIh8guAH9", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("On Top Of The World", false, "Imagine Dragons", "Night Visions", "0:03:09", "6Qj1WXW41Mn3Fh9V2sHphM", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("One Day More", false, "Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:41", "6ophEFs89SOktBpFnRM8BK", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("One Foot", false, "fun.", "Some Nights (Spotify Exclusive)", "0:03:31", "7c6TRb4cvgHWVhTJDfRqth", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("One Grain Of Sand", false, "Ron Pope", "Atlanta", "0:03:27", "3yqJGfvXtPZLiWHVeLWtm8", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("One More Night", false, "Maroon 5", "One More Night", "0:03:39", "3wJIAMuPdEoBddWlovWXCX", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Out Of My League", false, "Fitz and The Tantrums", "Out Of My League", "0:03:29", "5qEn8c0MBzyRKgQq91Vevi", new ArrayList<Boolean>(Arrays.asList(false, null, null, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Out On The Town - Bonus Track", false, "fun.", "Some Nights (Spotify Exclusive)", "0:04:21", "23wTcSwRHu8E513oeri4xK", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Paint the Town Green", false, "The Script", "No Sound Without Silence", "0:03:31", "5sUSZx5d2bThAZa4iS7cfu", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Paralyzer", false, "Finger Eleven", "Them vs. You. vs. Me (Deluxe Edition) and (Bonus Cuts)", "0:03:28", "4p7isjE8RGKAYdjOdWijK7", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Paris / Look Down", false, "Daniel Huttlestone;Aaron Tveit;Eddie Redmayne;Students;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:13", "5TlJb8F483IO1Rnzk4NsOz", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Peace", false, "O.A.R.", "The Rockville LP", "0:03:35", "2xwsf9FuFINP1X4FTsqZ7Q", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Peace Train", false, "Cat Stevens", "The Very Best Of Cat Stevens", "0:04:11", "0lwafb9HOIaXQVqbRkbEqs", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Peggy Sue", false, "Cobra Starship", "Listen To Me: Buddy Holly", "0:02:51", "2NZ1wLDyrvYj0cIA7XR9Qd", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Photograph", false, "Ed Sheeran", "x (Deluxe Edition)", "0:04:18", "1HNkqx9Ahdgi1Ixy2xkKkL", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Please Mister Postman", false, "The Beatles Revival Band", "Japan Collection", "0:02:32", "6xbPlXDDHKWr72fmF8PvoH", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Pokemon Theme", false, "Pokémon", "Pokemon X - Ten Years Of Pokemon", "0:03:16", "6xG2ZGudUgtV235xvDlSEt", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Pompeii", false, "Bastille", "Bad Blood", "0:03:34", "3gbBpTdY8lnQwqxNCcf795", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, null, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Portugal", false, "WALK THE MOON", "TALKING IS HARD", "0:04:01", "3MYWKl8ScgDu3sAvyneMCG", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Preacher", false, "OneRepublic", "Native (Deluxe)", "0:04:08", "5Fg4THcrWq1wTBxJeBCOyt", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Prelude / The Sound of Music", false, "Irwin Kostal;Julie Andrews", "The Sound of Music - Original Soundtrack Recording", "0:02:44", "6rbpI4fchfJx1IgCBowc8m", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("Princess of China", false, "Coldplay;Rihanna", "Mylo Xyloto", "0:03:59", "4HXOBjwv2RnLpGG4xWOO6N", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Prophets", false, "A.C. Newman", "Get Guilty", "0:02:58", "3AraBEre6TrHoClhG3EqCE", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Radetzky March, Op. 228", false, "London Philharmonic Orchestra;David Parry", "The 50 Greatest Pieces Of Classical Music", "0:03:05", "77XCSP1IlTerBpQseeuLhc", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Raining In My Heart", false, "Eric Idle", "Listen To Me: Buddy Holly", "0:03:00", "0SMEwlsHauOvoRzb7RZcB1", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Red River Valley", false, "Boxcar Willie", "20 Boxcar Greats", "0:03:31", "2t1JectnEh4QmPGSeMLvaW", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("(Remember The Days Of The) Old Schoolyard", false, "Cat Stevens", "Gold", "0:02:44", "1jywApoZ0qh69XyKQ22Bd9", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Renegades", false, "X Ambassadors", "Renegades", "0:03:14", "3wLfy6C6qhOxHpU64YYKGz", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rhythm Of Love", false, "Plain White T's", "Wonders Of The Younger", "0:03:20", "6MDTpYxPFL0wtFd0pjfKws", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rigoletto / Act 3: ~~La donna è mobile~~", true, "Giuseppe Verdi;Andrea Bocelli;Israel Philharmonic Orchestra;Zubin Mehta", "Opera - The Ultimate Collection", "0:02:10", "198T13qiWoDNMfF6MivwQW", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rivers of Babylon", false, "The Melodians", "Super Best", "0:04:17", "75gMrQKXJctiyN6IOkj6WE", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Roam [Edit] (45 Version)", false, "The B-52's", "Roam [Edit] / Bushfire [Digital 45]", "0:04:06", "0jfONt56vckywtWwm8wjki", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rock Lobster (45 Version)", false, "The B-52's", "Rock Lobster / 6060-842 [Digital 45]", "0:04:55", "5R0v2GLujsGk37QCkGdvMQ", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rock-in Robin", false, "Bobby Day", "1958 British Hit Parade Part 2", "0:02:34", "2FCShgjxXETi1eCO72ibbM", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rockin' Around The Christmas Tree", false, "Brenda Lee", "Christmas Classics Featuring Rudolph The Red-Nosed Reindeer, Frosty The Snowman & The Little Drummer Boy", "0:02:04", "28fuXrmmF9dYWx25dMW9dP", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rolling in the Deep", false, "Adele", "21", "0:03:48", "1CkvWZme3pRgbzaxZnTl5X", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Roxanne", false, "The Police", "Message In A Box", "0:03:14", "6eXovJdAhh26KFdpicZScW", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Rumour Has It", false, "Adele", "21", "0:03:41", "76N7FdzCI9OsiUnzJVLY2m", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Run for Your Life", false, "The Fray", "Scars & Stories", "0:03:58", "2K7flzz4LBzZMSO4n6bWrl", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Runaround Sue", false, "Dion & The Belmonts", "I Wonder Why", "0:02:47", "6jy0YaWonpm3xH27xFVlXF", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Runaround Sue", false, "The Northshore", "The Sing-Off: Season 3: Episode 2 - Signature Songs", "0:01:44", "3WWuYX2RzrRTUlQiybBHvc", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("S.O.S.", false, "ABBA", "The Essential Collection", "0:03:23", "3Nr0vHVNthUXnn2VUAJGbo", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sail", false, "AWOLNATION", "Megalithic Symphony", "0:04:19", "7ueP5u2qkdZbIPN2YA6LR0", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Santa Baby", false, "Eartha Kitt", "The Essential Eartha Kitt", "0:03:26", "1vZKP9XURuqMp1SpXGnoyb", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Santa Claus Is Coming to Town - Edit", false, "Frank Sinatra", "Christmas With Sinatra And Friends", "0:02:16", "0TT77vYipeZQ4bifoaB47y", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Seattle", false, "Jason Walker", "Jason Walker", "0:03:59", "2qS3i19JrOBKf7PAlMk8KU", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Secrets", false, "OneRepublic", "Waking Up", "0:03:44", "1NhPKVLsHhFUHIOZ32QnS2", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Semi-Charmed Life", false, "Third Eye Blind", "Third Eye Blind", "0:04:28", "42et6fnHCw1HIPSrdPprMl", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("September", false, "Earth, Wind & Fire", "The Eternal Dance", "0:03:34", "5nNmj1cLH3r4aA4XDJ2bgY", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Serenade No. 13 in G Major, K. 525 ~~Eine Kleine Nachtmusic~~: I. Allegro", true, "RSO Ljubljana & Alexander von Pitamic", "100 Most Essential Classical Favorites", "0:06:29", "37b9vKhHi4P23GvP9WECaN", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Set Fire to the Rain", false, "Adele", "21", "0:04:01", "3CKCZ9pfwAfoMZlMncA1Nc", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sh-Boom - Single Version", false, "The Chords", "Atlantic 60th: At The Hop", "0:02:24", "5TiUTAPurormiQX9gE0CAQ", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sherry", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:02:30", "6kYfnFjxQYx2WkBW5jIiiI", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Shut up and Dance", false, "WALK THE MOON", "Shut up and Dance", "0:03:17", "1K66si1ZELsRZzg7m7mcps", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sight Of The Sun", false, "fun.", "Sight Of The Sun", "0:03:30", "4orHVYvdG5v4G4bmp2Lwdg", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Silent Night", false, "Nat King Cole", "The Christmas Song", "0:02:11", "3TqXY3k36fxwMMZS4QROrY", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Silent Night, Holy Night!", false, "Faith Hill", "Joy To The World", "0:03:08", "7eNLKaU5U9tIS6K4mWYrYm", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Simple Song", false, "The Shins", "Port Of Morrow", "0:04:15", "48bo7uexDvAThcRDvEB2W7", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false))));
        myMusic.add(new Song("Sitting In Limbo", false, "Jimmy Cliff", "The Harder They Come (Remastered)", "0:04:55", "0wdGc7K2pSGoJtfwBxeGDn", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Six Degrees of Separation", false, "The Script", "#3", "0:03:52", "4IACOiO4fczuCkYFdYxDGu", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sixteen Going On Seventeen", false, "Charmian Carr;Dan Truhitte", "The Sound of Music - Original Soundtrack Recording", "0:03:17", "34IIktVCLfkbysTSYcKo3k", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("Skin - Acoustic Version", false, "BOY", "Mutual Friends Acoustic EP", "0:03:21", "4uGOdAFauRDbSy1lImngox", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sloop John B - 1996 - Remaster", false, "The Beach Boys", "Pet Sounds", "0:03:00", "2ULL3VZf4WwBKO4vjwT7Bg", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("So Long, Farewell", false, "Charmian Carr;Heather Menzies;Nicholas Hammond;Duane Chase;Angela Cartwright;Debbie Turner;Kym Karath", "The Sound of Music - Original Soundtrack Recording", "0:02:53", "2NMznAoH3IluVA0Hyx1Or8", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("Some Nights", false, "fun.", "Some Nights (Spotify Exclusive)", "0:04:37", "6t6oULCRS6hnI7rm0h5gwl", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Somebody To Love (Glee Cast Version) - Cover of Queen Song", false, "Glee Cast", "Glee: The Music, Volume 1", "0:04:43", "43wOnyLJcwYfKVNxXZWPDz", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Somebody Told Me", false, "The Killers", "Hot Fuss", "0:03:17", "7HGTkn2aX7MNdKs7nV2xBt", new ArrayList<Boolean>(Arrays.asList(null, null, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Someone Like You", false, "Adele", "21", "0:04:45", "4kflIGfjdZJW4ot2ioixTB", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Something I Need", false, "OneRepublic", "Native", "0:04:01", "4KANJH1baadr3U7XsVbM17", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sometime Around Midnight", false, "The Airborne Toxic Event", "The Airborne Toxic Event (Deluxe Edition)", "0:05:03", "7Hn0bZgca6QFz6OyKkvAi6", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Somewhere Only We Know", false, "Keane", "Somewhere Only We Know", "0:03:58", "6uNP8aOZphmhsYlOwRhNh1", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sonata In C Major KV 545: Allegro", false, "Wolfgang Amadeus Mozart;Andreas Haefliger", "Mozart Piano Sonatas", "0:04:31", "0566ehhGJvCd7hL3xQsGaM", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sonata In C Major KV 545: Andante", false, "Wolfgang Amadeus Mozart;Andreas Haefliger", "Mozart Piano Sonatas", "0:06:22", "474I3IXHQDLrgq2PWdMlf3", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sonata No. 11 in A Major for Piano, K. 331: Rondo ~~Alla turca~~", true, "Wolfgang Amadeus Mozart;Henrik Måwe", "Best - Mozart", "0:03:34", "6sqVhS3ZyQdgAAUY6HqPwP", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Soul Meets Body", false, "Death Cab for Cutie", "Plans", "0:03:49", "5yc59J3MR3tVDPTOgwgRI5", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Speed Of Sound", false, "Coldplay", "X & Y", "0:04:47", "7clUVcSOtkNWa58Gw5RfD4", new ArrayList<Boolean>(Arrays.asList(false, null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Spring' from 'The Four Seasons - Violin Concerto in E Major", false, "Antonio Vivaldi", "Star Trek Classical Themes", "0:03:37", "73efosVEYTx7po34Q0Ccvq", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Stand By Me - Single/LP Version", false, "Ben E. King", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:54", "2lzbKVKSUVeb01ytbHA8PS", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Stars", false, "Russell Crowe", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:45", "4cLsM2rpxuniX1GkXdQjeC", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Stay The Night", false, "James Blunt", "Some Kind Of Trouble", "0:03:25", "3YYfH8VlmWZWeJuF4HvUBJ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Stille Nacht, heilige Nacht", false, "Franz Xaver Gruber;Vienna Boys' Choir", "Vienna Boys Choir... Hymns & Carols for Christmas", "0:03:53", "0eXaaku8aQQ1l23lRro00U", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Stole the Show", false, "Kygo;Parson James", "Stole the Show", "0:03:42", "4iZPNYqzI2L0uwuUKun7Aa", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Suddenly", false, "Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:32", "7yXL9VSv7OTTLl3Bv6cA5C", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Suddenly - Reprise", false, "Eddie Redmayne;Amanda Seyfried", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:00:54", "5T4Dl966shSjGuY5zbiZJT", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Suite No. 1 in G Major, BWV 1007: I. Prelude", false, "Jörg Metzger", "100 Most Essential Classical Favorites", "0:02:39", "4O7eogoHs23cPwJ8jSZ1m5", new ArrayList<Boolean>(Arrays.asList(false, false, true, null, null, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Summertime", false, "The Mowgli's", "Summertime", "0:03:25", "53VPCNRpCj52gDgVrLtG5y", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Superheroes", false, "The Script", "No Sound Without Silence", "0:04:05", "37sINbJZcFdHFAsVNsPq1i", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Surfin' U.S.A.", false, "The Beach Boys", "Made In California", "0:02:28", "3Ck8yyQ2utJcADaSePSkpU", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Swallowed In The Sea", false, "Coldplay", "X & Y", "0:03:59", "2u2WL5N3KnQnykOZi3fxL6", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Sweet Disposition", false, "The Temper Trap", "[500] Days Of Summer - Music From The Motion Picture", "0:03:52", "5nWbbQ0sIEabqPxAdqmh66", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Symphony No. 40 in G Minor, K. 550: Molto Allegro", false, "Wolfgang Amadeus Mozart;James Levine", "Mozart: Symphony No. 40 / Symphony No. 41 ('Jupiter')", "0:07:14", "6T3Uxup3XgWJG7FuY7aUYO", new ArrayList<Boolean>(Arrays.asList(false, false, true, null, null, null, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Symphony No. 9 in D Minor, Op. 125, ~~Choral~~: II. Molto vivace", true, "Rudolf Petrak;Shirley Carter;Donald Bell;London Symphony Orchestra, Josef Krips;Jennifer Vyvyan", "The 99 Most Essential Beethoven Masterpieces", "0:09:44", "0MlLvJEWd39ebizzhY6RIL", new ArrayList<Boolean>(Arrays.asList(false, false, true, null, null, null, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Symphony No. 9 In D Minor, Op. 125, ~~Choral~~: Ode An Die Freude", true, "London Philharmonic Orchestra;London Philharmonic Choir;London Chorus;David Parry", "The 50 Greatest Pieces Of Classical Music", "0:02:32", "0fVGR7zM3PgcWlnu9gQnJu", new ArrayList<Boolean>(Arrays.asList(false, false, true, null, null, null, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Symphony No. 94 in G Major, ~~Surprise~~: II. Andante", true, "Philharmony Bonn & Heribert Beissel", "100 Most Essential Classical Favorites", "0:06:44", "5x1NCeVlLTwcbF6ORm9pma", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Take a Walk", false, "Passion Pit", "Gossamer", "0:04:24", "4Sfa7hdVkqlM8UW5LsSY3F", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Take It All", false, "Adele", "21", "0:03:48", "6jL1DEdjmOa27inIgU088B", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Take On Me", false, "a-ha", "Hunting High And Low", "0:03:45", "2WfaOiMkCvy7F5fcp2zZ8L", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Take Your Time", false, "The Fray", "Listen To Me: Buddy Holly", "0:03:27", "6PoLFRcLJr66mdeadWGgOU", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Tear In My Heart", false, "Twenty One Pilots", "Blurryface", "0:03:08", "3bnVBN67NBEzedqQuWrpP4", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Teenager In Love", false, "Dion", "Love Songs Of The 50's", "0:02:34", "2eVMXr9asK3jHzKBbOERTy", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Teenager in Love", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:02:55", "5FeU992vNw1J8j8aEw7vcR", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Tell Him", false, "The Exciters", "Tell Him", "0:02:36", "7rGOWzo4evAQQ2FzrSKp0B", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("That'll Be The Day", false, "Buddy Holly & The Crickets", "A Very Rare Live Buddy - [The Dave Cash Collection]", "0:02:17", "0Hh4ljzUJmQxTA6LWXauJ6", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("That'll Be The Day", false, "Linda Ronstadt", "Listen To Me: Buddy Holly", "0:02:33", "6OCUAzoQv2xXkCXwTjjDMm", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("That's Christmas to Me", false, "Pentatonix", "That's Christmas To Me", "0:03:02", "5jzt6eMsPGu7CYcYzP7Lg6", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The 4 Seasons: Violin Concerto In F Minor, Op. 8, No. 4, RV 297, ~~L'inverno~~ (Winter): II. Largo", true, "Antonio Vivaldi;Capella Istropolitana;Takako Nishizaki", "Vivaldi: The Four Seasons/Wind Concertos", "0:02:20", "1qxGvwVUopoFqCeuHzECUB", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The A Team", false, "Ed Sheeran", "+", "0:04:18", "1VdZ0vKfR5jneCmWIUAMxK", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Bare Necessities", false, "Phil Harris;Bruce Reitherman", "Disney's Greatest Volume 2", "0:04:51", "5XDxDzQcdwRN88DqRj0OXQ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, false, false, false, false))));
        myMusic.add(new Song("The Bargain", false, "Isabelle Allen;Hugh Jackman;Helena Bonham Carter;Sasha Baron Cohen", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:24", "7paDp4bj7qQU7Vtcg1bFPk", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Bishop", false, "Colm Wilkinson", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:34", "4o4MIPR7Ognceg3e6DsjGD", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Cave", false, "Mumford & Sons", "Sigh No More", "0:03:35", "4YkmvF9kPRR0HOOK5XUxjZ", new ArrayList<Boolean>(Arrays.asList(null, null, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Confrontation", false, "Hugh Jackman;Russell Crowe", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:54", "31dATgmleDm4vrtFKkRhEd", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Convent", false, "Hugh Jackman;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:00:52", "28kol7eppArFKGKaG8Qy60", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Death Of Gavroche", false, "Aaron Tveit;Daniel Huttlestone;Students", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:45", "1wMdRZT8YiWbRWhWhIEgN5", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Docks (Lovely Ladies)", false, "Anne Hathaway;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:04:03", "3tzEvrv2NNt4e9hKTPuvji", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Final Battle", false, "Aaron Tveit;Hadley Fraser;Students", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:06", "4tO0enUe9YuNvufZN3GKVC", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The First Attack", false, "Eddie Redmayne;Hadley Fraser;Students", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:01:21", "03i2w6Sl4oRhapIlFCPHyd", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The First Noël", false, "Vienna Boys' Choir", "Christmas Classics for Kids", "0:02:35", "4FIjHlvoiz6exGLaXcJVxi", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Funeral", false, "Band of Horses", "Everything All The Time", "0:05:21", "4o0NjemqhmsYLIMwlcosvW", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false))));
        myMusic.add(new Song("The Ghosts Of Beverly Drive", false, "Death Cab for Cutie", "Kintsugi", "0:04:03", "6wNCdMW82LwJgFrnGqLhpJ", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Judge", false, "Twenty One Pilots", "Blurryface", "0:04:57", "1lguQJjlNrIOoOylYVZN3M", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Lion Sleeps Tonight", false, "MC6 A Cappella", "MC6 Burgers, Shakes & Doo-Wop (A Capella)", "0:03:03", "0crWDkAajRTnsGuZ6CAU85", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Little Drummer Boy", false, "Harry Simeone Chorale", "Christmas Number 1's", "0:03:18", "6BurjcMgLHYgmar79fVwtM", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Marriage of Figaro / ~~Duettino~~ Sull 'Aria", true, "Deutsche Oper, Berlin;Karl Böhm", "The Shawshank Redemption", "0:03:32", "4CZWCG1KOEZPGdQqDL85VF", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Messiah, HWV 56: Hallelujah Chorus", false, "London Philharmonic Orchestra;David Parry;London Philharmonic Choir", "The 50 Greatest Pieces Of Classical Music", "0:03:32", "4NvvCGC8gwGE6HbvmaZGNb", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Middle", false, "Jimmy Eat World", "Bleed American (Deluxe Edition)", "0:02:48", "3mcG2NI5G5vhrQtRda1YnA", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Nights", false, "Avicii", "The Days / Nights", "0:02:56", "0ct6r3EGTcMLPtrXHDvVjc", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Robbery", false, "Sasha Baron Cohen;Helena Bonham Carter;Hugh Jackman;Samantha Barks;Russell Crowe;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:51", "4HAyg5Q6Ur78HyuJIz6o38", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Scientist", false, "Coldplay", "A Rush Of Blood To The Head", "0:05:09", "75JFxkI2RXiU7L9VXzMkle", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Sewers", false, "Sasha Baron Cohen;Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:23", "6SngsfIn681pAmXb3v7B70", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Show", false, "Kerris Dorsey", "Moneyball (Original Motion Picture Soundtrack)", "0:03:13", "3Z5lQaSCTKLAonBJSxNyGN", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Tales Of Hoffmann: Barcarolle", false, "London Philharmonic Orchestra;David Parry", "The 50 Greatest Pieces Of Classical Music", "0:03:33", "6WJ1pAFQ2NPmfzR4YNcAzT", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Tiki, TIki, Tiki Room", false, "Fulton Burley;The Mellomen;Thurl Ravenscroft;Wally Boag", "Disney's Greatest Volume 3", "0:02:38", "0QQHnY4ZCg1m3NrmP5wI1B", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("The Wedding", false, "Sasha Baron Cohen;Helena Bonham Carter;Eddie Redmayne;Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:02", "4PXVeKsmum88EGsh52pk4g", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("The Well-Tempered Clavier, Book I: Prelude and Fugue No. 1 in C Major, BWV 846", false, "Johann Sebastian Bach;Jenő Jandó", "Bach to Work - Classical Piano Music for Work or Study", "0:04:26", "4bVSzm4bl6YACVIZUbhStL", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("The Wire", false, "HAIM", "Days Are Gone", "0:04:05", "6golelYKuy85o3u0cxIxFK", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("There She Goes", false, "Sixpence None The Richer", "6 PICKS: Essential Radio Hits EP", "0:02:43", "0tDMn4F8OOD5j5OFrRW6m4", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Think It Over", false, "Ringo Starr", "Listen To Me: Buddy Holly", "0:01:48", "3xRaJnDcenuCNUZvdc0pCs", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Three Little Birds", false, "Bob Marley & The Wailers", "Legend (Deluxe Edition)", "0:03:00", "26JRni5Lqiyd9GNnlaz6DI", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Through The Fire And Flames", false, "DragonForce", "Inhuman Rampage", "0:07:21", "6nnacTL5on2aVsRhVDNUSo", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Til Kingdom Come", false, "Coldplay", "X & Y", "0:04:10", "1wQXj5bgxyZQ2XmE2X9s6n", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Time Of Our Lives", false, "Tyrone Wells", "Metal & Wood", "0:04:06", "09ss01b6DRAHBeQCVClJBS", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Tongue Tied", false, "Grouplove", "Never Trust A Happy Song", "0:03:38", "0GO8y8jQk1PkHzS31d699N", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Tonight Tonight", false, "Hot Chelle Rae", "Whatever", "0:03:20", "2i0AUcEnsDm3dsqLrFWUCq", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Top of the World", false, "Greek Fire", "Top of the World", "0:04:26", "1PvEOveuZFuu0LCKdKQRdN", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Trois Gymnopedies: No. 1", false, "Erik Satie;Anne Queffélec", "Satie: Gymnopedies - Gnossiennes - Piano Works", "0:03:33", "0Tlvb46peCAX3mrKvYqyOW", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("True Colors (Glee Cast Version)", false, "Glee Cast", "Glee: The Music, Volume 2", "0:03:34", "7mSADMHSbGcgeYIcF26dPZ", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("True Love Ways", false, "Jackson Browne", "Listen To Me: Buddy Holly", "0:03:03", "4y3HRxewdHiTEdbxZvWWv7", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Tuesday's Dead", false, "Cat Stevens", "Chronicles", "0:03:36", "2rJyXktaG9szGLGi9hammb", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Turning", false, "Les Misérables Cast", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:00:38", "0dQccSGzAaoL6OYvXbWMcQ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Turning Tables", false, "Adele", "21", "0:04:10", "5O6yk6U8L3rTbFsIwuqe8H", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: Courante", false, "Yo-Yo Ma", "Bach: Cello Suites Nos. 1, 5 & 6", "0:02:25", "6iO65VrcAiAAfWa4Tbk6Db", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: Menuett", false, "Yo-Yo Ma", "Bach: Cello Suites Nos. 1, 5 & 6", "0:03:05", "0g7TuAT11Xg9r8HErWW167", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Unaccompanied Cello Suite No. 1 in G Major, BWV 1007: Prélude", false, "Yo-Yo Ma", "Bach: Cello Suites Nos. 1, 5 & 6", "0:02:32", "17i5jLpzndlQhbS4SrTd0B", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Unaccompanied Cello Suite No. 6 in D Major, BWV 1012: Gavotte", false, "Yo-Yo Ma", "Bach: Cello Suites Nos. 1, 5 & 6", "0:03:27", "2ddhCHZW8CT0ZVJG2lHyuM", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Under Pressure", false, "Queen;David Bowie", "Queen 40 Limited Edition Collector's Box Set Vol. 2", "0:04:08", "45Zo6ftGzq6wRckCUrMoBJ", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Under The Boardwalk", false, "The Drifters", "Under The Boardwalk (US Release)", "0:02:37", "65jrjEhWfAvysKfnojk1i0", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Under the Sea", false, "Samuel E. Wright", "Little Mermaid (Special Edition)", "0:03:15", "6oYkwjI1TKP9D0Y9II1GT7", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Uprising", false, "Muse", "The Resistance", "0:05:04", "4VqPOruhp5EdPBeR92t6lQ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Upside Down", false, "Jack Johnson", "Sing-A-Longs & Lullabies For The Film Curious George", "0:03:28", "6shRGWCtBUOPFLFTTqXZIC", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Valjean's Soliloquy", false, "Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:03:18", "0kGWR2TUDw8AIHgmFwjk1V", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Valjean’s Confession", false, "Hugh Jackman;Eddie Redmayne", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:17", "3Y3rrP26asuQyu0GhjlSsy", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Violet Hill", false, "Coldplay", "Viva La Vida Or Death And All His Friends", "0:03:42", "1ZqHjApl3pfzwjweTfMi0g", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Violin Concerto in D Major, Op. 61: III. Rondo. Allegro", false, "South German Philharmonic Orchestra, Alexander von Pitamic & Ivan Czerkov", "100 Most Essential Classical Favorites", "0:07:19", "2vbjJg55e2Xf0NJsfBOaWT", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Viva La Vida", false, "Coldplay", "Viva La Vida Or Death And All His Friends", "0:04:02", "1mea3bSkSGXuIRvnydlB5b", new ArrayList<Boolean>(Arrays.asList(true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Viva La Vida", false, "David Garrett", "Music", "0:04:15", "5M0j0DvBgr65ucv46jxkzE", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Vivir Mi Vida", false, "Marc Anthony", "Vivir Mi Vida", "0:04:11", "3tm3GG9BBOYhUzKWlS6A74", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false))));
        myMusic.add(new Song("W.A. Mozart: Eine kleine Nachtmusik G-Dur KV 525/1. Allegro", false, "Rundfunk-Sinfonieorchester Leipzig;Instrumental;Max Pommer", "Wolfgang Amadeus Mozart: Best Of Wolfgang Amadeus Mozart/ Klarinettenkonzert (Clarinet Concerto)/ Klavierkonzert Nr. 21 (Piano Concerto No. 21/ Eine kleine Nachtmusik (A Little Night Music)", "0:07:47", "4MG2QK1rVUQtoNxfB0xFWY", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("W.A. Mozart: Eine kleine Nachtmusik G-Dur KV 525/4. Rondo. Allegro", false, "Rundfunk-Sinfonieorchester Leipzig;Max Pommer;Instrumental", "Wolfgang Amadeus Mozart: Best Of Wolfgang Amadeus Mozart/ Klarinettenkonzert (Clarinet Concerto)/ Klavierkonzert Nr. 21 (Piano Concerto No. 21/ Eine kleine Nachtmusik (A Little Night Music)", "0:06:16", "3N4uY9WvuQHN3DjMXjWixk", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wake Me Up", false, "Avicii", "Wake Me Up", "0:04:09", "4QRZirU4s1f30iDHzuKncj", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wake Me Up When September Ends", false, "Green Day", "American Idiot (Regular Edition)", "0:04:45", "3ZffCQKLFLUvYM59XKLbVm", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wake Up", false, "Arcade Fire", "Funeral", "0:05:35", "2uljPrNySotVP1d42B30X2", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wake Up Call", false, "Maroon 5", "It Won't Be Soon Before Long.", "0:03:21", "1EOUqRAHU05vxop83JSldi", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Walk Like an Egyptian", false, "The Bangles", "The Essential Bangles", "0:03:24", "1Jwc3ODLQxtbnS8M9TflSP", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Water Music - Suite #1 In F, HWV 348 - Alla Hornpipe", false, "George Frideric Handel", "Haendel: Water Music & Music for the Royal Fireworks", "0:04:03", "7iBLqbwm15INeLOgXcX6s4", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wavin' Flag - Coca-Cola® Celebration Mix", false, "K'NAAN", "Troubadour (Explicit Version)", "0:03:32", "02WDuAXXKumemrvsmrVBvH", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Ways To Go", false, "Grouplove", "Spreading Rumours", "0:03:35", "57nNNkgk768QVXq3uHxu5e", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("We Are The Champions", false, "Queen", "News Of The World (Deluxe Remastered Version)", "0:02:59", "7ccI9cStQbQdystvc6TvxD", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("We Will Rock You", false, "Queen", "News Of The World (Deluxe Remastered Version)", "0:02:02", "54flyrjcdnQdco7300avMJ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Welcome To The Black Parade", false, "My Chemical Romance", "The Black Parade (Explicit Version)", "0:05:11", "5wQnmLuC1W7ATsArWACrgW", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Well All Right", false, "Lyle Lovett", "Listen To Me: Buddy Holly", "0:02:22", "0lmxQFwM9bfBfMjxafuGTR", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("What A Wonderful World", false, "Louis Armstrong", "Madagascar", "0:02:16", "4q6DY9xD5rszxA4HYK023c", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("What If", false, "Five For Fighting", "Bookmarks", "0:03:27", "4Qdup02dJrZ1jR3UgXY6Vj", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("When A Child Is Born", false, "Andrea Bocelli", "Andrea (US version)", "0:03:49", "0MFQg8n9toCAdziJK9zSfs", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("When I Was Your Man", false, "Bruno Mars", "Unorthodox Jukebox", "0:03:33", "0nJW01T7XtvILxQgC5J7Wh", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("When She Loved Me", false, "Sarah McLachlan", "Disney's Greatest Volume 3", "0:03:05", "0h1n5hX20r9IrNKTUSV5s4", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("When You Were Young", false, "The Killers", "Sam's Town", "0:03:40", "70wYA8oYHoMzhRRkARoMhU", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("When You Wish Upon A Star - From ~~Pinocchio~~ Soundtrack", true, "Cliff Edwards;Disney Studio Chorus", "Disney's Greatest Volume 1", "0:03:15", "0JIPxQiFYgnPfQDuAZTnHk", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Whispering Bells", false, "The Del-Vikings", "Stand By Me [Original Motion Picture Soundtrack]", "0:02:26", "0VRJtAPuTBrYTfAjVp7HD9", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("White Christmas", false, "Irving Berlin;Bing Crosby", "Essential Christmas", "0:03:00", "3g1zzHEMoOyRSCKx41IwQm", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Who Am I?", false, "Hugh Jackman", "Les Misérables: The Motion Picture Soundtrack Deluxe (Deluxe Edition)", "0:02:37", "0BeS5hJXm3yzubCswEC8TQ", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false))));
        myMusic.add(new Song("Why Am I the One", false, "fun.", "Some Nights (Spotify Exclusive)", "0:04:46", "5QbQ5iAebksB5Wj5BPazNX", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("William Tell Overture: Finale", false, "Various Artists", "The 50 Best Classical Songs Ever", "0:03:25", "0LKzACt0fAcPsFE4jVfrbA", new ArrayList<Boolean>(Arrays.asList(false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Winnie The Pooh", false, "Chorus - Winnie The Pooh", "Disney's Greatest Volume 2", "0:02:19", "6bbFvT6NebTB5xLrWALTz9", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false))));
        myMusic.add(new Song("Without You (feat. Usher)", false, "David Guetta;Usher", "Nothing But The Beat", "0:03:28", "7rGMKCgeYXpBecQ1FPb3oc", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wonderful World", false, "Sam Cooke", "Portrait Of A Legend", "0:02:07", "5RQJusMAPwQkD4b6NiJk2U", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Words Of Love", false, "Jeff Lynne", "Listen To Me: Buddy Holly", "0:02:06", "7jqHXx0BUqD650g9sYPRMg", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Work This Body", false, "WALK THE MOON", "TALKING IS HARD", "0:02:55", "76EeScTnI2sCjDY0SfEoSb", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Wouldn't It Be Nice - 1999 - Remaster", false, "The Beach Boys", "The Beach Boys Love Songs", "0:02:25", "0cx32rX0uZvcJUP92Wkj2y", new ArrayList<Boolean>(Arrays.asList(false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("Yellow", false, "Coldplay", "Parachutes", "0:04:26", "3AJwUDP919kvQ9QcozQPxg", new ArrayList<Boolean>(Arrays.asList(true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("You Can Call Me Al", false, "Paul Simon", "The Essential Paul Simon", "0:04:36", "6wLr2oR8eqUG5Beleh2Crm", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("You Can't Always Get What You Want (Glee Cast Version)", false, "Glee Cast", "Glee: The Music, Volume 2", "0:03:27", "1Y7abeCiyuhkE7lVliXkWp", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("You Give Love A Bad Name", false, "Bon Jovi", "Cross Road", "0:03:44", "7LBJui5MdjfCd8YZr4xaqA", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, false, true, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("You Make My Dreams", false, "Daryl Hall & John Oates", "Voices", "0:03:10", "4o6BgsqLIBViaGVbx5rbRk", new ArrayList<Boolean>(Arrays.asList(false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false))));
        myMusic.add(new Song("You're All Alone", false, "John Swihart", "How I Met Your Music: Deluxe (Original Television Soundtrack)", "0:03:58", "1djuGTKn7S1M2glrJ6xY4P", new ArrayList<Boolean>(Arrays.asList(false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false))));
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
        // If the searchTag array does not contain  values
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
            // Declare an int that stores the return format the user would like
            int returnFormat;
            // Declare a String to store the user's name
            String username;
            // Ask the user what their name is
            System.out.println("What is your name?");
            username = in.next();
            // Ask the user what mode they would
            System.out.println("Greetings, " + username + "! How may I help you?");
            System.out.println("1) I would like to search my songs by text");
            System.out.println("2) I would like to search my songs by tag");
            System.out.println("3) Exit the program");
            // If the next input is an int
            while(in.hasNextInt())
            {
                // Set mode to the inputted int
                mode = in.nextInt();
                // If the input is invalid
                if(!(mode >= 1  && mode <= 3))
                {
                    // Tell the user not to be an idiot
                    System.out.println("Don't be an idiot...");
                    // Exit the loop
                    break;
                }
                if(mode == 3)
                {
                    return;
                }
                System.out.println("What format would you like your results in?");
                System.out.println("1) Playlist name (Song name, artist, and album)");
                System.out.println("2) Full name (Song name, artist, album, length, and all tags)");
                returnFormat = in.nextInt();
                if(!(returnFormat >= 1  && returnFormat <= 2))
                {
                    // Tell the user not to be an idiot
                    System.out.println("Don't be an idiot...");
                    // Exit the loop
                    break;
                }
                // If the selected mode is 1 (search by text)
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
                        System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": "  + display);
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
                            for(Song test: coolName.searchTags(tagsToSearch))
                            {
                                // Print out the full name of the song
                                if(returnFormat == 1)
                                {
                                    test.printPlaylistName();
                                }
                                if(returnFormat == 2)
                                {
                                    test.printFullName();
                                }
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
                            System.out.println(i + ") " + Song.EXAMPLE[i - 1] + ": "  + display);
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
