//Author:Thomas;Christian
//Name:Pompeii
//Purpose:a travel arround pompeii, you can
import java.util.Scanner;

public class Pompeii {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String replay = "y";
      //set replay
      while (replay.equals("y")){
         int allcollection=0;
         int forest = 1;
         int temple = 1;
         int square = 1;
         int theater = 1;
         int farm = 1;
         int area = 1;
         int temple2 = 1;
         int washroom = 1;
         int baths = 1;
         int gladiator = 1;
         //allcollections use out of "for loop", this is to determine is player quit itself or the program quit.
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                 "Welcome to Pompeii, it was a city in what is now the municipality of Pompei, " +
                 "near Naples, in the Campania region of Italy.\n" +
                 " Along with Herculaneum, Stabiae, and many surrounding villas, \n" +
                 "the city was buried under 4 to 6 m (13 to 20 ft) of volcanic ash and pumice in the eruption of Mount Vesuvius in 79 AD. ");
          //introduce the city
         try {
              Thread.sleep(5000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          //sleep for 5000ms
          System.out.println("Now we are going to start our trip, here is the map of pompeii.");
         for (int collections = 0;collections<10;) {

            //these variables are use for determine is collections still available there.
            String countinue;
            //interlizing veriables for continue
            System.out.println("                                                      .^:!~(/++_++~~<>><>>>ii?fi!i!!!llllllII;;;;l``^`..                                                \n" +
                    "                                                .^:!<+_~i!:,,`^`;\"^\"\"I:\"\"\";I:lli!,;;i!Illl!!l!i!!_:>><><<<ii!;;:,\"^'..                                  \n" +
                    "                                          '\";i++++>l,\"^l'..`;`  ^I\"  ^I\".':lI' ';:' ';;'  `I\",;,\"\"' .':`''`^\"\":Il!><<<<<>>!lI:,\"^.                      \n" +
                    "                                     `l>+_+~>l,^'....  ':^  .\",. .;:. ^l>:. \"l\"  \"I\"  \"!\"^,:\"I`  ^:^  '\"^    .'^`''...''\"\",:Ill!>_<I`                   \n" +
                    "                                  .l?]<I,^^''. __       .\",'  ^I\"  ,ll^.`I:. .;I`  :l`^;:!;. ',\". .\"\"'  `\"'.``\"`  .'.      /|...'`,l+~:.                \n" +
                    "                               .:<}~;`..       __|        .,\". ':lI^'\":'  \";^  `:\"'`;;!\".`:\". .^,`  .\"\".'^\",' .`^.  .'.     |   .`^'`\">]l               \n" +
                    "                            ,-~-~lI:,`        |__           ^:,:'`i;. .,\". .,;'.\"I;;`.\",`  \"l^  .\"\"..^,:,. '``  '\"`  .''  __|__^^^`..^.`+?:             \n" +
                    "                          ,>}\\!:^^;+;::^                 .\":,`.    ,:^  `\"^'^!:I,`',\"'  ,:' .,:' .\";;^..\"\".  '\"' .`\"'   ''`\"^,!,.     .`.\"-_\"           \n" +
                    "                      .\"+?+i:^\"! ___'l,\"I;\"'          `:;\"`.        ';;''\";;:`'Il'  ':\". `I\"  ^:\"\"^'^,'  '\"^. .^\". .`'..`,\"^^'\">I.      '^.,?~'         \n" +
                    "                    \"+u}i:,l<'  |___|I:.^:I:^.    .`:I;\".   ___      'I;;\"`^l,. 'll.  \";'  :I:,`\"l^  '\"^.  `\"'  `\"`.':,:^'.     ;>\"   ':l>;\"`!?i.       \n" +
                    "                 ^i-->ll~\"  `>^ |___| :I. ':lI\"`\"liIl^        /   .`,::\"`Il'  :!`  :<,  'I:\"^`:,. ':,'  `,'  .`'. `:II^':;`       '!l,I~>I,:Illi][:      \n" +
                    "              ,{[]_l+, .;>:  .\"\"  .I\"  \"!`  'l_I_I. '\";,.    / `:lll>\"   ';,. ',:. '!>,^:\"I^  \"I\"  ^;\"  .^^. .\"\",\"``:\". '::.   .^;l:'!i:     '\"!+}_\"    \n" +
                    "           .I+}\\+!'.,~\"  `ll'  ,I. .,:  '!IIl:`.^::\". .\";:'.^:<l\"'. `ll`   ,l^  ^;\"^\"l!:  .,;' .:,' .\",'  `:\",,^,,'  ^,'  `,\"'\"l<:.  li:        ,!~?~.  \n" +
                    "..      .:+]+~\"..Il. 'iI  .I~\"  ^;`  \"I,:l<!.    .`\";,' .:<>l,Ii:.   ';l;'  'I;``;;l' .:;'  `;\"  `:\"  'i;\"\"\"\"l`  '\"\". .^^.'\">>~<;^!' ^~>'        ,!I<]  \n" +
                    "l!l:^.\"+-+l^.l:   \"!` .Il.  ,!;. .I:^;>+:  \"I'      .,;;!!:^    \"!I,,\"' '\":`.`l:`. ':^  ';:. .,;'  \";``,:>:  ':,.  ^,`.^l!l>>l`   ..^',>>\"        !! >)I\n" +
                    " .'^\"+zn/]!^  \"!`  `!:  \"!^  'Il`^I++^ .:\"  `I`   .^:I;:!:`   .\"i~I!\"    .\":::.     .\";`  \":`  .;,'^:;!` 'Il'  `:^  ^;:l!:\"'        '\".`I>l:'    '!>!+]>\n" +
                    "     I}]--}}1[l,l\"  .II. 'i; .,<!l` \"l'  \":. '!;^\",:\"'  ':l;\":i<:.  ^::,,\"'..'^\".     `:\". ':\"'`:;!I. \"l\"  ^l;  'lI,`.\"!<I.    .`\":`  ^l.',llll:I+{?I.  \n" +
                    "       \"!-?>:l_1}]!.  \"l^ `~<l\"'`;\". ^;^  `I^^:ll~,   `\"^:,\"I>:.   `:!lll^   ___\"^`     `\"^.^,,I`.'II' .:l' .l>\"\"'^<I. `li>,  .I\"`^;.  .',. ..:<?_,     \n" +
                    "          ^>]?i,:<(~^. \"~>:^:!`  ';;' .::'^I:,^..\"+!\",,^     '\":\":il\"'  ',I^|    .`'.  .`;!::'';I`  \"i:. `  ___^^:^. .l>\"  \"li!` .`'.    .^I: 'l|)`       \n" +
                    "          `!]}<^':lll\"lI  '!;  .,I\"'\"l,^'.     ~+.        .^;:l;'   .`:Il!;'|---|':\"I;\"'^l,  ^!;. .;!::;:;^|___|  'll`^:\":l;.    .\"ll,`\">_l.         \n" +
                    "               `i>\"..:;` \"I` .li'.'::,,'.        -:   .`\":l;\"'. .^::\";,,`  '|___|`\";:\"\"\"`. .:;`  :!,\",      ___|',\". .\"\"'.^;l:  .`Ii\"',l!:' ,~~:            \n" +
                    "                   ^:` 'I;'\">\"  ;>,\"`\":^'       `:t<ll>>!I:l--!`   .`;!\".     ';I;l\".   .'\"`. 'I;^,!iI.  `;^  `\"`.',,,' 'Il'  `,!l:' `l_>\"              \n" +
                    "                    .\"^. ^:l,:,+?:.   '\"^'',l>+?[~+<\".  .'^,:!-++i    ',I:`'`,,;\"^\"::`  .`:I,'^:ll:  `,^  .\";'.`::,'.^\"'  ,>I..'. `I>>;'                \n" +
                    "                      '``..\"I:`\">[]i. .;-[]-~l,\",^.:i;;l;?;`. .`,|>     'II:;`.    .^ll:l:\".  \"l..\":' .,:' .::,^.'\"^. .\"\". 'l\"`:l<i,.                   \n" +
                    "                        ``^\"\"\",.  \"~|\\}]+!` ,I:,II:\",>^  ,-,`\",\"'^1l .`\",\"^\":\"^.    __.`\":,\"I^.    \"i` ',\". ^;I\"^.^,`  ^\"' .^\"..\"i+;,.                      \n" +
                    "                       .^^. ,I^ :})!',:', .l\"''   .:<I^^\">:   .'lxl\"\"`..  .^,,\",\"^'.__|\":\"'\":| |---|\",:\"`\",'  .\"\". '\"'.',!>i,.                         \n" +
                    "                           `\"' .+\\(!   .\".   .;,;I\"\"\":,i`  '>I,\"\"^`>jl      .^I,^:, __| .'\"ll| |   |,\"`\"\". .\",. .^\"'.':[)!\".                            \n" +
                    "                            `^,{}I.\"^^.',+`   .;\":...',:I\"^^^`'.  :(~ .'\";:\",' .`\",\"'^,^' .^;| |---|   '\"` .\",'.^,l<~!,'                               \n" +
                    "                           '^;fl    ^IIl:l>'   .::\"\"^\"\"^;I.          \"c<\"I\"\"!<l!!^ Il<:,`   .\"::I:.     .'\".'':!~<i:`                                   \n" +
                    "                          .,.'_+\". ^^'';;'`;'   'I^..   .:__     .''^\"\"\"\"`)j`^\"!_l.'li,l\";l^,:::|   |\"l`.'.'`\":li>!:'                                       \n" +
                    "                            `:.  :>-_' ..^!\"``\"`..'\">`   |__  :I:^`''''''.ic'  '+_!^^\"\"\";,.  .\"l|___|_`'`,l<<>;\".                                           \n" +
                    "                              ^,.   '>]~}>.''`^\";.''.^l\"  __|    \"!:\"\",\"\"^`'\"vl.^' :I,\"`;^'^^'.''`;!|>l,!><i:`                                                \n" +
                    "                             `\"':\"' `''}?^^`''. .    ,l^.'^\",I:.        .^:f)~+>+: .^^`^\"\";\"`''\";<f)|l,'                                                    \n" +
                    "                             `::l'... .++``\",\"^:,^`. ^;\"\"``^`\"::li<<<<>[|+-[{<l,`'\"\"\",,;!~_+>;'                                                         \n" +
                    "                                ^I`'`^^'>,'.''``\"\",;I\"\",:\"::,:~>l:\"`'....   ',l>~+_+_++>I^.                                                             \n" +
                    "                                 ',`\"`..           ..''`^^`.. .                   .^^.                                                                  \n");
            //Print the map
            System.out.println("\nNow choose the place you are going to next. Collect things in different places to get the final story.");
            System.out.println("You have collect "+collections+" collections.");
            int location = scan.nextInt();
            if (location==1){
               System.out.println("Now we are in the Pompeii forest park which located at the north-east of the Pompeii city. It was one of the \n" +
                       "favorite places of Pompeinans, who enjoyed relaxing walks here, and its wonderful and unique\n" +
                       "environment inspire many poets. They left a lot of wonderful love poems on the walls of the streets of Pompeii.\n" +
                       "You can find some cards in this forest park, there are poems on the cards. You can collect them.\n");
               if (forest==1){
                  System.out.println("You got the collection Poem card");
                  forest=0;
                  collections=collections+1;
               }
               //Forest
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            else if (location==2){
               System.out.println("We are now at Temple of Venus, this was a place that the acient Pompeii people engaged in a series of \n" +
                       "religious and ceremonial pratices to express their reverence and prayers to the goddess Venus.\n" +
                       "People who lived in Pompeii also would hold weddings in this temple. They believe their weddings \n" +
                       "could be blessed by the Venus. You can look for some shells in this temple and collect them, these shells\n" +
                       "repersent Venus because the ocean wasm the place she borned.");
               if (temple ==1){
                  System.out.println("You got the collection Shell");
                  temple =0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Temple
            else if (location==3){
               System.out.println("I'd like to ask you to look up and see a tall tower in the front of you. That is the center of the \n" +
                       " Ponpeii victory square, which is a square shape square. To the left of which are the farms, and at the end of Victory\n" +
                       " Square is the theater. the leaders of Pompeii would give speeches here, and many important political\n" +
                       " events would take place in this square.There are some badge hide in the corner in the victory square, \n" +
                       " you can find them and collect them together.");
               if (square ==1){
                  System.out.println("You got the collection Winner's Badge");
                  square=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Square
            else if (location==4){
               System.out.println("This expanse where we are now is the Star Theater, a theater that could hold over five hundred\n" +
                       " people at a time, which was very large for that time.It was the largest theater in Pompeii and \n" +
                       " was very popular with the people of Pompeii at that time. Many writers would do their best to \n" +
                       " put their plays on this stage. There are many vintage ticket stubs in this theater with some \n" +
                       " interesting information from that era, and you can collect them all!");
               if (theater==1){
                  System.out.println("You got the collection Ticket of Theater");
                  theater=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Theater
            else if (location==5){
               System.out.println("What you see in front of you is an open field some people would take for a parking lot, just \n" +
                       " kidding. This is actually a farm in Pompeii. Many different crops were grown here, but grapes \n" +
                       " and olives were the main ones, and Pompeii was famous for its wine and olive oil at that time!\n" +
                       " You can collect some seeds if you want, enjoy your time here!!!");
               if (farm==1){
                  System.out.println("You got the collection A Package of Seeds");
                  farm=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Farm
            else if (location==6){
               System.out.println("This is the most important place for the inhabitants of Pompeii - the residential area. \n" +
                       " There are about 20,000 people living in Pompeii, and the residential area is well \n" +
                       " planned and easily accessible, even the paths between the houses are well organized.\n" +
                       " According to the research, archaeologists have found some fossilized eggs in this \n" +
                       " area, and we have put some replicas in this area, so if you are interested, you \n" +
                       " can look for them and collect them.");
               if (area==1){
                  System.out.println("You got the collection A Fossilized Egg");
                  area=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Living area
            else if (location==7){
               System.out.println("This dilapidated building is the Temple of Apollo, \n" +
                       "also known as the Sanctuary of Apollo, is a Roman temple built in \n" +
                       "120 BC and dedicated to the Greek and Roman god Apollo. \n" +
                       "Apollo was the god of prophecy, \n" +
                       "so there might be priests or soothsayers in the temple to provide prophetic services \n" +
                       "to the citizens to help them understand the auspicious areas of the future or to seek \n" +
                       "oracles on major decisions (e.g. war, navigation, etc.). \n" +
                       "The laurel crown represents Apollo's triumph, glory and eternity, \n" +
                       "and likewise, we've put some replicas in the corners of the temple for you to collect!\n");
               if (temple2==1){
                  System.out.println("You got the collection Laurel crown");
                  temple2=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Temple2
            else if (location==8){
               System.out.println("I'm sure you've seen some benches along the way that have some holes in them. \n" +
                       "Many tourists who come to visit will sit on them to rest. \n" +
                       "In fact, these are the toilets that people used at that time.In fact, \n" +
                       "almost every private house in these cities, and many apartment houses in Pompeii, \n" +
                       "had private, usually one-seater, toilets not connected to the main sewer lines. \n" +
                       "There used to be a lot of beautiful mosaics in the toilets, \n" +
                       "and we've put some replica store stones in the toilets for you to collect!\n");
               if (washroom==1){
                  System.out.println("You got the collection Mosaic stones");
                  washroom=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //washroom
            else if (location==9){
               System.out.println("There are three public baths that can be found at Pompeil. \n" +
                       "These are the Forum baths, the Stabian\n" +
                       "baths and the central baths. The\n" +
                       "central baths were still beirtg built at the time of the eruption. \n" +
                       "Most people living in Pompeii prefer to go to a public bathhouse to bathe, \n" +
                       "and such bathhouses are of high quality, \n" +
                       "with three pools of different temperatures, \n" +
                       "and there are also swimming pools and saunas. \n" +
                       "They have all set up women-only bathhouses. \n" +
                       "After work, going to the bathhouse to take a dip is a daily routine for Pompeians. \n" +
                       "There used to be many beautiful murals in the bathhouse, \n" +
                       "and we've put out some small cards with mural designs that you can collect and enjoy!\n");
               if (baths==1){
                  System.out.println("You got the collection Mural cards");
                  baths=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //baths
            else if (location==10){
               System.out.println("The place we see with the many pillars is the Gladiator Barracks. \n" +
                       "In the latter years of Pompeii the four-sided colonnade rising up behind \n" +
                       "the Theatre was used as the barracks of the organisation of gladiators who performed in the town.\n" +
                       " Along the wings of the colonnade and on the first floor were the rooms \n" +
                       "which provided accommodation for the gladiators from other towns. \n" +
                       "We only made a few small helmet decorations that you can go find and collect.\n");
               if (gladiator==1){
                  System.out.println("You got the collection helmet decorations");
                  gladiator=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //gladiator barracks
            allcollection=collections;
            //sycro the collection num out of loop
         }
         if (allcollection == 10) {
            System.out.println("Congratulations, you went all areas in Pompeii city, now here is the final story of Pompeii\n");
            System.out.println("Pompeii is a city in Ancient Rome Empire. in 79 AD, Pompeii drowned by Vesuvius.\n" +
                    "In fact, there were many earthquakes before the volcano erupted, \n" +
                    "and that was the last warning of the volcano vesuvius to the inhabitants of Pompeii. \n" +
                    "But most of the city's inhabitants never believed that the disaster would affect them, \n" +
                    "and only a small group of people realized the severity of the disaster in advance and fled Pompeii in time, \n" +
                    "making them the only survivors of the catastrophe of the century. \n" +
                    "The heat, gas and dust from the eruption buried the city, \n" +
                    "and those who stayed in the city died in despair and agony before being turned to stone. \n" +
                    "Today, many archaeologists are trying their best to find out what the people who were turned into \n" +
                    "stone were doing in their last moments before they died, searching for the secrets of this catastrophic city.\n");
         }
         //determine is players collect all collections and quit
         System.out.println("Play again?(y/n)");
         replay = scan.next();
      }
   System.out.println("Thanks for playing.");
   }
}