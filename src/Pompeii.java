import java.util.Scanner;

public class Pompeii {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String replay = "y";
      //set replay
      while (replay.equals("y")){
         int allcollection=0;
         //allcollections use out of "for loop", this is to determine is player quit itself or the program quit.
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                 "Welcome to Pompeii, it was a city in what is now the municipality of Pompei, " +
                 "near Naples, in the Campania region of Italy." +
                 " Along with Herculaneum, Stabiae, and many surrounding villas, " +
                 "the city was buried under 4 to 6 m (13 to 20 ft) of volcanic ash and pumice in the eruption of Mount Vesuvius in 79 AD. ");
          //introduce the city
         try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          //sleep for 1000ms
          System.out.println("Now we are going to start our trip, here is the map of pompeii.");
         for (int collections = 0;collections<6;) {
            int forest = 1;
            int football = 1;
            int square = 1;
            int theater = 1;
            int farm = 1;
            int area = 1;
            //these variables are use for determine is collections still available there.
            String countinue = "y";
            //interlizing veriables for continue
            System.out.println("                                                      .^:!~(/++_++~~<>><>>>ii?fi!i!!!llllllII;;;;l``^`..                                                \n" +
                    "                                                .^:!<+_~i!:,,`^`;\"^\"\"I:\"\"\";I:lli!,;;i!Illl!!l!i!!_:>><><<<ii!;;:,\"^'..                                  \n" +
                    "                                          '\";i++++>l,\"^l'..`;`  ^I\"  ^I\".':lI' ';:' ';;'  `I\",;,\"\"' .':`''`^\"\":Il!><<<<<>>!lI:,\"^.                      \n" +
                    "                                     `l>+_+~>l,^'....  ':^  .\",. .;:. ^l>:. \"l\"  \"I\"  \"!\"^,:\"I`  ^:^  '\"^    .'^`''...''\"\",:Ill!>_<I`                   \n" +
                    "                                  .l?]<I,^^''.          .\",'  ^I\"  ,ll^.`I:. .;I`  :l`^;:!;. ',\". .\"\"'  `\"'.``\"`  .'.      .....'`,l+~:.                \n" +
                    "                               .:<}~;`..                  .,\". ':lI^'\":'  \";^  `:\"'`;;!\".`:\". .^,`  .\"\".'^\",' .`^.  .'.         .`^'`\">]l               \n" +
                    "                            ,-~-~lI:,`                      ^:,:'`i;. .,\". .,;'.\"I;;`.\",`  \"l^  .\"\"..^,:,. '``  '\"`  .''    .'`^^^`..^.`+?:             \n" +
                    "                          ,>}\\!:^^;+;::^                 .\":,`.    ,:^  `\"^'^!:I,`',\"'  ,:' .,:' .\";;^..\"\".  '\"' .`\"'   ''`\"^,!,.     .`.\"-_\"           \n" +
                    "                      .\"+?+i:^\"!;  'l,\"I;\"'           `:;\"`.        ';;''\";;:`'Il'  ':\". `I\"  ^:\"\"^'^,'  '\"^. .^\". .`'..`,\"^^'\">I.      '^.,?~'         \n" +
                    "                    \"+u}i:,l<'  :;' .I:.^:I:^.    .`:I;\".            'I;;\"`^l,. 'll.  \";'  :I:,`\"l^  '\"^.  `\"'  `\"`.':,:^'.     ;>\"   ':l>;\"`!?i.       \n" +
                    "                 ^i-->ll~\"  `>^  ';^  :I. ':lI\"`\"liIl^           .`,::\"`Il'  :!`  :<,  'I:\"^`:,. ':,'  `,'  .`'. `:II^':;`       '!l,I~>I,:Illi][:      \n" +
                    "              ,{[]_l+, .;>:  .\"\"  .I\"  \"!`  'l_I_I. '\";,.      `:lll>\"   ';,. ',:. '!>,^:\"I^  \"I\"  ^;\"  .^^. .\"\",\"``:\". '::.   .^;l:'!i:     '\"!+}_\"    \n" +
                    "           .I+}\\+!'.,~\"  `ll'  ,I. .,:  '!IIl:`.^::\". .\";:'.^:<l\"'. `ll`   ,l^  ^;\"^\"l!:  .,;' .:,' .\",'  `:\",,^,,'  ^,'  `,\"'\"l<:.  li:        ,!~?~.  \n" +
                    "..      .:+]+~\"..Il. 'iI  .I~\"  ^;`  \"I,:l<!.    .`\";,' .:<>l,Ii:.   ';l;'  'I;``;;l' .:;'  `;\"  `:\"  'i;\"\"\"\"l`  '\"\". .^^.'\">>~<;^!' ^~>'        ,!I<]  \n" +
                    "l!l:^.\"+-+l^.l:   \"!` .Il.  ,!;. .I:^;>+:  \"I'      .,;;!!:^    \"!I,,\"' '\":`.`l:`. ':^  ';:. .,;'  \";``,:>:  ':,.  ^,`.^l!l>>l`   ..^',>>\"        !! >)I\n" +
                    " .'^\"+zn/]!^  \"!`  `!:  \"!^  'Il`^I++^ .:\"  `I`   .^:I;:!:`   .\"i~I!\"    .\":::.     .\";`  \":`  .;,'^:;!` 'Il'  `:^  ^;:l!:\"'        '\".`I>l:'    '!>!+]>\n" +
                    "     I}]--}}1[l,l\"  .II. 'i; .,<!l` \"l'  \":. '!;^\",:\"'  ':l;\":i<:.  ^::,,\"'..'^\".     `:\". ':\"'`:;!I. \"l\"  ^l;  'lI,`.\"!<I.    .`\":`  ^l.',llll:I+{?I.  \n" +
                    "       \"!-?>:l_1}]!.  \"l^ `~<l\"'`;\". ^;^  `I^^:ll~,   `\"^:,\"I>:.   `:!lll^     '\"^`     `\"^.^,,I`.'II' .:l' .l>\"\"'^<I. `li>,  .I\"`^;.  .',. ..:<?_,     \n" +
                    "          ^>]?i,:<(~^. \"~>:^:!`  ';;' .::'^I:,^..\"+!\",,^     '\":\":il\"'  ',I^.    .`'.  .`;!::'';I`  \"i:. `>l,^^:^. .l>\"  \"li!` .`'.    .^I: 'l|)`       \n" +
                    "             `!]}<^':lll\"lI  '!;  .,I\"'\"l,^'.     ~+.        .^;:l;'   .`:Il!;'     ':\"I;\"'^l,  ^!;. .;!::;:;^  `,`  'll`^:\":l;.    .\"ll,`\">_l.         \n" +
                    "                `i>\"..:;` \"I` .li'.'::,,'.        -:   .`\":l;\"'. .^::\";,,`  ':I\"'.`\";:\"\"\"`. .:;`  :!,\",:;:. ',\". .\"\"'.^;l:  .`Ii\"',l!:' ,~~:            \n" +
                    "                   ^:` 'I;'\">\"  ;>,\"`\":^'       `:t<ll>>!I:l--!`   .`;!\".     ';I;l\".   .'\"`. 'I;^,!iI.  `;^  `\"`.',,,' 'Il'  `,!l:' `l_>\"              \n" +
                    "                    .\"^. ^:l,:,+?:.   '\"^'',l>+?[~+<\".  .'^,:!-++i    ',I:`'`,,;\"^\"::`  .`:I,'^:ll:  `,^  .\";'.`::,'.^\"'  ,>I..'. `I>>;'                \n" +
                    "                      '``..\"I:`\">[]i. .;-[]-~l,\",^.:i;;l;?;`. .`,|>     'II:;`.    .^ll:l:\".  \"l..\":' .,:' .::,^.'\"^. .\"\". 'l\"`:l<i,.                   \n" +
                    "                        ``^\"\"\",.  \"~|\\}]+!` ,I:,II:\",>^  ,-,`\",\"'^1l .`\",\"^\":\"^.  .`\":,\"I^.    \"i` ',\". ^;I\"^.^,`  ^\"' .^\"..\"i+;,.                      \n" +
                    "                         .^^. ,I^ :})!',:', .l\"''   .:<I^^\">:   .'lxl\"\"`..  .^,,\",\"^'.  .\":\"'\":,`.   \",:\"`\",'  .\"\". '\"'.',!>i,.                         \n" +
                    "                           `\"' .+\\(!   .\".   .;,;I\"\"\":,i`  '>I,\"\"^`>jl      .^I,^:,`.   .'\"ll;'   .^,\"`\"\". .\",. .^\"'.':[)!\".                            \n" +
                    "                            `^,{}I.\"^^.',+`   .;\":...',:I\"^^^`'.    :(~ .'\";:\",' .`\",\"'^,^' .^;:\",,'.   '\"` .\",'.^,l<~!,'                               \n" +
                    "                           '^;fl    ^IIl:l>'   .::\"\"^\"\"^;I.          \"c<\"I\"\"!<l!!^ Il<:,`   .\"::I:.     .'\".'':!~<i:`                                   \n" +
                    "                          .,.'_+\". ^^'';;'`;'   'I^..   .:I' .''^\"\"\"\"`)j`^\"!_l.'li,l\";l^,:::,>i. \"l`.'.'`\":li>!:'                                       \n" +
                    "                          `:.  :>-_' ..^!\"``\"`..'\">`      :I:^`''''''.ic'  '+_!^^\"\"\";,.  .\"l:',!`.`'`,l<<>;\".                                           \n" +
                    "                           ^,.   '>]~}>.''`^\";.''.^l\"      \"!:\"\",\"\"^`'\"vl.^' :I,\"`;^'^^'.''`;!!>l,!><i:`                                                \n" +
                    "                            `\"':\"' `''}?^^`''. .    ,l^.'^\",I:.     .^:f)~+>+: .^^`^\"\";\"`''\";<f)>l,'                                                    \n" +
                    "                             `::l'... .++``\",\"^:,^`. ^;\"\"``^`\"::li<<<<>[|+-[{<l,`'\"\"\",,;!~_+>;'                                                         \n" +
                    "                                ^I`'`^^'>,'.''``\"\",;I\"\",:\"::,:~>l:\"`'....   ',l>~+_+_++>I^.                                                             \n" +
                    "                                 ',`\"`..           ..''`^^`.. .                   .^^.                                                                  \n");
            //Print the map
            System.out.println("\nNow choose the place you are going to next. Collect things in different places to get the final story.");
            System.out.println("You have collect "+collections+" collections.");
            int location = scan.nextInt();
            if (location==1){
               System.out.println("We are now at Forest park, this is ...");
               if (forest==1){
                  System.out.println("You got the collection Limb");
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
               System.out.println("We are now at Football Court, this is ...");
               if (football==1){
                  System.out.println("You got the collection Football");
                  football=0;
                  collections=collections+1;
               }
               System.out.println("Continue?(y/n)");
               countinue = scan.next();
               if (countinue.equals("n"))
                  collections = 11;
            }
            //Football
            else if (location==3){
               System.out.println("We are now at Victory Square, this is ...");
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
               System.out.println("We are now at Star Theater, this is ...");
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
               System.out.println("We are now at Coin Farm, this is ...");
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
               System.out.println("We are now at Living area, this is ...");
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
            allcollection=collections;
            //sycro the collection num out of loop
         }
         if (allcollection == 6) {
            System.out.println("Congratulations, you went all areas in Pompeii city, now here is the final story of Pompeii");
            System.out.println("Pompeii is a city in Ancient Rome Empire. in 79 AD, Pompeii drowned by Vesuvius.");
         }
         //determine is players collect all collections and quit
         System.out.println("Play again?(y/n)");
         replay = scan.next();
      }
   System.out.println("Thanks for playing.");
   }
}